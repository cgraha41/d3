package com.company;

import java.io.*;
import java.util.*;


public class Interpreter {




    ArrayList<String> tokenInfo = Lexer.getTokenInfo();
    List<String> lineNumbers = Lexer.getLineNumbers();

    private parserFile parserFile = Lexer.getParserFile();


    //parserFile p = new parserFile(tokenInfo, lineNumbers);
    //parserFile = new parserFile(tokenInfo, lineNumbers);
    //  parserFile.createBinaryTree();


    public TreeMap<Integer, String> map;
    //Set<Integer> keys = map.keySet();


    public void traverse()          //traverse the binary tree
    {
        map = parserFile.getBinaryTree();

        //for(int c = 0; c < tokenInfo.size(); c+= 2){
        // System.out.println(m.
        //   System.out.println("");
        // }

        //  System.out.println("Printing all keys of TreeMap");
        //  for(Integer key : keys){
        //      System.out.println( key );
        //  }






    /*    for(Map.Entry m:map.entrySet())
        {
            System.out.println("Key:"+m.getKey() + " Value:"+m.getValue());
            try {
                FileWriter Output2 = new FileWriter("parserOutPut2.txt", true);

                Output2.write("Key:"+m.getKey() + " Value:"+m.getValue()+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



*/

        Program pro = new Program();
        pro.load();
    }


}

