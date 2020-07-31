package Baitap;

import java.util.Scanner;

public class Bai1HinhVuong {
	private static Scanner sc;
	private static Bai1HinhVuong b;
	public static Bai1HinhVuong getB() {
		return b;
	}

	public static void setB(Bai1HinhVuong b) {
		Bai1HinhVuong.b = b;
	}

	public static void main(String[] args)
	 {
		 sc = new Scanner(System.in);
		 System.out.print("Mời bạn nhập số");
		 int a = sc.nextInt();
		setB(new Bai1HinhVuong());
		
		//Hình vuông
		 for(int i = 0; i < a; i++)
		 {
			 System.out.println(" ");
			 for(int j = 0; j < a; j++)
			 {
				 System.out.print("*");
			 }
		 }
		 System.out.println();
		 
		 //Hình vuông rỗng
		 for(int i = 0; i <= a; i++)
		 {
			 System.out.println(" ");
			 for(int j = 0; j <= a; j++)
			 {	if( i == 0 || j == 0 || i == a || j == a)
			 {
				 System.out.print("*");
			 }
			 else
			 {
				 System.out.print(" ");
			 }
			 }
		 }
		
	 }

	


}
