# Claude Code Keyboard Shortcuts

## General Controls

| Shortcut | Action |
|----------|--------|
| `Ctrl+C` | Cancel current input or generation |
| `Ctrl+D` | Exit Claude Code session |
| `Ctrl+L` | Clear terminal screen (keeps conversation history) |
| `Ctrl+R` | Reverse search command history |
| `Ctrl+O` | Toggle verbose output (shows tool usage details) |
| `Ctrl+V` | Paste image from clipboard |
| `Up/Down` | Navigate through command history |
| `Esc Esc` | Rewind conversation/code to previous state |
| `Shift+Tab` | Toggle permission modes (Auto/Plan/Normal) |

## Bash Carryovers

| Shortcut | Action |
|----------|--------|
| `Ctrl+A` | Jump to beginning of line |
| `Ctrl+E` | Jump to end of line |
| `Ctrl+W` | Delete word backward |
| `Ctrl+U` | Delete from cursor to line start |
| `Ctrl+K` | Delete from cursor to line end |

## Multiline Input

| Method | How |
|--------|-----|
| `\` + `Enter` | Backslash at end of line, then Enter |
| `Ctrl+J` | Insert line feed |

## Command Prefixes

| Prefix | Action | Example |
|--------|--------|---------|
| `/` | Execute slash command | `/help`, `/cost`, `/clear` |
| `!` | Execute shell command (output added to context) | `!git status` |
| `@` | File path autocomplete | `@src/Hello.java` |
| `#` | Add to memory (CLAUDE.md) | `#` |
