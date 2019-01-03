package com.company;

import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {

    public String convert(String s, int numRows) {
        if(s==null||s.length()==0) return s;
        char[] chars=s.toCharArray();
        int len=chars.length;
        StringBuilder[] builds=new StringBuilder[len];
        for(int i=0;i<len;i++) builds[i]=new StringBuilder();
        int i=0;
        while (i<len){
            for(int j=0;j<=numRows-1&&i<len;j++) //these two loops may not execute, so first make them right, then check edge chases;
                builds[j].append(chars[i++]);
            for(int j=numRows-2;j>=1&&i<len;j--)
                builds[j].append(chars[i++]);
        }
        for(i=1;i<len;i++)
            builds[0].append(builds[i]);
        return builds[0].toString();
    }
}
public class ZigZagConversion {

    public static void main(String[] args) {
	// write your code here
        Solution s=new Solution();
        System.out.print(s.convert("PAYPALISHIRING",1));
    }
}
