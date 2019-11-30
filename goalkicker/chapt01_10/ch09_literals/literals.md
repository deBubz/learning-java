# Literals

Once again literals, but with `Java`

> Note there are some **numeric literals** in ch02

So literals are syntactic element (found in the source code) that represent a falue

## Using underscore `_`

since **Java 7** its possible to use `_` for seperating groups of digits in a primitive num literal for *readability*

```java
// these are the same
// ver >= Java SE7
int i1 = 123456;
int i2 = 123_456;
System.out.println(i1 == i2);   // true

// also work with all primitive num literals
byte col = 1_2_3;
short years = 2_016;
int ssn = 999_99_9999;
long ccnum = 123_345_678;
float pi = 3.14_15F;
double pidec = 3.14_15_92_65_35;

// also binary, octal, hex bases
short binary = 0b0_1_0_1;
int octal = 07_7_7_7_0;
long hexByte = 0xFF_EC_DE_5E;
```

There are also some limitation on where it cant be used:

- at the start/end of numbers
- adjacent to the decimal in a floating point literal
- before a `F` or `L` suffix
- in a position where a string of digits is expected (binary, hex,..)

## Hex, Octal and Binary literals

You know this 

- **hex** base-16 `0-9A-F`
- **octal** base-8 `0-7`
- **binary**

```java
// all of this are 110
int dec = 110;
int bin = 0b1101110;
int oct = 0156;
int hex = 0x6E;
```

## String Literals

You know this

> not this
>
> Interning and the string pool, refer to `string pool` and `heap storage`

## Escape sequence in literals

|Escape sequence | Meaning |
|---|---|
|`\\`| Backslash char|
|`\'`| single quote char|
|`\"`| double quote char|
|`\n`| linefeed character|
|`\r`| carriage return|
|`\t`| horizontal tab|
|`\f`| Form feed|
|`\b`| backspace|
|`\<octal>`| char code in the range 0-225|

## Character literals

char litterals provid the most convinient way to express `char` values in source code.
Consist of `'` open/close, and char representation 



