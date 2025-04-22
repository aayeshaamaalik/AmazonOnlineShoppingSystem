# Online Shopping System

This project is an implementation of an **Online Shopping System** designed using Object-Oriented Design (OOD) principles. The system simulates a platform similar to Amazon, supporting functionalities such as product browsing, search, category-based filtering, shopping cart management, order placement, payment processing, and shipment tracking.

**Design Reference:**  
This system is modeled on the conceptual architecture outlined in [ycwkatie's OOD Amazon Design](https://github.com/ycwkatie/OOD-Object-Oriented-Design/blob/main/ood/amazon.md).

---

## Key Components and Interacting Objects

The system is structured using core domain-driven classes and interfaces that collaborate to perform all major e-commerce operations:

- **OnlineShoppingSystem**: Central controller managing products, users (members/admins), search, and order operations.
- **Product**: Represents an item available for purchase, with pricing, stock, category, and review data.
- **Category**: Enum that classifies products into types (e.g., Electronics, Clothing, Home, etc.).
- **ProductReview**: Captures user-submitted ratings and textual reviews for products.
- **Account / Member / Admin**: Define user roles. Members can shop, Admins manage products.
- **ShoppingCart & Item**: Represent temporary cart items and quantities before checkout.
- **Order**: Represents a finalized purchase with shipment and payment tracking.
- **Shipment & ShipmentLog**: Represent shipping status and historical tracking logs.
- **Payment**: Handles the payment amount and transaction state.
- **Enums**:
  - `OrderStatus`, `PaymentStatus`, `ShipmentStatus` for tracking states
  - `Category` for product classification

---

## User Action Flow

The system supports the complete online shopping lifecycle. All key operations are exposed via methods in the `OnlineShoppingSystem` class:

1. `addAdmin(Admin admin)`  
   Registers new administrators.

2. `registerMember(Member member)`  
   Adds new customers to the system.

3. `addProduct(Product product, Admin admin)`  
   Allows an admin to add a product to the platform.

4. `updateProduct(Product updatedProduct, Admin admin)`  
   Lets an admin modify existing product details.

5. `deleteProduct(Product product, Admin admin)`  
   Removes a product from the catalog if requested by an admin.

6. `searchByKeyword(String keyword)`  
   Returns a list of products whose name contains the keyword.

7. `filterByCategory(Category category)`  
   Filters and returns all products within a specific category.

8. `filterByPriceRange(double min, double max)`  
   Returns all products within the specified price range.

9. **Member checkout**  
   A `Member` adds `Item`s to their `ShoppingCart`, which can be converted to an `Order` and paid for using a `Payment` object.

10. **Order tracking**  
    Orders are updated using `Shipment` and `ShipmentLog`, allowing status monitoring from "Pending" to "Delivered".

---

## Getting Started

To set up and run the project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/online-shopping-system.git
   ```

2. Navigate to the project folder:
   ```bash
   cd online-shopping-system
   ```

3. Open in your Java IDE (e.g., IntelliJ IDEA, Eclipse)

4. Build and run the project  
   Ensure your environment supports **Java 8+**

---

## Project Structure

| Component                     | Responsibility                                                 |
|------------------------------|-----------------------------------------------------------------|
| `Product`, `ProductReview`   | Define product listings, ratings, and review system             |
| `Category`                   | Categorizes products for filtering                             |
| `Account`, `Member`, `Admin` | Represents users and their access permissions                  |
| `ShoppingCart`, `Item`       | Manage cart contents before checkout                           |
| `Order`, `OrderStatus`       | Tracks order placements and status                             |
| `Shipment`, `ShipmentLog`    | Track shipping progress with logs                              |
| `Payment`, `PaymentStatus`   | Handles payments and their completion status                   |
| `OnlineShoppingSystem`       | Coordinates the overall system logic                           |

