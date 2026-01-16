# Use Case Diagram Documentation

A use case diagram shows the different ways users (called "actors") interact with a system. It displays what users can do in the system and how the system responds to their actions.

## Actors in ShopHub

The diagram shows three main actors:

1. **Customer** - A regular user who shops on the platform
2. **Admin** - An administrator who manages the platform
3. **Payment Gateway** - An external system that handles payments

## Customer Use Cases

These are the actions a customer can perform:

- **Register** - Create a new account
- **Login** - Sign in to an existing account
- **Search Products** - Look for products in the store
- **Manage Cart** - Add, remove, or modify items in shopping cart
- **Checkout** - Proceed to purchase items
- **Track Order** - Check the status of placed orders
- **Manage user Profile** - Update personal information

## Admin Use Cases

These are the actions an admin can perform:

- **Admin Login** - Sign in as administrator
- **Manage Inventory** - Add, update, or remove products from stock
- **View Orders** - See all customer orders
- **Update Order Status** - Change the status of orders (e.g., shipped, delivered)
- **View Dashboard** - See overview of platform statistics
- **Manage Products** - Add, edit, or delete products

## Shared Use Cases

These functionalities are used by multiple use cases:

- **JWT Authentication** - Security system for verifying user identity (used by Login and Admin Login)
- **Filter Products** - Sorting and filtering products (used by Search Products)
- **Make Payment** - Processing payment transactions (used by Checkout)

## Relationships

**Include Relationships:**
- `Login` includes `JWT Authentication` - Login requires authentication
- `Admin Login` includes `JWT Authentication` - Admin login requires authentication
- `Search Products` includes `Filter Products` - Searching involves filtering
- `Checkout` includes `Make Payment` - Checkout requires payment processing

This use case diagram shows that:
- **Customers** can browse, shop, and manage their orders
- **Admins** can manage products, inventory, and view all orders
- **Payment Gateway** handles all payment transactions
- Some functionalities like authentication and filtering are shared across different use cases
