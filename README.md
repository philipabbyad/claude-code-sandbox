# Claude Code Sandbox

A minimal Java project demonstrating the composition pattern.

## Structure

- `Hello.java` — Entry point
- `Greeter.java` — Returns a simple greeting
- `TimeGreeter.java` — Wraps a `Greeter` and adds time-of-day prefix

## Requirements

- Java 8+

## Build and Run

```bash
javac Hello.java Greeter.java TimeGreeter.java
java Hello
```

Output varies by time of day:
```
Good morning! Hello, Claude Code
Good afternoon! Hello, Claude Code
Good evening! Hello, Claude Code
```

## Test

```bash
./test.sh
```

Validates that output has the correct prefix and suffix.
