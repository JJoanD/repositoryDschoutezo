import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Botte botte = new Botte();
        List <ThreadBevitore> bevitori = new ArrayList<>();
        ThreadBevitore b1 = new ThreadBevitore(botte, "Pippo");
        ThreadBevitore b2 = new ThreadBevitore(botte, "Brogi");
        ThreadBevitore b3 = new ThreadBevitore(botte, "Sae");
        ThreadBevitore b4 = new ThreadBevitore(botte, "ALessio");
        ThreadBevitore b5 = new ThreadBevitore(botte, "Gino");
        ThreadBevitore b6 = new ThreadBevitore(botte, "Ahmed");
        ThreadBevitore b7 = new ThreadBevitore(botte, "Salah");
        ThreadBevitore b8 = new ThreadBevitore(botte, "Messi");
        ThreadBevitore b9 = new ThreadBevitore(botte, "Dino");
        ThreadBevitore b10 = new ThreadBevitore(botte, "Grillo");

        bevitori.add(b1);
        bevitori.add(b2);
        bevitori.add(b3);
        bevitori.add(b4);
        bevitori.add(b5);
        bevitori.add(b6);
        bevitori.add(b7);
        bevitori.add(b8);
        bevitori.add(b9);
        bevitori.add(b10);

        for (ThreadBevitore threadBevitore : bevitori) {
            threadBevitore.start();
        }

        Thread.sleep(10000);
        botte.finitoDiBere(b1.getNome());

        Thread.sleep(1000);
        System.out.println("Vino ancora a disposizione: " + botte.getLitri() +"l");
        System.exit(0);
    }
}
