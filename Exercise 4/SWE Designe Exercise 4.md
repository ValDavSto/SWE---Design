# SWE Designe Exercise 4

#### 1) Adapter

The Library Managements System of the other university's has a different implementation, but we still want to be able to only have one search method for all inventories. For this reason the implementation of the other library need to be adapted to our implementation, to realize this we take use of the Adapter pattern.  In our case the target is our implemented search. The adaptee is the implementation of the REST API (Not completely sure) of the other universities. For each university we need a separate adapter class, because each implementation is different (assumption). 



#### 2) Patterns 

##### Singleton:

The Singleton pattern can be applied for the controller class, only one instance of each controller class is necessary.



##### Strategy:





#### 3) Design-by-Contract

**sqrt:**

method signature: `sqrt(double x)`

pre-condition: `assert x >= 0;`

post-condition: `assert result^2 == x`



**getNextElement (Queue):**

method signature: `getNextElement()`

pre-condition: `assert queue.isEmpty() == false`

post-condition: ??



**setAge:**

method signature: `setAge(int newAge)`

pre-condition: `assert newAge >= 0 && newAge % 2 == 0`

post-condition: `assert newAge >= 0 && newAge % 2 == 0 ` ??



**setBirthday:**

method signature: `setBirthday(LocalDate Birthday)`

pre-condition: ?

post-condition: ?



**rentBook:**

method signature: `rentBook(int copyID)`

pre-condition: `assert checkAvailability(copy.getISBN()) > 0`

post-condition: availability has to be at least one lower than before (not perfect if multiple counters exist and the book could also be  returned by another lender)



**returnBook:**

method signature: `retunrBook(int copyID)`

pre-condition: `` (If the lender still has the book or it is damaged can not be tested by the program)

post-condition: `` availability has to be at least one higher than before



**addCopy:**

method signature: `addCopy(Copy copy)`

pre-condition: `assert` Copy ISBN is the same as Book ISBN

post-condition: new Copy can be find with its id in the inventory



**deleteCopy.**

method signature: `deleteCopy(Copy copy)`

pre-condition: the Copy exists in the inventory

post-condition: the Copy does not exist in the inventory anymore



**addController:**

method signature: `addController()` (it cant be differentiated between controllers)

pre-condition: `assert console.getControllerCount() < 4 && console.getControllerCount() >= 1` (console is an Object of the class 							`GamingConsole` and `getControllerCount()` is a method which returns the number of connected controllers)

post-condition: `assert console.getControllerCount() <= 4 && console.getControllerCount() >= 2`



**removeController:**

method signature: `removeController()`

pre-condition: `assert console.getControllerCount() >= 3`

post-condition: `assert console.getControllerCount() >= 2`