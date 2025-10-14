/* 	** Java Multiple Exception:
	
	** Note: Sometime, different errors (exceptions) can happen in the same "try" block. It can be handle
them by with multiple "catch" blocks.

	** One "try", Many "catch":



public class Main{

	public static void main(String[] args){

		try{
			int[] myArr = {1, 2, 3};
			System.out.println(myArr[2]);

			int result = 10;

		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index does't exist.");
			e.printStackTrace();

		}catch(ArithmeticException e){
			System.out.println( result + " 10 Can't devided by Zero 0.");
			e.printStackTrace();
			
		}catch(Exception e){

			System.out.println("Exception");
			e.printStackTrace();

		}

	}

}

 

	** Order Matters:

	Should always put more specific exceptions first, and general ones later. Otherwise, the general catch
will grab the error and the specific ones will never run.

* Example:

	try{

	int result = 10 / 0;
	
	}catch(Exception e){
		
		System.out.println("General error.");
	
	}catch(ArithmeticException e){
		
		//this will never be reached.
		
		e.printStackTrace();
	}


	** Multi-Catch:

	Since Java7, you can catch multiple exception in on catch block using the "|" symbol. This is useful
when different exceptions should be handled in the same way, so you don't have to repeat code:

	catch(ArithmeticException | ArrayIndexOutOfBoundsException e){

		e.printStackTrace();
	}



 * */













