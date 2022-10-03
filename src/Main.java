import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Into a number of lines you want it : ");
        int numLines = scn.nextInt();
        System.out.println("Into a character you want to print it : ");
        scn.nextLine();
        String symbole = scn.nextLine();
//        showTriangle(numLines , symbole);
        Triangle triangle = new Triangle(numLines ,symbole);

        triangle.showTriangle();
//        System.out.println(triangle.getElements().get(2));
//        triangle.showTriangleDecorated();
//        triangle.showTriangle();
//         Triangles triangles = new Triangles();
//        triangles.addTriangle(new Triangle(numLines ,symbole ));
//        triangles.addTriangle(new Triangle(9 ,"0" ));
//        for(ArrayList<Triangle>  d : triangles) {
//
//        }

    }




    public static void  showTriangle(int numLines , String symbole ){

        for (int i = 1; i <= numLines; i++) {

            for (int j = numLines; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(symbole+" ");
            }

            System.out.println();
        }

    }
}