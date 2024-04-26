public class TextBook extends Book{
    private int numPages;
    public TextBook(){
        super();
    }
    public TextBook(String title, double price, java.time.LocalDate releaseDate, int numPages){
        super(title,price,releaseDate);
        this.numPages=numPages;
    }
    public TextBook(String title, double price, int numPages){
        super(title,price);
        this.numPages=numPages;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("TextBook has number of pages:"+this.getNumPages());
    }
}
