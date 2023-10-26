import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();
    public void addProduct(Product p) {
        products.add(p);

    }
    public List<Product> getAllProducts(){
     return products;
    }
    public Product getProduct(String name){
        for(Product p: products){
            if(p.getName().equals(name)) return p;
        }
        return null;
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();                // for lowercase(eg: 'Black' should come even if we pass 'black');
        List<Product> prods = new ArrayList<>();
        for(Product p : products) {
            String name= p.getName().toLowerCase();
            String type= p.getType().toLowerCase();
            String place=p.getPlace().toLowerCase();
            if (name.contains(str) || type.contains(str) || place.contains(str)){
                prods.add(p);
        }

        }
        return prods;
    }
//    public Product getProduct(String place){   //assignment task
//        for(Product p: products){
//            if(p.getPlace().equals(place)) return p;
//        }
//        return null;
//    }



}



