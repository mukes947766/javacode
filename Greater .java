import  java.util.Scanner;
public class Greater{
public static void main(String [] args){

Scanner input=new Scanner(System.in);
 System.out.println("enter the values of a");
  System.out.println("enter the values of b");
   System.out.println("enter the values of c");
int a = input.nextInt();
int b=input.nextInt();
int c=input.nextInt();
if(a>b&& a>c){
  System.out.println("the value  A greater");
}
else if(a>b&& a>c){
  System.out.println("the value  B greater");
}
else {
  System.out.println("the value  C greater");
}
}
}
