package Stuffsthings;
public class Clasz{
    private String title;
    private String grade;
    private int period;

    private boolean weighted;

    public Clasz(String title, String grade, boolean weighted, int period){
        this.title = title;
        this.grade = grade;
        this.weighted = weighted;
        this.period = period;
    }
    public String toString(){
        return "\nClass: " + title + "\nGrade: " + grade + "\nPeriod: " + period + "\n";
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String newGrade){
        grade = newGrade;
    }

    public int getPeriod(){
        return period;
    }
    public void setPeriod(int newPeriod){
        period = newPeriod;
    }

    public boolean isWeighted(){
        return weighted;
    }
    public void setWeighted(boolean weighted){
        this.weighted = weighted;
    }

}