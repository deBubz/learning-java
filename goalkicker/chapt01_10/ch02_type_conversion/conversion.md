# Type conversion

Type casting primitive types

## Numeric Primitive Casting

Numeric primitive casting works in 2 ways

```java
// implicit casting
// source type has smaller range than target type
// small to big
byte bvar = 42;
short shVar = bvar;
int iVar = shvar
long lvar = ivar;
float fvar = lvar;
double dvar = fvar;
```

```java
// explicit casting
// source type has larger range than target type
double dvar = 42.0d;
float fvar = (float)dvar;
long lvar = (long)dvar;
int ivar = (int) lvar;
short svar = (short)ivar;
byte bvar = (byte) shortvar;
// numbers are round down when doing explicit castingg
```

## Basic Number Promotion

Shows type promotion, basicly implicit casting are automaticly done but explicit wont

```java
char c1 = 1, c2 = 2;
short s1 = 1, s2 = 2;
int i1 = 1, i2 = 2;
float f1 = 1.0f, f2 = 2.0f;

//  c1 = c1 + c2;   // error: cant conv from int to char;
//  s1 = s1 + s2;   // error: cant conv int to short;
i1 = c1 + c2;       // char promoted to int
i1 = s1 + s2;       // short promoted to int
i1 = c1 + s2;       // both promoted to int
f1 = s1 + f2;       // short promoted to float
i1 = i1 + i2;       // int unchanged
```

## Non-numeric primitive casting

`boolean` cannot be cast to/from any other primative type

`char` can be used to cast from/to any numeric type using the code-point mappings specified by unicode. 
A `char` is represented in memory as an unsigned `16-bit` int (2byte) so casting to `byte` will drop 8 bits. The utility methods of the `Character` cass use `int` (4 bytes) to tranfer to/fromcode-point values, but a `short` (2byte) would also suffice for storing Unicode code point

```java
int badIn = (int) true;     // compilation err: incompatible type
char c1 = (char) 65;        // A
byte b1 = (byte) 'A';       // 65
short s1 = (short) 'A';     // 65
int i1 = (int) 'A';         // 65

char c2 = (char) 8253;      // ?
byte b2 = (byte) '?';       // 61 truncated code-poin into ascii range
short s2 = (short) '?';     // 8253
int i2 = (int) '?';         // 8253
```

## Object Casting

as with primitives, objects can be cast both explicitly and implicitly.

**Implicit** casting happence when source type *extends* or *implements* the target type (casting to a superclass, or interface)

**Explicit casting has to be done when the source type is *extend`ed`* or *implement`ed`* by the target type( casting to a subtype ). This can produce `Runtime Exception` (ClassCastExeption) when the obj being cast is not the target type(or subtype)

```java
Float flVar = new Float(42.0f);
Number n = flVar;               // implicit (float implements number)
Float flVar2 = (Float) n;       // explicit
Double dbvar = (Double) n;      // exeption (object is not Double)
```

## Testing if an Object can be cast using `instanceof`

Java provides `instanceof` operator to test if an obj of a certain typt, or a subclass of that type. The program can then choose to cast or not cast that obj accordingly

```java
Object obj = Calendar.getInstance();
long time = 0;

if(obj instanceof Calendar) {
    time - ((Calendar)obj).getTime();
}
if (obj instanceof Date) {
    time = ((Date)obj).getTime();     // this will always fail, obj is not Date type
}
```

