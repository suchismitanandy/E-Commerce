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

Implementation Details
------------------------
1. In-Memory Data Storage
2. Products are stored in a Java ArrayList
3. No external database is used

API endpoints after being live:

POST https://E-Commerce.onrender.com/api/products
GET  https://E-Commerce.onrender.com/api/products/{id}

