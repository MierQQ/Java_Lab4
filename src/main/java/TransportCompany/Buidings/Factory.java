package TransportCompany.Buidings;

import TransportCompany.Exceptions.FactoryException;
import TransportCompany.Products.Product;

import java.util.List;

public class Factory implements Runnable {
    private final Class<? extends Product> productToMake;
    private final List<Product> storage;
    public Factory(Class<? extends Product> productToMake, List<Product> storage) {
        this.productToMake = productToMake;
        this.storage = storage;
    }

    public Product produce() throws FactoryException {
        Product result = null;
        try {
            result = (Product) productToMake.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new FactoryException("Product creation exception", e);
        }
        return result;
    }

    @Override
    public void run() {

    }
}
