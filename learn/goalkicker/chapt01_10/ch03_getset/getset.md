# Getters and Setters

This just to discuss getter and setters to access to data in Java class

## Using getters/setters to implement constraints

Getters and setters allow for objects containing `private` variabbles which can be accessed and changed with restriction.

```java
public class Person {
    private String name;

    public String getName() { return name; }
    public void setName(String name) {
        if(name!=null && name.length()>2) this.name = name;
    }
}
```

I can use this for validation

## Why use them

From the doc, the main reason is "security" ??

Its true its to choose how the user can interact with the class,
giving the class a more guarded internal nature as **it** dictates.


## Adding get/set

This is to achieve **encapsulation**. Its to wrap data and code as a sigle unit. A good practice to declare the variables `private` and access them through getters and setters to view/modify them

```java
private String name;

public void setName(String name) { this.name = name; }
public String getName() { return this.name; }
```

Public getter and setters are part of the `Property` definition of a `Java Bean`