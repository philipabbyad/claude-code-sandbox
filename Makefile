build:
	javac Hello.java Greeter.java TimeGreeter.java

test: build
	./test.sh

clean:
	rm -f *.class
