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


            InputStream f = new FileInputStream(fileName);
            InputStreamReader i = new InputStreamReader(f, StandardCharsets.UTF_8);
            BufferedReader b = new BufferedReader(i);

           // b.lines().forEach(line -> System.out.println(line));

            //System.out.println(i.read());


            int counter;
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

                   current = "LET";

                   sentences.add(sentence);
                   sentence = "";
                   sentence = sentence + current;
                //   System.out.print(sentences);
                   System.out.println();

//                       System.out.print(current);

                   current = "";

               }



           //    System.out.print(current);


               if (current.contains("=") == true){
                   //System.out.println(" = true");


                   sentence = sentence + current;

                 System.out.println();
              //     System.out.println("sentence: " + sentence);
                   System.out.print(current);
                  current = "";

               }
//               System.out.print(current);


          //      Output.write(c);

                    current = current + c;





            }




            System.out.println("Innerinner");

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
