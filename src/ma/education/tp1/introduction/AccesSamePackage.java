package ma.education.tp1.introduction;

public class AccesSamePackage {

	public static void main(String[] args) {
		Salle sa = new Salle("Salle A");
		System.out.print("Name: "+ sa.name+" id: "+sa.id);
	}
}
