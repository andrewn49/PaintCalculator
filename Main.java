import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nowall = new Scanner(System.in);
        System.out.println("enter the number of walls in the room");
        int walls =  nowall.nextInt();

        Scanner wallh = new Scanner(System.in);
        System.out.println("Enter the height of the room");
        int height = wallh.nextInt();

        Scanner walll = new Scanner(System.in);
        System.out.println("Enter the length of the walls");
        int length = walll.nextInt();

        float paint = ((length * height)* walls)/6.5f;

        System.out.println("To paint all of the walls you will need roughly: " + paint + " Litres of paint");


    }
}