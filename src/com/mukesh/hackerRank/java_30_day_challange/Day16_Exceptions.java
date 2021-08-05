package com.mukesh.hackerRank.java_30_day_challange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16_Exceptions {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();

        try
        {
            System.out.println(Integer.parseInt(S));
        }
        catch(Exception e)
        {
            System.out.println("Bad String");
        }
    }

}
