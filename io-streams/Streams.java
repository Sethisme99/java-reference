/* ** I/O Streams(Input/Output Streams):
 	
    You've already seen how to create, read, and write simple text files.

    There is an importain difference between working with the File class and working
with I/O Streams (Input/Output Stream):

     - The File class(from java.io) is used to get information about files and directories:

		* Does the file exist?
		* What is its name or size?
		* Create or delete files and folders

	But: the File class does not read or write the contents of the file.


     So far, we have used FileWriter for writting text and Scanner for reading text. These
are easy to use, but they are mainly designed for simple text files.

     I/O Streams are more flexible, because they work with text and binary data(like img,
audio, PDFs).


    ** Types of Streams:

    	-Byte Streams:
	   Work with raw binary data(like image, audio, and PDF files).
	   *Example: FileInputStream, FileOutputStream.

	-Character Streams:
	   Work with text(Characters and Strings). These streams automatically handle -
	   character encoding.
	   *Examples: FileReader, FileWriter, BufferedReader, BufferedWriter.

    ** Note: Use character streams when working with text, and byte streams when working with
    binary data.



     *** Java FileInputStream

     So far, Scanner class was used to read text files. Scanner is very convenient for text
because it can split input into lines, words, or numbers. However, sometimes you need more
control. When reading binary data(like images, audio...) or when need full control of raw 
bytes. in those case we need FileInputStream.

   * Example: Read a Text File:
   use FileInputStream to read a text file, one byte at a time, and print the result as
characters:




import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Streams{

public void create(){
		
	try{
	
	File file = new File("byte.txt");
	if (file.createNewFile()){
				
		System.out.println(file + " was created successfully.");

	}else{
		System.out.println(file + " was unsuccessfully created.");
			}
	}catch(IOException e){
		System.out.println("Error creating file.");
		e.printStackTrace();
	}		
	}


	public static void main(String[] args){

		
		Streams st = new Streams();
		st.create();

		try(OutputStream os = new FileOutputStream("byte.txt");
		     InputStream is = new FileInputStream("byte.txt")){

			byte[] data = {65, 66, 67, 68, 69};

			for(int x = 0; x < data.length; x++){
				os.write(data[x]);
			}

			int size = is.available();
			int i;
			while((i = is.read()) != -1){

				System.out.println((char) i);
			}
		

		}catch(IOException e){
			System.out.println("Error write and read file.");
			e.printStackTrace();
		}
	}


}


   ** Java FileOutputStream:


	The FileOutputStream class works in similar way as FileWriter, but it write data as raw bytes.
That means you can use it not only for text files, but also for binary files(like images, PDFs...).

   ** Write a Text File:

   This example writes a short text string to a file using FileOutputStream.

   * Note If the file already exists, its contents will be replaced (overwritten).




import java.util.Arrays;
import java.io.FileOutputStream;
import java.io.IOException;

public class Streams{

	public static void main(String args[]){

		//The text want to write:
		String text = "Hello World!";

		//try-with-resources:
		try(FileOutputStream fos = new FileOutputStream("byte.txt")){

			fos.write(text.getBytes()); //convert text to bytes and write to file.
			System.out.println("The file was successfully written.");
			
			//by doing this this can be read into the console.
			byte[] data = text.getBytes();
			System.out.println(Arrays.toString(data));


		}catch(IOException e){

			System.out.println("Error writing to file.");
			e.printStackTrace();
		}
	
	}

}


   ** Copy a Binary File(Real-World Example):



import java.util.Arrays;
import java.io.FileInputStream;		//used to retrieve data from a file.
import java.io.FileOutputStream;	//used to tranfer the data from the file that retrieved.
import java.io.IOException;


public class Streams{


	public static void main(String[] args){

		//this can work with image file.
		//in this ex work with txt file.
		String file1 = "byte.txt";
		String file2 = "myFile.txt";

		try(FileInputStream fis = new FileInputStream(file1);
		    FileOutputStream fos = new FileOutputStream(file2)){

				//temp var:
				int b;

				//read data from the first file & store inside b:
				
				while((b = fis.read()) != -1){

					//write those data from b to second file;
					fos.write(b);
				}

				System.out.println("The data was successfully transfered." + "from" + file1 + " to " + file2);

		    }catch(IOException e){


			System.out.println("Error while transfering data.");
			e.printStackTrace();
		    }


		try(FileInputStream input = new FileInputStream(file2)){
			
			int size = input.available();
			for(int i = 0; i < size; i++){
				System.out.print((byte) input.read() + " ");
			}
			System.out.println();

		}catch(IOException e){
			System.out.println("Error reading file to console.");
			e.printStackTrace();
		}
	}

}









// Small Project:
// parent class to handle file creation and a child class to handle writing and reading in the main class:

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;



class CreateFile{
	
	private String fileName = "myFile.txt";

	public void create(){

		try{
			File file = new File(fileName);
			if(file.createNewFile()){
			System.out.println(file.getName() + " was created successfully.");
			}else{
			System.out.println(file.getName() + " already exists.");
		}	

		}catch(IOException e){
			System.out.println("Error create file.");
			e.printStackTrace();
		}
	}

	public String getFileName(){
		return this.fileName;
	}

}

class WriteFile extends CreateFile{

	private String data = "Hello!";

	public void write(){
		try(FileWriter writer = new FileWriter(getFileName())){
			
			writer.write(data);
			
			System.out.println(getFileName() + " was successfully written.");

		}catch(IOException e){

			System.out.println("Error Writing to file.");
			e.printStackTrace();
		}

	}



}



public class Streams{

	public static void main(String[] args){
		
		WriteFile wf = new WriteFile();	// instantiated WriteFile class.
		wf.create(); // create file.
		wf.write(); // write to file.
		String fileName = wf.getFileName(); // stored file name.

		// try-with-resources: FileInputStream will be closed automatically
		
		try(Scanner myReader = new Scanner(new File(fileName))){


			while(myReader.hasNextLine()){
				String data = myReader.nextLine();
				System.out.println(data);
			}

		}catch(IOException e){

			System.out.println("Error reading file.");
			e.printStackTrace();
		}

	
		
	}

}


   ** BufferedReader and BufferedWriter

	BufferedReader and BufferedWriter make reading and writing files faster.

	- BufferedReader lets us read text line by line with readLine().
	- BufferedWriter lets us write text efficiently and add new lines with newLine().

	These classes are usually combined with FileReader and FileWriter, which handle opening or creating the file.
	** The buffered classes then make reading/writing faster by using a memory buffer.


   ** Read a text file(line by line)



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Streams{

	public static void main(String[] args){

		try(BufferedReader br = new BufferedReader(new FileReader("myFile.txt"))){
		
			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}

		}catch(IOException e){
			System.out.println("Error bufferedReader.");
			e.printStackTrace();

		}
	
	}


}


   ** Java BufferedWriter:

   The BufferedWriter class is used to write text to a file, one line or one string at a time. If the file already exists
, its contents will be replaced(overwritten).


   ** Write to a text file.

   Use BufferedWriter with FileWriter to write text to a file. The write() method adds text, and you can use newLine()
to insert a line break:


   ** Example:


 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Streams{

	public static void main(String[] args){
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("byte.txt"))){

			bw.write("First love.");
			bw.newLine(); //add line break.
			bw.write("Second love.");

			System.out.println("Successfully wrote to the file.");

		}catch(IOException e){

			System.out.println("Error writing to file.");
			e.printStackTrace();
		}

	}

}


   ** Append to a Text File

    To add new content to the end of a file (instead of overwriting), pass true to FileWriter:
 


	** Example:

	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;

	public class Main {
  		public static void main(String[] args) {
    		
		// true = append mode
    		try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt", true))) {
      			bw.newLine();                      // move to a new line
      			bw.write("Appended line");         // add new text at the end
      			System.out.println("Successfully appended to the file.");
    		} catch (IOException e) {
      			System.out.println("Error writing file.");
    		}
  		}
	}


 **/ 





























