package netty;

public class AIOTimeClient {
    public static void main(String[] args) {
        int port = 8080;
        new Thread(new AsyncTimeClientHandler("127.0.0.1",port),"AIO-AsychTimeClientHandler-001").start();
    }
}
