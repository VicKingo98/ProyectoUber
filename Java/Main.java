class Main{

    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andrés Herrera";
        car.passenger = 4;
        car.printDataCar();


        Car car2 = new Car();
        car2.license = "JAK067";
        car2.driver = "Paola Agudelo";
        car2.passenger = 3;
        car2.printDataCar();
        
    }
}