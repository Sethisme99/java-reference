class Book{
		
	private String bookName = "How To Be A Good Programmer.";

	public void getBook(){
		System.out.println("The Book Title Is: " + bookName);
	}

}


class Library{

	//HAS-A -> class reference:
	//access modifire + Class you want to reference + reference:

	private Book book;
	
	public Library(Book book){

		this.book = book;
	}


	public void rentBook(){

		book.getBook();
		System.out.println("The book is renting....");
	}

}


public class Test{

	public static void main(String[] a){
		Book bk = new Book();
		Library lb = new Library(bk);
		lb.rentBook();

	}

}






