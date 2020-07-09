package demo;

import java.util.ArrayList;
import java.util.List;
// implemento l'interfaccia clonable
public class BookShop implements Cloneable{
	
	private String shoName;
	List<Book> books = new ArrayList<>();
	@Override
	public String toString() {
		return "BookShop [shoName=" + shoName + ", books=" + books + "]";
	}
	public String getShoName() {
		return shoName;
	}
	public void setShoName(String shoName) {
		this.shoName = shoName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public void loadData() {
		// simulo database
		for (int i = 0; i < 10; i++) {
			Book b = new Book();
			b.setBid(i);
			b.setBname("Book"+ i);
			getBooks().add(b);
		}
		
		
	}
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		// fetch data from old object more faster!!!
		BookShop shop = new BookShop();
		for (Book b : this.getBooks()) {
			shop.getBooks().add(b);
		}
		return shop;
	}
	
	
}
