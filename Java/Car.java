class Car {
    private Integer id;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String license;
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    private Account driver;
    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    protected Integer passenger;

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        } 
    }

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if(passenger != null){
        System.out.println("License: " + license + " Driver: " + 
        driver.name + " Passengers: " + passenger);
        }
    }
}
