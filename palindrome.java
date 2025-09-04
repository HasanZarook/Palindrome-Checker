import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = a.nextInt();
        int p = x;
        int q = 0;
        while (x!=0){
            int r = x%10;
            q=q*10+r;
            System.out.println(p);
            x/=10;}
        if(p==q){
            System.out.println("yep");
        }
        else{
            System.out.println("nope");
        }
    }

}
