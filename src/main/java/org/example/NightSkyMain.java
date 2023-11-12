package org.example;
import org.example.classes.NightSky;

public class NightSkyMain {
    public static void main(String[] args) {
        // Task 7
//        NightSky nightSky = new NightSky(0.2);
//        nightSky.printLine();

//        NightSky nightSky = new NightSky(8, 4);
//        nightSky.print();
//        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
//        System.out.println("");
//
//        nightSky.print();
//        System.out.println("Number of stars: " + nightSky.starsInLastPrint());

        NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");
        NightSky = new NightSky(0.2, 15, 6);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}
