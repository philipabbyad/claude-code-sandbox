#!/bin/bash
set -e

echo "Compiling..."
javac Hello.java Greeter.java TimeGreeter.java

echo "Running..."
output=$(java Hello)

echo "Validating..."

# Check for time-based prefix
if [[ "$output" =~ ^Good\ (morning|afternoon|evening)! ]]; then
    echo "  - Time greeting: OK"
else
    echo "FAIL: Expected 'Good morning/afternoon/evening!' prefix"
    echo "  Got: $output"
    exit 1
fi

# Check for base greeting at end
if [[ "$output" == *"Hello, Claude Code" ]]; then
    echo "  - Base greeting: OK"
else
    echo "FAIL: Expected output to end with 'Hello, Claude Code'"
    echo "  Got: $output"
    exit 1
fi

echo "PASS: All checks passed"
