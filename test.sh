#!/bin/bash
set -e

echo "Compiling..."
javac Hello.java Greeter.java

echo "Running..."
output=$(java Hello)

expected="Hello, Claude Code"
if [ "$output" = "$expected" ]; then
    echo "PASS: Output matches expected"
    exit 0
else
    echo "FAIL: Expected '$expected', got '$output'"
    exit 1
fi
