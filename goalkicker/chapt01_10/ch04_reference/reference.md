# Reference Data Type

## Dereferencing

Basicly the `.` to access data, methods within the object

```java
Object obj = null;
obj.toString();     // 'obj' dereferenced
```

*Dereferencing* follows the memory addr stored in a reference, to place in memory where the actual object resides.

When a referenced has the value `null`, dereferencing results in a `NullPointerException`

`null` indicates the absence of a value, following the memory address leads nowhere. So there is no object on which the requested method can be called.

## Instantiating a reference type

```java
Object obj = new Object();
```

- So
  - `Object` is a reference type
  - `obj` is the variable in which to store the new reference
  - `Object()` is to call a constructor of `Objecct`
- What happens:
  - Space in memory is allocated for the object
  - the const `Object()` is called to initialize that memory space
  - the memory addr is stored in `obj`, so that it `referenced` the newly created object.

Which is very different from primitives variabbles, where the actual value is stored in val