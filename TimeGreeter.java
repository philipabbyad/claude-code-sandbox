import java.time.LocalTime;

public class TimeGreeter {
    private static final String FALLBACK_GREETING = "Welcome";

    private Greeter greeter;

    public TimeGreeter(Greeter greeter) {
        this.greeter = greeter;
    }

    public String greet() {
        String timeOfDay = getTimeOfDay();
        String baseGreeting = (greeter != null) ? greeter.greet() : FALLBACK_GREETING;
        return "Good " + timeOfDay + "! " + baseGreeting;
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
