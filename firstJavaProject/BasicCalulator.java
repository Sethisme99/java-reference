class Addition{
	int a, b;
	int result = 0;
	Addition(int a, int b){
		this.a = a;
		this.b = b;
		this.result = a + b;
	}


	void showAdditionResult(){
		System.out.println("The result of " + a + "+" + b + " = " + result);
		
	}
}


class Substraction{

	int a,b;
	int result = 0;
	//constructor:
	Substraction(int a, int b){
		this.a = a;
		this.b = b;
		this.result = a - b;
	}

	void showSubstractionResult(){
		System.out.println("The result of" + a + "-" + b + " = " + result);
	}

}


class Multiply{
	int a, b;
	int result = 0;

	Multiply(int a, int b){
		this.a = a;
		this.b = b;
		this.result = a * b;

	}

	void showMultiplyResult(){
		String phrase = "The result of ";
		System.out.println(phrase + a + "*" + b + " = " + result);
	}

}



class BasicCalulator{
	public static void main(String[] arg){
		//Create obj
		//
		Addition add1 = new Addition(5, 4);
		Substraction sub1 = new Substraction(10, 5);
		Multiply mul1 = new Multiply(2, 4);
		
		//access reference of obj
		//
		add1.showAdditionResult();
		sub1.showSubstractionResult();
		mul1.showMultiplyResult();
	}


}



