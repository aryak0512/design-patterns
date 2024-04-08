# design-patterns
Common design pattern implementations

# Chapter 1 
Principles : 
- Encapsulate what varies
- Favor composition over inheritance. [Duck object is "composed" of a behavior which can be changed at runtime]
- Program to interfaces or super types, not implementations [concrete implementations]

Strategy : defines a family of algorithms which are encapsulated and can be used interchangeably. Strategy lets the algorithm vary independently regardless of the client that uses it. [E.g any kind of duck can have a FlyBehavior]

# Chapter 2
Principles : 
- Strive for loosely coupled designs between objects that interract with each other

Observer Pattern : defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically. [Subject and its observers]

Observer pattern is implemented in JDK using the Observable class and Observer interface.

Demerits of Java's built in pattern:
- Observable is class and not interface. Violates our principle : "code to interfaces and not concrete classes"
- Observable is class so cannot perform inheritance if subject is already extending a class
- setChanged() is a protected method that needs to be compulsorily get called before notifyObservers() is called.
		To access setChanged() we need to compulsorily extend and call the method in concrete class. (and not Observable)
		
NOTE : Don’t depend on a specific order of notification for your Observers. The order of notifications sent by the observable is not the same as consumed by the observers. 