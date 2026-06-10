

public class LibraryInterfaceDemo {
    public static void main(String [] args){
        KidUser kid = new KidUser();
        kid.age = 10;
        kid.registerAccount();

        kid.bookType = "Kids";
        kid.requestBook();

        kid.age = 17;
        kid.registerAccount();

        kid.bookType = "Kids";
        kid.requestBook();

        AdultUser adult = new AdultUser();
        adult.age = 10;
        adult.registerAccount();

        adult.bookType = "Kids";
        adult.requestBook();

        adult.age = 17;
        adult.registerAccount();

        adult.bookType = "Kids";
        adult.requestBook();




        
    }
}
