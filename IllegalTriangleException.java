package app;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(){
        super("edge not Triangle");
    }
    public IllegalTriangleException(String string){
        super(string);
    }
}
