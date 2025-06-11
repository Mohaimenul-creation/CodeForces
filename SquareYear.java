import java.util.Scanner;
public class SquareYear{
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    
    for(int i=1;i<=t;i++){
      String s=sc.next();
      int a=Integer.parseInt(s);
      double root1=Math.pow(a,0.5);
      int root=(int)root1;
      if(root*root==a){
        if(root==1){
          System.out.println("0 1");}
        else{
          
          int x=0;
          int y=root;
            System.out.println(x+" "+y);
        }
       }
      else{
        System.out.println("-1");
      }
    }
  }
}