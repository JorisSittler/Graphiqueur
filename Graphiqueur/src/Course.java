import java.util.ArrayList;
import java.util.List;

public class Course {
	int numero;
	ArrayList<PointDePassage> parcours;

	public Course(int n, List<PointDePassage> liste) {
		numero = n;
		parcours = new ArrayList<PointDePassage>(liste);
	}
	public Course(int n){
		numero = n;
		parcours=null;
	}
	public Course(int n, ArrayList<float[]> liste){
		numero = n;
		for (float[] tab : liste){
			parcours.add(new PointDePassage(tab));
		}
	}
	
	public void retarderDe(float m){
		for (PointDePassage p : parcours){
			p.retarderDe(m);
		}
	}
	
	

	public String toString() {
		String s = "\n" + numero;
		for (PointDePassage p : parcours) {
			s = s + "\n" + p;
		}
		return s;
	}
}
