import java.util.HashSet;
import java.util.Set;

public class Sale {
    private String productName;
    
    public Sale(String productName) {
        this.productName = productName;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Sale)) {
            return false;
        }
        
        Sale other = (Sale) obj;
        return productName.equals(other.getProductName());
    }
    
    @Override
    public int hashCode() {
        return productName.hashCode();
    }
    
    public static void main(String[] args) {
        Set<Sale> sales = new HashSet<>();
        sales.add(new Sale("Tea"));
        sales.add(new Sale("Coffee"));
        sales.add(new Sale("Milk"));
        
        System.out.println("Sales before removal: " + sales);
        
        Sale saleToRemove = new Sale("Tea");
        boolean removed = sales.remove(saleToRemove);
        
        if (removed) {
            System.out.println("Sale with Tea removed successfully.");
            System.out.println("Sales after removal: " + sales);
        } else {
            System.out.println("Sale with Tea not found.");
        }
    }
}

