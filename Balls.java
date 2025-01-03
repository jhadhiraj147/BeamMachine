public class Balls {
    public static int count = 0;
    int deviation = 0;
    String path = "";


    Balls() {count++;}

    
    void RandomLeftOrRight() {
        int random_number = (int) (Math.random() * 2);
        if (random_number == 0) {
            this.path += "L";} 

        else {this.path += "R";
        this.deviation += 1;}}}
