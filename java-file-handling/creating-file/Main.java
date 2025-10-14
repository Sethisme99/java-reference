/*	** Create File in java:
 *	
 *	- Using FileOutputStream() constructor
 *	- Using File.createNewFile() method
 *	- Using File.write() method
 *
 *
 *	** Create File Using FileOutputStream Constructor
 *
 *		FileOutputStream is used to create a file and write date into -
 *	it. The strean would create a file, if it doesn't already exist, before-
 *	opening it for output.
 *
 *		Here are two constructors which can be used to create -
 *	FileOutputStram object.
 *
 *	** Syntax:
 *
 *	OutputStream f = new FileOutputStream("path...");
 *
 *	** Using File() method:
 *
 *	File f = new File("path.....");
 *	OutputStream f = new FileOutputStream(f);
 *
 *
 *	
	
//Example:
// Create File Using FileOutoutStream Constructor:


	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.OutputStream;


	public class Main{
	
		public static void main(String a[]){


		try{
		
		//this array contained array of byte number,
		//each number represent character A to E.

		byte bwrite [] = {65, 66, 67, 68, 69};

		//this library used to writing raw bit to a file.

		OutputStream os = new FileOutputStream("test.txt");

		for(int x = 0; x < bwrite.length; x++){

			os.write(bwrite[x]); //writes the bytes

		}
			os.close();

			//open the file and read it.
			InputStream is = new FileInputStream("test.txt");

			//geting the number if bytes available to read.

			int size = is.available();

			//The reading loop:
			//read one byte at a time.
			for(int i = 0; i < size; i++){
				
				//convert each byte into char with the following
				//space.
				
				System.out.print((char)is.read() + " ");
			}

			is.close();

		} catch(IOException e){

			//if any I/O error happens prints "Exception"
			//instead of crashing.
			
			System.out.print("Exception");
		}
		}

	}



   ** Create File using File.createNewFile() method:

   	File.createNewFile() method allows to create a file in given location or
in current directory as follows-

   ** Syntax:

   	File file = new File("path:....");
	
	//Create the file:
	
	if(file.createNewFile()){

		System.out.println("File is created!");
	}else{
		System.out.println("File is already exists.");
	}




 //Example:
 //Create File using File.createNewFile():
 

 import java.io.File;
 import java.io.FileReader;
 import java.io.FileWriter;
 import java.io.IOException;

 public class Main{

	public static void main(String a[]){

		try{

		File file = new File("/home/sethpc/Desktop/testFile.txt");
		
		//create the file:

		if (file.createNewFile()){

			System.out.println("File is created!");
		}
		else{
			System.out.println("File already exists.");
		}

			//Write content:
			FileWriter writer = new FileWriter(file);
			writer.write("Test data");
			writer.close();

			//read content:
			FileReader reader = new FileReader(file);

			int c;
			while((c = reader.read()) != -1){
				char ch = (char) c;
				System.out.println(ch);
			}
		}catch(IOException e){
			System.out.print(e);
		}


	}

 }


	** This docs from w3school is more simple:
	
	** Create a File:
	
	In Java, you can create a new file with the createNewFile() method from
the File class.

	This method returns:
		- true - if the file was created successfully.
		-false - if the file already exists.

	** Note: that the method is enclosed in a try...catch block. This is necessary
because it throwns an IOException if an error occurs(if the file cannot be created for some
reason);

	

//Example:
import java.io.File; //file class.
import java.io.IOException; //import error handling IOException.


public class Main{

	public static void main(String[] args){

		try{

			File file = new File("w3school.txt");
			if (file.createNewFile()){
				System.out.println("File created: " + file.getName());
			}else{
	
				System.out.println("File already exists.");
			}

		}catch(IOException e){
			
			System.out.println("An error occured.");
			e.printStackTrace(); //print error details.
		}
	}
}

 ** Note: The createNewFile() method only creates an empty file. It does not add any content
inside.
	
 ** To create a file in a specific folder:

 // File file = new File("/home/sethpc/Desktop/testFile.txt");

 *
 * */










