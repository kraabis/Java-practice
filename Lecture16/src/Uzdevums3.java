import java.util.Random;

public class Uzdevums3 {
    public static void main(String[] args) {
        Random randomMainigais = new Random();
        int uzgeneretsSkaitlis = randomMainigais.nextInt(100) + 1 ;
        int uzgeneretsSkaitlis2 = randomMainigais.nextInt(100) + 1 ;
        int uzgeneretsSkaitlis3 = randomMainigais.nextInt(100) + 1 ;

        System.out.println("Sis ir uzgenerets skaitlis "+ uzgeneretsSkaitlis);
        System.out.println("Sis ir uzgenerets skaitlis "+ uzgeneretsSkaitlis2);
        System.out.println("Sis ir uzgenerets skaitlis "+ uzgeneretsSkaitlis3);

        int sum = uzgeneretsSkaitlis + uzgeneretsSkaitlis2 +uzgeneretsSkaitlis3;

        System.out.println("Summa ir " + sum);
    }
}
