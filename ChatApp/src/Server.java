import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {


    @Override
    public void run() {

//        server will constantly listen for incoming connections and then accept them

        try {
            ServerSocket server = new ServerSocket(9999);

//            server has the accept method which - returns a client socket
            Socket client = server.accept();


//            still need a shutdown function here


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    class ConnectionHandler implements Runnable{

        private Socket client;

//        Bufferedreader to get the stream from the socket
        private BufferedReader in;

//        Printwriter when writing to the client
        private PrintWriter out;

        private String nickname;

//        create constructor which takes in the socket as a parameter
        public ConnectionHandler(Socket client) {
            this.client = client;
        }

        @Override
        public void run() {

            //        new connection handler for each client that connects

//            initialise reader and writer
            try {
                out = new PrintWriter(client.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(client.getInputStream()));

//                now we can send something to the client
                out.println("Please enter your handle: ");
                nickname = in.readLine();

//                can perform checks on the nickname entered here ...
                


            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
