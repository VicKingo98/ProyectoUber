from account import Account
from car import Car
from driver import Driver
from uberx import UberX

if __name__ == "__main__":
    print("Hola mundo!")
    car = Car("JPU879", Account("Juan Pablo Zapata", "JP654"))
    print(car)
    print(vars(car.driver))

    car2 = UberX("HJU789", Driver("Martha Fernández", "MF654"),"Toyota","Corolla")
    print(vars(car2))
    print(vars(car2.driver))