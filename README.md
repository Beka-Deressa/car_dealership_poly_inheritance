1. **Define the Car class:** Start by creating a class called `Car`. This class should have properties common to all cars such as `make`, `model`, and `price`. It should also have a constructor to initialize these properties and getter methods to retrieve their values.

2. **Define subclasses for Car:** Next, define subclasses for specific types of cars. Create subclasses for `Sedan` and `SUV`. These classes should extend the `Car` class and call the parent constructor to initialize the common properties. (super())

3. **Create the CarDealer class:** Now, in the `CarDealer` class add an `ArrayList` of `Car` objects to represent the `inventory`.

4. **Add methods to CarDealer:** Add the following methods to the `CarDealer` class:
    - An `addCar()` method that takes a `Car` object and adds it to the `inventory`.
    - A `sellCar()` method that takes a `Car` object and removes it from the `inventory`.
    -
    - .

5. **Test your classes:** Finally, write some test code to make sure your classes are working correctly. Create instances of `Sedan` and `SUV`, add them to the dealer's `inventory`, and sell them. Check that the `getInventoryCount()` method returns the correct number of cars in the `inventory` after each operation.
