
import java.util.Scanner;

public class NewShoe {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the treads length in the shoe");
		int n=scan.nextInt();
		for(int i=0;i<=3*n;i++) {
			if(i==0)System.out.print(" ");
			else System.out.print("_");
		}
		System.out.println();
			String a=" ";
			for (int i=1;i<=3*n;i++) {
			if(i==1)System.out.print("/");
			else System.out.print("|");
			for(int j=1;j<=3*n;j++) {
				System.out.print(a);
				}
			for(int k=0;k<i;k++) {
				System.out.print(a);
			}
			System.out.println("\\");
				
				}
			for(int i=0;i<=6*n+1;i++) {
				if(i==0)System.out.print("|");
				else
				System.out.print(a);
			}
			for(int i=1;i<=3*n;i++) {
			
				System.out.print(" -");
			}
			System.out.println();
			for(int i=1;i<=3*n;i++) {
				System.out.print("|");
				for(int j=0;j<=12*n+1;j++)
					System.out.print(" ");
				if(i==1)System.out.println("\\");
				else System.out.println("|");
			}
			for(int i=0;i<=6*n+2;i++)
				if(i==0)System.out.print("\\");
				else if(i==6*n+2)System.out.print("/");
				else if(i % 6==0)System.out.print("^ ");
				else System.out.print("- ");
			
	}}
		
	

