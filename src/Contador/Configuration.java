/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contador;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Saulo Victor
 */

public class Configuration {
    String Version;
    String File;
    
    public Configuration() throws IOException {
        this.Version = "VER [1.0]";
        this.File = "Config.ini";
        String Arquivo="Ken.txt";
        FileReader arq = new FileReader(File);
        BufferedReader lerArq = new BufferedReader(arq);
        String line;
        //String line=lerArq.readLine();
        //lerArq.reset();
        line=lerArq.readLine();
    }
    
}
