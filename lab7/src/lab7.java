import java.util.*;

class Product {
    String name;
    double recommendedPrice;

    public Product(String name, double recommendedPrice) {
        this.name = name;
        this.recommendedPrice = recommendedPrice;
    }
}

class OnlineStore {
    String name;
    List<Product> products;

    public OnlineStore(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Double getPrice(String productName) {
        for (Product product : products) {
            if (product.name.equals(productName)) {
                return product.recommendedPrice; // Повертаємо реальну ціну товару
            }
        }
        return null; // Повертаємо null, якщо товар не знайдено
    }
}

class ProductSearchService {
    List<OnlineStore> stores;

    public ProductSearchService() {
        stores = new ArrayList<>();
    }

    public void addStore(OnlineStore store) {
        stores.add(store);
    }

    // Задача 1: Знайти мінімальну ціну на заданий товар
    public double findMinimumPrice(String productName) {
        double minPrice = Double.MAX_VALUE;
        Iterator<OnlineStore> iterator = stores.iterator();
        while (iterator.hasNext()) {
            OnlineStore store = iterator.next();
            Double price = store.getPrice(productName);
            if (price != null && price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice == Double.MAX_VALUE ? -1 : minPrice;
    }

    // Задача 2: Скласти список магазинів з мінімальною ціною
    public List<String> findStoresWithMinimumPrice(String productName) {
        List<String> result = new ArrayList<>();
        double minPrice = findMinimumPrice(productName);

        Iterator<OnlineStore> iterator = stores.iterator();
        while (iterator.hasNext()) {
            OnlineStore store = iterator.next();
            Double price = store.getPrice(productName);
            if (price != null && price == minPrice) {
                result.add(store.name);
            }
        }
        return result;
    }

    // Задача 3: Чи є магазин, де всі товари дешевші за рекомендовану ціну
    public boolean hasStoreWithAllProductsCheaper() {
        for (OnlineStore store : stores) {
            boolean allCheaper = true; // Початкова умова, що всі товари дешевші за рекомендовану ціну
            for (Product product : store.products) {
                Double actualPrice = store.getPrice(product.name); // Отримуємо реальну ціну товару
                // Якщо ціна товару не менша за рекомендовану, магазин не підходить
                if (actualPrice != null && actualPrice >= product.recommendedPrice) {
                    allCheaper = false;
                    break; // Якщо хоча б один товар не дешевший за рекомендовану ціну, виходимо з перевірки
                }
            }
            if (allCheaper) { // Якщо всі товари дешевші
                return true;
            }
        }
        return false; // Якщо жоден магазин не задовольняє умову, повертаємо false
    }
}

public class lab7 {
    public static void main(String[] args) {
        ProductSearchService service = new ProductSearchService();

        // Створення магазинів
        OnlineStore store1 = new OnlineStore("Цитрус");
        store1.addProduct(new Product("Laptop", 2000));
        store1.addProduct(new Product("Phone", 500));

        OnlineStore store2 = new OnlineStore("АТБ");
        store2.addProduct(new Product("Laptop", 950));
        store2.addProduct(new Product("Phone", 480));

        OnlineStore store3 = new OnlineStore("Сiгма");
        store3.addProduct(new Product("Laptop", 1599));
        store3.addProduct(new Product("Phone", 700));

        service.addStore(store1);
        service.addStore(store2);
        service.addStore(store3);


        // Виконання завдань
        String productName = "Laptop";

        // Задача 1
        System.out.println("Мінімальна ціна на " + productName + ": " + service.findMinimumPrice(productName));

        // Задача 2
        System.out.println("Магазини з мінімальною ціною на " + productName + ": " + service.findStoresWithMinimumPrice(productName));

        // Задача 3
        System.out.println("Чи є магазин, де всі товари дешевші за рекомендовану ціну? " + service.hasStoreWithAllProductsCheaper());
    }
}
