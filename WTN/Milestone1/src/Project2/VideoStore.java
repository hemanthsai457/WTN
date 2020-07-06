package Project2;

public class VideoStore 
{
	Video[] store=new Video[5];
	void addvideo(String name)
	{
		store[0]=new Video(name);
		System.out.println("Video "+'"'+store[0].getName()+" added Successfully.");
	}
	void doCheckout(String name)
	{
		if(store[0].videoname.equals(name))
		{
			store[0].doCheckout();
		}
		else
		{
			System.out.println("Video not available");
		}
	}
	void doReturn(String name)
	{
		if(store[0].videoname.equals(name))
		{
			store[0].doReturn();
		}
		else
		{
			System.out.println("Video not allowed to return");
		}
	}
	void recieveRating(String name,int rating)
	{
		if(store[0].videoname.contentEquals(name))
		{
			store[0].recieveRating(rating);
		}
		else
		{
			System.out.println("Video not available");
		}
		System.out.println("Rating "+'"'+store[0].rating+'"'+" has been mapped to the video "+'"'+store[0].getName()+'"'+".");
	}
	void listInventory()
	{
		System.out.println("-------------------------------------------------");
		System.out.println("Video Name	|	CheckoutStatus	| Rating");
		System.out.println(store[0].getName()+"		| 	   "+store[0].getCheckout()+" 	|  "+store[0].getRating());
		System.out.println("-------------------------------------------------");
	}
	

}
