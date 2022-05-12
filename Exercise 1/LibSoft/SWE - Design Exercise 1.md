## SWE - Design Exercise 1

Valentin Stolz 1346475



### Task 2

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



#### Lender Module

##### Lender 

The class `lender` represents a lender in the real world. <br/>It contains the information about the lender in the case of the library of the university<br/>following information is given: first name, last name and matriculation number.



#### Rental Management

##### Reservation

The class `Reservation` represents a reservation of a book in the real world.<br/>It contains of the date when the wanted book is available, how long till the<br/>available date the lender can get the book  and which book is reserved for which lender.<br/>With the method `reservate_copy` the program will reserve a certain copy of a book.

##### Rental

The class `Rental` represents the rental of a book in the real world.<br/>It contains the information about who lent a book, when it was lent, which copy<br/>and when the book has to be returned. <br/>With the method `lend_copy` the program initialize to store the information about<br/>a new renal instance.



#### Database Management

##### DatabaseController

With the help of the  class `DatatbaseController` new books or copies can be<br/>added to the inventory or can be removed from it. <br/>