package chess.client;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Person implements Actor {
//    Scanner scanner = new Scanner(System.in);
    @Override
    public String sendCommand() throws IOException {
        return "";
    }



    public String sendCommand(Scanner scanner)  {
        /*
            玩家对战从命令行输入命令
         */

        String line = scanner.nextLine();
        if(line!=null)
            return line;
        else
            return "";
}



}