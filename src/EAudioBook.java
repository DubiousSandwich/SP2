public class EAudioBook extends NetTitle{
    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes){
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints(){
        return ((double) durationInMinutes / 2) * convertLiteratureType() * (getPseudoCopies() * getUseFactor());
    }
}
