package com.marker.datastructure.base.arraylist;

import java.util.ArrayList;

public class Client {

  public static void main(String[] args) {
//    ArrayList<E>

    ArrayList<String> list = new ArrayList<String>();
    list.add("marker1");
    list.add("marker2");
    list.add("marker3");
    list.add("marker4");
    System.out.println(list.toString());

    System.out.println(list.remove(2));

    System.out.println(list.toString());

//    System.out.println(list.constants("marker1"));

    System.out.println(list.get(1));

//    System.out.println(list.set(4, "marker.new"));

    System.out.println(list.toString());

//    System.out.println(list.get(4));
    System.out.println(list.set(-2, "ssss"));
    
    System.out.println(list.toString());

  }


}
