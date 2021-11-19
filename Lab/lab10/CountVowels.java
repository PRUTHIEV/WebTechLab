package Java.Lab.lab10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CountVowels {
    private static final Scanner input = new Scanner(System.in);
    public static void appendFile(String s)throws Exception{
        File outputFile = new File("D:\\Interview\\JavaProgramming\\src\\Java\\Lab\\lab10\\output.txt");
        FileOutputStream fout = new FileOutputStream(outputFile,true);
        fout.write(s.getBytes());
    }
    public static void readWriteFile() throws Exception {
        File inputFile = new File("D:\\Interview\\JavaProgramming\\src\\Java\\Lab\\lab10\\output.txt");
        FileInputStream fin = new FileInputStream(inputFile);
        byte [] arr = new byte[(int)inputFile.length()];
        System.out.println("The number of bytes read is :" + fin.read(arr));
        String inputMsg = new String(arr);
        int count = 0;
        for(int i = 0 ; i < inputMsg.length() ; i++){
            if(inputMsg.charAt(i) == 'a' || inputMsg.charAt(i) == 'e' ||
                    inputMsg.charAt(i) == 'i' || inputMsg.charAt(i) == 'o' || inputMsg.charAt(i) == 'u'){
                count ++ ;
            }
        }
        appendFile("\nThe number of vowels is :" + count);
    }
    public static void writeFile(String s) throws IOException{
        File outputFile = new File("D:\\Interview\\JavaProgramming\\src\\Java\\Lab\\lab10\\output.txt");
        FileOutputStream fout = new FileOutputStream(outputFile);
        fout.write(s.getBytes());
    }
    public static void main(String[] args){
        try {
            String s;
            System.out.print("Enter a sentence :");
            s = input.nextLine();
            System.out.println("Writing into the file ....");
            writeFile(s);
            readWriteFile();
        }catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}
