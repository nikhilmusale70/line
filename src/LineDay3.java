import java.util.Random;

public class LineDay3 {
    public static void lineDay3() {
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

        //compare line 1 and line 2
        Double doublelen1 = new Double(len1);
        Double doublelen2 = new Double(len2);
        
        int compare = doublelen1.compareTo(doublelen2);

        if(compare > 0)
            System.out.println("line1 is greater than line2");
        else if (compare < 0)
            System.out.println("line2 is greater than line 1");
        else
            System.out.println("Lines are equal in length");
    }
}
