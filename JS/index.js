var car = new Car("AWS547", new Account("Federico Padilla","FED543"));
car.passenger = 4;
car.printDataCar();

console.log("UberX")
var uberX = new UberX("MNT764", new Account("Mateo Salcedo","MAT553"), "Hyundai", "I25");
uberX.passenger = 4;
uberX.printDataCar();

console.log("*****User*****")
var user = new User("Victor Gaviria","10384662","victor@gmail.com","vic123")
user.printDataUser();