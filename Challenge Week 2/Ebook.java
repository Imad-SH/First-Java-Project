//This is the code I added
public class Ebook extends LibraryItem{
    private double filesize; //in Mb
    private String format;
    public Ebook(String title, String author, double filesize, String format){
        super(title,author);
        this.filesize = filesize;
        this.format = format;
    }
    @Override 
    public void displayInfo() { 
        super.displayInfo(); 
        System.out.println("Filesize = " + filesize+", Format = "+format); 
    } 
    @Override
    public String getItemType(){
        return "EBook";
    }
}
