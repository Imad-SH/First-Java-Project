public class Journal extends LibraryItem{
    private String field; 
 
    public Journal(String title, String author, String field) { 
        super(title, author); 
        this.field = field; 
    } 
 
    @Override 
    public void displayInfo() { 
        super.displayInfo(); 
        System.out.println("Field: " + field); 
    }

    @Override
    public String getItemType(){
        return "Journal";
    }
}
