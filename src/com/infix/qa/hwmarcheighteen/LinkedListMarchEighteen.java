package com.infix.qa.hwmarcheighteen;

/* Java LinkedList class can contain duplicate elements,
maintains insertion order, non synchronized,
manipulation is fast because no shifting needs to occur,
and can be used as a list, stack or queue
 */

import java.util.LinkedList;

public class LinkedListMarchEighteen {
    public static void main(String [] args){
        // LinkedList name = new LinkedList();
        // LinkedList<Integer> name = new LinkedList<Integer>()
        LinkedList<String> name = new LinkedList<String>();
        /* when you put String remove yellow highlight also
        only have to use String can not use any other
        data type same with integer */

        name.add("Jahid");
        name.add("Sabbir");
        name.add("Mamun");
        name.add("Tauhid");
        name.remove(2);
        name.remove("Sabbir");
        //name.clear();
        System.out.println(name.peekFirst());
        System.out.println(name.getLast());
        System.out.println(name.contains("Juned"));
        System.out.println(name);
    }
}

