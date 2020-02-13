package com.company;

import org.javatuples.Pair;
import org.javatuples.Triplet;
import org.javatuples.Unit;

public class Main {

    public static void main(String[] args) {
        Unit<String> unit;
        Pair<Integer, String> pair;
        Triplet<Integer, String, Boolean> triplet;

        unit = Unit.with("hello");
        pair = Pair.with(1, "yasuo");
        triplet = Triplet.with(2, "Kata", true);

        System.out.println("unit:: " + unit);
        System.out.println("pair:: " + pair);
        System.out.println("triplet:: " + triplet);

    }
}
