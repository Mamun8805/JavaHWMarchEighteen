package com.infix.qa.hwmarcheighteen;

import javax.swing.plaf.nimbus.State;

public class ArrayListMarchEighteen {

    public static void main(String[] args) {
        // This Array how you add manually.
        String[] state = new String[4];
        state[0] = "Michigan";
        state[1] = "Newyork";
        state[2] = "Ohio";
        state[3] = "Florida";
        state[4] = "California";
        System.out.println(state [0]);

        // This is ArrayList ... More flexible
        ArrayList stateList = new ArrayList();
        stateList.add("Michigan");
        stateList.add("Newyork");
        stateList.add("California");
        stateList.add("Florida");
        stateList.remove(2);
        stateList.remove("Michigan");
        //countryList.clear();
        System.out.println(statelist.contains("Texas"));
        System.out.println(stateList);
    }
}