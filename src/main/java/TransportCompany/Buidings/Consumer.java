package TransportCompany.Buidings;

import TransportCompany.Products.Product;

import java.util.List;

public class Consumer implements Runnable {
    private final List<Product> storage;

    public Consumer(List<Product> storage) {
        this.storage = storage;
    }

    public void consume(){

    }
    @Override
    public void run() {

    }
}
