import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

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
        System.out.println(this.toString());
    }
    public String getDateToString(java.time.LocalDate date){
        int dayOfMonth=date.getDayOfMonth();
        String dayOfMonthString;
        if((dayOfMonth%10)==1){
            dayOfMonthString=String.format("Released on %dst of ",dayOfMonth);
        } else if ((dayOfMonth%10)==3) {
            dayOfMonthString=String.format("Released on %drd of ",dayOfMonth);
        }else{
            dayOfMonthString=String.format("Released on %dth of ",dayOfMonth);
        }
        String month=date.getMonth().getDisplayName(TextStyle.FULL,Locale.ENGLISH);
        String year=String.format(" of the year %d.",date.getYear());
        return dayOfMonthString + month+year;
    }
    @Override
    public String toString(){
        return "Book title is " + this.getTitle() +
                "\n"+this.getDateToString(this.getReleaseDate())+
                "\nWith ID: " +this.getId();
    }

}
