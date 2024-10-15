public class Magazine extends LibraryItem{
    private int issueNumber; 
 
    public Magazine(String title, String author, int issueNumber) { 
        super(title, author); 
        this.issueNumber = issueNumber; 
    } 
 
    @Override 
    public void displayInfo() { 
        super.displayInfo(); 
        System.out.println("Issue Number: " + issueNumber); 
    }
    @Override
    public String getItemType(){
        return "Magazine";
    }
}
