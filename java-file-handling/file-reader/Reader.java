/*	** File Reader:
 
	Scanner class can be used to read the contents of the file we created.
	
	//Example:
 
 	** Explanation: This program opens the file named filename.txt and reads it line by line using a 
	Scanner. Each line is printed to the console. If the file cannot be found, the program will print "An error occurred." instead.
 



import java.io.File;			//File class.
import java.io.FileNotFoundException;	//Class to handle errors.
import java.util.Scanner;		//read the text file class.
import java.io.FileWriter;

public class Reader{

	public static void main(String[] args){


		try{
			
			File file = new File("w3school.txt");
		
			if(file.createNewFile()){
			System.out.println("The File was created sucessfully." + " " + file.getName());
			}else{
			System.out.println(file.getName() + " " + "The File was already exist.");
			}

			FileWriter myWriter = new FileWriter(file);
			myWriter.write("Hello this Document was reference from W3school!");
			myWriter.close();
			System.out.println("The" + " " + file.getName() + " " + "Was sucessfully wroted!");
		
			Scanner myReader = new Scanner(file);
			//using hasNextLine() to check the data exist line by line in the file.
			while(myReader.hasNextLine()){

				//create an variable to store those text temporary while display them.
				//nextLine() will read the data line by line then return it as String.
				String data = myReader.nextLine();
			
				System.out.println(data);
			}
			myReader.close();
				
		}catch(Exception e){

			System.out.print("Exception:");
			e.printStackTrace();
		}


	}

}

 
** Get File Information:

To get more information about a file, use any of the file methods:

//Example:
	 
import java.io.File;

public class Reader{

	public static void main(String[] args){

		System.out.println("File Information: ");
		File myFile = new File("w3school.txt");
			
		if(myFile.exists()){ 	//.exists() check if the file exist.
			System.out.println("File name: " + myFile.getName());
			System.out.println("Absolute path: " + myFile.getAbsolutePath());
			System.out.println("Writeable: " + myFile.canWrite());
			System.out.println("Readable: " + myFile.canRead());
			System.out.println("File size in bytes " + myFile.length());
		}else{
			System.out.println("The file does not exist.");
		}
	}
}

 
** Other Ways to Read Files

There are several classes you can use to read files in Java:

	-Scanner - best for simple text and when you want to parse numbers or words easily.
	-BufferedReader - best for large text files, because it is faster and reads line by line.
	-FileInputStream - best for binary data (images, audio, PDFs) or when you need full control of raw bytes.
 
 * */

















