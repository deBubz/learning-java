# OOP stuff

- Encapsulation
- Inheritance 
- Polymorphism
- Abstraction

--- 

## Encapsulation

- wrapping data into a single unit(class) or scoping

[BankAccount example](BankAccount1/)

## Inheritance

- when one class acquires methods and fields of another
- child class inherit from parent/super class
- uses the extends keyword

> [Inheritance](Insects/)

- Pros
  - Minimize code duplication
- Cons
  - Tightly coupled
  - Increased Effort to jump through abstractions to get appropriate functionalities

## Interface

- enforce certain fields/methods on a class
- Interface do not enforce how these method should be implemented - you just MUST HAVE them

> [Interface](Pets/)


## Functional programming

- focuses on computing result from functions rather than perfoming actions on objects
- Obj are immutable
- Instead of modifying or changing obj, create a new obj which looks like the old obj except for the change.

## Lambda

- anonymous objects/ functions that you can create without adding more code
- great tool if you need quick function for a quick calculation/operation
- often are single purpose and do not affect other code

```java
// fuction returning a string
() -> { return "Hello";}

// will thow error if not use with an interface
```


## Misc

### Primitive v Wrapper class

- primitive types have less flexibility. Only binary val of the type can be stored init
- Wrapper class provides more flexibility in storing, converting and manipulating data

