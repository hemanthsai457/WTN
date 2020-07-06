package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable p=new Veena();
		Playable p1=new Saxophone();
		p.play();
		p1.play();
	}

}
