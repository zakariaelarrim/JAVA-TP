package ma.education.tp1.introduction;

public class Test {

	public static void main(String[] args) {
////		Salle s1 = new Salle();
//		Salle s2 = new Salle("CIGMA");
//		Salle s3 = new Salle("CIGMA2", 1);
//     // -------------
//		System.out.print("object 1 ---- ");
//        System.out.print(" | id: "+s1.id);
//        System.out.print(" | name:"+s1.name);
//        
//     // ------------- 
//        System.out.print(" object 2 ---- ");
//        System.out.print("| id: "+s2.id);
//        System.out.print(" | name:"+s2.name);
//     // ------------- 
//        System.out.print(" object 3 ---- ");
//        System.out.print(" | id: "+s3.id);
//        System.out.print(" | name:"+s3.name);
        
		Salle s1= new SalleCours("Salle 1", 1, 20);// correct
		SalleCours s2= new SalleCours("Salle 2", 2, 20);// correct
		SalleCours s3= s1; // incorrect
		// le type de s1 est Salle par contre le type de s3 est SalleCours alors le type des object est différent  
		// incorrect ----> SalleCours s3= (SalleCours)s1
		SalleCours s4= s2; // correct 
		
//		---------------------
		Salle s5= new Laboratoire("LABO", 2,"CHIMIE");
		SalleCours s6= new SalleCours("Salle 2", 2, 20);
		SalleCours s7= (SalleCours)s5;// incorrect
		// le type de s5 est Salle par contre le type de s7 est SalleCours alors le type des object est différent
		// Non c'est pas possible d'utiliser un cast car le s5 instancier a la classe fille laboratoire, donc la classe mére salle sera une classe fille laboratoire . Alors on peut pas faire un casting entre deux classe filles 
		
		SalleCours s8= s6;
	}

}
