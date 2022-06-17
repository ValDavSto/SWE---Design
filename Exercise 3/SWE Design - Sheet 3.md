# SWE Design - Sheet 3

## Exercise 2

#### Catalogoue

`searchBook`; `checkAvailability`; `addBook`; `createBook` ; `checkISBN`; `generateBibTex`

The class `Catalogue` is the **information expert** for the managment of the whole library inventory.<br>It also functions as a **creator** for an object of the classes `Book` and `Copy` which get created with the<br/>methods `createBook` and `addCopy`. To be able to get a high **cohesion** and low **coupling** we include<br>all methods which relate to the book inventory in `Catalogue`, the following methods fall under this<br>responsibility:<br>`searchBook`, `checkAvailability`, `checkISBN`, `generateBibTex`



#### UserManagment

`deactivateUser`; `registerUser`; 

The class `UserManagment` is the **information expert** for the managment of the users using the<br>LibSoft System. With the method `registerUser` the class functions as a **creator** for objects of<br>the class `lender`. With the method `deactivateUser` is also in the class to enshure high **cohision**<br>and low **coupling**.



#### RentalManagment





 