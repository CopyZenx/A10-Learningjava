package com.musayilmaz.learningjava;

public class Variables {

    public static void main(String[] args) {

        //integer = int

        int x=5;
        int y=4;
        int age=19;
        int result=age*4/3;

        System.out.println(result);

        //double or float (float daha az yer kaplar)

        double pi=3.14;
        double r=5.0;

        // eğer r'yi değişmez yapmak istersen "final double r=5.0;" yazarsan değizmeş olur

        System.out.println("r:" + r);

        r=4;

        System.out.println("r:" + r);

        System.out.println(2*pi*r);

        double a = 19.0;

        System.out.println(a*4/3);

        //string metin verileri

        String name = "James";
        String surname = "Hotfield";
        String fullname = name + " " + surname;

        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullname);


        //Boolean yanlış ya da doğru

        boolean isAlive = true;
        isAlive = false;

        System.out.println(isAlive);





    }

}
