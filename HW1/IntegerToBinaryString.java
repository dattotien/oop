import java.util.Scanner;

public class IntegerToBinaryString {
    public static void main(String[] arg){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        String ans="";
        while(n!=0)
        {
            ans=Integer.toString(n%2)+ans;
            n/=2;
        }
        System.out.print(ans);
    }
}
