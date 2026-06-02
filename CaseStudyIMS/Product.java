package CaseStudyIMS;

public class Product {
    private String productId;
    private String productName;
    private String description;
    private double price;
    private int stockLevel;
    private String category;
    public Product(String productId, String productName, String description, double price, int stockLevel, String category) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stockLevel = stockLevel;
        this.category = category;
    }
    public String getproductId(){
        return productId;
    }
    public String getproductName(){
        return productName;
    }
    public String getdescription(){
        return description;
    }
    public double getprice(){
        return price;
    }
    public int getstockLevel(){
        return stockLevel;
    }
    public String getcategory(){
        return category;
    }
    public void setStockLevel(int stockLevel){
        if(stockLevel >= 0){
            this.stockLevel = stockLevel;
        } else {
            System.out.println("Stock level cannot be negative.");
        }
    }
    public String toString(){
        return "Product ID: " + productId + "\n" +
               "Name: " + productName + "\n" +
               "Description: " + description + "\n" +
               "Price: $" + price + "\n" +
               "Stock Level: " + stockLevel + "\n" +
               "Category: " + category;
    }
}
