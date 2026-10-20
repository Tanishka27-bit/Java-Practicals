import java.rmi.registry.*;

public class RmiServer {
    public static void main(String[] a) {
        try {
            CalculatorRemote service = new CalculatorRemoteImpl();
            Registry r;
            try {
                r = LocateRegistry.createRegistry(1099);
            } catch (java.rmi.server.ExportException e) {
                r = LocateRegistry.getRegistry(1099);
            }
            r.rebind("CalculatorService", service);
            System.out.println("RMI server ready on port 1099");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
