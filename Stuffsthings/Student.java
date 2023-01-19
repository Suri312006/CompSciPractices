package Stuffsthings;
import java.util.*;
public class Student{
    private ArrayList<Clasz> schedule;
    private String name;
    Scanner scan = new Scanner(System.in);

    private double GPA = 0;

    public Student(String name){
        this.name = name;
        schedule = new ArrayList<Clasz>();
        String cont = "yes";
        while (cont.equals("yes")){
            System.out.println("input class, period, grade, weighted? (yes/no), and do you need to add another class? (yes/no)");
            String cls = scan.next();
            int per = scan.nextInt();
            String grd = scan.next();
            boolean weighted = scan.next().equals("yes");
            cont = scan.next();
            schedule.add(new Clasz(cls, grd, weighted, per));
        }

    }
    public void printOut(){
        System.out.println(schedule);
    }

  public double calcGPA(){
    int i;
    int sum = 0;
    int count = 0;
    for (i = 0; i < schedule.size(); i++){
      if (schedule.get(i).getGrade().equals("pending")){
        sum +=0;
      }
      else{
      if (schedule.get(i).isWeighted()&&(schedule.get(i).getGrade().equals("A")||schedule.get(i).getGrade().equals("B")||schedule.get(i).getGrade().equals("C"))) sum+=1;
      if (schedule.get(i).getGrade().equals("A")) sum+=4;
      if (schedule.get(i).getGrade().equals("B")) sum+=3;
      if (schedule.get(i).getGrade().equals("C")) sum+=2;
      if (schedule.get(i).getGrade().equals("D")) sum+=1;
      count++;
    }
    }
    System.out.println("gpa: " + (1.0 * sum / count));
    GPA = (1.0 * sum / count);
    return 1.0 * sum / count;

  }
  public void updateGrade(int per, String newGrade){
    for (int i = 0; i < schedule.size(); i++){
      if(schedule.get(i).getPeriod()==per){
        schedule.get(i).setGrade(newGrade);
      }
    }
  }

  public void addClass(String className, String grade, boolean Weighted){
    schedule.add(new Clasz(className, grade, Weighted, schedule.size()));
  }
  public void addClass(String className, String grade, boolean Weighted, int period){
        schedule.add(new Clasz(className, grade, Weighted, period));
    }
  public void deleteClass(int per){
        schedule.set(per, new Clasz("no class", "none",false, per));
  }

}