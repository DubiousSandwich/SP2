public class PrintedBook extends PhysicalTitle{
    int pages;

    public PrintedBook(String title, String literatureType, int pages, int copies){
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints(){
        return this.pages * convertLiteratureType() * copies;
    }

}
