package com.acc.lkm.SurpriseMockTest;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TreeMap<String,String> treeMap=new TreeMap<String,String>();
        treeMap.put("Java","Eclipse");
        treeMap.put("PYTHON","PyCharm");
        treeMap.put("C++","Dev C++");
        for(Map.Entry m1:treeMap.entrySet()) {
        	System.out.println(m1.getKey()+"---"+m1.getValue());
        }
    }
}
