/* A book IS A product that has additional information - e.g. title, author

 	 A book also comes in different formats ("Paperback", "Hardcover", "EBook")
 	 
 	 The format is specified as a specific "stock type" in get/set/reduce stockCount methods.

*/
public class Book extends Product implements Comparable
{
  private String author;
  private String title;
  private int year;
  
  // Stock related information NOTE: inherited stockCount variable is used for EBooks
  int paperbackStock;
  int hardcoverStock;

  
  public Book(String name, String id, double price, int paperbackStock, int hardcoverStock, String title, String author, int year)
  {
  	 // Make use of the constructor in the super class Product. Initialize additional Book instance variables. 
  	 // Set category to BOOKS 

     super(name, id, price, 100000, Product.Category.BOOKS);
     this.paperbackStock = paperbackStock;
     this.hardcoverStock = hardcoverStock;
     this.title = title;
     this.author = author;  
     this.year = year; 
  }
  
  public Book(String name, double price, int paperbackStock2, int hardcoverStock2, String title2, String author2,
      int year2) {
  }

  public int getYear() {
    return year;
  }

  public String getAuthor() {
    return author;
  }

  // Check if a valid format  
  public boolean validOptions(String productOptions)
  {
  	// check productOptions for "Paperback" or "Hardcover" or "EBook"
  	// if it is one of these, return true, else return false

    if (productOptions.equals("Paperback") || productOptions.equals("Hardcover") || productOptions.equals("EBook")) {   
          return true;
    }
    return false;  
  }
  // Override getStockCount() in super class.
@Override
  public int getStockCount(String productOptions)
	{
  	// Use the productOptions to check for (and return) the number of stock for "Paperback" etc
  	// Use the variables paperbackStock and hardcoverStock at the top. 
  	// For "EBook", use the inherited stockCount variable.

  	if (productOptions.equals("Paperback")) {
        return paperbackStock;
    }
    else if (productOptions.equals("Hardcover")) {
         return hardcoverStock; 

    } else  {
        return super.getStockCount("EBook");
    }  
	} 
  public void setStockCount(int stockCount, String productOptions)
	{
    // Use the productOptions to check for (and set) the number of stock for "Paperback" etc
   	// Use the variables paperbackStock and hardcoverStock at the top. 
   	// For "EBook", set the inherited stockCount variable.

     if (productOptions.equals("Paperback")) {
         this.paperbackStock = stockCount;

     } else if (productOptions.equals("Hardcover")) {
         this.hardcoverStock = stockCount;

     } else if (productOptions.equals("EBook")) {
       super.setStockCount(getStockCount(productOptions),"EBook"); // getting the inherinted stockCount variable and 
       // I am setting it to EBook
          
     }
    }
  /*
   * When a book is ordered, reduce the stock count for the specific stock type
   */
  public void reduceStockCount(String productOptions)
	{
  	// Use the productOptions to check for (and reduce) the number of stock for "Paperback" etc
   	// Use the variables paperbackStock and hardcoverStock at the top. 
   	// For "EBook", set the inherited stockCount variable.

     if (productOptions.equals("Paperback")) {
          paperbackStock--;

     } else if (productOptions.equals("Hardcover")) {
          hardcoverStock--;

     } else {
        setStockCount(getStockCount(productOptions),"EBook"); // get the inherited StockCount variable from the 
        // super class and decrement it.  
          
     }
	}
  /*
   * Print product information in super class and append Book specific information title and author
   */
  public void print()
  {
  	// Replace the line below.
  	// Make use of the super class print() method and append the title and author info. See the video

    super.print();
    System.out.print(" " + "Book Title: " + title + " ");
    System.out.print("Author: " + author + " year: " + year);
  }
  @Override
  public int compareTo(Object o) {

    Book other = (Book) o;
      if (this.getYear() > other.getYear()) {
        return 1;
      }
      else if (this.getYear() < other.getYear()) {
           return -1;
      }
      else {
        return 0;
      }
}

}

