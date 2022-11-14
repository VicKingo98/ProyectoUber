class User extends Account {

    public User(String name, String document, String email, 
    String password) {
        super(name, document);
        this.email = email;
        this.password = password;
    }

    void printDataUser() {
        System.out.println("User name: " + name + " User document: "
        + document);
    }
}
