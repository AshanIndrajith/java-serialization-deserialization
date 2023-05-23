import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Clent {

    public static void main(String[] args) {


        try {
            Registry reg=LocateRegistry.getRegistry("localhost",53421);
            Calculator cal=(Calculator) reg.lookup("mycal");

            int add=cal.addNumber(10,20);
            System.out.println(add);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }


    }


}
