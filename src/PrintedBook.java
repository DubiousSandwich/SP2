public class PrintedBook extends Title{
    int pages;
    int copies;

    public PrintedBook(String title, String literatureType, int pages, int copies){
        super(title,literatureType);
        this.pages = pages;
        this.copies = copies;
    }

    @Override
    protected double calculatePoints(){
        return this.pages * convertLiteratureType() * copies;
    }

}
