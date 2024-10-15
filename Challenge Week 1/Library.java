package library;
public class Library {
    public static void main(String[] args){
        Book book1 = new Book("Le Pain Au Chocolat","Imad SH",true);
        System.out.println(book1.getBookInfo());
        book1.borrowBook();
        book1.returnBook();
    }
}
