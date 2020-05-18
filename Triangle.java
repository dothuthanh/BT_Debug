package app;

import java.util.Scanner;

public class Triangle {
    public void start() throws IllegalTriangleException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh a");
        int a = scanner.nextInt();
        if (a <= 0) throw new IllegalTriangleException("canh a khong lon 0");
        System.out.println("nhap canh b");
        int b  = scanner.nextInt();
        if(b <= 0) throw new IllegalTriangleException("canh b khong hop le mopi ban nhap lai");
        System.out.println("nhap canh c");
        int c = scanner.nextInt();
        if( c <= 0) throw new IllegalTriangleException("canh c khong hop le moi ban nhap lai");
        if(a + b <= c) throw new IllegalTriangleException("khong phai tam giac");
        if (a + c <=b) throw new IllegalTriangleException("khong phai tam giac");
        if (b + c <= a) throw new IllegalTriangleException("khong phai tam giac");

    }
}
