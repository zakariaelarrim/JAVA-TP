package ma.education.tp1.introduction;

public class Salle {

	public long id;
	public String name;

	public Salle(String name) {
		this.name = name;
	}
    public Salle(String name, long id) {
			this(name);
			this.id = id;
    }
    
    public void TestShowMethodName() {
    	// nothing
    }
    public boolean equals(Salle ob) {
    	boolean result = false;
    	if(this.id == ob.id) {
    		result = true;
    	}
    	return result;
    }
    
}