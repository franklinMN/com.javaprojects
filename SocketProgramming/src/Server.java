import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    
    public static void main(String[] args) {
        
        try{

            /* 1. Create a Server socket connection
             * 2. Accept the client connection
             * 3. Create I/O to client objects for the server socket
             * 4. Create input object to read the server input
             * 5. Write a while infinite loop
             * 6. send confirmation message to client
             * 7. interact with client
             * 8. end loop
             * 9. close all the resources
             */

            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server Socket is created " + serverSocket );


            Socket clientSocket = serverSocket.accept();
            System.out.println("Client is accepted");


            BufferedReader inFromClient = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()) );
            PrintWriter outToClient = new PrintWriter( clientSocket.getOutputStream(), true );


            BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));


            String serverMessage;
            String clientMessage;
            outToClient.println("Welcome to the chat server ! You can start chatting...");

            while( (clientMessage = inFromClient.readLine())  !=  null ){

                System.out.println("Client: " + clientMessage );

                System.out.print("Server : ");
                serverMessage = serverInput.readLine();

                outToClient.println(serverMessage);
            }

            inFromClient.close();
            outToClient.close();
            serverInput.close();
            clientSocket.close();
            serverSocket.close();

        }catch( Exception e ) {

            e.printStackTrace();

        }
    }
    
}
