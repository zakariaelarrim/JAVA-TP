package Package2;
import ma.education.tp1.introduction.Salle;

public class AccessHorsPackage extends Salle {

	public AccessHorsPackage(String name) {
		   super(name);
	   }
	   public AccessHorsPackage(String name, long id) {
		   super(name, id);
	   }
	   public void afficher(Salle s) {
		   System.out.println(s.id );
		   System.out.println(s.name );
	   }
		public static void main(String[] args) {
			Salle sb = new Salle("Salle b");
			System.out.print("Name: "+ sb.name+" id: "+sb.id); 
		}
		
		// je remarque que l'acces aux atrubits declarer protected qui sont dans la classe Salle visible a les classes qui ont le meme package est les calsses filles(acces par heritage) 
}
