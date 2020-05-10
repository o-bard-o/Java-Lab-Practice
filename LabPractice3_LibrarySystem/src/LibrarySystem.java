
public class LibrarySystem {
	public static void main(String args[]) {
		Library a = new Library();
		a.returnBook(2);
		for(int i=0;i<10;i++) {
			System.out.println(a.shelf[i].States);
		}
	}
}
class Book{
	String States;
	Book(String s) {
		States=s;
	}
}
class Library{
	Book[] shelf = new Book[10];
	Library(){
		for(int i=0;i<10;i++) {
			shelf[i]=new Book("Returned");
		}
	}
	void borrowBook(int n) {
		if(shelf[n].States=="Returned") {
			shelf[n].States="Borrowed";
		}
		else
			System.err.println("Cannot Borrow the book.");
	}
	void returnBook(int n) {
		if(shelf[n].States=="Borrowed") {
			shelf[n].States="Returned";
		}
		else
			System.err.println("Haven't Borrowed the book.");;
	}
	
}