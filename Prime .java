import java.util.Scanner;
public class Prime {
  public static void main(String [] args){
    Scanner input =new Scanner(System.in);
    int a=input.nextInt();
    int b=0;
    for (int i=1;i<=a;i++){
      if(a%i==0){
        b++;
        
      }
    }
    if(b==2){
      System.out.println("prime");
    }
    else{
      System.out.println("non-prime");
    }
    
  }
}

   
    
    
