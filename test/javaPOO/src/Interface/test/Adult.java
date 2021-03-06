package Interface.test;

public class Adult implements IPerson{

	@Override
	public String saludo(String name) {
		return "Buenos dias".concat(name);
	}

	@Override
	public PersonEnum personType() {
		return PersonEnum.ADULT;
	}

	@Override
	public String print(String name) {
		return "Adulto ".concat(saludo(name));
	}

}
