package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value/60;
    }

    public static void main(String[] args){
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 Euro. Test result : " + passed);
        float inE = 140;
        float expectedE = inE/60;  //не знал как переменную в переод потавить (10/3=3,3333333в переоде)
        float outE = Converter.rubleToDollar(in);
        boolean passedE = expectedE == outE;
        System.out.println(" 140 rubles are "+ expectedE +" Dollars . Test result :  " + passedE);
    }
}