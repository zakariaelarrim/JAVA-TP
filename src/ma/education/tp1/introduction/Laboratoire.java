package ma.education.tp1.introduction;

public class Laboratoire extends Salle{
    
	String type;
	
	public Laboratoire (String name) {
		super(name);
	}
	public Laboratoire (String name, long id, String type) {
		super(name, id);
		this.type = type;
	}
}
