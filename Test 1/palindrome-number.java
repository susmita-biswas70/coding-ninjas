import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int reverseNum=0;
		int originalNum=n;
		while(n!=0){
			int r=n%10;
			reverseNum=reverseNum*10+r;
			n/=10;
		}
		if(originalNum==reverseNum){
			System.out.print("true");
		}
		else{
			System.out.print("false");
		}

	}
}
