package chatbot.Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
        public static void main(String args[]) throws Exception
        {

            // Create server Socket
            ServerSocket ss = new ServerSocket(4999);

            // connect it to client socket
            Socket s = ss.accept();
            System.out.println("Connection established");

            // to send data to the client
            PrintStream ps = new PrintStream(s.getOutputStream());

            // to read data coming from the client
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            // to read data from the keyboard
            BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

//        Chatbot cb1 = new Chatbot();

            // server executes continuously
            while (true) {

                String str, str1;

                while ((str1 = kb.readLine()) != null) {
                    ps.println(str1);
                    if ((str = br.readLine()) != null){
                        str = br.readLine();
                        System.out.println("Bot: " + str);
                    }
                }

                // close connection
                ps.close();
                br.close();
                kb.close();
                ss.close();
                s.close();

                // terminate application
                System.exit(0);

            } // end of while
        }
}

