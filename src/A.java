import java.util.Scanner;
import java.util.stream.IntStream;

public class A {
    public static void main(String ...args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int n = scan.nextInt();
//        if(n % 2 ==0){
//            System.out.println(n+ " is Even no");
//        }
//        else {
//            System.out.println(n+ " is Odd no");
//        }
//        scan.close();
//    }
    Scanner scan = new Scanner(System.in);
        System.out.println("enter no: ");

    String result = IntStream.of()
                            .mapToObj(n-> {
                                if (n % 2 == 0) {
                                    return n + " is even no";
                                }else{
                                    return n+ " is odd no";
                                }
                            }).findFirst()
                            .orElse("Invalid");
                            System.out.println(result);
        }
}