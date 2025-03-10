# FinanceTracker

# Description

The Finance Tracker is a microservices-based web application that empowers users to manage their personal finances efficiently. The system helps users to track income and expenses, set monthly budgets, analyze spending patterns, and receive alerts for overspending. This application promotes financial stability by offering real-time insights and automated tracking of transactions with categorized details. The backend architecture is built using Spring Boot Microservices to ensure scalability, security, and modular development.



# Objectives

1. Provide secure user authentication for personalized finance tracking.
2. Allow users to register and login securely.
3. Enable users to log expenses and income with categorized labels like groceries, salary, bills, and others.
4. Allow users to set monthly budgets and monitor their spending patterns.
5. Display all transactions for a logged-in user.
6. Provide data-driven insights and analytics on spending habits.
7. Send alerts for overspending when expenses exceed the defined budget.

# Endpoints

1. Signup Microservice (8081)
2. POST /users/signup – Register a new user
3. POST /login – Login user and return user-specific transactions
4. GET /users/{id} – Fetch user by ID
5. GET /users/email/{email} – Fetch user by Email
6. DELETE /users/{id} – Delete user by ID
7. GET /users – Fetch all users

Homepage Microservice (8082)

1. POST /api/transactions – Add a transaction (Income or Expense)
2. GET /api/transactions – Get all transactions
3. GET /api/transactions/{id} – Get transaction by ID
4. GET /api/transactions/user – Get transactions by User ID
5. DELETE /api/transactions/{id} – Delete transaction by ID

Budget Microservice (8083)

1. POST /api/budget – Set a monthly budget
2. GET /api/budget/{userId} – Get the budget set by the user
3. DELETE /api/budget/{id} – Delete budget
4. GET /api/budget/alert/{userId} – Alert user when expenses exceed budget

# Page Functionality

1. Signup Page

-> User Registration using Name, Email, Password.
-> Secure password encryption.
-> Email validation and uniqueness check.
-> Automatic user creation in MySQL database.

2. Login Page

-> User login using Email and Password.
-> On successful login, fetch all transactions related to the user.
-> Returns user-specific transactions in JSON format.
-> Invalid login attempts return an error message.

3. Homepage

-> Display all transactions of the logged-in user.
-> Allow users to add new transactions (Income/Expense).
-> Provide filters to sort transactions by Date, Amount, or Category.
-> Analyze spending habits with real-time graphs.

4. Budget Page

-> Allow users to set monthly budgets.
-> Compare expenses with budget limits.
-> Trigger alerts when expenses exceed the defined budget.
-> Display monthly progress with graphical insights.


# Technology Stack

-> Backend: Spring Boot (Java)
-> Database: MySQL
-> Microservices: Spring Cloud
-> Authentication: JWT (Upcoming Feature)
-> Tools: Postman, IntelliJ IDEA


# How to Run

1. Clone the project from the repository.
2. Start MySQL Server and create databases for each service.
3. Run each microservice one by one:
4. Signup Microservice (Port: 8081)
5. Homepage Microservice (Port: 8082)
6. Budget Microservice (Port: 8083)
7. Eureka Microservice (Port: 8761)
8. API_Gateway (Port: 9091)
9. Use Postman to test the endpoints.
