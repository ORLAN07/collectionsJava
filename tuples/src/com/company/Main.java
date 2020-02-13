package com.company;

import org.javatuples.Pair;
import org.javatuples.Quartet;
import org.javatuples.Triplet;
import org.javatuples.Unit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<String> arrayList = new ArrayList<>();
        arrayList.add("yasuo");
        arrayList.add("talon");
        arrayList.add("katarina");
        arrayList.add("sett");
        arrayList.add("zed");

        Quartet<String, String, String, String> quartet;
        quartet = Quartet.fromIterable(arrayList, 1);
        System.out.println("quartet:: " + quartet);

    }
}
