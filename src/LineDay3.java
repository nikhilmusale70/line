import java.util.Random;

public class LineDay3 {
    public static void main(String[] args) {
        Random ran=new Random();

        //for line 1
        int x1= ran.nextInt(10);
        int y1= ran.nextInt(10);
        int x2= ran.nextInt(10);
        int y2= ran.nextInt(10);
        int x= (x2-x1);
        int y= (y2-y1);
        double len1= Math.sqrt( Math.pow(x,2) + Math.pow(y,2) );
        System.out.println("Length of line1 is :- "+len1);

        //for line 2
        int x3= ran.nextInt(10);
        int y3= ran.nextInt(10);
        int x4= ran.nextInt(10);
        int y4= ran.nextInt(10);
        int x5= (x4-x3);
        int y5= (y4-y3);
        double len2= Math.sqrt( Math.pow(x5,2) + Math.pow(y5,2) );
        System.out.println("Length of line2 is :- "+len2);

        if(len1==len2)
            System.out.println("lines are equal in length");
        else
            System.out.println("Lines are not equal in length");
    }
}
