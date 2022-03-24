package ma.education.tp2.introduction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import ma.education.tp1.introduction.Salle;

public class TestReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class tr =  Salle.class;
		Field[] fl = tr.getDeclaredFields();

		for(Field item: fl) {
			System.out.println("AttrubitName: "+item.getName());
		}
		
		Method[] mt = tr.getDeclaredMethods();
		for(Method item: mt) {
			System.out.println("MehtodName: "+ item.getName());
		}
		
		Constructor[] constructors = tr.getConstructors();
		Salle o2 = (Salle)constructors[0].newInstance("Salle Informatique");
		o2.id = 2;
		Salle o3 = (Salle)constructors[1].newInstance("Salle des cours", 2);
		System.out.println(" Object 2 Name: "+o2.name+" id: "+o2.id);
		System.out.println(" Object 3 Name: "+o3.name+" id: "+o3.id);
		System.out.println(o2.equals(o3));
		
	}

}
