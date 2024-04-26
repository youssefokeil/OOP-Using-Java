import java.time.LocalDate;

public class Book {
    private static int staticID=0;
    private int id;
    private double price;
    private java.time.LocalDate releaseDate;
    private String title;
    public Book(){
        staticID+=1;  //updates staticID to increase on book
        /* the instance of book will take a serial id = the current value of staticId */
        this.id=staticID;
        this.releaseDate=java.time.LocalDate.now(); //assumes book is just released if not specified
    }
    public Book(String title, double price){
        this();
        this.title=title;
        this.price=price;
    }
    public Book(String title, double price, java.time.LocalDate releaseDate ){
        this(title, price);
        this.releaseDate=releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public static int getStaticID() {
        return staticID;
    }

    public static void setStaticID(int staticID) {
        Book.staticID = staticID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void print(){
        System.out.println("Title of Book is:" + this.getTitle());
        System.out.println("Price of Book is:" + this.getPrice());
        System.out.println("ID of book is:"+ this.getId());
        System.out.println("Book is released on:" + this.getReleaseDate());
    }
}
