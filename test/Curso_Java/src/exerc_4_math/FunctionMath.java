package exerc_4_math;

public class FunctionMath {

	public static void main(String[] args) {
		int num1=5;
		int num2=2;
		double decim=1.8;
		int redon;
		int max=Math.max(num1, num2);
		double sqrt=Math.sqrt(num1);
		double pow=Math.pow(num1, num2);
		double round=Math.round(sqrt);
		double PI=Math.PI;
		redon=(int)Math.round(decim);
		System.out.println("Función Máximo de dos números "+max);
		System.out.println("Función Raíz Cuadrada "+sqrt);
		System.out.println("Función Redondedo "+round);
		System.out.println("Función Potencia "+pow);
		System.out.println("Función PI "+PI);
		System.out.println("Función PI Redondeada "+Math.round(PI));
		System.out.println("Variable refundida de decimal a entero: "+redon);
	}

}
