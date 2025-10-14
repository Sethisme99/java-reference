/*  ** Java Packages:
 *	
 	Packages are used in java in order to prevent naming conflicts, control acces, make searching/ -
locating and usage of classes, interfaces, enumerations, and annotaions easier, etc.

	A Java package can be defined as a grouping of related types (classes, interfaces, enumerations, -
and annotaions) providing access protection and namespace management.

   ** Types of Java Packages:
   	
   	-Built-in Java Packages.

	-User-derfined Java Packages.

   ** Some of the existing packages are:
   	
   	- java.lang - bundles the fundamental classes.

	- java.io - classes for input, output functions are bundle in this package.


   ** User defined Packages:

   	You can define your own packages to bundle groups of classes/interfaces, etc. It is a good practice
- to group related classes implemented by you so that a programmer can easily determine that the classes,
interfaces, enumerations, and annotations are relate.

	Since the package creates a new namespace there won't be any name conflicts with names in other -
packages. Using packages, it is easier to provide access control and it is also easier to locate the --
related classes.

   ** Creating a java package:
   	
   	While creating a package, you should choose a name for the package and include a package statement-
along with that name at the top of every source file that contains the classes, interface, enumerations, -
and annotaion type that you want to include in the package.

	The package statment should be the firest line in the source file. There can be only one package
statement in each source file, and it applies to all types in the file.

	If a package statement is not used when the class, interfaces, enumerations, and annotation types -
will be placed in the current default package.



  ** Compiling with Package:
  	
  	To compile the programs with package statements, will have to use "-d" option:

	"javac -d Destination_folder file_name.java".

  
 ** Importing Package:
 	
 	If a class wants to use another class in the same package, the package name no need to be used.
classes in the same package find each other without any special syntax.

  ** Example
 
 
 *
 *
 **/
