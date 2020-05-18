package app;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        try{
            triangle.start();
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
            System.out.println("Loi");
        }
    }
}
