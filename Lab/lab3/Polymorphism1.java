package Java.Lab.lab3;
class ProgrammingLanguage{
    protected String languageName,founder,speed;
    protected String typed;
    int year;
    public ProgrammingLanguage(String languageName, String founder,int year) {
        this.languageName = languageName;
        this.founder = founder;
        this.year = year;
    }
    public String speed(){
        return "The speed is very very slow";
    }
    public String getLanguageName() {
        return languageName;
    }
    public String getFounder() {
        return founder;
    }
    public String getTyped() {
        return "Machine level typed";
    }
    public int getYear() {
        return year;
    }
    public String application(){
        return "The application depends upon the language :";
    }

    @Override
    public String toString() {
        return getFounder() + " " + getLanguageName() + " "+ getTyped() + " " + application();
    }
}
class CPlusPlus extends ProgrammingLanguage{
    public CPlusPlus(String languageName, String founder,int year) {
        super(languageName, founder, year);
    }
    @Override
    public String getLanguageName() {
        return languageName;
    }
    @Override
    public String getFounder() {
        return founder;
    }
    @Override
    public String speed() {
        return "Faster than Python and Java";
    }
    @Override
    public String getTyped() {
        return "Statistically Typed";
    }
    @Override
    public int getYear() {
        return year;
    }
    @Override
    public String application() {
        return  " -> C++ is used is a lot of operating systems (Mac OS and Linux as well). Windows OS is a mix of C and C++.\n"+
                " -> YouTube is written in a few different languages However,\n"+
                " -> C++ was used for the most important and core function of this app – video processing.\n"+
                " -> Managing this many data is extremely difficult when your site has approximately between to 2 billion monthly users.\n"+
                " -> I think it speaks for itself. C++ is a secret weapon of the biggest companies in the world.\n";
    }
    @Override
    public String toString() {
        return "Founder :" +  getFounder() + "\n" +"Language :"  + getLanguageName() + "\n"+ "Typed : " + getTyped() + "\n" + application();
    }
}
class Python extends  ProgrammingLanguage{
    public Python(String languageName, String founder, int year) {
        super(languageName, founder, year);
    }
    @Override
    public String getLanguageName() {
        return languageName;
    }
    @Override
    public String speed() {
        return "Python is slower than java and C++";
    }
    @Override
    public String getFounder() {
        return founder;
    }
    @Override
    public String getTyped() {
        return "Dynamically Typed";
    }
    @Override
    public int getYear() {
        return year;
    }
    @Override
    public String application() {
        return  " -> Python is used in web development where in Django ,flask are the most used frameworks\n"+
                " -> It is used in Machine learning where in the libraries like Numpy , Pandas ,Tensorflow, keras are used\n"
                +" -> It is also used in Data science along with R\n";
    }
    @Override
    public String toString() {
        return "Founder :" +  getFounder() + "\n" +"Language :"  + getLanguageName() + "\n"+ "Typed : " + getTyped() + "\n" + application();
    }
}
class Java extends  ProgrammingLanguage{
    public Java(String languageName, String founder, int year) {
        super(languageName, founder,year);
    }
    @Override
    public String speed() {
        return "Faster than Python but slower than C++";
    }
    @Override
    public String getLanguageName() {
        return languageName;
    }
    @Override
    public String getFounder() {
        return founder;
    }
    @Override
    public String getTyped() {
        return "Statistically Typed";
    }
    @Override
    public int getYear() {
        return year;
    }
    @Override
    public String application() {
        return " -> Java is used in Web development as backend support where in Maven , Spring , Spring MVC are used\n"+
                " -> It has connectivity with the databases like SQLite , MYSQL , Postgres\n" +
                " -> It is used in Android Development with Android XMl and Android Studio\n" +
                " -> It is to create Desktop Applications using JAVAFX and JAVAFX xml\n";
    }
    @Override
    public String toString() {
        return "Founder :" +  getFounder() + "\n" +"Language :"  + getLanguageName() + "\n"+ "Typed : " + getTyped() + "\n" + application();
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage("Assembly Language" , "Dennis Ritchie",1700);
        for(int i =  0 ; i < 5 ; i ++){
            int randomNumber = (int)((Math.random()*3)+1);
            switch(randomNumber){
                case 1 -> {
                    programmingLanguage = new CPlusPlus("C ++","Bjarne Stroustrup",1900);
                    System.out.println(programmingLanguage.toString());
                    break;
                }
                case 2 ->{
                    programmingLanguage = new Python("Python" , "Guido van Rossum",1975);
                    System.out.println(programmingLanguage.toString());
                    break;
                }
                case 3 -> {
                    programmingLanguage =  new Java("Java","James Gosling",1990);
                    System.out.println(programmingLanguage.toString());
                    break;
                }
                default -> {
                    System.out.println("Invalid Language !!!!");
                    System.out.println(programmingLanguage.toString());
                }
            }
        }
    }
}
