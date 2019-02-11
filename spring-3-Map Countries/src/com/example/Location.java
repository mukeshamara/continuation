package com.example;
import java.util.Map;
import java.util.TreeMap;

public class Location {
private TreeMap<Integer,String> hm;

public void setHm(TreeMap<Integer, String> hm) {
	this.hm = hm;
}


public void showCountries()
{
	System.out.println("Code : Country");
    for(Integer x:hm.keySet())
	   System.out.println(x+"  : "+hm.get(x));
}
}
