# ecommerce-system-simulator

This Ecommerce System Simulator sells numerous types of products to registered customers.
Customers can order a product of their choice and the system will help ship it to them. In addition, registered users, active orders, and 
shipped orders are all tracked by the system. 

This system allows you to order products, such as shoes, books, clothing, furniture, computers and etc. 
Products can then be shipped once ordered and can even be cancelled. I also added a feature of a Cart where each customer 
possess their own cart, where they can add products, remove items and then order all item in their cart. 

The ECommerceUserInterface is the class with the main() method and is the user interaction part. 

Some of the commands or actions are: 
PRODs: Gives you access to the list of products available to customers

CUSTS: Lists all the registered customers 

NEWCUSTS: String name, String Address 
Creates a new registered customer 

ORDERS: List all orders that have been shipped

BOOKS : List all Books 

SHIP: String orderNumber
ships an order to the customer 

CUSTORDERS: String customerId
lists shipped and current orders for this customer id

ORDERS: String productId, String customerId
orders a product for a customer 

ORDERBOOK: String productId, String CustomerId, String options
orders a book for a customer, options can be one of the following (Paperback, Hardcover, EBook)

ORDERSHOES: String productId, String customerId, String options
orders shoes for a customer, options include size & color (Sizes: 6,7,8,9,10 & Color: Black or Brown)

CANCEL: String orderNumber 
cancels existing orders 

ADDTOCART: String productId, String CustomerId, String productOptions
Adds a product to the customer's cart 
Note: productOptions is only valid when ordering a Book with the following 3 options: Paperback, Hardcover, EBook. If you are not ordering a book
then you can leave the productOptins blank. 

PRINTCART: String customerId
Prints all the products in the cart 

REMOVECARTITEM: String customerId, String productId
Removes a product from the customer's cart 

ORDERIITEMS: String customerId 
Creates a product order for each product inside the cart 
