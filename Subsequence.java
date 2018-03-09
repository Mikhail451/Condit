
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.ArrayList;

import java.util.StringTokenizer;

import static java.lang.System.in;

public class Subsequence {

    public static void main(String[] args) throws Exception {
        String X,Y;

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        System.out.println("Список X:");
        X= reader.readLine();
        System.out.println("Список Y:");
        Y=reader.readLine();
        ArrayList<String> ArrayX = new ArrayList<String>();
        ArrayList<String> ArrayY= new ArrayList<String>();
        ArrayList<String> ArrayZ= new ArrayList<String>();
        StringTokenizer stx,sty;
        stx = new StringTokenizer(X, ",");
        sty = new StringTokenizer(Y, ",");
        while (stx.hasMoreTokens()) {
            ArrayX.add((stx.nextToken()));
            while (sty.hasMoreTokens()) {
                ArrayY.add((sty.nextToken()));
            }
        }
        int i;
        for(i=0;i<ArrayX.size();i++)
        { if ((ArrayY).contains(ArrayX.get(i)))
        { ArrayZ.add(ArrayX.get(i));}
        }
        boolean b =ArrayX.equals(ArrayZ);
        System.out.println(b);
    }
}
