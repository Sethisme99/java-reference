/*	** Java File Class:
 
	The file class is used to represent the path of a file or directory in
file system. This class is used for creation of file and directories, file -
searching, file deletion, etc. We need to "import java.io.package" before using
the File class.

	** Create File Object:

	To work with a file in java, first create a file object by passing the
file name or path as a string. The file object represent the actual -
file/directory on the disk.


	** Syntax:

	import java.io.File; //Import the File class
	
	File myobj = new File("filename.txt"); //Specify the filename


	** File Class Constructors:

	1, File(File parent, String child)

	This constructor creates a new File instance from a parent abstract -
	path-name and a child path-name string.

	2, File(String pathname)

	This constructor creates a new File instance by converting the given -
	path-name string into an abstract path-name.

	3, File(String parent, String child)

	This constructor creates a new File instance from a parent path-name
	string and a child path-name string.

	4, File(URI uri)

	This constructor creates a new File instance by converting the given
	file: URI into an abstract path-name.

	** File Class Methods:
	
	Once you have File object in hand, then there is a list of helper -
methods which can be used to manipulate the files.

	** Method & Description:
	
	1, getName()
	
	Returns the name of the file or directory.

	2, getAbsolutePath()

	Returns the absolute path-name of the file.

	3, canRead()

	Tests whether the application can read the file denoted by this abstract
	path-name. return true if and only if the file specified by this -
	abstract path-name exists and can be read by the application. false -
	otherwise.

	4, canWrite()

	Tests whether the application can modify to the file denoted by this -
	abstract path-name. Returns true if and only if the file system actually
	contains a file denoted by this abstract path-name and the application -
	is allowed to write to the file. false othewise.

	5, exists()

	Test whether the file or directory denoted by this abstract path-name -
	exists. Returns true if and only if the file or directory denoted by -
	this abstract path-name exist. false otherwise.

	6, isDirectory()

	Test whether the file denoted by this abstract path-name is a directory.
	Returns true if and only if the file denoted by this abstract path-name
	exists and is a directory. false otherwise.

	7, isFile()

	Tests whether the file denoted by this abstract path-name is a normal
	file. A file is normal if it is not a directory and , on addition, -
	satisfies other system-dependent criteria. Any non-directory file -
	created by a Java application is guaranteed to be a normal file. Returns
	true if and only if the file denoted by this abstract path-name exists -
	and is a normal file; false otherwise.

	8, length()
	
	Returns the size of the file in bytes.

	9, createNewFile()

	Automatically creates a new, empty file. Returns true if the named file
	does not exist and was successfully created. false if the named file -
	already exists.

	10,delete()

	Deletes the file or directory denoted by this abstract path-name. If -
	this path-name denotes a directory, then the directory must be empty in
	order to be deleted. Returns true if and only if the file or directory -
	is successfully deleted. false otherwise.

	11, list()

	Returns an array of string naming the files and directories in the -
	directory.

	12, mkdir()

	Creates the directory. Returns true if and only if the directory was
	created. false otherwise.


//Example:

 import java.io.File;

 public class Main{

	public static void main(String[] args){


		File f = null;
		String[] strs = {"test1.txt", "test2.txt"};
		try{

			//for each string in string array
			for(String s:strs){
				
				//create new file
				
				f = new File(s);
				
				//true if the file is executable
				
				boolean bool = f.canExecute();
				
				//fine the absolute path
				
				String a = f.getAbsolutePath();

				//prints absolute path

				System.out.print(a);

				//print

				System.out.println(" is executable:" + bool);
			}

	
		} catch (Exception e){

			//if any I/O error occurs:

			e.printStackTrace();
		}

	}

 }




 *
 *
 *
 *
 *
 * */















