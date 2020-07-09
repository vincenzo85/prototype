package demo;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bs = new BookShop();
		bs.setShoName("Libreria Flaminia");
		bs.loadData();
	
		
		// il secondo oggetto è vuoto, potremmo clonare il primo
		// invece di rifare loadData;
		BookShop bs1 = new BookShop();
		bs1.setShoName("ere");
		
		
		//casting a book shop non lo sa che è book shop
		// aggiungo Exception
		BookShop bs2 = (BookShop) bs.clone();
		bs.getBooks().remove(2);
		System.out.println(bs);
		System.out.println(bs2);
		
		
	}

}
