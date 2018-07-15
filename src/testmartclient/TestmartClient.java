
package testmartclient;

import app.ProductCatalog;
import app.ProductCatalogService;
import java.util.List;

public class TestmartClient {

    public static void main(String[] args) {
        
        ProductCatalogService service = new ProductCatalogService();
        ProductCatalog catalog = service.getProductCatalogPort();
        List<String> list = catalog.getProducts("books");
        for(String str : list){
            System.out.println(str);
        }
        
        //catalog.addProduct("books", "Harry Potter and YO MAMA SO FAT HAHHAHAH");
        
    }
    
}
