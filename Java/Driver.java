class Driver extends Account {

    public Driver(String name, String document, String email, 
    String password) {
        super(name, document);
    }

    void printDataDriver(){
        System.out.println("Driver name: " + name + 
        " Driver document: " + document);
    }
    
}
