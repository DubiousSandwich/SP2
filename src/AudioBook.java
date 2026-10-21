public class AudioBook extends Title{
    int durationInMinutes;
    int copies;

    AudioBook(String title, String literatureType, int durationInMinutes, int copies){
        super(title, literatureType);
        this.durationInMinutes = durationInMinutes;
        this.copies = copies;
    }

    @Override
    protected double calculatePoints(){
        return (durationInMinutes *0.5) * convertLiteratureType() * copies;
    }
}
