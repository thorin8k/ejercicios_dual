
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        //Creamos 5 instancias de la clase Producto.
        Producto p1 = new Producto("tomate",2);
        Producto p2 = new Producto("lechuga",5);
        Producto p3 = new Producto("pescado",4);
        Producto p4 = new Producto("carne",6);
        Producto p5 = new Producto("cerveza",9);

        //Creamos un ArrayList.
        ArrayList<Producto> a = new ArrayList<Producto>();

        //Añadimos las 5 instancias de Producto al ArrayList.
        a.add(p1);
        a.add(p2);
        a.add(p3);
        a.add(p4);
        a.add(p5);

        //Visualizamos el ArrayList con un Iterator.
        Iterator<Producto> it = a.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.print("****************");
        System.out.println("");

        //Eliminamos dos elementos del ArrayList
        a.remove(4);
        a.remove(1);

        //Insertamos un elemento en medio de la lista.
        a.add(1,p1);

        //Visualizamos nuevamente el ArrayList
        it = a.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Eliminamos todos los valores del ArrayList
        a.removeAll(a);

    }

}
