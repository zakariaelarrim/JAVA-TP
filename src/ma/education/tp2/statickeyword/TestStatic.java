package ma.education.tp2.statickeyword;

public class TestStatic {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant(1,"AHMED", 20);
        Etudiant e2 = new Etudiant(2, "SAID", 30);
        
        System.out.println("id: "+e1.id+" nom: "+e1.nom+" nbEtudiant: "+Etudiant.nbEtudiant);
        System.out.println("id: "+e2.id+" nom: "+e2.nom+e1.nom+" nbEtudiant: "+Etudiant.nbEtudiant);
	    
	}

}
