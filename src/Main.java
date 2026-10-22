public class Main {

    public static void main(){
        Author a = new Author("George Orwell");

        Title a1 = new PrintedBook("1984","FAG",285,100);
        Title a2 = new AudioBook("Animal Farm","SKØN",60,30);
        Title a3 = new PrintedBook("Homage to Catalonia","FAG", 300,50);

        Title a4 = new EBook("1984","TE",97,30,205,8000,true);
        Title a5 = new EAudioBook("Animal Farm", "LYRIK",97,40,50,120);
        Title a7 = new EBook("1984","BI",97,30,205,8000,false);

        //exception check
        Title a6 = new EBook("1984","TQ",97,30,205,8000,false);

        a.addTitle(a1);
        a.addTitle(a2);
        a.addTitle(a3);

        Author b = new Author("Georgine Wilson");

        b.addTitle(a4);
        b.addTitle(a5);
        //b.addTitle(a6);

        System.out.println(a.getName() + ": " + a.calculateRoyalties() + " kr");
        System.out.println(b.getName() + ": " + b.calculateRoyalties() + " kr");

        System.out.println("\n====================== test ===================");

        System.out.println(a1.calculatePoints());
        System.out.println(a1.calculateRoyalty());

        System.out.println(a4.calculatePoints());
        System.out.println(a4.calculateRoyalty());

        //illustrated vs nonIllustrated
        System.out.println(a4.calculatePoints());
        System.out.println(a7.calculatePoints());


    }

}
