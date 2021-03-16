package com.musayilmaz.learningjava;

public class OperatorsAndFlows {

    public static void main(String[] args) {

        int x=5;
        System.out.println(x);

        x =x + 1;
        System.out.println(x);

        x++;
        System.out.println(x);

        x--;
        System.out.println(x);

        x = x*5;
        System.out.println(x);

        int y=4;

        System.out.println(x>y);
        System.out.println(y>x);
        y=30;
        System.out.println(x>=y);
        System.out.println(x==y);
        y=29;
        System.out.println(y!=x);       // "!=" eşit değildir demek

        //and &&
        //or ||


        //if flows

        y=30;

        if (x>y) {
            System.out.println("x is bigger");
        } else if (y>x) {
            System.out.println("y is bigger");
        } else {
            System.out.println("x=y");

        }

        //switch

        int day = 3;
        String dayString = "";

        if (day==1) {
            dayString="Monday"; }
        else if (day==2) {
            dayString="Tuesday"; }
        else if (day==3) {
            dayString="Wednesday"; }
        System.out.println(dayString);



        switch (day) {
            case 1:
            dayString="monday";
            break;
            case 2:
            dayString="tuesday";
            break;
            case 3:
            dayString="Wednesday";
         default:
             dayString="Sunday";

             System.out.println(dayString);

        }




        }



    }


