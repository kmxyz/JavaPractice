import java.util.*;

public class Interests{
    public static void main (String [] args){
        double rate = 1.05;
        Scanner input = new Scanner(System.in);
        System.out.println("please input the money you wanna sava every year");
        double save = input.nextDouble();
        System.out.println("please input how many years do you want to save");
        int year = input.nextInt();
        double total = 0;
        for(int i = 0; i < year; i++){
            total += save;
            total *= rate;
        }
        System.out.println("The total money you will get after " + year + " years are: " + total);
    }
}