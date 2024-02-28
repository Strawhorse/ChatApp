import java.io.IOException;
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

        @Override
        public void run() {

            //        new connection handler for each client that connects


        }
    }
}
