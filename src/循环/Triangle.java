package Ñ­»·;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please input a number!");
		int i=input.nextInt();
		if(i<=0){
			System.out.println("Error!");
		}else{
			
			
			for (int j = 1; j <=i; j++) {
//				for (int m = i; m > j; m--) {
//				System.out.print(" ");
//			 }
				for (int n = 0; n <j; n++) {
					int m=(n+1)*j;
					System.out.print((n+1)+"*"+j+"="+m);
					System.out.print(" ");
					
				}
				System.out.println();
				
			}
			
		}
	input.close();	
	}
	
}
