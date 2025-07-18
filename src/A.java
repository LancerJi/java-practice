import java.util.Scanner;

public class A {
    public static void main(String ...args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scan.nextInt();
        if(n % 2 ==0){
            System.out.println(n+ " is Even no");
        }
        else {
            System.out.println(n+ " is Odd no");
        }
        scan.close();
    }
}
