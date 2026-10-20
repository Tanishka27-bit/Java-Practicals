import java.rmi.*;

public interface CalculatorRemote extends Remote {
    int add(int a, int b) throws RemoteException;
}
