
import java.time.LocalDate;
import java.util.Scanner;

public class YearCalculater {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter your Date of birth:");
        int DateOfBirth = inputScanner.nextInt();
        int currentBirth=LocalDate.now().getYear();
        int age=currentBirth-DateOfBirth;
        System.out.println(age);
       


        
    }
}
