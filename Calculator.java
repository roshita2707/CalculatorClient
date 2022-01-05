package service;

public class Calculator {

	public static void main(String[] args) {
		CalculatorResourceService service =new CalculatorResourceService();
		CalculatorResource resource = service.getCalculatorResourcePort();
		System.out.println(resource.add(5, 6));
		System.out.println(resource.sub(6, 5));
		System.out.println(resource.div(12, 6));
		System.out.println(resource.mul(5, 6));


	}

}
