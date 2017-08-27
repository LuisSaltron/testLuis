package exercise2_persona;

public class Persona {

	static final String sexoDefault = "H"; // constante
	static final int pesoIdeal = -1;
	static final int infraPeso = 0;
	static final int sobrePeso = 1;

	private String nombre;
	private String DNI;
	private String sexo;
	private int edad;
	private int IMC;
	private double peso;
	private double altura;
	private boolean mEdad;

	// CONSTRUCTORES

	// constructor por defecto
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = sexoDefault;
		this.peso = 0;
		this.altura = 0;
		comprobarSexo();
		generaDNI();
	}

	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
		comprobarSexo();
		generaDNI();
	}

	public Persona(String nombre, int edad, String sexo, int peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		comprobarSexo();
		generaDNI();
	}

	// METODOS PRIVADOS
	private void comprobarSexo() {
		if (this.sexo != "H" || this.sexo != "F")
			this.sexo = sexoDefault;

	}

	private void generaDNI() {
		char c = (char) (Math.random() * 26 + 'A'); // crea las letras aleatoriamente
		int n = (int) Math.floor(Math.random() * (99999999 - 10000000) + 10000000); // genera el dni de 8 aletaoriamente
		String letra = String.valueOf(c);
		String number = String.valueOf(n);
		this.DNI = letra + number;
	}

	// METODOS PUBLICOS
	public boolean esMayorDeEdad() {
		if (this.edad > 17) {
			this.mEdad = true;
		} else
			this.mEdad = false;

		return this.mEdad;
	}

	public int calcularIMC() {
		
		double peso = this.peso / (this.altura * 2);
		if (peso < 20) {
			this.IMC = pesoIdeal;
		}
		
		if (peso >= 20 && this.IMC <= 25) {
			this.IMC = infraPeso;
		}
		
		if (peso >25) {
			this.IMC = sobrePeso;
		}
		return this.IMC;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

}
