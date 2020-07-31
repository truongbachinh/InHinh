import java.util.Scanner;

public class InHinh {
	
	    public static void main(String[] args) {
	        HinhChuNhatSao();
	        HinhChuNhatRong();// vì để kiểu static nên cùng định dạng với hàm main ko cần tạo đối tượng
	       InHinh ih = new InHinh();
	       ih.InHinhTamGiacSo();// In hình mà ko có static nên cần tạo đối tượng để gọi đến hàm inHinhTamGiacSo
	    }
	    public static void HinhChuNhatSao()
	    {
	       for(int i = 0; i < 5; i++)
	       {
	    	   System.out.println("");
	    	   for(int j = 0; j < 5; j++)
	    	   {
	    		   System.out.print("*");
	    	   }
	       }
	       System.out.println("");
	    }
	    public static void HinhChuNhatRong()
	    {
	        for(int a = 1; a <= 5; a++)
	        {
	            System.out.println("");
	            for (int b = 1; b <= 5; b++)
	            {
	                if(a==1 || b == 1 || a == 5|| b == 5)
	                {
	                    System.out.print("*");
	                }
	                else {System.out.print(" ");}
	                    }
	        }
	        System.out.println("\n");
	      
	    }
	    public void InHinhTamGiacSo() 
	    {
	    	try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Mời bạn nhập chiều cao của hình tam giác");
				
				int height = sc.nextInt();
				for (int i1 = 1; i1 <= height; i1++)
				{
					for(int i2 = 1 ; i2 <= height - i1; i2++)
					{
						System.out.print("  ");
					}
					for(int i3 = 1; i3 <= 2 * i1 - 1; i3++)
					{
						
						System.out.print(" "+ i3);
					
					}
					System.out.println();
				}
			}
	    }
	    	
	 }

