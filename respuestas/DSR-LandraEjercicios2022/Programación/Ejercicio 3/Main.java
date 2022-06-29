import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Producto prod_1 = new Producto("prod1",10);
        Producto prod_2 = new Producto("prod2",5);
        Producto prod_3 = new Producto("prod3",1);
        Producto prod_4 = new Producto("prod4",6);
        Producto prod_5 = new Producto("prod5",8);

        ArrayList<Producto> producto = new ArrayList<Producto>();
        producto.add(prod_1);
        producto.add(prod_2);
        producto.add(prod_3);
        producto.add(prod_4);
        producto.add(prod_5);

        Iterator<Producto> iter = producto.iterator();

        while (iter.hasNext()) {
            System.out.print("\n"+iter.next() + " ");
        }

        producto.remove(prod_2);
        producto.remove(prod_4);

        Producto prod_6 = new Producto("prod6",4);
        producto.add(1,prod_6);
        iter=producto.iterator();
        System.out.println("\n------------");
        while (iter.hasNext()) {
            System.out.print("\n"+iter.next() + " ");
        }
        producto.clear();
        iter=producto.iterator();
        System.out.println("\n------------");
        while (iter.hasNext()) {
            System.out.print("\n"+iter.next() + " ");
        }



    }






}