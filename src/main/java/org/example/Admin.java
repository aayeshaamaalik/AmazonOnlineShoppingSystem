package org.example;

public class Admin extends Account {

    public Admin(String username, String password, String name, Address address, String email, String phone) {
        super(username, password, name, address, email, phone);
    }

    // Placeholder methods for admin features (delegated to OnlineShoppingSystem)
    public boolean addProduct(Product product) {
        return true;
    }

    public boolean updateProduct(Product product) {
        return true;
    }

    public boolean deleteProduct(Product product) {
        return true;
    }

    public boolean addCategory(Category category) {
        return true;
    }

    public boolean deleteCategory(Category category) {
        return true;
    }
}
