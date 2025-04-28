package week1.day2.homework;

public class Library {
	
	String addBook(String bookTitle){
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	protected void issueBook(){
		System.out.println("Book issued successfully");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library L = new Library();
		System.out.println(L.addBook("BookName: JAVA"));
		L.issueBook();

	}

}
