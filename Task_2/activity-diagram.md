# Activity Diagram Documentation

## What is an Activity Diagram?

An activity diagram shows the flow of activities (actions) in a system. It displays the step-by-step process of how things happen, including decision points and different paths based on choices.

## ShopHub Activity Flow

The diagram shows the workflow for two types of users: **Customer** and **Admin**.

## Start

The process begins when someone opens ShopHub.

## Customer Path

### 1. User Type Decision
After opening ShopHub, the system checks: "User Type?"
- If **Customer** → continues to customer flow
- If **Admin** → continues to admin flow

### 2. New Customer Decision
For customers, the system asks: "New Customer?"
- If **Yes** → performs "Register" activity
- If **No** → performs "Login" activity

Both paths merge and proceed to the next step.

### 3. Shopping Activities
After registration/login, the customer performs:
- **Browse Products** - Look at available items
- **Manage Cart** - Add or remove items from cart
- **Checkout** - Proceed to purchase
- **Make Payment** - Pay for the items

### 4. Payment Success Decision
After making payment, the system checks: "Payment Success?"
- If **Yes** → performs "Place Order" followed by "Track Order"
- If **No** → performs "Retry Payment"

Both paths eventually merge.

## Admin Path

If the user is an **Admin**, the activities are:
1. **Admin Login** - Sign in as administrator
2. **View Dashboard** - See platform overview
3. **Manage Inventory** - Add, update, or remove products
4. **Process Orders** - Handle customer orders

## End

All paths (customer flow and admin flow) eventually merge and the process ends.

## Key Elements

**Activities:** Rectangular boxes showing actions (e.g., "Register", "Login", "Browse Products")

**Decisions:** Diamond shapes showing decision points (e.g., "User Type?", "New Customer?", "Payment Success?")

**Flow:** Arrows show the direction of the process flow

**Merge Points:** Where different paths come together

## Summary

This activity diagram shows:
- **Customers** can register/login, browse products, manage cart, checkout, make payment, and track orders
- **Admins** can login, view dashboard, manage inventory, and process orders
- The system handles different paths based on user type and decisions (like payment success)
- All activities flow from start to end, showing the complete process

The diagram helps understand the overall workflow and how different user actions lead to different outcomes in ShopHub.
