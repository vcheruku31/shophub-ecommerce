# Sequence Diagram Documentation

A sequence diagram shows how different parts of a system communicate with each other over time. It displays the order of messages exchanged between users and system components, like a conversation flow.

## Participants in ShopHub

The diagram shows six main participants:

1. **Customer** - A user shopping on the platform
2. **Admin** - An administrator managing the platform
3. **Web/Mobile App** - The user interface (website or mobile app)
4. **Auth Service** - Handles user authentication and login
5. **Order System** - Manages all orders
6. **Payment Gateway** - Processes payments

## Customer Journey

### 1. Login/Register
- Customer sends "Login / Register" request to Web/Mobile App
- Web/Mobile App sends "Authenticate User" to Auth Service
- Auth Service responds with "Auth Success" back to Web/Mobile App

### 2. Shopping Process
- Customer sends "Browse Products" to Web/Mobile App
- Customer sends "Add to Cart" to Web/Mobile App
- Customer sends "Checkout" to Web/Mobile App

### 3. Payment and Order
- Web/Mobile App sends "Process Payment" to Payment Gateway
- Payment Gateway responds with "Payment Success" to Web/Mobile App
- Web/Mobile App sends "Create Order" to Order System
- Order System responds with "Order Confirmed" to Web/Mobile App

### 4. Track Order
- Customer sends "Track Order" to Web/Mobile App
- Web/Mobile App sends "Get Order Status" to Order System
- Order System responds with "Order Status" to Web/Mobile App

## Admin Journey

### 1. Admin Login
- Admin sends "Admin Login" to Web/Mobile App
- Web/Mobile App sends "Authenticate Admin" to Auth Service
- Auth Service responds with "Auth Success" to Web/Mobile App

### 2. Dashboard and Order Management
- Admin sends "View Dashboard" to Web/Mobile App
- Web/Mobile App sends "Get Orders" to Order System
- Order System responds with "Order Data" to Web/Mobile App
- Admin sends "Manage Orders" to Web/Mobile App

## How It Works

**Lifelines:** Each participant has a vertical dashed line showing they exist throughout the process.

**Messages:** 
- Solid arrows show requests being sent
- Dotted arrows show responses being received

**Flow:** Messages flow from top to bottom, showing the sequence of events over time.

This sequence diagram shows:
- **Customers** interact with the app, which communicates with Auth Service, Order System, and Payment Gateway
- **Admins** interact with the app, which communicates with Auth Service and Order System
- All interactions go through the Web/Mobile App, which acts as the main interface
- Each action triggers a response, showing the ack-and-forth communication between components

