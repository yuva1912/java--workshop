import java.time.LocalDate;
import java.time.LocalTime;

public class RegistrationTimeLeft {
    public static void main(String[] args) {
        LocalTime currenttTime = LocalTime.now();
        LocalTime registrationEndTime = LocalTime.of(18, 59);
        int hoursLeft = registrationEndTime.getHour()-currenttTime.getHour();
        int minitesLeft = registrationEndTime.getMinute()-currenttTime.getMinute();
        System.out.println("you have"+hoursLeft+minitesLeft );
        
    }
}    


