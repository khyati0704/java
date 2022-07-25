import java.util.Scanner;  
class Max
{
public static void main(String []args){ 
int a,b,c,largest,ans;
Scanner sc = new Scanner(System.in);  
System.out.println("enter three number:");
a = sc.nextInt();
b = sc.nextInt();  
c = sc.nextInt();  
ans = a>b?a:b;
largest =c>ans?c:ans;
System.out.println("max number is :"+largest);
}
}