package Java.Lab.lab3;
class Color{
    protected String colorString,color;
    public Color(String colorString, String color) {
        this.colorString = colorString;
        this.color = color;
    }
    public String getColorString() {
        return colorString;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return color + "The color written is :" + colorString + " Ansi value is :" + getColor();
    }
}
class Green  extends Color{
    public Green(String colorString, String color) {
        super(colorString, color);
    }
    @Override
    public String getColorString() {
        return super.getColorString();
    }
    @Override
    public String getColor() {
        return super.getColor();
    }
    @Override
    public String toString() {
        return color + "The color written is :" + colorString;
    }
}
class Blue extends Color{
    public Blue(String colorString, String color) {
        super(colorString, color);
    }
    @Override
    public String getColorString() {
        return super.getColorString();
    }
    @Override
    public String getColor() {
        return super.getColor();
    }
    @Override
    public String toString() {
        return color + "The color written is :" + colorString;
    }
}
class Purple extends Color{
    public Purple(String colorString, String color) {
        super(colorString, color);
    }
    @Override
    public String getColorString() {
        return super.getColorString();
    }
    @Override
    public String getColor() {
        return super.getColor();
    }
    @Override
    public String toString() {
        return color + "The color written is :" + colorString;
    }
}
class Red extends Color{
    public Red(String colorString, String color) {
        super(colorString, color);
    }
    @Override
    public String getColorString() {
        return super.getColorString();
    }
    @Override
    public String getColor() {
        return super.getColor();
    }
    @Override
    public String toString() {
        return color + "The color written is :" + colorString;
    }
}
class Cyan extends Color{
    public Cyan(String colorString, String color) {
        super(colorString, color);
    }
    @Override
    public String getColorString() {
        return super.getColorString();
    }
    @Override
    public String getColor() {
        return super.getColor();
    }
    @Override
    public String toString() {
        return color + "The color written is :" + colorString;
    }
}
public class Polymorpshism2 {
    public static void main(String[] args) {
        Color color = new Color("Black","\u001B[30m");
        for(int i = 0 ; i < 10 ; i++){
            int randomNumber = (int)((Math.random()*5)+1);
            switch (randomNumber){
                case 1 -> {
                    color = new Green("Green","\u001B[32m");
                    System.out.println(color);
                }
                case 2 -> {
                    color = new Purple("Purple","\u001B[35m");
                    System.out.println(color);
                }
                case 3 -> {
                    color = new Blue("Blue" , "\u001B[34m");
                    System.out.println(color);
                }
                case 4 -> {
                    color = new Red("Red" , "\u001B[31m");
                    System.out.println(color);
                }
                case 5 -> {
                    color = new Cyan("Cyan" , "\u001B[36m");
                    System.out.println(color);
                }
                default -> {
                    System.out.println("Invalid Color!!!!");
                }
            }
        }
    }
}
