# Class Diagram Documentation

A class diagram is a visual representation that shows the structure of a system. It displays classes (like blueprints for objects), their properties (attributes), their actions (methods), and how they connect to each other (relationships).

## Classes in the E-Commerce System

This class diagram represents an e-commerce system with six main classes:

### 1. User: A customer or user of the e-commerce platform.

**Attributes (Properties):**
- `userId`: Unique number to identify each user
- `name`: User's full name
- `email`: User's email address
- `address`: User's physical address
- `phoneNo`: User's phone number

**Methods (Actions):**
- `register()`: Allows a new user to create an account
- `login()`: Allows a user to sign in (returns true if successful)
- `logout()`: Signs out the current user
- `updateDetails()`: Updates user's personal information

---

### 2. Cart: A shopping cart where users temporarily store products before purchasing.

**Attributes:**
- `cartId`: Unique number to identify each cart
- `userId`: The ID of the user who owns this cart

**Methods:**
- `addItem()`: Adds a product to the cart
- `calculateTotal()`: Calculates the total price of all items in the cart
- `removeItems()`: Removes products from the cart

---

### 3. Product: An item available for sale in the store.

**Attributes:**
- `productId`: Unique number to identify each product
- `productName`: Name of the product
- `price`: Cost of the product
- `sellerName`: Name of the person/company selling the product
- `quantity`: How many units are available in stock
- `userId`: ID of the user (seller) associated with the product
- `cartId`: ID of the cart this product belongs to

**Methods:**
- `addProduct()`: Adds a new product to the system
- `getProductDetails()`: Retrieves information about the product
- `removeProduct()`: Removes a product from the system
- `calculateTotal()`: Calculates total price for a quantity of this product
- `addToCart()`: Adds this product to a shopping cart

---

### 4. Category: A way to organize products into groups (like "Electronics", "Clothing", etc.).

**Attributes:**
- `categoryId`: Unique number to identify each category
- `name`: Name of the category
- `description`: Description of what this category contains

**Methods:**
- `addProduct()`: Adds a product to this category
- `removeProducts()`: Removes products from this category
- `getProducts()`: Gets a list of all products in this category

---

### 5. Order: A confirmed purchase made by a user.

**Attributes:**
- `orderId`: Unique number to identify each order
- `userId`: ID of the user who placed the order
- `cartId`: ID of the cart from which the order was created

**Methods:**
- `getOrderDetails()`: Retrieves information about the order
- `placeOrder()`: Finalizes and creates the order
- `cancelOrder()`: Cancels an existing order
- `trackOrder()`: Provides tracking information for the order

---

### 6. Payment: Handles the payment process for orders.

**Attributes:**
- `paymentId`: Unique number to identify each payment
- `paymentType`: Type of payment method (e.g., credit card, PayPal)
- `userId`: ID of the user making the payment
- `orderId`: ID of the order being paid for

**Methods:**
- `makePayment()`: Processes the payment (returns true if successful)
- `generateInvoice()`: Creates an invoice document for the payment
- `refundPayment()`: Processes a refund (returns true if successful)

---

## Relationships Between Classes

The arrows in the diagram show how classes are connected:

1. **User → Cart** (1 to 1)
   - Each user has exactly one shopping cart

2. **Cart → Product** (1 to many)
   - One cart can contain multiple products

3. **Category → Product** (1 to many)
   - One category can contain multiple products

4. **Order → Product** (1 to many)
   - One order can include multiple products

5. **User → Order** (1 to many)
   - One user can place multiple orders

6. **Order → Payment** (1 to 1)
   - Each order has exactly one payment

7. **User → Payment** (1 to many)
   - One user can make multiple payments

