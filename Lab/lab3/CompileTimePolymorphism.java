package Java.Lab.lab3;

public class CompileTimePolymorphism {
    @SafeVarargs
    public static <T extends Number> T add(T ...b){
        Double sum = 0.00;
        for(int i = 0;  i < b.length ; i++){
            sum += b[i].doubleValue();
        }
        return (T) sum;
    }
    public static<T extends Number>  T add(T a, T b){
        Double sum = a.doubleValue() + b.doubleValue();
        return (T)sum;
    }
    public static<T extends Number> T add(T a , T b ,  T c){
        Double sum = a.doubleValue() + b.doubleValue() + c.doubleValue();
        return (T)sum;
    }

    public static<T extends Number>  T sub(T a, T b){
        Double sum = a.doubleValue() - b.doubleValue();
        return (T)sum;
    }
    public static<T extends Number> T sub(T a , T b ,  T c){
        Double sum = a.doubleValue() - b.doubleValue() - c.doubleValue();
        return (T)sum;
    }
    @SafeVarargs
    public static <T extends Number> T sub(T ...b){
        Double sum = 0.00;
        for(int i = 0 ; i < b.length ; i++){
            sum -= b[i].doubleValue();
        }
        return (T) sum;
    }
    public static<T extends Number>  T mul(T a, T b){
        Double sum = a.doubleValue() * b.doubleValue();
        return (T)sum;
    }
    public static<T extends Number> T mul(T a , T b ,  T c){
        Double sum = a.doubleValue() * b.doubleValue() * c.doubleValue();
        return (T)sum;
    }
    @SafeVarargs
    public static <T extends Number> T mul(T ...b){
        Double sum = 1.00;
        for(int i = 0 ; i < b.length ; i++){
            sum *= b[i].doubleValue();
        }
        return (T) sum;
    }
    public static void main(String[] args) {
        System.out.println("The addition of two numbers is :" + add(23,45));
        System.out.println("The addition of two numbers are :" + add(23,45,67));
        System.out.println("The addition of more numbers are :" + add(23,45,67,12,8,9));
        System.out.println("The subtraction of two numbers is :" + sub(23,45));
        System.out.println("The subtraction of two numbers are :" + sub(23,45,67));
        System.out.println("The subtraction of more numbers are :" + sub(23,45,67,12,8,9));
        System.out.println("The multiplication of two numbers is :" + mul(23,45));
        System.out.println("The multiplication of two numbers are :" + mul(23,45,67));
        System.out.println("The multiplication of more numbers are :" + mul(23,45,67,12,8,9));
    }
}
