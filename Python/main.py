from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo!")
    car = Car("JPU879", Account("Juan Pablo Zapata", "JP654"))
    print(vars(car.driver))

    car2 = Car("HJU789", Account("Martha Fernández", "MF654"))
    print(vars(car2.driver))