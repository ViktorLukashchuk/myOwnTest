import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Books implements Comparable<Books>{
	private String bookName;
	private String author;
	private String genre;
	private int yearOfPublishing;
		public Books(String bookName, String author, String genre, int yearOfPublishing) {
			this.setBookName(bookName);
			this.setAuthor(author);
			this.setGenre(genre);
			this.setYearOfPublishing(yearOfPublishing);
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public int getYearOfPublishing() {
			return yearOfPublishing;
		}
		public void setYearOfPublishing(int yearOfPublishing) {
			this.yearOfPublishing = yearOfPublishing;
		}
		
		@Override
		public String toString() {
		        return (this.getBookName()/*+ this.getAuthor() + this.getGenre() + this.yearOfPublishing*/);
		        
		   }
	
		
		@Override
		public int compareTo(Books o) {
			return bookName.compareTo(o.bookName);
		}

		
}
		
