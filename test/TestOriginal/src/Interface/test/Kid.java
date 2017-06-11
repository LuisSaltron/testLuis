package Interface.test;

public class Kid implements IPerson {

	@Override
	public String saludo(String name) {
		
		return "Hoa ".concat(name);
	}

	@Override
	public PersonEnum personType() {
		
		return PersonEnum.KID;
	}

	@Override
	public String print(String name) {
		return "KID ".concat(saludo(name));
	}
	
}
