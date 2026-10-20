import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] a) {
        try (Socket s = new Socket("localhost", 5000);
                BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintWriter out = new PrintWriter(s.getOutputStream(), true)) {
            out.println("Hello from client");
            System.out.println("Server: " + in.readLine());
        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage() + ". Start Server first.");
        }
    }
}
