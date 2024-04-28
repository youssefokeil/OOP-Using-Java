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
        System.out.println(this.toString());
    }
    @Override
    public String toString(){
        return super.toString()+
                String.format("\nHas %d number of pages",this.getNumPages());

    }
}
