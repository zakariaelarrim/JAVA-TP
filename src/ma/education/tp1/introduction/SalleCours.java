package ma.education.tp1.introduction;

public class SalleCours extends Salle {
  byte nombrePlaces;
  public SalleCours (String name) {
		super(name);
	}
	public SalleCours (String name, long id, byte nombrePlaces) {
		super(name, id);
		this.nombrePlaces = nombrePlaces;
	}
}
