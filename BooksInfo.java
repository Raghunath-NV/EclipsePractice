import java.io.*;

class BooksInfo {

	FileOutputStream fos;
	ObjectOutputStream os;
	Book book;

	FileInputStream fis;
	ObjectInputStream ois;

	BooksInfo() {

		try{
			fos = new FileOutputStream("mybooks.txt");
			os = new ObjectOutputStream(fos);
			book = new Book(100, "RESTful", "Oreilly", 34.56);
			System.out.println(book);
			os.writeObject(book);
			System.out.println("Stored!");
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try{
				os.close();
				fos.close();
			} catch(Exception e) {

			}
		}

	}

	void readBook() {
		try{
			fis = new FileInputStream("mybooks.txt");
			ois = new ObjectInputStream(fis);
			Book obj = (Book) ois.readObject();
			System.out.println("From file --> " + obj);	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String a[]) {
		BooksInfo bi = new BooksInfo();
		bi.readBook();
	}

}