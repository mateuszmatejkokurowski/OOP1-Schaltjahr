import java.util.Scanner;

class Schaltjahr {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please provide your year");
    int year = sc.nextInt();
    if (year % 4 == 0) {
        if (year % 100 != 0) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println("It is a century");
        }
    }
    else {
        System.out.println("Your input is not divisible by 4");
    }
    }
    }

