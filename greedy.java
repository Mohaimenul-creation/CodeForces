import java.util.Scanner;
public class greedy{
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    int term=sc.nextInt();
    
    for(int i=1;i<=term;i++){
      int a=sc.nextInt();
      int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int k=1;
    boolean f=true;
    while(f){
      if(k%2==0){
       a-=1;
         c-=1;
         if(a==0 || c==0){
           System.out.println("Flower");
           break;
         }}
         else{
           b-=1;
         d-=1;
         if(b==0 || d==0){
           System.out.println("Gellyfish");
           break;
         }
         }
        k++;
      }
    }
  }
}
  