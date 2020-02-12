package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "orlando");
        hashMap.put(2, "yasuo");
        hashMap.put(3, "katarina");

        Set<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(9);
        System.out.println(hashSet);

        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("perro");
        treeSet.add("gato");
        System.out.println(treeSet);


        LinkedList linkedList = new LinkedList();
        linkedList.add("Geeks");
        linkedList.add(4);
        linkedList.add("Geeks");
        linkedList.add(5);

        System.out.println("LinkedList " + linkedList);
        System.out.println("poll:: " + linkedList.poll());
        System.out.println("LinkedList222 " + linkedList);
        System.out.println("plast:: " + linkedList.pollLast());
        System.out.println("plastEnd:: " + linkedList);

        Stack stack = new  Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println("stack:1: " + stack);
        System.out.println("stack:: " + stack.peek());
        System.out.println("stack:2: " + stack);
        System.out.println("stack:1.1: " + stack.pop());
        System.out.println("stack:2.2: " + stack);
        System.out.println("stack:3.1: " + stack.search("2"));
    }
}
