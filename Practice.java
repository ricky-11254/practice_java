import java.util.Scanner;
public class Practice{
    public static void main(String[] args){
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        a = input.nextInt();
        System.out.println("Enter the second value: ");
        b = input.nextInt();
        System.out.println("a + b = "+(a + b));
        System.out.println("a - b = "+(a - b));
        System.out.println("a * b = "+(a * b));
        System.out.println("a / b = "+(a/b));
        System.out.println("a % b = "+(a % b));
    }
}