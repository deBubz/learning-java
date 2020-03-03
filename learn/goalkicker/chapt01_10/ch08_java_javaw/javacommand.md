# `java` and `javaw`

## Entry point classes

Entry point class contains the `main` methods

```java
public static void main(String[] args)
// this also works
public static void main(String args[])
```

When using `java`, the commad starts the VM, it loads the specified entry-point calss to find `main`. If succesful, the args from cmd are converted to `String` obj and assembbled to an array, which wont be `null` and contain any `null` entries.
Valid entry-point class do:

- named `main`
- be `public` and `static`
- `void` return type
- contain a single `String[]` array
- Be generic: type params not allowed
- Have a non-generic, top-lvl (not nesteed or iner) enclosing class

### JavaFx entry points

`JavaFx` entry-point must

- extend `javafx.application.Application`
- be `public` and not `abstract`
- not generic/nesed
- have an explicit or implicit `public` no-arg constructor

## Trouble shooting `java`

read more in the doc 28-29.
This could be usefull as it discusses compilation

## Running Java app with library dependencies

Recommend reading in more in the doc itself 29-30
This will only conrain some highlighed points

## OK

basicly I think this whole chapter handles content which are currently outside of my scope, so it seems quite complex.

I believe its dealing with the specifics on handling using the `java` command on the cmd, so it does seem quite important and should be **revise**

Page `27 - 33`