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
        System.out.println(this.toString());
    }
    @Override
    public String toString(){
        String s = super.toString() +
                String.format("\nAudioBook takes %.1f minutes to finish:", this.getLengthInMinutes());
        return s;

    }
}

