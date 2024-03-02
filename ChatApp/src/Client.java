//Uses two threads: 1 to receive messages from server, 2 takes in console line input

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client implements Runnable{

    private Socket client;
    private BufferedReader in;
    private PrintWriter out;


    @Override
    public void run() {

        try {

//            if connect to someone else's server, need to use their IP address
//            If locally, can use private IP address
//            If your computer, localhost

            Socket client = new Socket("127.0.0.1", 9999);
            out = new PrintWriter(client.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
