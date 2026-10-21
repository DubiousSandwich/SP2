public class Main {

    public static void main(){
        Author a = new Author("George Orwell");

        Title a1 = new PrintedBook("1984","SKØN",285,200);
        Title a2 = new AudioBook("Animal Farm","SKØN",60,4);
        Title a3 = new PrintedBook("Homage to Catalonia","FAG", 300,60);

        a.addTitle(a1);
        a.addTitle(a2);
        a.addTitle(a3);

        System.out.println(a.getName() + ": " + a.calculateRoyalties() + " kr");
    }

}
