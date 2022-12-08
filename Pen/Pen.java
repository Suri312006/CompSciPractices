package Pen;

public class Pen {
    private boolean open;
    private String InkColor;
    private int InkLevel;
    private boolean TipDown;
    private boolean memoryWipe;

    private String name;

    public Pen(String name, boolean open, String InkColor, int InkLevel, boolean TipDown, boolean memoryWipe){
        this.open = open;
        this.InkColor  =InkColor;
        this.InkLevel = InkLevel;
        this.TipDown = TipDown;
        this.memoryWipe = memoryWipe;
        this.name = name;
    }

    public Pen(){
        this.name = "default";
        this.open = false;
        this.InkColor = "Black";
        this.InkLevel = 100;
        this.TipDown = false;
        this.memoryWipe = false;
    }

    public void clickOpen(){TipDown = true;open = true;}

    public void clickClose(){
        open = false;
        TipDown = false;
    }

    public String getInkLevel(){
        return name+" has "+ InkLevel+" characters left";
    }
    public void refill(){
        InkLevel = 100;
    }

    public void changeColor(String newColor){
        InkColor = newColor;
    }

    public void write(String input){
        clickOpen();
        if(InkLevel > input.length()) {
            System.out.println(input + " (in "+InkColor+" color)");
            InkLevel = InkLevel - input.length();
        }
        else{
            System.out.println(name+ " does not have enough Ink, please refill");
        }
    }

    public void stopWrite(){
        clickClose();
    }

    public void flashEm(){
        if(memoryWipe = true){
            System.out.println("Memory Wiped");
        }
    }



    public String toString(){

        return "Name: "+name+ ", InkColor: " + InkColor + ", InkLevel: "+InkColor + ", Memory Wipe Capability: "+memoryWipe;
    }







}
