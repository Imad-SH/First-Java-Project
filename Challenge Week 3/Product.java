public class Product{
    String name;
    double price;
    int quantity;
    Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void displayInfo(){
        System.out.println("Details : \n"+
                            "name = "+this.name+"\n price = "+this.price+"\n quantity = "+ this.quantity);
    }
    public void updateQuantity(int newQuantity){
        this.quantity = newQuantity;
    }
    public void updateQuantity(int addedQuantity, boolean addToExisting){
        if (addToExisting){
            this.quantity += addedQuantity;
        }else{
            this.quantity = addedQuantity;
        }
    }
    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public static void welcomeMessage(){
        System.out.println("! Welcome to your products inventory !");
    }
}

