from car import Car

if __name__ == "__main__":
    print("Hola mundo!")
    car = Car()
    car.license = "JPU879"
    car.driver = "Juan Pablo Zapata"
    print(vars(car))

    car2 = Car()
    car2.license = "HJU789"
    car2.driver = "Martha Fernández"
    print(vars(car2))