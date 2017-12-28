/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contador;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author User
 */
public class EscreverArquivo {
    private File file;

	public EscreverArquivo(File file) throws IOException {
		super();
		this.file = file;
                this.fr = new FileWriter(file,true);
	}
            FileWriter fr;
           
        public void escrever(String str){		
		
		try {
			fr.write(str);
		}
                catch (IOException e) {
			e.printStackTrace();
			
		}
	}
        public void fechar(){
            try {
                fr.close();
            }
            catch (IOException e) {
			e.printStackTrace();
			
		}
        }
}
