import java.*;
import java.util.Scanner;
public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("Input author name : ");
		String auothorName = scan.nextLine();
		System.out.print("Input author email : ");
		String authorEmail = scan.next();
		scan.nextLine();
		
		Author author1 = new Author(authorName,authorEmail);
		System.out.println(author1);
		
		System.out.println();
		System.out.print("Input book title : ");
		String bookTitle = scan.nextLine();
		System.out.print("Input book pages : ");
		int BookPages = scan.nextInt();
		Book book1 = new Book (bookTitle,auothor1,bookPages);
		System.out.print(book1);
		
		scan.close();
	}

}
