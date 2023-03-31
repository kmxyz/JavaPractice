import java.util.*;
public class ExerciseFizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        boolean divisiableByFive = number % 5 == 0 ? true : false;
        boolean divisiableByThree = number % 3 == 0 ? true : false;
        String output = ((divisiableByFive ? "Fizz" : "") + (divisiableByThree ? "Buzz" : ""));
        System.out.println(output.length() == 0 ? number : output);
    }
}
