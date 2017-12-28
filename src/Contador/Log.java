/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contador;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Saulo Victor
 */
public class Log {

    String Arquivo;
    String Ver;

    Log() {
        Arquivo = "Contador.log";
        Ver = "1.1";

    }

    public static void escrever() {
        File file = new File("Contador.log");
        EscreverArquivo e = null;
        try {
            e = new EscreverArquivo(file);
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }

        e.escrever("Teste");
        e.escrever("Teste2");
        e.fechar();
    }

    private String data() {
        Date Data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String data = formatador.format(Data);
        return data;

    }

    private String hora() {
        SimpleDateFormat horaformato = new SimpleDateFormat("HH:mm:ss");
        Date Hora = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
        String hora = horaformato.format(Hora);
        return hora;
    }

    public void iniciar() {
        File file = new File(Arquivo);
        EscreverArquivo e = null;
        try {
            e = new EscreverArquivo(file);
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
        e.escrever("\r\n" + "[" + data() + " - " + hora() + "] " + "|Moedas ++| |Versão: " + Ver + "| Iniciado" + "\r\n");
        e.fechar();
    }

    public void LogTable1(JTable Table1) {
        File file = new File(Arquivo);
        EscreverArquivo e = null;
        try {
            e = new EscreverArquivo(file);
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int rows = Table1.getRowCount();
        e.escrever("[" + data() + " - " + hora() + "] Valores inseridos a serem calculados: ");
        for (int i = 0; i < rows; i++) {   //percorre toda a tabela linha por linha      
            Object objValue = Table1.getValueAt(i, 0); //Lê o valor da linha i, da coluna 0
            
            BigDecimal Value =  (BigDecimal) objValue;
            String valor = Value.toString();
            e.escrever(valor + ", ");
        }
        e.escrever("\r\n");
        e.fechar();
    }
    public void LogMoedas(int N100,int N50,int N20,int N10, int N5, int N2, int M1, int M50, int M25, int M10, int M5,String total, String ConfereSoma, String local, int compara){
        File file = new File(Arquivo);
        EscreverArquivo e = null;
        try {
            e = new EscreverArquivo(file);
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
        e.escrever("[" + data() + " - " + hora() + "] "+ "TOTAL: R$" + total + " |Total da soma das moedas: R$" + ConfereSoma + " |Notas: R$100,00:" + N100 + "  R$50,00:" + N50 + "  R$20,00:" + N20 +"  R$10,00:" + N10 +"  R$5,00:" + N5 + "  R$2,00:" + N2 + " | Moedas: R$1,00:"+ M1 + "  R$0,50:" + M50 +"  R$0,25:" + M25 + "  R$0,10:" + M10 + "  R$0,05:" + M5 + " |INFO: " + local +" |Total CompareTo confereSoma: "+ compara +"\r\n");
    e.fechar();
    }
    public void pdfException(){
        File file = new File(Arquivo);
        EscreverArquivo e = null;
        try {
            e = new EscreverArquivo(file);
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
        e.escrever("[" + data() + " - " + hora() + "] " + "FileNotFoundException | Falha ao gerar PDF. O arquivo pode estar sendo usado por outro programa!  " + "\r\n");
    e.fechar();    
    }
    public void numberException(String Valor){
        File file = new File(Arquivo);
        EscreverArquivo e = null;
        try {
            e = new EscreverArquivo(file);
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
        e.escrever("[" + data() + " - " + hora() + "] " + "NumberFormatException | O valor informado não se trata de um número. VALOR: "+ Valor + "\r\n");
       e.fechar(); 
    }
    
    

}
