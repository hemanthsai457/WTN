package ClassAndObjects;

class Box 
{
	int width;
	int height;
	int depth;
	float vol=0;
	Box(int width,int height,int depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	float volume()
	{
		vol=height*width*depth;
		return vol;
	}
}
class main1
{
	public static void main(String args[])
	{
		float f;
		Box b=new Box(10,20,1);
		f=b.volume();
		System.out.println(f);
	}
	
}
