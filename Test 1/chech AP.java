import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int d=b-a;
		boolean isAP=true;
		for(int i=2;i<n;i++){
			int c=sc.nextInt();
			if(c-b!=d){
				isAP=false;
				break;
			}
			b=c;
		}
		System.out.println(isAP?"true":"false");

	}
}
