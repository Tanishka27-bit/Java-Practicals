import java.rmi.*;
import java.rmi.server.*;

public class CalculatorRemoteImpl extends UnicastRemoteObject implements CalculatorRemote {
    public CalculatorRemoteImpl() throws RemoteException {
        super();
    }

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
