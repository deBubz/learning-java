# Primitive Data Type

There ae 8 primitives type `byte`, `short`, `int`, `long`, `char`, `boolean`, `float` and `double`

## char primitive

stores `16-bit` unicod, the litteral is enclosed in single quotes

- Default value `\u0000`
- max val `\uffff` (65,535) min val `\uf0000` (0)
- use the escape character to declare a char of any unicode character
  
Its possible to add to a `char`

```java
// itterating through every lower-case letter
for (int i = 0; i <= 26; i++) {
    char letter = (char) ('a' + i); 
    System.out.println(letter);
}
```

## Primitive Tyoe Cheatsheet

page 43

just a table with primitives, their memory size and range

## float primitive

- by defauly decimals are interperated as `doubles`
- to create a `float`, append an `f` to the decimal literal
- because of how floating point numbers are stored (in binary), many numbers dont have an exact representation.
```java
float bad = 3.145926f;
System.out.print(bad);  //  3.145925 loss of data
```
- while float is fine for most applications, both `float` and `double` should **not** be used for large decinal numbers. use `BigDecimal`
- default float val is `0.0f`

## Int primitive

- primitive `int` variable directly hold the value, while `Interger` holds a referece to the value
- 32-bit signed int

> Test out some code IntTest.java

## Converting Primitives

- we can convert btween `int` and `floating point` values
- since every `char` correspond to a number in Unicode encoding, `char` types can be convert to/from `int` and `floating point` obj type
- `bool` is the only type that cannot be converted to/from other types (test)
- 2 types of conversion
  - **Widening** when converting one type to another which occupies more bits (no loss of data)
    ```java
    //  done automaticly
    int a = 1;
    double d = a;   // valid conversion
    ```
  - **Narrowing** converting one type to another which occupies less bits (possible loss of data)
    ```java
    double d = 18.96;
    int b = d;          //  invalid, throw compile-time error
    int b = (int) d;    //  valid, but value is now trucated
                        //  b = 18
    ```

## Memory consumption of primitives v boxed primitives

| Primitive | Boxed | Memory size Primitive/boxed |
|---|---|---|
|`boolean`|`Boolean`| 1 byte / 16 byte |
|`short`|`Short`| 1 byte / 16 byte |
|`char`|`Char`| 2 byte / 16 byte |
|`int`|`Integer`| 4 byte / 16 byte |
|`long`|`Long`| 8 byte / 16 byte |
|`float`|`Float`| 4 byte / 16 byte |
|`double`|`Double` | 8 byte / 16 byte |

- `Boxed` obj always require 8-bytes(or multi of 8) for type and mem management
- all `boxed` types all require 16 in total

Advanced stuff

- Memory consumption can have a bit impact on performance
  - in arrays when using a `float[5]` will require only 32 bytes, where a `Float[5]` storing 5 disticnt non-null values  will require 112 bytes

### Boxed value caches

This dont make sense for now pg 46

## Double primitive

Because of the way floating points number are stored, many numbers don't have an exact representation

```java
double not = 1.32 - 0.42;   //  should be 0.9
System.out.println(not);    //  0.900000000001
```

- Again should use `Big Decimal` store precise numbers insteald of `float` and `double`
- default is `0.0d`

## Long Primitive

- `64 bit` signed int
- `L` must be appened at the end of the litteral
- Theres some other misc info with how caches int, and its range

> reread and codetest

## byte primitive

- 8 bit signed int, min -27 max 27-1

## Negative value representation

- java and most lang that stores negative integral numbers in 2 complement

> WTF is this note 

## Short primitve

just more information




