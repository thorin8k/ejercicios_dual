import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Producto1", 1);
        Producto p2 = new Producto("Producto2", 2);
        Producto p3 = new Producto("Producto3", 3);
        Producto p4 = new Producto("Producto4", 4);
        Producto p5 = new Producto("Producto5", 5);

        ArrayList<Producto> lista = new ArrayList<>();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        Iterator <Producto> it = lista.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        lista.remove(p2);
        lista.remove(p3);

        Producto p6 = new Producto("Producto6", 6);

        lista.add(2, p6);

        it = lista.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        
        while (it.hasNext()){
            lista.remove(it);
        }

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}