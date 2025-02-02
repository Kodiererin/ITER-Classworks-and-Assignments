import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Obj2 {
    public static void main(String[] args) {
        try {
            System.out.println("Name: Ujjwal Kumar \nRegistration Number: 2141011063");
            String serverAddress = "time.nist.gov";
            int port = 13;

            Socket socket = new Socket(serverAddress, port);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Server Response:");

            int data;
            while ((data = br.read()) != -1) {
                System.out.print((char) data);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
