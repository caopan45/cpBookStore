package org;

import sun.applet.Main;

public class BlcakMan implements Animal,Human{
    @Override
    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        Animal a = new BlcakMan();
        Human b =(Human) a;
        System.out.println( b == a);
        a.run();
        b.run();
    }
}
