# SWE Design - Sheet 3

## Exercise 2

#### Catalogue

`searchBook`; `checkAvailability`; `addBook`; `createBook` ; `checkISBN`; `generateBibTex`

The class `Catalogue` is the **information expert** for the management of the whole library inventory.<br>It also functions as a **creator** for an object of the classes `Book` and `Copy` which get created with the<br/>methods `createBook` and `addCopy`. To be able to get a high **cohesion** and low **coupling** we include<br>all methods which relate to the book inventory in `Catalogue`, the following methods fall under this<br>responsibility:<br>`searchBook`, `checkAvailability`, `checkISBN`, `generateBibTex`



#### UserManagment

`deactivateUser`; `registerUser`; 

The class `UserManagment` is the **information expert** for the management of the users using the<br>LibSoft System. With the method `registerUser` the class functions as a **creator** for objects of<br>the class `Lender`. With the method `deactivateUser` is also in the class to ensure high **cohesion**<br>and low **coupling**.



#### RentalManagment

`rentBook`; `returnBook`;

The class `LenderManagment` is the **information expert** for the management of the book rentals.<br> With the method `rentBook` the class functions as a **creator** for objects of the class `Rental`. <br>The method `returnBook` is also included in the `LenderManagment` to fulfill high **cohesion**<br>and low **coupling**.

