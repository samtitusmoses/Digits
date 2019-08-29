import java.util.Scanner;
class CountDigit{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int count=0;
while(N!=0){
N=N/10;
count++;
}
System.out.println("Count:"+count);
}
} 