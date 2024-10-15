import library.*; 
import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(); 
        // Create books 
        Book book1 = new Book("1984", "George Orwell", "1234567890"); 
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321"); 
        // Add books to the library 
        library.addBook(book1); 
        library.addBook(book2); 

        // Adding a book from the user's preference
        while(true){
            System.out.println("Enter book title: ");
            String user_title = scanner.nextLine();
            System.out.println("Enter book author: ");
            String user_author = scanner.nextLine();
            System.out.println("Enter book isbn: ");
            String user_isbn = scanner.nextLine();
            Book book = new Book(user_title, user_author, user_isbn );
            library.addBook(book);
            System.out.println("Book added succesfully ! Add more ? (Y/n)");
            String answer = scanner.nextLine();
            if(answer.toLowerCase() == "n"){ break; }
        }
        // Create members 
        Member member1 = new Member("Alice", 1); 
        Member member2 = new Member("Bob", 2); 
 
        // Add members to the library 
        library.addMember(member1); 
        library.addMember(member2); 
 
        // List all books 
        System.out.println("Books in the library:"); 
        library.listBooks(); 
 
        // Search for a book 
        Book foundBook = library.findBookByTitle("1984"); 
        if (foundBook != null) { 
            System.out.println("Found book: " + 
foundBook.getTitle()); 
        } else { 
            System.out.println("Book not found."); 
        } 
    } 
} 

