import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

    public int addNumber(int x, int y) throws RemoteException;


}
