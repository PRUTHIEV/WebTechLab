package Java.Lab.lab3;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Pair{
    private String name;
    double points;
    public Pair(String name, double points) {
        this.name = name;
        this.points = points;
    }
    public String getName() {
        return name;
    }
    public double getPoints() {
        return points;
    }
    @Override
    public String toString() {
        return "Name :" + name + " Points :" + points;
    }
}
class Cricket{
    protected String format;
    int numOvers ,numberOfDays;
    public Cricket(String format, int numOvers, int numberOfDays) {
        this.format = format;
        this.numOvers = numOvers;
        this.numberOfDays = numberOfDays;
    }
    public String getFormat() {
        return format;
    }
    public int getNumOvers() {
        return numOvers;
    }
    public int getNumberOfDays() {
        return numberOfDays;
    }
}
class TestCricket extends Cricket{
    Pair []teams;
    String name;
    double points;
    private final Scanner input = new Scanner(System.in);
    public Pair getValues(){
        System.out.print("Enter name :");
        name = input.nextLine();
        System.out.print("Enter points :");
        points = input.nextDouble();
        Pair value = new Pair(name,points);
        return value;
    }
    public TestCricket(String format, int numOvers, int numberOfDays) {
        super(format, numOvers, numberOfDays);
        System.out.println("TEST CRICKETS");
        teams = new Pair[3];
        System.out.println("TEAMS");
        for(int i = 0 ; i < 3 ; i++){
            teams[i] = getValues();
            input.nextLine();
        }
    }
    public void sortData(){
        Arrays.sort(teams, Comparator.comparing(Pair :: getPoints).reversed());
    }
    @Override
    public String toString(){
        return teams[0].toString() +" " +  teams[1].toString() + " " +  teams[2].toString() + "\n" ;
    }
}
class ODICricket extends Cricket{
    Pair [] teams;
    String name;
    double points;
    private final Scanner input = new Scanner(System.in);
    public Pair getValues(){
        System.out.print("Enter name :");
        name = input.nextLine();
        System.out.print("Enter points :");
        points = input.nextDouble();
        Pair value = new Pair(name,points);
        return value;
    }
    public ODICricket(String format, int numOvers, int numberOfDays) {
        super(format, numOvers, numberOfDays);
        System.out.println("ODI CRICKETS");
        teams = new Pair[3];
        System.out.println("TEAMS");
        for(int i = 0 ; i < 3 ; i++){
            teams[i] = getValues();
            input.nextLine();
        }
    }
    public void sortData(){
        Arrays.sort(teams, Comparator.comparing(Pair :: getPoints));
    }
    @Override
    public String toString(){
        return teams[0].toString() +" " +  teams[1].toString() + " " +  teams[2].toString() + "\n" ;
    }
}
class T20Cricket extends Cricket{
    Pair [] teams;
    String name;
    double points;
    private final Scanner input = new Scanner(System.in);
    public Pair getValues(){
        System.out.print("Enter name :");
        name = input.nextLine();
        System.out.print("Enter points :");
        points = input.nextDouble();
        Pair value = new Pair(name,points);
        return value;
    }
    public T20Cricket(String format, int numOvers, int numberOfDays) {
        super(format, numOvers, numberOfDays);
        System.out.println("T20 CRICKETS");
        teams = new Pair[3];
        System.out.println("TEAM");
        for(int i = 0 ; i < 3 ; i++){
            teams[i] = getValues();
            input.nextLine();
        }
    }
    public void sortData() {
        Arrays.sort(teams, Comparator.comparing(Pair::getPoints));
    }
    @Override
    public String toString(){
        return teams[0].toString() +" " +  teams[1].toString() + " " +  teams[2].toString() + "\n" ;
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        TestCricket testCricket = new TestCricket("Test" ,90,5);
        ODICricket odiCricket = new ODICricket("ODI" ,50,1);
        T20Cricket t20Cricket = new T20Cricket("T20" , 20,1);
        testCricket.sortData();
        System.out.print(testCricket);
        odiCricket.sortData();
        System.out.print(odiCricket);
        t20Cricket.sortData();
        System.out.print(t20Cricket);
    }
}
