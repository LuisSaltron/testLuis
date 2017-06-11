package Interface.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		showPerson(createPersonList());
	}

	public static List<IPerson> createPersonList(){
		List<IPerson> personList=new ArrayList<IPerson>();
		personList.add(new Kid());
		personList.add(new Teenager());
		personList.add(new Adult());
		personList.add(new IPerson() {
			
			@Override
			public String saludo(String name) {
				return "Soy un extrano".concat(name);
			}
			
			@Override
			public PersonEnum personType() {
				return PersonEnum.ADULT;
			}

			@Override
			public String print(String name) {
				return "Adulto extrano ".concat(saludo(name));
			}
		});
		personList.add(new Adult());
		return personList;
	}
	
	public static void showPerson(List<IPerson> list){
		for (IPerson person: list){
			System.out.println(person.print("Luis"));
		}
	}
}
