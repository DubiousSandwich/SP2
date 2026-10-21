public abstract class Title {
    private String title;
    private String literatureType;
    static final double RATE = 0.067574;

    public Title(String title, String literatureType){
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty(){
        return calculatePoints() * RATE;
    }

    protected abstract double calculatePoints();

    protected double convertLiteratureType(){
        try {
            switch (this.literatureType){
                case "BI", "TE" -> {return 3.0;}
                case "LYRIK" -> {return 6.0;}
                case "SKØN" -> {return 1.7;}
                case "FAG" -> {return 1.0;}
                default -> throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

}
