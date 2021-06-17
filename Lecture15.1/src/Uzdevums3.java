public class Uzdevums3 {

    public static void main(String[] args) {
        int soundLevel = 1000;

            if (soundLevel <= 39){
                System.out.println("vajs");
        } else if (soundLevel >= 40 && soundLevel <= 69) {
            System.out.println("Merens");
        } else if (soundLevel >= 70 && soundLevel <= 99) {
            System.out.println("Skals ");
        } else if (soundLevel >= 100 && soundLevel <= 129) {
            System.out.println("Loti Skali");
        } else{
            System.out.println("Sapigi");
        }
    }
}