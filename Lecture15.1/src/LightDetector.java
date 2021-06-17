public class LightDetector {
    public static void main(String[] args) {

        int lightRange = 450;

        if (lightRange >= 380 && lightRange <= 449){
            System.out.println("violet");
        }else if (lightRange >= 450 && lightRange <= 494){
            System.out.println("blue");
        }else if (lightRange >= 495 && lightRange <= 569){
            System.out.println("Green");
        }else if (lightRange >= 570 && lightRange <= 589){
            System.out.println("Yellow");
        }else if (lightRange >= 590 && lightRange <= 619){
            System.out.println("Orange");
        }else if (lightRange >= 620 && lightRange <= 750){
            System.out.println("Red");
        }else {
            System.out.println("Invisible Light");
        }
    }
}
