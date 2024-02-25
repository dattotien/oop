import java.util.Scanner;

public class Distance {
    public static void main(String[] arg){
        Scanner scan= new Scanner(System.in);
        int x= scan.nextInt();
        int y= scan.nextInt();
        double distance = Math.sqrt(x*x+y*y);
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
    }
}
