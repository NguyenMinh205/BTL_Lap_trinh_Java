package repository;

import model.Product;
import repository.IRepository.IProductRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {

    private static final String FILE_PATH = "products.txt";
    private List<Product> products = new ArrayList<>();

    public ProductRepositoryImpl() {
        loadProductsFromFile();
        if (products.isEmpty()) {
            initializeProducts();
            saveProductsToFile();
        }
    }

    private void loadProductsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Object obj = ois.readObject();

            if (obj instanceof List<?>) {
                List<?> list = (List<?>) obj;
                if (!list.isEmpty() && list.get(0) instanceof Product) {
                    products = new ArrayList<>();
                    for (Object item : list) {
                        products.add((Product) item);
                    }
                    System.out.println("Danh sách sản phẩm đã được đọc từ file thành công.");
                } else {
                    throw new IOException("Dữ liệu trong file không phải là List<Product>");
                }
            } else {
                throw new IOException("Dữ liệu trong file không phải là List<?>");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Chưa Có Món Đồ Uống Nào");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveProductsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initializeProducts() {
        products.add(new Product("SP01", "Trà sữa Mixue", 45000, "Đồ uống", 100));
        products.add(new Product("SP02", "Trà Sữa Thiên Đường", 40000, "Đồ uống", 100));
        products.add(new Product("SP04", "Trà Sữa Koi Thé", 45000, "Đồ uống", 100));
        products.add(new Product("SP05", "Cà phê Trung Nguyên", 50000, "Đồ uống", 100));
        products.add(new Product("SP06", "Cà phê VIP", 70000, "Đồ uống",100));
        products.add(new Product("SP07", "Mimi tea", 35000, "Đồ uống", 100));
        products.add(new Product("SP08", "Share Tea", 35000, "Đồ uống", 100));
        products.add(new Product("SP09", "Bubbly Tea", 30000, "Đồ uống", 100));
        products.add(new Product("SP10", "Trà Sữa Phúc Long", 35000, "Đồ uống", 100));
        products.add(new Product("SP11", "Trà Sữa Socola", 40000, "Đồ uống", 100));
        products.add(new Product("SP12", "Trà Sữa Happy", 40000, "Đồ uống", 100));

        products.add(new Product("SP13", "Gà rán", 50000, "Đồ ăn", 100));
        products.add(new Product("SP14", "Pizza xúc xích", 60000, "Đồ ăn", 100));
        products.add(new Product("SP15", "Pizza hải sản", 60000, "Đồ ăn", 100));
        products.add(new Product("SP16", "Mì cay Hàn Quốc", 40000, "Đồ ăn", 100));
        products.add(new Product("SP17", "Bánh tráng trộn", 20000, "Đồ ăn", 100));
        products.add(new Product("SP18", "Bánh tráng nướng", 20000, "Đồ ăn", 100));
    }
    
    public int productNum(List<Product> p){
        return p.size();
    }

    @Override
    public Product save(Product product) {
        String newId = generateNewId();
        product.setMaSP(newId);
        products.add(product);
        saveProductsToFile();
        return product;
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    @Override
    public Product findByName(String name) {
        for (Product product : products) {
            if (product.getTenSP().toLowerCase().contains(name.toLowerCase())) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(Product product) {
        product.setMaSP(generateNewId());
        products.add(product);
        saveProductsToFile();
    }

    @Override
    public void clear() {
        products.clear();
        saveProductsToFile();
    }

    @Override
    public void delete(Product product) {
        products.remove(product);
        saveProductsToFile();
    }

    private String generateNewId() {
        
        if (products.isEmpty()) {
            return "SP01";
        }

        int maxNumber = 0;
        for (Product p : products) {
            String maSP = p.getMaSP();
            if (maSP != null && maSP.matches("^SP\\d+$")) {
                try {
                    int currentNum = Integer.parseInt(maSP.substring(2));
                    maxNumber = Math.max(maxNumber, currentNum);
                } catch (NumberFormatException ignored) {
                }
            }
        }
        return String.format("SP%02d", maxNumber + 1);
    }

    @Override
    public Product update(Product pd) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getMaSP().equals(pd.getMaSP())) {
                products.set(i, pd);
                saveProductsToFile();
                return pd;
            }
        }
        return null;
    }
}
