"""Assignment 2: Vehicle Inheritance Example
Base class: Vehicle -> Subclasses: Car, Bike (methods overridden)
"""


class Vehicle:
    """Base class."""

    def __init__(self, brand, model):
        self.brand = brand
        self.model = model

    def start(self):
        print(f"{self.brand} {self.model}: Vehicle is starting.")

    def move(self):
        print(f"{self.brand} {self.model}: Vehicle is moving.")

    def info(self):
        print(f"Vehicle -> Brand: {self.brand}, Model: {self.model}")


class Car(Vehicle):
    """Car overrides start, move and info."""

    def __init__(self, brand, model, doors):
        super().__init__(brand, model)
        self.doors = doors

    def start(self):
        print(f"{self.brand} {self.model}: Car engine starts with a key/push button.")

    def move(self):
        print(f"{self.brand} {self.model}: Car is driving on four wheels.")

    def info(self):
        print(f"Car -> Brand: {self.brand}, Model: {self.model}, Doors: {self.doors}")


class Bike(Vehicle):
    """Bike overrides start, move and info."""

    def __init__(self, brand, model, has_gear):
        super().__init__(brand, model)
        self.has_gear = has_gear

    def start(self):
        print(f"{self.brand} {self.model}: Bike starts with a kick/self-start.")

    def move(self):
        print(f"{self.brand} {self.model}: Bike is riding on two wheels.")

    def info(self):
        gear = "Yes" if self.has_gear else "No"
        print(f"Bike -> Brand: {self.brand}, Model: {self.model}, Gears: {gear}")


if __name__ == "__main__":
    vehicles = [
        Vehicle("Generic", "V1"),
        Car("Toyota", "Innova", 4),
        Bike("Honda", "Shine", True),
    ]

    # Polymorphism: same method calls, different behaviour per class
    for v in vehicles:
        v.info()
        v.start()
        v.move()
        print()
