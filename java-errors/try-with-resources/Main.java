/*	** Java try-with-resources
 
 	- Java Close Resources:

	When working with files, streams. Or other resources, it is important to close them after use. If you
forgot to close a resource, it may keep using memory or even prevent you from opening the file again until the
program ends.

	In older code, you had to close "resources" manually by calling their close() method:


//Example: 
import java.io.FileOutputStream;
import java.io.IOException;

public class Main{

	public static void main(String[] args){

		try {

			FileOutputStream output = new FileOutputStream("ex.text");
			output.write("Hello".getBytes());
			output.close(); // must close manually
			System.out.println("Successfully wrote to the file.");
			
		}catch(IOException e){

			e.printStacktrace();
		}


	}

}


	** Java try-with-resources:
	
	You can use try-with-resources. It is a special from of try that works with resources (like files and
	streams). The resource is declared inside parentheses "try(....)", and Java will close it automatically
	when the block finishes - even if an error occurs.


//Example (try-with-resources)

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


class CreateFile{

private String fileName = "mySecret.txt";

public void makeFile(){

	try{	
		File myFile = new File(fileName);
		if (myFile.createNewFile()){

			System.out.println(myFile + " was created successfully.");
		}else{
			System.out.println(myFile + " was already exists.");
		}
	}catch(IOException e){
		System.out.println("There was something wrong when creating the file.");
		e.printStackTrace();
	}
}

public String getName(){
return this.fileName;
}


}




public class Main{

	public static void main(String[] args){

		CreateFile createFile = new CreateFile();
		createFile.makeFile();

		//resource is opened inside try()
		try(FileOutputStream output = new FileOutputStream("mySecret.txt")){
			output.write("Hello World".getBytes());
			//no need to call close() here.
			System.out.println("The file was successfully Wroted." + createFile.getName());
			
		}catch(IOException e){

			System.out.println("Something went wrong.");
			e.printStackTrace();

		}

	}

}

	** Why use try-with-resources?
	
	- Safer - resources are always closed, even if an exception occurs.

	- Cleaner - no need to write close() calls.

	- Shorter code - less boilerplate, easier to read.

	** useful when working with file, streams, or database connection, to 
make sure they are closed properly.

*/





