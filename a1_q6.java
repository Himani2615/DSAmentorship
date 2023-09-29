import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();
    String rev="";
    while(n>0){
        int d=n%10;
        String a=String.valueOf(d);
        rev=rev+a;
        n=n/10;
        
        
    }
    System.out.println(rev);
    }
   }
