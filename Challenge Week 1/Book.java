package library;
public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    public Book(String title, String author, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public void borrowBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("Borrowing the book. . .");
            System.out.println("Borrowed successfully! ");
        }else{
            System.out.println("The book is already borrowed.");
        }
    }
    public void returnBook(){
        isAvailable = true;
    }
    public String getBookInfo(){
        return "Book info :\n"+"Title = "+title+"\nAuthor = "+ author 
                + "\nAvailability = "+isAvailable;
    }
}
