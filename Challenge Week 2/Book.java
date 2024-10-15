public class Book extends LibraryItem{
    private String genre; 
 
    public Book(String title, String author, String genre) { 
        super(title, author); 
        this.genre = genre; 
    } 
 
    @Override 
    public void displayInfo() { 
        super.displayInfo(); 
        System.out.println("Genre: " + genre); 
    } 

    @Override
    public String getItemType(){
        return "Book";
    }
}
