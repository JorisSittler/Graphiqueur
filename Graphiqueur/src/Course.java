import java.util.ArrayList;
import java.util.List;

public class Course {
	ArrayList<PointDePassage> parcours;

	public Course(List<PointDePassage> liste) {
		parcours = new ArrayList<PointDePassage>(liste);
	}
	public void retarderDe(float m){
		for (PointDePassage p : parcours){
			p.retarderDe(m);
		}
	}
	
	

	public String toString() {
		String s = "";
		for (PointDePassage p : parcours) {
			s = s + "\n" + p;
		}
		return s;
	}
}
