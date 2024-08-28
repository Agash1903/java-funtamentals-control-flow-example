import java.util.*;
import java.util.Scanner;

public class Index {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        if(n>0){
            System.out.println("Positive number");

        }
        else if(n<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Zero");
        }

        switch (n%7) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("Not a Day");
                break;
        }
         
        System.out.println("For Loop");
        for (int i=0;i<=n;i++) {
            System.out.println(i+" ");
        }
        
        System.out.println("While Loop");
        int i=n;
        while(i>0){
            System.out.println(i+" ");
            i--;
        }

        System.out.println("do while loop");
        int j=1;
        do{
            System.out.println(j+" ");
            j++;
        }while(j<=n);
     
    }
}