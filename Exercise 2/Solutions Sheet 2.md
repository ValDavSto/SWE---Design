## Solutions: Sheet 2

| Student             | Matrikel Number |
| ------------------- | --------------- |
| Valentin Stolz      | 1346475         |
| Patryk Brychcy      | 1298691         |
| Sascha Gavrilov     | 1298701         |
| Abdurrahman Farimza | 1410712         |
| Max Semdner         | 1294899         |

### Exercise 1 + 2

![](/home/max/GitHub/SWE---Design/Exercise%202/UML/uml.png)

If the image is too small to read follow: https://github.com/ValDavSto/SWE---Design/blob/main/Exercise%202/UML/uml.png

#### LibraryManagement

##### LibraryManagmentSystem 

The class `LibraryManagementSystem` is used the implement the whole GUI for the user/employee<br>to access the software





#### Book Inventory

##### Copy 

The class `Copy` represents an individual copy of a certain book in the real world.<br/>For the program the class `Copy` is needed to keep track of each individual copy.<br/>It contains an unique `copy_id` the place where it is in the library and two flags <br/>which indicate if the copy is landed or reserved



##### ISBN

The class `ISBN` represents the **I**nternational **S**tandard **B**ook **N**umber of a book. <br>For that all the important information is retrieved from the ISBN and is stored in separate values.



##### Author

The class `author` represents the author of the book.<br/>This class just stores the name of the author in two Strings.<br/>It gives the program the possibility to store multiple authors for one book.



##### Title

The class `Title` stores the bibliographic information about  the book. <br/>This information contains the actual `title` of the book, the `page_number`,<br/>`publisher`, `year_of_publication` and the authors using the `Author` class.



##### Book

The class `Book` represents a book in the real world as whole.<br/>This class just take all the previous given classes and combines the information.<br/>One part is all the information about the book with `ISBN` and `Title`.<br/>The other part is the managing of all the copies in the library with the help of the `Copy` class.



##### Catalogue

The class `Catalogue` is used to manage the library inventory. <br>Following methods are implemented to manage the inventory:<br>`searchBook`: Searches a book by the name in the inventory and returns a boolean if the library has the book<br>`chekcAvailability`: Checks if a copy of a certain is available, it can be checked by the ISBN or the name<br>										and will return the number of available copies<br>



All following methods will return a boolean to check the successful outcome

`addBook`: A new copy of a book will be added to the inventory<br>`createBook`: A new book will be added to the inventory<br>`checkISBN`: With the help of the checksum the method will check if the given ISBN is correct<br>`generateBibTeX`: The method will create a BibTex file based on a given book





#### Lender Module

##### Lender 

The class `lender` represents a lender in the real world. <br/>It contains the information about the lender in the case of the library of the university<br/>following information is given: first name, last name and matriculation number.



##### UserManagment

The class `UserManagment` manages the access of the users/lenders.<br>Following methods are  implemented:<br>`deactivateUser` : With the matriculationnumber of a lender can be deactivated because of missbehavior<br>`registerUser` : A new user will be registered in the LibSoft with his/her credentials 





#### Rental Management

##### Reservation

The class `Reservation` represents a reservation of a book in the real world.<br/>It contains of the date when the wanted book is available, how long till the<br/>available date the lender can get the book  and which book is reserved for which lender.<br/>



##### Rental

The class `Rental` represents the rental of a book in the real world.<br/>It contains the information about who lent a book, when it was lent, which copy<br/>and when the book has to be returned. <br/>



##### RentalManagment

The class `RentalManagment` manages the all rentals.<br>The class implements following methods:<br>`rentBook` :  A given copy of a book  will be marked as rented<br>`retrunBook`: The method will set a given copy of a book as available<br>`reservateCopy`: A currently not available copy will be reserved for a lender

All methods will return a boolean to check if the operation was successful.

### Exercise 3

>  See attachment