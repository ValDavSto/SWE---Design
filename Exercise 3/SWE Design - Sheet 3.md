# SWE Design - Sheet 3

## Exercise 2

#### Catalogue

`searchBook`; `checkAvailability`; `addBook`; `createBook` ; `checkISBN`; `generateBibTex`

The class `Catalogue` is the **information expert** for the management of the whole library inventory.<br>It also functions as a **creator** for an object of the classes `Book` and `Copy` which get created with the<br/>methods `createBook` and `addCopy`. To be able to get a high **cohesion** and low **coupling** we include<br>all methods which relate to the book inventory in `Catalogue`, the following methods fall under this<br>responsibility:<br>`searchBook`, `checkAvailability`, `checkISBN`, `generateBibTex`



#### UserManagment

`deactivateUser`; `registerUser`; 

The class `UserManagment` is the **information expert** for the management of the users using the<br>LibSoft System. With the method `registerUser` the class functions as a **creator** for objects of<br>the class `Lender`. With the method `deactivateUser` is also in the class to ensure high **cohesion**<br>and low **coupling**.



#### RentalManagement

`rentBook`; `returnBook`;

The class `LenderManagment` is the **information expert** for the management of the book rentals.<br> With the method `rentBook` the class functions as a **creator** for objects of the class `Rental`. <br>The method `returnBook` is also included in the `LenderManagment` to fulfill high **cohesion**<br>and low **coupling**.

## Exercise 3

#### Catalogue

`removeBook`; `checkBookAvailability`; `findBookLocation`; `openOnlineLocation`

The `Catalogue` class is the **information expert** for the management of the library's inventory. It functions as a **creator** for objects of the classes `Book` which get created in the methods `removeBook`, `checkBookAvailability`, `findBookLocation` and as a **creator** for objects of the classes `Copy` created in the method `openOnlineLocation`. To be able to get a high **cohesion** and low **coupling** we include all methods which relate to the book inventory in `Catalogue`, the following methods fall under this responsibility:`removeBook`, `checkBookAvailability`, `findBookLocation`

#### UserManagement

`authenticateUser`; 

The class `UserManagment` is the **information expert** for the management of the users using the LibSoft System. With the method `registerUser` the class functions as a **creator** for objects of the class `Lender`. With the method `authenticateUser` is also in the class to ensure high **cohesion** and low **coupling**.

#### RentalManagement

`extendRental`; `reportBookRentalHistory`;`reportLenderRentalHistory`; `reserveBook`; `remindUser`

The class `LenderManagment` is the **information expert** for the management of the book rentals. With the method `rentBook` the class functions as a **creator** for objects of the class `Rental`. The method `extendRental`, `reportLenderRentalHistory`, `reserveBook`, `remindUser` are not part of the `UserManagement` as the class `RentalManagement` has an attribute `Lender`. So `RentalManagement` serves as a **creator** for an object of `Lender`.  If the class `UserManagement` would also contain an attribute of `RenatalManagemt` you would have a higher coupling. However, to achieve low **coupling** and high **cohesion** only `RentalManagement` contains the object and uses it for rental methods which require an user such as `extendRental`, `reportLenderRentalHistory`, `reserveBook`, `remindUser`. Further more the method `reportBookRentalHistory` functions as an **creator** of an object of the Class `Book`.
