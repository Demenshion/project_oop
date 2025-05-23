public class LB1 {
    public static void main(String[] args){
        DooBee m1 = new DooBee();
        BeerSong m2 = new BeerSong();
        Shuffle1 m3 = new Shuffle1();
        PoolPuzzleOne m4 = new PoolPuzzleOne();
        m1.text();
        m2.poem();
        m3.magnet();
        m4.Pool();
    }
}
class DooBee {
    int x;
    void text(){
        x = 1;
        while (x < 3){
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3){
            System.out.println("Do");
        }
    }
}
class BeerSong {
    int beerNum;
    String word;
    void poem(){
        beerNum = 99;
        word = "бутылок (бутылки)";
        while (beerNum > 0){
            if (beerNum == 1){
                word = "бутылка";
            }
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum == 0){
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }
}
class Shuffle1 {
    int x;
    void magnet(){
        x = 3;
        while (x > 0){
            if (x > 2){
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 2){
                System.out.print("b c");
            }
            if (x == 1){
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}
class PoolPuzzleOne{
    int x;
    void Pool(){
        x = 0;
        while (x < 1){
            System.out.print("a ");
            if (x < 1){
                System.out.print("noise");
            }
            x = x + 2;
            if (x > 1 ){
                System.out.print("annoys");
                x = x - 1;
            }
            if (x == 1){
                System.out.print("an");
            }
            if (x > 3){
                System.out.print("oyster");
            }
            System.out.print("");
            x = x - 2;
        }
    }
}