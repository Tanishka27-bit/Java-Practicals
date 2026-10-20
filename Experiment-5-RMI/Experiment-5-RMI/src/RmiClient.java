import java.rmi.registry.*;

public class RmiClient {
    public static void main(String[] a) {
        try {
            Registry r = LocateRegistry.getRegistry("localhost", 1099);
            CalculatorRemote c = (CalculatorRemote) r.lookup("CalculatorService");
            System.out.println("10 + 20 = " + c.add(10, 20));
        } catch (Exception e) {
            System.out.println("Start RmiServer first");
            e.printStackTrace();
        }
    }
}
