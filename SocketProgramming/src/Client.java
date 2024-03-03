import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {


        /* 1. Create a Socket for the Client
         * 2. Create a I/O objects for the sockets
         * 3. Create a input Object for the Client to read data
         * 4. Write a while loop - infinite
         * 5. interact with server accordingly - ( server sends the first message always - confirmation message )
         * 6. loop ends
         * 7. close the resources
         */

         try{

            Socket clientSocket = new Socket("localhost", 1234);
            System.out.println("Client created with - name: localhost and port: 1234" );


            BufferedReader inFromServer = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()) );
            PrintWriter outToServer = new PrintWriter( clientSocket.getOutputStream(), true );


            BufferedReader clientInput = new BufferedReader( new InputStreamReader(System.in) );

            String clientMessage;
            String serverMessage;

            while( (serverMessage = inFromServer.readLine())  !=  null ){

                System.out.println("Server: " + serverMessage);

                System.out.print("Client: ");
                clientMessage = clientInput.readLine();

                outToServer.println(clientMessage);
            }

            clientInput.close();
            inFromServer.close();
            outToServer.close();
            clientSocket.close();
            
         }catch( Exception e ){

            e.printStackTrace();

         }
         
    }
    
}
