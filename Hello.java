public class Hello {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        TimeGreeter timeGreeter = new TimeGreeter(greeter);
        System.out.println(timeGreeter.greet());
    }
}
