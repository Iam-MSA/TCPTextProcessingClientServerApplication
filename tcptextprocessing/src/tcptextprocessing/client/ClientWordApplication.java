package tcptextprocessing.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
//hello
/**
 * This class launches the frame and manages 
 * the connection to the server.
 * 
 * @author Mirza Sahid Afridi
 */
public class ClientWordApplication {

    public static void main(String[] args) throws UnknownHostException, IOException {

        // Launch client-side frame
        ClientWordFrame clientDateFrame = new ClientWordFrame();
        clientDateFrame.setVisible(true);

        // Connect to the server @ localhost, port 4228
        Socket socket = new Socket(InetAddress.getLocalHost(), 4228);

        // Update the status of the connection
        clientDateFrame.updateConnectionStatus(socket.isConnected());

        // Read from network
        BufferedReader bufferedReader = new BufferedReader
        		(new InputStreamReader(socket.getInputStream()));
        
        // Display the current date
        String currentDate = bufferedReader.readLine();
        clientDateFrame.updateServerDate(currentDate);

        // Close everything
        bufferedReader.close();
        socket.close();

    }

}
