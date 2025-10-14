/*	* What is loop?
	
	+ Loop using when you want to run one thing or one task multiple time.

	+ Loop has three types based on its own use case:
		
		- while loop.
		- for loop.
		- do while loop.


*/

/*	** What is to consider when working with multiple loop or innerLoop:

		-A loop doesn't have to use a counter at all -it just needs some condition that can change.
		
		-If you have multiple nested loops, each one must have something inside it that can eventually make its own condition false.

		-The easiest and most common way: give each loop it own counter (i, j, k, ...).

		-But the counter doesn't have to be a separate variable -sometimes one variable is enough if you deliberately update it in the right place.

*/

	//Common way: Two counter for each loops: i and j.

	int i = 1;
	while(i <= 4){

		int j = 1;
		while(j <= 3){

			System.out.println("Hello");

			j++;
		}

	  i++;

	}


	//One counter variable: using if condition inside. Print hi every 3 iteration.



	int i = 1;

	while(i <= 12){
		System.out.println("Hello");
		
		if(i % 3 == 0){

			System.out.println("Hi");
		}


		i++;
	}




/*
** If your logic is “for each thing, do some repeated steps,” use nested loops.

** If your logic is “go through everything, but sometimes do something special,” use one loop with an if.
*/


	int i = 1;

	while(i<=4){
		System.out.println("hi");
		
		while(i <= 3){
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
		}

		i++;

	}



