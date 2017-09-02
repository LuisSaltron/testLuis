package exercise2_persona;

public class MainPersona {

	public static void main(String[] args) {
		creaPersona();
	}

	public static void creaPersona() {
		Persona persona = new Persona("Luis", 20, "F", 55, 120);
		persona.esMayorDeEdad();
		System.out.println(persona.toString());
		mayorEdad(persona);
		imc(persona);
	}

	public static void mayorEdad(Persona p) {
		if (p.esMayorDeEdad())
			System.out.println("Es mayor de edad");

		else
			System.out.println("No es mayor de edad");
	}

	public static void imc(Persona p) {
		switch (p.calcularIMC()){
		case Persona.infraPeso:
			 System.out.println("La persona esta por debajo de su peso ideal");
		break;
		
		case Persona.sobrePeso:
			 System.out.println("La persona esta por encima de su peso ideal");
		break;
		
		case Persona.pesoIdeal:
			 System.out.println("La persona esta en su peso ideal");
		}
	}
}
