public class Food extends Product{
    private String expiration;
    public Food(String name,double price,int quantity,String expiration){
        super(name, price, quantity);
        this.expiration = expiration;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("expiration = "+this.expiration);
    }
}
