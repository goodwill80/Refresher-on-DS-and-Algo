Java:

1. What is the syntax for enhanced switch case?
- provides a more concise and expressive way to write switch statements.
- String result = switch (value) {
  case 1 -> "One";
  case 2, 3 -> "Two or Three";
  default -> "Other";
  };


2. What is the difference between an abstract class and interface?
- An abstract class is a class that may contain abstract methods along with non-abstract methods, fields, and constructors. It can also have method implementations. On the other hand, an interface is a reference type that defines a contract or a set of methods that a class implementing the interface must adhere to. It only contains method signatures and constants (public static final fields).
- Abstract classes are used for class hierarchies, providing common implementation, while interfaces are used to define contracts and allow multiple inheritance of behavior. The decision to use an abstract class or an interface depends on the specific requirements and design goals of the application.
