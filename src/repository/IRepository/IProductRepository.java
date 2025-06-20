package repository.IRepository;

import model.Product;
import java.util.List;

public interface IProductRepository {

    public Product save(Product product);

    public List<Product> findAll();

    public Product findByName(String name);

    public void addProduct(Product product);

    public void delete(Product product);

    public void clear();
    
    public Product update(Product product);
    
}
