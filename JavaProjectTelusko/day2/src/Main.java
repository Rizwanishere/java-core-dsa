import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        // hey service, add a product
        service.addProduct(new Product("Asus Vivobook","Laptop","Brown Table",2023));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));;
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logitech Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));



//        List<Product>products= service.getAllProducts();
////        System.out.println(products); // does not print line by line so use loop
//        for(Product p :products){
//            System.out.println(p);
//        }
//        System.out.println("============================================================================================");
//        System.out.println("A Particular Product");
//        Product p = service.getProduct("Asus Vivobook");
////        Product p = service.getProduct("Brown Table"); //assignment task
//        System.out.println(p);

        System.out.println("============================================================================================");
        System.out.println("A Particular Text");
        List<Product> prods = service.getProductWithText("black");
        for(Product product :prods){
            System.out.println(product);
        }
    }
}