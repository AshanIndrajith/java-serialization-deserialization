import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {

    public static void main(String[] args) {

        try {
            Registry reg=LocateRegistry.createRegistry(53421);
            Calculator cal=new MyCalculator();
            reg.rebind("mycal",cal);

            System.out.println("running");

        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }


    }
}
