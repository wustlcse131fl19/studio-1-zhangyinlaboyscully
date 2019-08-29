package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Enter value for the first int");
        int n2 = ap.nextInt("Enter value for the second int");
        double avg = (n1 + n2)/2.0;
        System.out.println(avg);

        //comment
    }


}
