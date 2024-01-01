import java.util.*;
public class differenceOfsumAndmul {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a num");
        int n= sc.nextInt();
        int x= add(n);
        int y= mul(n);
        int diff=y-x;
        System.out.println(diff);
    }
public static int add(int a) {
    int add=0;
    while(a>0) {
        int num=a%10;
        add=add+num;
        a=a/10;
    }
   return add;
 }
 public static int mul(int a) {
    int add=1;
    while(a>0) {
        int num=a%10;
        add=add*num;
        a=a/10;
    }
   return add;
 }
  
}
