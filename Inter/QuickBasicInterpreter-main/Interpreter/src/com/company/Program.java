package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Program {


    FileWriter Output;

    ArrayList<String> sentences = new ArrayList<>();



    public void load() {               //reads statements from an input stream and
        //parses them into a collection of statements


        String fileName = "C:\\Users\\Cline\\Downloads\\Inter\\parserOutput.txt";

        //System.out.println("Inner");

        try {
            Output = new FileWriter("ProgramOut.txt", true);


            InputStream f = new FileInputStream(fileName);
            InputStreamReader i = new InputStreamReader(f, StandardCharsets.UTF_8);

            //  BufferedReader b = new BufferedReader(i);
            // b.lines().forEach(line -> System.out.println(line));


            int counter;
            int counter2 = 0;
            char c;
            String current = "";
            String sentence = "";

           while((counter = i.read()) != -1) {


                    c = (char) counter;



               if (current.contains("LET") == true){

                       current = "LET ";
                   if (counter2 != 0) {

                       sentences.add(sentence);
                   }
                   sentence = "";
                   sentence = sentence + current;
                   counter2++;

                   current = "";
               }



               if (current.contains("Value:X")){
                   current = "X";
                   sentence = sentence + current;
                   current = "";
               }

               if (current.contains("Y")){
                   current = "Y";
                   sentence = sentence + current;
                   current = "";
               }
               if (current.contains("=")){
                   current = " = ";
                   sentence = sentence + current;
                   current = "";
               }

               if (current.contains("Value:1")){

                   current = "1";
                   sentence = sentence + current;
                   current = "";

               } if (current.contains("Value:2")){
                   current = "2";
                   sentence = sentence + current;
                   current = "";

               } if (current.contains("Value:3")){
                   current = "3";
                   sentence = sentence + current;
                   current = "";

               } if (current.contains("Value:4")){
                   current = "4";
                   sentence = sentence + current;
                   current = "";

               } if (current.contains("Value:5")){
                   current = "5";
                   sentence = sentence + current;
                   current = "";

               } if (current.contains("Value:6")){
                   current = "6";
                   sentence = sentence + current;
                   current = "";

               } if (current.contains("Value:7")){
                   current = "7";
                   sentence = sentence + current;
                   current = "";

               } if (current.contains("Value:8")){
                   current = "8";
                   sentence = sentence + current;
                   current = "";

               } if (current.contains("Value:9")){

                   current = "9";
                   sentence = sentence + current;

                   current = "";

               }


               if (current.contains("00")){
                   //System.out.println(" = true");

                   current = "00";
                   sentence = sentence + current;

                   current = "";

               }

               if (current.contains("Key:21")){
                   current = "SQR (23.14159265)";
                   sentence = sentence + current;
                   current = "";
               }
               if (current.contains("Value:EXP")){
                   current = " EXP";
                   sentence = sentence + current;
                   current = "";
               }
               if (current.contains("Value:(")){
                   current = "(";
                   sentence = sentence + current;
                   current = "";
               }
               if (current.contains("Value:)")){
                   current = ")";
                   sentence = sentence + current;
                   current = "";
               }
               if (current.contains("Value:-")){
                   current = "-";
                   sentence = sentence + current;
                   System.out.println();
                   current = "";
               }
               if (current.contains("^")){
                   current = "^";
                   sentence = sentence + current;
                   current = "";
               }
               if (current.contains("/")){
                   current = "/";
                   sentence = sentence + current;
                   current = "";
               }
               if (current.contains("*")){
                   current = "'*'";
                   sentence = sentence + current;
                   current = "";
               }
               if (current.contains("INT")){
                   current = "INT";
                   sentence = sentence + current;
                   current = "";
               }
               if (current.contains("PRI")){
                   current = "PRINT ";
                   sentences.add(sentence);
                   sentence = "";
                   sentence = sentence + current;
                   counter2++;
                   current = "";
               }
               if (current.contains("NEXT")){
                   current = "NEXT ";
                   sentences.add(sentence);
                   sentence = "";
                   sentence = sentence + current;
                   counter2++;
                   current = "";
               }
               if (current.contains("END")){
                   current = "END ";
                   sentences.add(sentence);
                   sentence = "";
                   sentence = sentence + current;
                   counter2++;
                   current = "";


                   Output.write(String.valueOf(sentences));

               }


               current = current + c;


           }



            Output.close();

        }

        catch(FileNotFoundException e){
            System.out.println("not found");
        }

        catch (IOException er){
            System.out.println("io");
        }

    }



    public void run (){             //iterates over the collection and executes each of the statements


        ArrayList<String> interpretation = new ArrayList<>();


        String current = "";

        int x=0;
        double y=0;


        for (int counter = 0; counter < sentences.size(); counter++){
         //   System.out.print("RUN" + counter + ": ");
            current = sentences.get(counter);
            System.out.println(current);


            if (current.contains("LET")){


                current = current.replace("LET", "");
                System.out.println(current);

                if (current.contains("X = ")) {
                    interpretation.add(current);
                    current = String.valueOf(current.charAt(current.length() - 1));
                    x = Integer.valueOf(current);
                    System.out.println(x);
                }

                if (current.contains("X^2")){
                    current = current.replace("X^2", String.valueOf(x * x));
                }

                if (current.contains("Y = ")) {
                    interpretation.add(current);
                    current = current.replace("Y = ", "");
                    current = current.replace("EXP", "");



                    current = current.replace("(","");
                    current = current.replace(")","");

                    if (current.contains("/2")){
                       String[] temp = new String[2];
                         temp = current.split("/2");
                        System.out.println(temp[0]);
                        System.out.println(temp[1]);
                        current = Integer.valueOf(temp[0])/ 2 + temp[1];
                    }


                   System.out.println(current);

              //      y = Integer.valueOf(current);
               //     System.out.println(y);
                }




            }

          //      System.out.println(interpretation);

        }






    }


}
