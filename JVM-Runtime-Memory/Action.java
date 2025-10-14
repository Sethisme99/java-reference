class Car{
	static int wheels = 4; //Method Area
	String color;		//Heap (inside Object)

	Car(String color){
		this.color = color;
	}


	void drive(){
		int speed = 60; //stack
		System.out.println(color + " car driving at " + speed);
	}

}



class Action{

	public static void main(String[] arg){
		Car c1 = new Car("Red"); //Object in Heap
		Car c2 = new Car("Black"); //another Object in Heap
		
		c1.drive();	//uses Thread-1 Stack
		c2.drive();	//also Thread-1 Stack
	}

}
