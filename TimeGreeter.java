import java.time.LocalTime;

public class TimeGreeter {
    private Greeter greeter;

    public TimeGreeter(Greeter greeter) {
        this.greeter = greeter;
    }

    public String greet() {
        String timeOfDay = getTimeOfDay();
        return "Good " + timeOfDay + "! " + greeter.greet();
    }

    private String getTimeOfDay() {
        int hour = LocalTime.now().getHour();
        if (hour < 12) {
            return "morning";
        } else if (hour < 17) {
            return "afternoon";
        } else {
            return "evening";
        }
    }
}
