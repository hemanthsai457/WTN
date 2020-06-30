package Project2;

public class Video
{
	String videoname;
	boolean checkout;
	int rating;
	public Video(String name)
	{
		videoname=name;
	}
	String getName()
	{
		return videoname;
	}
	void doCheckout()
	{
		System.out.println("Video "+'"'+getName()+'"'+" checkedout successfully.");
	}
	void doReturn()
	{
		checkout=true;
		System.out.println("Video "+'"'+getName()+'"'+" Returned successfully.");
	}
	void recieveRating(int rating)
	{
		this.rating=rating;
	}
	int getRating()
	{
		return rating;
	}
	boolean getCheckout()
	{
		return checkout;
	}
	
}