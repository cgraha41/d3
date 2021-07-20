package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Program {


    FileWriter Output;

   /*


    public void run (){             //iterates over the collection and executes each of the statements

    }
}
*/




    public void load() {               //reads statements from an input stream and
        //parses them into a collection of statements


        String fileName = "C:\\Users\\Cline\\Downloads\\Inter\\newestParserOutput.txt";

        System.out.println("Inner");

        try {
            Output = new FileWriter("ProgramOut.txt", true);
//            Output = new FileWriter("ProgramOutRealArray.txt", true);


            InputStream f = new FileInputStream(fileName);
            InputStreamReader i = new InputStreamReader(f, StandardCharsets.UTF_8);
            BufferedReader b = new BufferedReader(i);

           // b.lines().forEach(line -> System.out.println(line));

            //System.out.println(i.read());


            int counter;
            int counter2 = 0;
            char c;
            String current = "";
            String sentence = "";
            ArrayList<String> sentences = new ArrayList<>();

           while((counter = i.read()) != -1) {




                    // converts integer to character
                    c = (char) counter;


                    // prints character
               //System.out.print(c);


         //      current = current.replace("e", " ");

           //    current = current.replace("y:", " ");
             //  current = current.replace("Value:", " ");

             /*  if (current.contains("K") == true){
                   System.out.println("true");
                   current = current.replace("K", " ");

               }*/

               if (current.contains("LET") == true){
                //   System.out.println("LET true");


                       current = "LET ";
                   if (counter2 != 0) {

                       sentences.add(sentence);
                   }
                   sentence = "";
                   sentence = sentence + current;
                  System.out.print(sentences);
              //     System.out.println();
                   counter2++;
//                       System.out.print(current);

                   current = "";

               }



           //    System.out.print(current);


               if (current.contains("Value:X") == true){
                   //System.out.println(" = true");

                   current = "X";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               }

               if (current.contains("Y") == true){
                   //System.out.println(" = true");

                   current = "Y";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               }
               if (current.contains("=") == true){
                   //System.out.println(" = true");

                   current = " = ";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               }

               if (current.contains("Value:1") == true){
                   //System.out.println(" = true");

                   current = "1";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               } if (current.contains("Value:2") == true){
                   //System.out.println(" = true");

                   current = "2";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               } if (current.contains("Value:3") == true){
                   //System.out.println(" = true");

                   current = "3";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               } if (current.contains("Value:4") == true){
                   //System.out.println(" = true");

                   current = "4";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               } if (current.contains("Value:5") == true){
                   //System.out.println(" = true");

                   current = "5";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               } if (current.contains("Value:6") == true){
                   //System.out.println(" = true");

                   current = "6";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               } if (current.contains("Value:7") == true){
                   //System.out.println(" = true");

                   current = "7";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               } if (current.contains("Value:8") == true){
                   //System.out.println(" = true");

                   current = "8";
                   sentence = sentence + current;

                   System.out.println();
                   current = "";

               } if (current.contains("Value:9")){
                   //System.out.println(" = true");

                   current = "9";
                   sentence = sentence + current;

                   System.out.println();
                   current = "";

               }

               if (current.contains("Value:0")){
                   //System.out.println(" = true");

                   current = "0";
                   sentence = sentence + current;

                   System.out.println();
                   current = "";

               }

               if (current.contains("0")){
                   //System.out.println(" = true");

                   current = "0";
                   sentence = sentence + current;

                   System.out.println();
                   current = "";

               }



               if (current.contains("Value:EXP")){
                   //System.out.println(" = true");

                   current = " EXP";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               }


               if (current.contains("Value:(")){
                   //System.out.println(" = true");

                   current = "(";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               }

               if (current.contains("Value:)")){
                   //System.out.println(" = true");

                   current = ")";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               }

               if (current.contains("Value:-")){
                   //System.out.println(" = true");

                   current = "-";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               }

               if (current.contains("^")){
                   //System.out.println(" = true");

                   current = "^";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               }

               if (current.contains("/")){
                   //System.out.println(" = true");

                   current = "/";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               }

               if (current.contains("*")){
                   //System.out.println(" = true");

                   current = "'*'";
                   sentence = sentence + current;

                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";

               }

          //      Output.write(c);

   //                 current = current + c;


               if (current.contains("INT")){
                   //System.out.println(" = true");

                   current = "INT";

                   sentence = sentence + current;
                   System.out.print(sentences);
                   System.out.println();
                   //     System.out.println("sentence: " + sentence);
                   //System.out.print(current);
                   current = "";
               }


               if (current.contains("PRI")){
                   System.out.println("PRINT true");

                   current = "PRINT ";
                   sentences.add(sentence);
                   sentence = "";
                   sentence = sentence + current;
                   System.out.print(sentences);
                   System.out.println();
                   counter2++;
//                       System.out.print(current);

                   current = "";

               }


               if (current.contains("NEXT")){
                   System.out.println("NEXT true");

                   current = "NEXT ";
                   sentences.add(sentence);
                   sentence = "";
                   sentence = sentence + current;
                   System.out.print(sentences);
                   System.out.println();
                   counter2++;
//                       System.out.print(current);

                   current = "";

               }


               if (current.contains("END")){
                   System.out.println("END true");

                   current = "END ";
                   sentences.add(sentence);
                   sentence = "";
                   sentence = sentence + current;
                   System.out.print(sentences);
                   System.out.println();
                   counter2++;
//                       System.out.print(current);

                   current = "";

                         Output.write(String.valueOf(sentences));

               }


               current = current + c;


           }




          //  System.out.println("Innerinner");

            Output.close();

        }

        catch(FileNotFoundException e){
            System.out.println("not found");

        }

        catch (IOException er){
            System.out.println("io");





   //         try {
     //           Output.close();
       //     } catch (IOException e) {
         //       e.printStackTrace();
           // }




        }

    //    finally {
            // releases system resources associated with this stream
      //      if(f!=null)
          //      f.close();
        //}




    }


}
