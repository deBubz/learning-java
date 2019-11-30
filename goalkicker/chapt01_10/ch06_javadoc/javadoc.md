# Doccumenting

doccumentation is often generated with `javadoc`

## Building `javadoc` from the commandline

```bash
javadoc File.java
```

A more practical use of the tool will recursively reads all javafiles `[source-dir]`, creades doc for `[package.name]` and al sub package, place the generated html in `[docs-dir]`
```bash
javadoc -d [docs-dir] -subpackages -sourcepath [source-dir] [package.name]
```

## General notes

This section present the agreed standards on javadoc comments for aspects such as:

- Class
- Method
- Package
- Links
- Code Snippets
- Field Doccumentation

