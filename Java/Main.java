class Main{

    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        Car car = new Car("AMQ123", new Account("Andrés Herrera", "AND123"));
        car.passenger = 4;
        car.printDataCar();

        Driver driver = new Driver("Paola Agudelo","PAO234","pao@gmail.com","pao123");
        UberX uberx = new UberX("JAK067",new Driver("Paola Agudelo", "PAO234","pao@gmail.com","pao123"),"Chevrolet","Camaro");
        uberx.passenger = 3;
        uberx.printDataCar();
        driver.printDataDriver();
    }
}