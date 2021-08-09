import java.util.Random;

public class LineDay3 {
    public static void main(String[] args) {
        Random ran=new Random();
        int x1= ran.nextInt(10);
        int y1= ran.nextInt(10);
        int x2= ran.nextInt(10);
        int y2= ran.nextInt(10);
        int x= (x2-x1);
        int y= (y2-y1);
        double len= Math.sqrt( Math.pow(x,2) + Math.pow(y,2) );
        System.out.println("Length of line is :- "+len);
    }
}
