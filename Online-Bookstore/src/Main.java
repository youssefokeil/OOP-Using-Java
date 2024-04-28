
import java.util.Scanner;

public class Main {
    public static Book[] bookArrayInitialization(){
        //create scanner class
        Scanner myScanner=new Scanner(System.in);
        int sizeOfArray;
        Book[] bookArray;
        System.out.println("Number of books you want to input: ");
        sizeOfArray=Integer.parseInt(myScanner.nextLine());
        bookArray=new Book[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            System.out.println("For Textbook type 0, for Audiobook type 1:");
            // used byte to save memory
            int typeOfBook=Integer.parseInt(myScanner.nextLine());
            // Title of Book retrieval
            System.out.println("Type title of book");
            String title= myScanner.nextLine();
            // Price of book
            System.out.println("Type Price of book");
            double price= Double.parseDouble(myScanner.nextLine());
            // Release Date
            System.out.println("Release Date in YYYY-MM-DD format:");
            java.time.LocalDate releaseDate=java.time.LocalDate.parse(myScanner.nextLine());
            if(typeOfBook==0){
                // Number of pages if it's textbook
                System.out.println("Number of pages is:");
                int numPages=Integer.parseInt(myScanner.nextLine());
                // initializing textbook
                bookArray[i]=new TextBook(title,price,releaseDate,numPages);
            }
            else {
                // length in minutes if it's audiobook
                System.out.println("Length of Audio Book in minutes is:");
                double lengthInMinutes=Double.parseDouble(myScanner.nextLine());
                // initializing audio
                bookArray[i]=new AudioBook(title,price,releaseDate,lengthInMinutes);
            }
        }
        return bookArray;
    }
    public static void main(String[] args) {
        Book[] bookArray=bookArrayInitialization();
        int sizeOfArray=bookArray.length;
        //printing each book in the array
        for (Book book : bookArray) {
            book.print();
        }
    }
}