public class CarLauncher {
    public static void main(String[] args) {

        Car carMainigais = new Car();

        carMainigais.setCarModel("Tesla model M");
        carMainigais.setYear(2020);
        carMainigais.setNew(true);


        System.out.println("Model " + carMainigais.getCarModel());
        System.out.println("Year "+ carMainigais.getYear());
        System.out.println("Is new " + carMainigais.isNew());

    }
}
