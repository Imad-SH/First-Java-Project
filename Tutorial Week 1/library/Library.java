package library;
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    public void addBook(Book book) { 
        books.add(book); 
    }
    public void addMember(Member member) { 
        members.add(member); 
    }
    public void listBooks() { 
        for (Book book : books) { 
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
    public Book findBookByTitle(String title) {
        for (Book book : books) { 
            if (book.getTitle().equalsIgnoreCase(title)) { 
                return book; 
            } 
        } 
        return null; // Not found 
    } 
}
