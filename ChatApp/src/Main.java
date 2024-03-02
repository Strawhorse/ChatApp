
//main method to create instance of the server

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        server.run();
        Client client = new Client();
        client.run();
    }
}