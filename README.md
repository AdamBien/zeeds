<img src="logo.png" alt="zeeds logo" width="200">

# zeeds (**Z**ero d**E**pendency s**EEDS**)

*Too small for their own repository. Too useful to not exist.*

Zero-dependency Java 25+ source files designed as starting points for your projects. Run directly with `java filename.java` — no compilation step needed. Each zeed is self-contained, using only JDK APIs. Copy, customize, extend.

Only Java 25+ is required, no external dependencies.

## Zeeds

- [**zhello**](zhello) — The simplest possible Java 25 script, ideal as a starting point. Usage: `./zhello`
- [**zcpdir**](zcpdir) — Copy a directory recursively. Usage: `./zcpdir <source-directory> [target-directory]`
- [**zcbs**](zcbs) — Save clipboard content to a file. Usage: `./zcbs <filename>`
- [**zecho**](zecho) — Echo text with colored output. Usage: `./zecho <text>`
- [**zwrap**](zwrap) — Wrap a Java script with additional parameters. Usage: `./zwrap <script> [args...]`
- [**zmkdir**](zmkdir) — Create year/month directories. Usage: `./zmkdir -f` (flat: 2026.01) or `./zmkdir -n` (nested: 2026/01)
- [**zmenu**](zmenu) — Interactive terminal menu with arrow key navigation. Configure menu items, navigate with arrows, confirm with Enter, cancel with Escape.
- [**zargs**](zargs) — Idiomatic argument parsing with enum-based options. Usage: `./zargs [options] <files...>`
- [**ztwins**](ztwins) — Find files with identical content. Usage: `./ztwins <file> <directory>`
- [**zdate**](zdate) — Print and copy today's date to the clipboard. Usage: `./zdate` (dd.MM.yyyy) or `./zdate -y` (yyyy.MM.dd)
- [**zheader**](zheader) — Prepend a copyright / license header from the clipboard to all `.java` files recursively, skipping files that already contain it. Usage: `./zheader [dir] [-dry]`
- [**zimginfo**](zimginfo) — Print image dimensions and file size. Usage: `./zimginfo <image-file>`
- [**zlaunch**](zlaunch) — Load environment entries from properties files, then launch an application. Usage: `./zlaunch <command> [args...]`
- [**zjdocfind**](zjdocfind) — Find and open javadoc for a type by simple or fully qualified name. Usage: `./zjdocfind String` or `./zjdocfind java.lang.String`
- [**zzip**](zzip) — Zip a directory into a `.zip` file. Usage: `./zzip <directory>`
- [**zgitr**](zgitr) — List git remotes (fetch and push) from the current repository's `.git/config`. Usage: `./zgitr`
- [**zourl**](zourl) — Open a configured URI with the system's default application. Usage: `./zourl` or `./zourl -Duri=https://github.com`
- [**zbump**](zbump) — Bump `version.txt` using a `yyyy.MM.dd.NN` per-day sequence, searching the current directory upwards (and `src/main/resources`). Usage: `./zbump`
- [**znotes**](znotes) — Append timestamped thoughts to a Markdown notes file (folder configurable via `zcfg`). Usage: `./znotes <thought>`, `./znotes -l` (list), or `./znotes -o` (open)
- [**zf2cb**](zf2cb) — Load a file into the system clipboard. Usage: `./zf2cb <file>`
- [**zcbxmlstrip**](zcbxmlstrip) — Strip XML/HTML markup from clipboard text, in place. Usage: `./zcbxmlstrip`
- [**zlsbc**](zlsbc) — List all [business components (BCs)](https://bce.design) — directories containing a `boundary`, `control`, or `entity` layer — with colored output. Usage: `./zlsbc <directory>`
