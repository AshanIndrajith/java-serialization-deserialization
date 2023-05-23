import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalculator extends UnicastRemoteObject implements Calculator {


    protected MyCalculator() throws RemoteException {
        super();
    }



    @Override
    public int addNumber(int x, int y) throws RemoteException {
        return x+y;
    }
}
