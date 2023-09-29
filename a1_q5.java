import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int i=0;
    while(n>0){
        i++;
        n=n/10;
        
    }
    System.out.println(i);
    
    
   }
  }
