/*	** Java Write To File:
 
 	Using FileWriter class to write a file.
 	
	In example below will be use FileWriter together with it write() method to create
some text into a file.

	** Note: When after done writing, the file should be close with close() method.


//Example:
//
import java.io.File; //create file class.
import java.io.FileWriter; //FileWriter class.
import java.io.IOException; //IOException class.

public class Write{

	public static void main(String[] args){

		try{
			//create file:
			File file = new File("w3school.txt");
			if(file.createNewFile()){

				System.out.println("File created successfully: " 
						+ file.getName());
			}else{
				System.out.println("Failed to create file. The file already exist");
			}

			// Write the file with some text:

			FileWriter myWriter = new FileWriter("w3school.txt");
			
			//using write() method to write the file.
			
			myWriter.write("w3school has a good docs!");

			//using close() to close the file after writed it.

			myWriter.close();

			System.out.println("The File Successfully Wroted!");


		}catch(IOException e){
			System.out.println("Exception");
			e.printStackTrace();
		}

	}

}


// Write To a File with try-with-resources:
// This will allow the file to be close automatically. without close() method.

//Example:

import java.io.FileWriter;
import java.io.IOException;

public class Write{

	public static void main(String args[]){

		//FileWriter will be closed automatically here.
		try(FileWriter myWriter = new FileWriter("w3school.txt")){

			myWriter.write("Write file with close file auto!");
			System.out.println("The file wrote successfully.");
		}catch(Exception e){

			System.out.println("Exception error");
			e.printStackTrace();
		}
	}


}

	** Append to a File:
	
	Normally, FileWriter will overwrite a file if it already exists. If you want to add new content
at the end of the file(without deleting what's already there). you can use the two argument constructor -
and pass true as the second parameter. This puts the writer into append mode:



 //Example:
 
import java.io.FileWriter;
import java.io.IOException;

public class Write{

	public static void main(String[] args){

		//true = append mode.
		try(FileWriter myWriter = new FileWriter("w3school.txt", true)){

			myWriter.write("Appending the text: true = append mode!");
			System.out.println("Successfully appended to the file.");

		}catch(Exception e){

			System.out.print("Exception error:");
			e.printStackTrace();
		}
	}

}

	** Other ways to Write to Files:
	-FileWriter - easiest choice for basic text.
	-BufferedWriter - better for large text files, because it is faster and supports handy features.
	-FileOutputStream - best for binary data(image, audio, PDFs).


 * */









