# design-patterns
Common design pattern implementations

# Chapter 1 
Principles : 
- Encapsulate what varies
- Favor composition over inheritance. [Duck object is "composed" of a behavior which can be changed at runtime]
- Program to interfaces or super types, not implementations [concrete implementations]

Strategy : defines a family of algorithms which are encapsulated and can be used interchangeably. Strategy lets the algorithm vary independently regardless of the client that uses it. [E.g any kind of duck can have a FlyBehavior]