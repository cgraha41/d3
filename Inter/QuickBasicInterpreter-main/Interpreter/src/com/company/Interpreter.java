package com.company;

import java.io.*;
import java.util.*;


public class Interpreter {

    public List<String> basicCodeList = Lexer.getBasicCodeList();

    int c = 0;
    int e = basicCodeList.size();
    Stack identifier = new Stack();
    Stack constant = new Stack();

    public void Interpret()
    {
        while (c < e)
        {
            switch (c){
            case (basicCodeList.get(c) == "INT"):
                c++;
                                                              //take BasicCodeList(c);
                identifier.add(basicCodeList.get(c));         // push the value of the identifier on the stack identifier;
                break;
            case (basicCodeList.get(c) == String.valueOf(1)):                 //INT_CONSTANT:
                c++;
                                                             //  take BasicCodeList(c);
                constant.add(basicCodeList.get(c));          // push the value of the constant on the stack constant;
                break;
            case ASSIGN_OP:
                pop the last two items from the stack S;
                store the value of the second item popped into the identifier value (first item popped)
                break;
             //  other case alternatives
        }  // end case
        c++;           // advance to next symbol in BasicCodeList
    }
    // end while





        }

    }


}
