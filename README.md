# gutenberg
A MongoDB based  e-commerce site demo with Spring Boot support.

I present here a MongoDB based e-commerce web site demo.
The focus is on MongoDB Spring Boot support.

The database gutenbergDB used in this demo can be prepopulated using the attached Javascript file gutenberg.js.

Five collections are used:

categories: book categories
books: books
orders: orders to be placed or already placed on this site
user: users registered to this site
reviews: reviews of books written by registered users

All orders can be persisted with a state that can be:
CART, PRE_AUTHORIZE, PRE_SHIPPING, SHIPPED

A user can see other books most frequently bought with the books she plans to buy.
A user can vote for the reviews written for these books



A full tutorial for this project can be found on this page:

www.dominique-ubersfeld.com/GUTENBERG/Gutenberg3.html

 


 
