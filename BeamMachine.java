import java.util.Scanner;

public class BeamMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of balls and holes: ");
        int total_balls = input.nextInt();
        int total_holes = input.nextInt();
        Balls[] all_balls = new Balls[total_balls];
        int[] histogram = new int[total_holes];
        for (int i = 0; i < total_balls; i++) {
            Balls new_ball = new Balls();
            for (int j = 0; j < total_holes - 1; j++) {
                new_ball.RandomLeftOrRight();}
            all_balls[i] = new_ball;
            histogram[new_ball.deviation]++;
        }

        for (int k = 0; k < all_balls.length; k++) {
            System.out.printf(" Ball No. %d Ball Path: %s Ball Location: %d", k+1, all_balls[k].path, all_balls[k].deviation);
            System.out.println();
        }

        System.out.println("Distribution: ");

        for (int l = 0; l < histogram.length; l++) {
            System.out.printf("Line %d  ", l);
            for (int m = 0; m < histogram[l]; m++) {
                System.out.print("0 ");
            }
            System.out.println();
        }

    }}
