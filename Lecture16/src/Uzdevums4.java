import java.util.Random;

public class Uzdevums4 {

    public static void main(String[] args) {

        Random randomMainigais = new Random();
        int dice1;
        int dice2;
        int dice3;

        do {
           dice1 = randomMainigais.nextInt(6) + 1;
           dice2 = randomMainigais.nextInt(6) + 1;
           dice3 = randomMainigais.nextInt(6) + 1;

           System.out.println("Pirmais kauliņš = " + dice1);
           System.out.println("Otrais kauliņš = " + dice2);
           System.out.println("Trešais kauliņš = " + dice3);

        } while (dice1 != dice2 || dice2 != dice3);

        System.out.println("Jūs vinnējāt");

    }
}
