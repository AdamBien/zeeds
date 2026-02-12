<img src="logo.png" alt="zeeds logo" width="200">

# zeeds (**Z**ero d**E**pendency s**EEDS**)

*Too small for their own repository. Too useful to not exist.*

Zero-dependency Java 25+ source files designed as starting points for your projects. Run directly with `java filename.java` — no compilation step needed. Each zeed is self-contained, using only JDK APIs. Copy, customize, extend.

## Zeeds

- [**zcpdir**](zcpdir) — Copy a directory recursively. Usage: `./zcpdir <source-directory> [target-directory]`
- [**zcbs**](zcbs) — Save clipboard content to a file. Usage: `./zcbs <filename>`
- [**zecho**](zecho) — Echo text with colored output. Usage: `./zecho <text>`
- [**zwrap**](zwrap) — Wrap a Java script with additional parameters. Usage: `./zwrap <script> [args...]`
- [**zmkdir**](zmkdir) — Create year/month directories. Usage: `./zmkdir -f` (flat: 2026.01) or `./zmkdir -n` (nested: 2026/01)
- [**zmenu**](zmenu) — Interactive terminal menu with arrow key navigation. Configure menu items, navigate with arrows, confirm with Enter, cancel with Escape.
- [**zargs**](zargs) — Idiomatic argument parsing with enum-based options. Usage: `./zargs [options] <files...>`
- [**ztwins**](ztwins) — Find files with identical content. Usage: `./ztwins <file> <directory>`
