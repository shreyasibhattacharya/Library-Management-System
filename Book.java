public class Book{
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
    public void borrowBook() {
        if(!isBorrowed){
            isBorrowed = true;
            System.out.println("Book is successfully borrowed: " + title);
        } else{
            System.out.println("Sorry, this book is already borrowed");
        }
    }
    public void returnBook() {
        if(isBorrowed){
            isBorrowed = false;
            System.out.println("You've successfully returned the book: " + title);
        } else {
            System.out.println("This book wasn't borrowed");
        }
        }
        public boolean isAvailable() { 
            return !isBorrowed;
    } 
        public String getTitle(){
            return title;
        } 
        public String getAuthor(){
            return author;
        }
        public boolean isBorrowed(){
            return isBorrowed;
        }
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
        System.out.println("Availability: " + (isBorrowed ? "Not Available" : "Available"));
    }
    

}