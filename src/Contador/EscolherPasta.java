/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contador;

import javax.swing.JFileChooser;

/**
 *
 * @author User
 */
public class EscolherPasta {
  
    public static String escolheArquivo(){ 
         String arquivoWave;    
         JFileChooser arquivo = new JFileChooser();    
         arquivo.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);  
         if(arquivo.showOpenDialog(arquivo) == JFileChooser.APPROVE_OPTION){ 
             arquivoWave = arquivo.getSelectedFile().getPath(); 
         }        
         else{ 
             arquivoWave = ""; 
         } 
         return arquivoWave; 
    } 
}

