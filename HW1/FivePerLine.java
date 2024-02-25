public class FivePerLine{
    public static void main(String[] arg){
        for(int i=1000;i<=2000;i++)
        {
            System.out.print(i+" ");
            if(i%5==4)System.out.print("\n");
        }
    }
}