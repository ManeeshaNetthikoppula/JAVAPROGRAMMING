/*// To Add numbers
import java.util.Scanner;
public class Basicprograms {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int sum;
        sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + "is " +sum);
    }
}*/


/*// Using scanner
import java.util.Scanner;
public class Basicprograms{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second numbers: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and "+ num2 + " is " + sum);
    }
}*;*/

/*// Checking a number is Even or Odd
public class Basicprograms{
    public static void main(String[] args) {
        int num = 6;
        if(num % 2==0){
            System.out.println("The given number is an Even number");
        }
        else{
            System.out.println("the given number is an Odd number");
        }
    }
}*/

//using scanner
/*import java.util.Scanner;
public class Basicprograms{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2==0){
            System.out.println("The Entered number is an Even Number");
        }
        else{
            System.out.println("The Entered number is an Odd number");
        }
    }
}*/

/*//to calculate factorial of a number
public class Basicprograms{
    public static void main(String[] args) {
        int num = 9;
        long factorial = 1;
        for( int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: "+ factorial);
    }
}*/

/*//Using Scanner
import java.util.Scanner;
public class Basicprograms{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        long factorial =1;
        for(int i = 1; i<= num; i++){
            factorial *= i;
        }
            System.out.println("Factorial of " + num +" is: " + factorial);
    }
}*/


/*// To find composite number
public class Basicprograms{
    public static void main(String[] args) {
        int num = 100;
        int count = 0;
        for(int i =1;i<=num;i++){
            if(num % i== 0){
                count++;
            }
        }
        if(num>1 && count>2){
            System.out.println(num + " is a composite number");
        }
        else{
            System.out.println(num + " is Not a Composite number");
        }
    }
}*/
/*//Using Scanner
import java.util.Scanner;
public class Basicprograms{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int count = 0;
        for(int i =1;i<=num;i++){
            if(num % i== 0){
                count++;
            }
        }
        if(num>1 && count>2){
            System.out.println(num + " is a composite number");
        }
        else{
            System.out.println(num + " is Not a Composite number");
        }
    }
}*/

/*//To print natural numbers between 1 & 100 using for loop
public class Basicprograms{
    public static void main(String[] args) {
        for(int i = 1;i<=100;i++){
        System.out.println(i + " ");
        }
    }
}*/
/*//Using while loop
public class Basicprograms{
    public static void main(String[] args) {
        int i = 1;
        while(i <= 100){
            System.out.print(i + " ");
            i++;
        }
    }
}*/
 
/*// To print even numbers between 2 & 10
public class Basicprograms{
    public static void main(String[] args) {
        int count = 0;
        for(int i = 2;i<=10;i++){
            System.out.println(i + " ");
            i++;
        }
    }
}*/

