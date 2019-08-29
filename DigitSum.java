import java.util.Scanner;
class DigitSum{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the num");
int N=scan.nextInt();
int sum=0;
int r;
while(N!=0){
r=N%10;
sum=sum+r;
N=N/10;
}
System.out.println("Sum:"+sum);
}
}