package Project2;

import java.util.Scanner;

public class VideoLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int choice;
		Scanner sc=new Scanner(System.in);
		VideoStore v=new VideoStore();
		do
		{
			System.out.println("MAIN MENU");
			System.out.println("==========");
			System.out.println("1.Add Videos:");
			System.out.println("2.Check Out Video");
			System.out.println("3.Return Video");
			System.out.println("4.Recieve Rating");
			System.out.println("5.List Inventory");
			System.out.println("6.Exit");
			System.out.println("Enter your choice (1..6) :");
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter the name of video you want to add");
				String n=sc.next();
				v.addvideo(n);
			}
			else if(choice==2)
			{
				System.out.println("Enter the name of the video you want to checkout");
				String n=sc.next();
				v.doCheckout(n);
			}
			else if(choice==3)
			{
				System.out.println("Enter the name of the video you want to return");
				String n=sc.next();
				v.doReturn(n);
			}
			else if(choice==4)
			{
				
				System.out.println("Enter the name of the video you want to rate");
				String n=sc.next();
				System.out.println("Enter rating");
				int r=sc.nextInt();
				v.recieveRating(n, r);
			}
			else if(choice==5)
			{
				v.listInventory();
			}
			else if(choice==6)
			{
				System.out.println("Exiting...!! Thanks for using the application");
				System.exit(1);
			}
		}
		while(choice!=6);
		sc.close();
		}
		catch(Exception e)
		{
			System.out.println("Please insert all the details");
			System.out.println("-------------------------------------------------");

		}
	}
}
