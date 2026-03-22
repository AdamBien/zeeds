import module java.management;

/**
 * A zsh prompt displaying the current directory and system load.
 *
 * Installation:
 *   1. Compile to decrease startup time:
 *      javac zprmt.java
 *   2. Copy to a directory in your PATH:
 *      cp zprmt /usr/local/bin/
 *   3. Add to your ~/.zshrc:
 *      precmd() { PROMPT=$(java zprmt) }
 *   4. Reload your shell:
 *      source ~/.zshrc
 */
void main() {
  var dir = Path.of("").toAbsolutePath().getFileName();
  var os = ManagementFactory.getOperatingSystemMXBean();
  var load = "%.1f".formatted(os.getSystemLoadAverage());
  IO.print("%%F{cyan}%s%%f %%F{yellow}[%s]%%f ❯ ".formatted(dir, load));
}
