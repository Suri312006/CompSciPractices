package Pen;

public class Pen_is {
    public static void main(String[] args){
        Pen shit = new Pen("shit", false, "Rainbow", 69, false, true );
        Pen normie = new Pen();

        shit.write("bro this is so hype");
        System.out.println(shit.getInkLevel());

        normie.write("hope you get betterington!!!!");
        shit.refill();
        System.out.println(shit.getInkLevel());

    }
}
