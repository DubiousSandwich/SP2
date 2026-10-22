import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name){
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title){
        this.titles.add(title);
    }

    public double calculateRoyalties(){
        double sum = 0;
        for (Title t : this.titles){
            sum += t.calculateRoyalty();
        }
        sum = Math.round(sum*100);
        sum /= 100;
        return sum;
    }

    public String getName(){
        return this.name;
    }

}
