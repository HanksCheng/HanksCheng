import java.util.Scanner;

public class Calcu {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        String o=scn.next();

        int a=0;
        
        if(o.charAt(0)=='+'){
            a=n+m;  
        }else if(o.charAt(0)=='-'){
            a=n-m;
        }else if(o.charAt(0)=='*'){
            a=n*m;
        }else{
            a=n/m;
        }
        

        System.out.println(n+o+m+"="+a);
    }
}