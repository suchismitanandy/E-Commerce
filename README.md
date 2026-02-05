Features
--------------
1. Add a new Product
2. Retrieve an product by ID
3. Input validation with meaningful error responses
4. In-memory storage (no database required)

Application URL
-----------------
http://localhost:8080

API Endpoints
---------------
1. Add a New Item

POST /api/products

Description: Adds a new product to the system.

Request Body

{
  "name": "iPhone 15",
  "description": "Latest Apple smartphone",
  "price": 69999
}


Success Response – 200 OK

{
  "id": 1,
  "name": "iPhone 15",
  "description": "Latest Apple smartphone",
  "price": 69999
}

2. Get product by ID

GET /api/products/{id}

Description: Retrieves a single item using its ID.

Example

GET /api/products/1


Success Response – 200 OK

{
  "id": 1,
  "name": "iPhone 15",
  "description": "Latest Apple smartphone",
  "price": 69999
}

Implementation Details
-----------------------
1. In-Memory Storage
2. Items are stored in an ArrayList
3. No database is used
4. Data will be lost when the application restarts

ID Generation
---------------
Each item is assigned a unique ID using AtomicLong

Input Validation Rules
-------------------------
Field	Rule
1. name	Required, cannot be blank
2. description	Required, cannot be blank
3. price	Required, must be greater than 0

Validation Error Example (400 Bad Request)

{
  "name": "Name is required",
  "price": "Price must be greater than 0"
}


API endpoints after being live
-----------------------------------------
URL 
--------------------
https://e-commerce-application-1p4m.onrender.com

POST https://e-commerce-application-1p4m.onrender.com/api/products
GET  https://e-commerce-application-1p4m.onrender.com/api/products/{id}


