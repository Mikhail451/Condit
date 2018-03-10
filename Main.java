package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) throws Exception{

        String intel;
        int j;

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        System.out.print("введите значения для пирамиды через запятую:");
        intel = reader.readLine();

        ArrayList<Integer> Array = new ArrayList<>();
        StringTokenizer st;
        st = new StringTokenizer(intel, ",");

        while (st.hasMoreTokens()) {
            Array.add(Integer.valueOf(st.nextToken()));
            Collections.sort(Array);
        }

        Iterator<Integer> it = Array.iterator();
        ArrayList<Integer> Array1 = (ArrayList<Integer>) Array.clone();
        Collections.fill(Array1, 0);
        Array1.remove(Collections.max(Array1));
        if (Array.size()==6){
        for (j = 0; j < 3; j++) {
            Collections.fill(Array1, 0);
            Array1.set((Array1.size() / 2 - j), (it.next()));
            if (j==1){ Array1.set((Array1.size() / 2 + j), (it.next()));}
            if (j==2){ Array1.set((Array1.size() / 2 - j+2), (it.next())); Array1.set((Array1.size() / 2 - j+4), (it.next()));
            }
             System.out.println(Array1);}



        }
        else {System.out.println("Невозможно построить пирамиду");}
    }
}

