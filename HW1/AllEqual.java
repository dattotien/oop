import java.util.Scanner;

public class AllEqual{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        if(a==b&&b==c)System.out.print("equal");
        else System.out.print("not equal");
    }
}