public class AudioBook extends Book{
    private double lengthInMinutes;
    public AudioBook(){
        super();
    }
    public AudioBook(String title, double price, java.time.LocalDate releaseDate, double lengthInMinutes){
        super(title,price,releaseDate);
        this.lengthInMinutes=lengthInMinutes;
    }
    public AudioBook(String title, double price, double lengthInMinutes){
        super(title,price);
        this.lengthInMinutes=lengthInMinutes;
    }

    public double getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(double lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("TextBook has number of pages:"+this.getLengthInMinutes());
    }
}

