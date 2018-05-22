import java.util.Scanner;

public class NepalFlag {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of flag");
		int n=scan.nextInt();
		for(int i=0;i<=n;i++) {
			String a=" ";
			System.out.print("|");
			for(int j=0;j<i;j++) {
				System.out.print(a);
			}
			System.out.println("\\");
			if(i==n) {
				System.out.print("|");
				for(int k=0;k<=(n/2);k++) System.out.print("- ");
			}}
		System.out.println();
		for(int i=1;i<=n;i++) {
			String a=" ";
			if(i==1)continue;
			System.out.print("|");
			for(int j=1;j<i;j++) {
				System.out.print(a);
			}
			System.out.println("\\");
			if(i==n) {
				
				for(int k=0;k<=(n/2);k++) 
					{if(k==0)System.out.print("|");
					System.out.print("- ");}
			}}System.out.println();
		for(int i=1;i<n/2;i++)
		System.out.println("|");
		
		}
}
