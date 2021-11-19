package Java.Lab.lab11;

public class GenericClass<S,I>{
    private S u;
    private I v;
    GenericClass(S u, I v){
        this.u = u;
        this.v = v;
    }

    public S getU() {
        return u;
    }

    public I getV() {
        return v;
    }

    @Override
    public String toString() {
        return u + " " + v;
    }
}
