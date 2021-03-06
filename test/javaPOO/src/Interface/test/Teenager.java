package Interface.test;

public class Teenager implements IPerson{

	@Override
	public String saludo(String name) {
		
		return "Que hay!".concat(name);
	}

	@Override
	public PersonEnum personType() {
		
		return PersonEnum.TEENAGER;
	}

	@Override
	public String print(String name) {
		return "Teenager ".concat(saludo(name));
	}
	
}
