package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Program {


    FileWriter Output;

   /* public void load () {               //reads statements from an input stream and
        //parses them into a collection of statements


        String fileName = "src//parserOutPut.txt";

        try {
            InputStream fis = new FileInputStream(fileName);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
        }
        catch {
            (br.lines().forEach(line -> System.out.println(line)));

        }
    }
    public void run (){             //iterates over the collection and executes each of the statements

    }



}
*/


    public void load() {               //reads statements from an input stream and
        //parses them into a collection of statements


        String fileName = "C:\\Users\\Cline\\Downloads\\Inter\\parserOutput.txt";

        System.out.println("Inner");

        try {
            Output = new FileWriter("ProgramOutput.txt", true);


            InputStream f = new FileInputStream(fileName);
            InputStreamReader i = new InputStreamReader(f, StandardCharsets.UTF_8);
            BufferedReader b = new BufferedReader(i);

           // b.lines().forEach(line -> System.out.println(line));

            //System.out.println(i.read());
            //System.out.println(i.read());

            int counter;
            char c;

            while((counter = i.read()) != -1) {

                // converts integer to character
                 c = (char)counter;

                // prints character
              System.out.print(c);
                Output.write(c);

            //    if(Output){

              //  }

            }

      //      System.out.print(c);



            System.out.println("Innerinner");


        }

        catch(FileNotFoundException e){
            System.out.println("not found");

        }

        catch (IOException er){
            System.out.println("io");





            try {
                Output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }




        }

    //    finally {
            // releases system resources associated with this stream
      //      if(f!=null)
          //      f.close();
        //}




    }


}
