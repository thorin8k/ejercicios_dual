import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Producto prod1= new Producto("prod1",(int)(Math.random()*100));
        Producto prod2= new Producto("prod2",(int)(Math.random()*100));
        Producto prod3= new Producto("prod3",(int)(Math.random()*100));
        Producto prod4= new Producto("prod4",(int)(Math.random()*100));
        Producto prod5= new Producto("prod5",(int)(Math.random()*100));
        productos.add(prod1);
        productos.add(prod2);
        productos.add(prod3);
        productos.add(prod4);
        productos.add(prod5);
        Iterator<Producto> iterator=productos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        productos.remove(3);
        productos.remove(2);
        Producto prod = new Producto("prod",(int)(Math.random()*100));
        productos.add( productos.size()/2,prod);
        System.out.println();
        iterator=productos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        productos.clear();
    }
}
