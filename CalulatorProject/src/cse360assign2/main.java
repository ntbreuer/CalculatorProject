package cse360assign2;

public class main {

	public static void main(String[] args) {
		Calculator Calc = new Calculator();
		
		Calc.add(5); System.out.println(Calc.getTotal());
		Calc.multiply(5); System.out.println(Calc.getTotal());
		Calc.divide(0); System.out.println(Calc.getTotal());
		Calc.add(1); System.out.println(Calc.getTotal());
		Calc.multiply(5); System.out.println(Calc.getTotal());
		
		System.out.println(Calc.getHistory());
	}
	
}
