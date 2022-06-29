import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Planeta> planetas= new ArrayList<>();
        List<Satelite> satelites= new ArrayList<>();
        Planeta pluton = new Planeta(Math.random() * 100, Math.random() * 100, Math.random() * 100, Math.random() * 100, Math.random() * 100, Math.random() * 100,
                Math.random() * 100, true);

        Planeta mercurio = new Planeta(Math.random() * 100, Math.random() * 100, Math.random() * 100, Math.random() * 100, Math.random() * 100, Math.random() * 100,
                Math.random() * 100, true);

        planetas.add(pluton);
        planetas.add(mercurio);

        Satelite pluton1= new Satelite(Math.random() * 100,Math.random() * 100,Math.random() * 100,Math.random() * 100,Math.random() * 100,Math.random() * 100,
                Math.random() * 100,pluton);
        Satelite pluton2= new Satelite(Math.random() * 100,Math.random() * 100,Math.random() * 100,Math.random() * 100,Math.random() * 100,Math.random() * 100,
                Math.random() * 100,pluton);

        Satelite mercurio1= new Satelite(Math.random() * 100,Math.random() * 100,Math.random() * 100,Math.random() * 100,Math.random() * 100,Math.random() * 100,
                Math.random() * 100,mercurio);
        satelites.add(pluton1);
        satelites.add(pluton2);
        satelites.add(mercurio1);
        System.out.println("Que quieres ver, satelites o planetas?");
        System.out.println("1.Satelites");
        System.out.println("2.Planetas");
        int respuesta=entrada.nextInt();
        if (respuesta==1){
            Iterator<Satelite> it=satelites.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        } else if (respuesta==2) {
            Iterator<Planeta> it=planetas.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
        else {
            System.out.println("Numero incorrecto");

        }
    }
}