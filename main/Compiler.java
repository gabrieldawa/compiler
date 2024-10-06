// compilador para a opção 1 da tarefa de fundamentos ~ by Gabriel Dawa - 20231ss.tds_q0065
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Compiler {
    public static void main(String[] args) throws Exception{
        File input = new File("input.txt"); // pega o arquivo "input.txt" e cria o objeto input
        Scanner sc = new Scanner(input); // cria o scanner que lê o objeto input
        String tempIn, tempOut = ""; // cria variáveis temporárias de entrada e saída 

        while(sc.hasNext()){ // enquanto há texto a ser lido
            tempIn = sc.next().trim(); // lê o texto parte por parte
            
            switch(tempIn){// pega a parte do texto em tempIn, analiza e age conforme necessário, concatenado tudo em tempOut 
                case "LOAD":  tempOut += "100"; break;
                case "PRINT": tempOut += "101"; break;
                case "HALT":  tempOut += "102"; break;
                case "DEC":   tempOut += "103"; break;
                case "INC":   tempOut += "104"; break;
                case "ADD":   tempOut += "105"; break;
                case "JNZ":   tempOut += "106"; break;
                case "JZ":    tempOut += "107"; break;
                case "SET":   tempOut += "108"; break;
                default: // ignora "R" or ","
                    tempOut += (tempIn.startsWith("R")) ? (tempIn.endsWith(",")) ? tempIn.substring(1, tempIn.length() - 1) : tempIn.substring(1) : tempIn; 
                    break;
            }   tempOut += (sc.hasNext()) ? "\n" : ""; // quebra todas as linhas menos a última
        }   sc.close();// fecha scanner

        File output = new File("output.txt"); // cria arquivo output.txt
        FileWriter wr = new FileWriter(output); // cria filewriter que escreve em output.txt
        wr.write(tempOut); // escreve tempOut no arquivo output
        wr.close();// fecha filewriter 
    }
}
