/* ** Java Delete Files:
 
To delete a file in Java, use the delete() method:

//Example:
 

 * */


import java.io.File;

public class Delete{

	public static void main(String[] args){
		
		File file = new File("test.txt"); // delete() method can be used to delete both dir and file
						  // just need to replace file to dir path when instantiated
						  // File obj to handle file or DIR.
		
		if(file.delete()){

			System.out.println("Deleted the file: " + file.getName());
		}else{
			System.out.println("Failed to delete the file." + file.getName());
		}

	}

}





