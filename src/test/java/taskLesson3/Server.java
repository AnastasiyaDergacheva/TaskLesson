package taskLesson3;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        int portNum = 4446;
        //int portNum = Integer.parseInt(System.getProperty("ServerPort"));
        HttpServer server = null;
        try {
            server = HttpServer.create();
            server.bind(new InetSocketAddress(portNum), 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HttpContext context = server.createContext("/", new Server.EchoHandler());
        HttpContext context2 = server.createContext("/help", new Server.EchoHandler2());
        server.setExecutor(null);
        server.start();
    }

    static class EchoHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();
            ArrayList<String> header = new ArrayList<>();

            exchange.getRequestHeaders().values().forEach(s -> header.add(s.toString()));
            exchange.getRequestHeaders().values().forEach(o -> System.out.println("header=" + 0));

            for (String a : header) {
                if (a.contains("Hello")) {
                    builder.append("Hello to, my friend");
                }
            }
            builder.append("Hello to, my friend! To get started http://localhost:4446/help");
            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();
        }
    }

    static class EchoHandler2 implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();
            ArrayList<Integer> header = new ArrayList<>();
            header.add(111);
            header.add(45);
            header.add(34);
            header.add(5623);
            header.add(56);
            header.add(50);
            header.add(5);

            //exchange.getRequestHeaders().values().forEach(s -> header.add(s.size()));
            //exchange.getRequestHeaders().values().forEach(o -> System.out.println("header=" + 0));
            builder.append("Solve the example:\n");
            for (Integer a : header) {
                if (a.intValue() <= 50) {
                    int num = a.intValue();
                    builder.append( num + "+" + " (" + num + " * 2) " + " = ?\n");
                }
            }

            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
            exchange.close();
        }
    }
}
