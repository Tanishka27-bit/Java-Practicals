import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] a) {
        try (ServerSocket ss = new ServerSocket(5000)) {
            System.out.println("Server waiting on port 5000");
            try (Socket s = ss.accept();
                    BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    PrintWriter out = new PrintWriter(s.getOutputStream(), true)) {
                System.out.println("Client: " + in.readLine());
                out.println("Hello from server");
            }
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
