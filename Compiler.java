// compiler for option 1 of school project by Gabriel Dawa - 20231ss.tds_q0065
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Compiler {
    public static void main(String[] args) throws Exception{
        File input = new File("input.txt"); // turns the input.txt file into a file object
        Scanner sc = new Scanner(input); // create scanner that reads the file object    
        String tempIn, tempOut = ""; // sets the temporary input and output variables 

        while(sc.hasNext()){ // while theres text to be read
            tempIn = sc.next().trim(); // read the text, set it to the var temp and remove whitespace

            switch(tempIn){// checks what the contents of the text is and adjusts accordingly 
                case "LOAD":  tempOut += "100"; break;
                case "PRINT": tempOut += "101"; break;
                case "HALT":  tempOut += "102"; break;
                case "DEC":   tempOut += "103"; break;
                case "INC":   tempOut += "104"; break;
                case "ADD":   tempOut += "105"; break;
                case "JNZ":   tempOut += "106"; break;
                case "JZ":    tempOut += "107"; break;
                case "SET":   tempOut += "108"; break;
                default: // ignore "R" or ","
                    tempOut += (tempIn.startsWith("R")) ? (tempIn.endsWith(",")) ? tempIn.substring(1, tempIn.length() - 1) : tempIn.substring(1) : tempIn; 
                    break;
            }   tempOut += (sc.hasNext()) ? "\n" : ""; // breaks every line sans the last one
        }   sc.close();// closes scanner

        File output = new File("output.txt"); // creates new file output.txt
        FileWriter wr = new FileWriter(output); // creates filewriter that writes to output.txt
        wr.write(tempOut); // writes output to file
        wr.close();//closes writer 
    }
}