# Java Methods
Java Methods are blocks of code that perform a specific task

A method allows us to reuse code, improving both efficiency and organization

 All methods in Java must belong to a class.

 Methods are similar to functions and expose the behavior of objects.

Syntax of Java Methods:
 ```
returnType methodName(parameters) {
  // method body
 return value; // optional (only if returnType is not void)
}
```
## Key Components of a Method Declaration:
`Modifier`: Defines access level (public, private, protected, default)

`Return Type`: Specifies what value the method returns or void if no return

`Method Name`: Name of the method, follows camelCase convention

`Parameters`: Optional inputs passed to the method

`Method Body`: Contains the logic or statements to be executed

## Why Use Methods?
Breaking code into separate methods helps improve readability, reusability, and maintainability

`Code Reusability`: Write once, use multiple times without repeating code so that code reusability increase.

`Modularity`: Dividing a program into separate methods allows each method to handle a specific task, making the code more organized and easier to manage.

`Readability`: Smaller, named methods make the code easier to read and understand.

`Maintainability`: It’s easier to fix bugs or update code when it's organized into methods.

## Method Call Stack in Java
Java is an object-oriented and stack-based programming language where methods play a key role in controlling the program's execution flow

When a method is called, Java uses an internal structure known as the call stack to manage execution, variables, and return addresses.

## Call Stack
The call stack is a data structure used by the program during runtime to manage method calls and local variables. It operates in a Last-In-First-Out `(LIFO)` manner, meaning the last method called is the first one to complete and exit.

