# Data types are divided into two groups:

Primitive data types - includes `byte`, `short`, `int`, `long`, `float`, `double`, `boolean` and `char`

Non-primitive data types - such as `String`, `Arrays` and `Classes`

## Primitive Data Types

Primitive data types in Java are the predefined data types that store simple values directly. They are not objects and do not have methods.

### Primitive number types are divided into two groups:
Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are `byte`, `short`, `int` and `long`. Which type you should use, depends on the numeric value.

Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: `float` and `double`.  

## Non-Primitive Data Types
Non-primitive data types are called reference types because they refer to objects.

The main differences between primitive and non-primitive data types are:

Primitive types in Java are predefined and built into the language, while non-primitive types are created by the programmer (except for String).

Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.

Primitive types start with a lowercase letter (like int), while non-primitive types typically starts with an uppercase letter (like String).

Primitive types always hold a value, whereas non-primitive types can be `null`.

Examples of non-primitive types are `Strings`, `Arrays`, `Classes` etc

### The var Keyword

The `var` keyword was introduced in Java 10 (released in 2018).

The `var` keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.
