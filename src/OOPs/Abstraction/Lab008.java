package OOPs.Abstraction;

public class Lab008 {
    public static void main(String[] args) {
        Book myBook = new PrintMyBook("Harry Potter", "J.K. Rowling", 120);
        System.out.println(myBook.getDetails());

    }
}

class PrintMyBook extends Book  {

    PrintMyBook(String bookName, String authorName, int bookPrice){
        super(bookName, authorName, bookPrice);

    }

    @Override
    String getDetails() {
        return name + "," + author +"," + price;
    }

}


abstract class Book {

    String name;
    String author;
    int price;

    Book(String name, String author, int price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract String getDetails();
}