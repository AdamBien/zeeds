<img src="logo.png" alt="zeeds logo" width="200">

# zeeds (**Z**ero d**E**pendency s**EEDS**)

*Too small for their own repository. Too useful to not exist.*

Zero-dependency Java 25+ source files designed as starting points for your projects. Run directly with `java filename.java` — no compilation step needed. Each zeed is self-contained, using only JDK APIs. Copy, customize, extend.

Only Java 25+ is required, no external dependencies.

## Zeeds

- [**zhello**](zhello) — The simplest possible Java 25 script, ideal as a starting point. Usage: `./zhello`
- [**zcpdir**](zcpdir) — Copy a directory recursively. Usage: `./zcpdir <source-directory> [target-directory]`
- [**zcpv**](zcpv) — Copy a directory to a destination as `[NAME][SUFFIX]`, appending `_v1`, `_v2`, ... if it already exists. Usage: `./zcpv <source-folder> <destination-path> [-name <name>] [-suffix <suffix>]`
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
- [**zlsbc**](zlsbc) — List all [business components (BCs)](https://bce.design) — directories containing a `boundary`, `control`, or `entity` layer — with colored output. Prints the component name by default, or the path relative to the given directory with `-full`. Usage: `./zlsbc [directory]` (defaults to the current directory) or `./zlsbc [directory] -full`
- [**zlinediff**](zlinediff) — Compare two text files line by line and list differing lines with colored output; exits with `1` if the files differ. Usage: `./zlinediff <left> <right>`
- [**zprecache**](zprecache) — Verify a service worker's `PRECACHE` array against the served site root: reports stale entries (listed, no file — `cache.addAll()` fails) and uncached servable files (probable omissions); exits with `1` on drift. Usage: `./zprecache <site-root> [sw-file]` (sw-file defaults to `<site-root>/sw.js`)
- [**zprmt**](zprmt.java) — A zsh prompt showing the current directory and the system load average. Compile with `javac zprmt.java` to reduce startup time, copy `zprmt.class` to e.g. `/usr/local/bin`, and add `precmd() { PROMPT=$(java -cp /usr/local/bin zprmt) }` to `~/.zshrc`
- [**zproof**](zproof) — Proofread the clipboard text with the local, on-device macOS LLM (Apple Foundation Model via the `fm` CLI) — nothing leaves the machine. Prints the corrected text and copies it back to the clipboard. Requires macOS with Apple Intelligence and the `fm` CLI. Usage: `./zproof`
- [**zlastmod**](zlastmod) — Print the most recently modified files in a directory, searching all subfolders, with their modification timestamps. Skipped files and folders (default `.git,.DS_Store`, glob patterns) and the number of files shown (default 20) are configurable via `zcfg` (`skip=` and `count=` in `$HOME/.zlastmod/app.properties`, `./app.properties`, or `-Dskip=...` / `-Dcount=...`). Usage: `./zlastmod [directory] [-count:N] [-ending:SUFFIX]` (defaults to the current directory; `-count:N` overrides the configured count; `-ending:SUFFIX` only considers files whose name ends with `SUFFIX`, e.g. `-ending:.java`)
- [**zindex**](zindex) — Create a markdown index (default `index.md`) in the current directory with links to all files in the current directory and its subfolders, sorted by path; the index file itself is excluded. The index file name and the ignored endings (default `.git,.DS_Store,.class`, matched against file and folder names) are configurable via `zcfg` (`name=` and `ignore=` in `$HOME/.zindex/app.properties`, `./app.properties`, or `-Dname=...` / `-Dignore=...`). Usage: `./zindex [-Dname=FILES.md] [-Dignore=.git,.jar]`
- [**zindexai**](zindexai) — Create a markdown index (default `index.md`) in the current directory with links to all files in the current directory and its subfolders, sorted by path, each annotated with a one-sentence description or a few tags of the file's content generated by the local, on-device macOS LLM (Apple Foundation Model via the `fm` CLI) — nothing leaves the machine. Binary and empty files are labeled without consulting the model; the index file itself is excluded. The index file name, the ignored endings (default `.git,.DS_Store,.class`, matched against file and folder names), the mode (`describe` or `tag`, default `describe`) and the number of bytes per file sent to the model (default `4000`) are configurable via `zcfg` (`name=`, `ignore=`, `mode=` and `limit=` in `$HOME/.zindexai/app.properties`, `./app.properties`, or `-Dname=...` / `-Dignore=...` / `-Dmode=...` / `-Dlimit=...`). Requires macOS with Apple Intelligence and the `fm` CLI. Usage: `./zindexai [-Dmode=tag] [-Dname=FILES.md] [-Dignore=.git,.jar] [-Dlimit=2000]`
- [**zskillcheck**](zskillcheck) — Validate the YAML frontmatter of every `SKILL.md` below the given paths: reports values strict YAML parsers reject (e.g. an unquoted `description` containing `: ` or ` #`), missing `name` / `description`, and descriptions over 1024 characters, as `file:line:column: message`; exits with `1` on findings. Usage: `./zskillcheck [path...]` (defaults to the current directory)
