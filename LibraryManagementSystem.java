import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        library.addBook(new Book("Verity", "Colleen Hoover"));
        library.addBook(new Book("The Secret", "Rhonda Byrne"));
        library.addBook(new Book("Grit", "Angela Duckworth"));


        while(true) {
            System.out.println("\nAvailable Books: ");
            library.displayAvailableBooks();

            System.out.println("\nDo you want to borrow or return a book?");
            System.out.println("Type 'borrow' to borrow a book, 'return' to return a book, or 'exit' to quit.");
            String action = scanner.nextLine().toLowerCase();

            if(action.equalsIgnoreCase("Borrow")){
                System.out.print("Enter the title of the book you want to borrow: ");
                String borrowTitle = scanner.nextLine();
                System.out.print("Enter the author of the book you want to borrow: ");
                String borrowAuthor = scanner.nextLine();
                library.borrowBook(borrowTitle, borrowAuthor);
               

            } else if(action.equalsIgnoreCase("Return")){
                System.out.print("Enter the title of the book you want to return: ");
                String returnTitle = scanner.nextLine();
                System.out.print("Enter the author of the book you want to return: ");
                String returnAuthor = scanner.nextLine();
                library.returnBook(returnTitle, returnAuthor);

            } else if (action.equalsIgnoreCase("exit")) {
                    // Exit condition
                    System.out.println("Exiting the system. Goodbye!");
                    break;
            }  else {
                System.out.println("Invalid option. Please enter 'borrow', 'return', or 'exit'.");
        }

    }
    scanner.close();
 
  }
  
}
