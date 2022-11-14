class Main{

    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        UberX uberx = new UberX("JAK067",new Account("Paola Agudelo", "PAO234"),"Chevrolet","Camaro");
        uberx.setPassenger(4);
        uberx.printDataCar();
    }
}