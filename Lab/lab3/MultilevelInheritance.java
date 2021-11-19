package Java.Lab.lab3;

import java.util.ArrayList;
import java.util.Scanner;

class Player{
    private String name,state,country;
    private int age;
    public Player(String name, String state, String country,int age) {
        this.name = name;
        this.state = state;
        this.country = country;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getState() {
        return state;
    }
    public String getCountry() {
        return country;
    }
    public int getAge() {
        return age;
    }
}
class GameLevel extends Player{
    protected String level;
    int numberOfMatches;
    int yearsOfExperience;
    public GameLevel(String name, String state, String country,int age, int numberOfMatches, int yearsOfExperience) {
        super(name, state, country,age);
        this.numberOfMatches = numberOfMatches;
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getLevel() {
        return level;
    }
    public int getNumberOfMatches() {
        return numberOfMatches;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
class ChessPlayer extends GameLevel{
    double blitzRating , rapidRating , classicalRating,totalRating;
    public ChessPlayer(String name, String state, String country,int age,int numberOfMatches,int yearsOfExperience,double blitzRating, double rapidRating, double classicalRating) {
        super(name,state,country,age,numberOfMatches,yearsOfExperience);
        this.blitzRating = blitzRating;
        this.rapidRating = rapidRating;
        this.classicalRating = classicalRating;
        this.totalRating = (this.blitzRating + this.rapidRating + this.rapidRating)/3;
    }
    public double getBlitzRating() {
        return blitzRating;
    }
    public double getRapidRating() {
        return rapidRating;
    }
    public double getClassicalRating() {
        return classicalRating;
    }
    public void determineLevel(){
        if(totalRating >=0 && totalRating <=1500)level = "Beginner";
        else if(totalRating > 1500 && totalRating <= 1800)level = "Expert";
        else if(totalRating > 1800 && totalRating <= 2000)level = "Specialist";
        else if(totalRating > 2000 && totalRating <= 2300)level = "Candidate Master";
        else if(totalRating > 2300 && totalRating <= 2500)level = "Master";
        else if(totalRating > 2500 && totalRating <= 2700)level = "Grandmaster";
        else if(totalRating > 2700 && totalRating <= 2900)level = "International Grandmaster";
        else level = "Legendary Grandmaster";
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getState() + " " + getCountry() + " " +
                getLevel() + " " + getNumberOfMatches() + " " + getYearsOfExperience() + " " +
                totalRating;
    }
}
public class MultilevelInheritance {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        String name,state,country;
        int age ,numberOfMatches,yearsOfExperience;
        double blitzRating , rapidRating , classicalRating;
        System.out.print("Enter the number of chess players :");
        n = input.nextInt();
        ArrayList<ChessPlayer>chessPlayers = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
            input.nextLine();
            System.out.print("Enter name :");
            name = input.nextLine();
            System.out.print("Enter state,country :");
            state = input.next();
            country = input.next();
            System.out.print("Enter age , number of matches , years of experience: ");
            age = input.nextInt();
            numberOfMatches = input.nextInt();
            yearsOfExperience = input.nextInt();
            System.out.print("Enter the ratings in : Blitz , Rapid , Classical :");
            blitzRating = input.nextInt();
            rapidRating = input.nextInt();
            classicalRating = input.nextInt();
            chessPlayers.add(new ChessPlayer(name,state,country,age,numberOfMatches,yearsOfExperience,blitzRating,rapidRating,classicalRating));
            chessPlayers.get(i).determineLevel();
        }
        for(int i = 0; i < n ; i++){
            System.out.println(chessPlayers.get(i));
        }
    }
}
