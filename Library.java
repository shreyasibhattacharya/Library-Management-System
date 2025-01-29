import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);

    }

    public void displayAvailableBooks(){
        for(Book book : books){
            if(book.isAvailable()){
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
    public void borrowBook(String title, String author){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author) && book.isAvailable()){
                if(book.isAvailable()){
                    book.borrowBook();
                    System.out.println("You have successfully borrowed '" + title + "' by " + author + ".");
                }  else {
                    System.out.println("Sorry, '" + title + "' by " + author + " is already borrowed.");
                }
                return;
            }
        }
          System.out.println("Sorry, the book is not available!");
    }
    public void returnBook(String title, String author){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author) && book.isBorrowed()){
                if (!book.isAvailable()) {
                    book.returnBook();  // Mark the book as returned
                    System.out.println("You have successfully returned '" + title + "' by " + author + ".");
                } else {
                    System.out.println("The book '" + title + "' by " + author + " was not borrowed.");
                }
                return; 
            }
         }
         System.out.println("This book wasn't borrowed from the Library!");
     }
    
}
