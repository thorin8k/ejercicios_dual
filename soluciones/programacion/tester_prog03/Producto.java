import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Producto {

    private String nombre;
    private int cantidad;

    public Producto() {
    }

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String toString() {
        return "----\nNombre: " + this.nombre + "\nCantidad: " + this.cantidad;
    }

    public static void main(String[] args) {

        Producto prd1 = new Producto("test", 1);
        Producto prd2 = new Producto("test2", 2);
        Producto prd3 = new Producto("test3", 3);
        Producto prd4 = new Producto("test4", 4);
        Producto prd5 = new Producto("test5", 5);

        List<Producto> productos = new ArrayList<>();

        productos.add(prd1);
        productos.add(prd2);
        productos.add(prd3);
        productos.add(prd4);
        productos.add(prd5);
        System.out.println("Longitud actual: " + productos.size());
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----");

        System.out.println();
        System.out.println();
        System.out.println("------------- Segunda parte:");

        productos.remove(prd2);
        productos.remove(prd4);
        productos.add(Integer.valueOf(productos.size()/2), new Producto("test6", 6));
        System.out.println("Longitud actual: " + productos.size());

        iterator = productos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----");

        productos.clear();

        System.out.println();
        System.out.println("Eliminando....");
        System.out.println("Longitud actual: " + productos.size());
    }
}
