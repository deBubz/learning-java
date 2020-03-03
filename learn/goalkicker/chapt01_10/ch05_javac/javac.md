# Java compiler `javac`

## `javac` basics

### Simple example

Assuming the following *"Hello.java" contains

```java
public class Hello{
    public static void main(String[] args) {
        System.out.println("Hey");
    }
}
```

This is compled using
```bash
$   javac Hello.java
```
creates the file `Hello.class` which can be run as:
```bash
$   java Hello
Hey 
```

So key points

1. source filename `Hello.java` must match the class name in the source file
2. bytecode filename `Hello.class` correspond to the classname
3. when running Java app with `java`, use the classname

### Example with packages

Most java code uses packages to organize the name spacke for classes and reduce the risk of accidental classname collision.

So to declare the `Hello` in the package `com.example`
```java
package com.example;

public class Hello {
    public static void main(String[] a) {
        System.out.println("Hey");
    }
}
```

The sourve code file needs to be stored in a dir tree corresponding to the package maning
```java
package com.example;
// ~/Dir/com/example/Hello.java
```
which will creates `Hello.class` in the same directory

### Commonly used `javac`

- `-d` set destination dir for the `.class` bytefiles
- `-sourcepath` sets a source code search path
- `-cp` or `-classpath` sets the search path for finding external and previously complised classes (classpath)

## Compiling for differen versions

There are many different changes to the Java language and runtime, this include:

- Changes in the Java syntax and sematics
- Changes in the API provided by the java standard class
- Changes in the Java(bytecode) instruction set and classfile format

## Compiling old Java with a newer compiler

basicly use the `-source` to disable the new syntax??

```
$   javac -source 1.4 OldSyntax.java
```

