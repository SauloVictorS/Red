/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Escrito por: Saulo Victor
 * saulovictor@hotmail.com.br
 */
package Contador;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import com.itextpdf.text.Image;
import java.awt.Toolkit;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.Date;


/**
 *
 * @author User
 */

public class Principal extends javax.swing.JFrame {
    /**
     * Creates new form Principal
     */
    BigDecimal ValorTotal= new BigDecimal(0);
    public Principal() {
        URL url = this.getClass().getResource("Red Ico 2.png");
        java.awt.Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
    }
     
    //getContentPane().setBackground(Color.BLUE);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RS = new javax.swing.JLabel();
        Insert = new javax.swing.JButton();
        value1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        InserirValor = new javax.swing.JLabel();
        Remove = new javax.swing.JButton();
        GerarB = new javax.swing.JButton();
        M5 = new javax.swing.JLabel();
        TotalLabel = new javax.swing.JLabel();
        RedIco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Red");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(345, 510));
        setMinimumSize(new java.awt.Dimension(345, 510));
        setResizable(false);
        getContentPane().setLayout(null);

        RS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RS.setText("R$");
        getContentPane().add(RS);
        RS.setBounds(20, 40, 30, 30);

        Insert.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Insert.setText("Inserir");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        getContentPane().add(Insert);
        Insert.setBounds(240, 40, 80, 30);

        value1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        value1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                value1KeyPressed(evt);
            }
        });
        getContentPane().add(value1);
        value1.setBounds(50, 40, 180, 30);

        Table1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Table1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Valores Inseridos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table1.setGridColor(new java.awt.Color(255, 102, 0));
        Table1.setSelectionBackground(new java.awt.Color(34, 72, 130));
        Table1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Table1InputMethodTextChanged(evt);
            }
        });
        Table1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Table1PropertyChange(evt);
            }
        });
        Table1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Table1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);
        if (Table1.getColumnModel().getColumnCount() > 0) {
            Table1.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 300, 220);

        InserirValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        InserirValor.setText("Insira um valor:");
        getContentPane().add(InserirValor);
        InserirValor.setBounds(20, 20, 210, 15);

        Remove.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Remove.setText("Remover");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });
        getContentPane().add(Remove);
        Remove.setBounds(20, 340, 90, 30);

        GerarB.setText("Gerar");
        GerarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarBActionPerformed(evt);
            }
        });
        getContentPane().add(GerarB);
        GerarB.setBounds(250, 420, 70, 30);

        M5.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 12)); // NOI18N
        M5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        M5.setText("R$");
        getContentPane().add(M5);
        M5.setBounds(190, 340, 70, 20);

        TotalLabel.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 12)); // NOI18N
        TotalLabel.setText("0.00");
        getContentPane().add(TotalLabel);
        TotalLabel.setBounds(260, 340, 60, 20);

        RedIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contador/Red BW.png"))); // NOI18N
        RedIco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RedIco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RedIcoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RedIcoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RedIcoMouseExited(evt);
            }
        });
        getContentPane().add(RedIco);
        RedIco.setBounds(10, 440, 70, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        // Remove o numero selecionado da lista
        try{
        ((DefaultTableModel) Table1.getModel()).removeRow(Table1.getSelectedRow());
        atualizarTotal();
        }
        catch(ArrayIndexOutOfBoundsException e){
            ErroTabela erro = new ErroTabela();
            erro = new ErroTabela();
            erro.setLocationRelativeTo(null);
            erro.setVisible(true);
            erro.setResizable(false);
        }
        
    }//GEN-LAST:event_RemoveActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        inserir();
    }//GEN-LAST:event_InsertActionPerformed

    private void value1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_value1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            inserir();
        }
    }//GEN-LAST:event_value1KeyPressed
    
    private void atualizarTotal(){
        int rows = Table1.getRowCount(); //pega quantas linhas tem a tabela
        ValorTotal = new BigDecimal(0);
        for(int i =0;i<rows;i++){   //percorre toda a tabela linha por linha      
            Object objValue = Table1.getValueAt(i,0); //Lê o valor da linha i, da coluna 0
            BigDecimal value =  (BigDecimal) objValue;//Converte o valor em um BigDecimal
            ValorTotal = ValorTotal.add(value); //Soma o valor total
            
        }
        String ValorTotalP;
        DecimalFormat decimal = new DecimalFormat("0.00");
        ValorTotalP = decimal.format(ValorTotal);
        TotalLabel.setText(ValorTotalP);
        
        
        int valorM = calculaMoedas(ValorTotal);
        
        if (valorM % 5 !=0) {
                SumError erro = new SumError();
                erro = new SumError();
                erro.setLocationRelativeTo(null);
                erro.setVisible(true);
                erro.setResizable(false);
            }
        
    }
    private int calculaNotas(BigDecimal Valor){
        int valorN = Valor.intValue(); //isola apenas o valor das notas
        return valorN;
    }
    private int calculaMoedas(BigDecimal Valor){
        BigDecimal V = new BigDecimal(100); //variavel em BigDecimal que contém o valor 100 que será usado nas multiplicações abaixo
        BigDecimal Total = Valor.multiply(V); //variavel em BigDecimal que armazena o valor total multiplicado por 100
        BigDecimal N100 = new BigDecimal(calculaNotas(Valor)); //variavel que armazena apenas o valor das notas sem as moedas
        N100=N100.multiply(V); //multiplica o valor das notas por 100
        int valorM= Total.intValue()-N100.intValue(); //subtrai o valor total pelo valor das notas, ambos multiplicados por 100. O resultado é o valor das moedas 
        return valorM;    
    }
    private void inserir() {
        Log log = new Log();
       String valorStr = null;
        try {
            valorStr = value1.getText().trim();
            String valor = String.valueOf(valorStr.replace(',', '.'));
            BigDecimal Valor = new BigDecimal(valor);
            int valorM = calculaMoedas(Valor);
            if (valorM % 5 !=0) {
                SumError erro = new SumError();
                erro = new SumError();
                erro.setLocationRelativeTo(null);
                erro.setVisible(true);
                erro.setResizable(false);
            } else {
                value1.setText("");
                ValorTotal = ValorTotal.add(Valor);
                DefaultTableModel val = (DefaultTableModel) Table1.getModel();
                val.addRow(new Object[]{Valor});
                atualizarTotal();
            }

        } catch (NumberFormatException e) {
            log.numberException(valorStr);
            NumError erro = new NumError();
            erro = new NumError();
            erro.setLocationRelativeTo(null);
            erro.setVisible(true);
            erro.setResizable(false);

        }
        Date hora = new Date();
        hora.getTime();
    }
    
    private void GerarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarBActionPerformed
        //String folder = EscolherPasta.escolheArquivo();
        //Moedas valor;
        Log log = new Log();
        BigDecimal total = new BigDecimal(0); //Esta variavel armazena o valor total da soma dos valores inseridos.
        BigDecimal confereSoma= new BigDecimal(0); //Esta variavel armazena a multiplicação das notas totais.
        int valorN; //Armazena o valor das notas. Por exemplo: Valor inserido: 50,55 valor armazenado: 50
        int valorM; //Armazena o valor das moedas. Por exemplo: Valor inserido: 50,55 valor armazenado: 55
        
        int N100 = 0;
        int N50 = 0;
        int N20 = 0;
        int N10 = 0;
        int N5 = 0;
        int N2 = 0;
        int M1 = 0;
        int M50 = 0;
        int M25 = 0;
        int M10 = 0;
        int M5 = 0;
        int M01 = 0;
        
        int rows = Table1.getRowCount(); //pega quantas linhas tem a tabela
        log.LogTable1(Table1);
        for(int i =0;i<rows;i++){   //percorre toda a tabela linha por linha      
            Object objValue = Table1.getValueAt(i,0); //Lê o valor da linha i, da coluna 0
            //double Value = ((Double)objValue); //Converte o valor em um double
            
            BigDecimal Value =  (BigDecimal) objValue;//Converte o valor em um BigDecimal
           
            
            total=total.add(Value);//Soma o valor total
            valorN = calculaNotas(Value); //isola apenas o valor das notas
            valorM= calculaMoedas(Value); // Isola apenas o valor das moedas
            {
                N100 = N100 + (valorN/100); //soma o valor presente na variavel com o valorN dividido por 100. Ou seja: Se você recebe 150, a divisão por 100 será igual a 1.
                valorN=(valorN%100); //iguala a variavel valorN ao resto da divisão por 100. Ou seja se a variavel vale 150 o resto é 50
                
                N50 = N50 + (valorN/50);
                valorN=(valorN%50);
            
                N20 = N20 + (valorN/20);
                valorN=(valorN%20);
        
                N10 = N10 + (valorN/10);
                valorN=(valorN%10);
        
                N5 = N5 +(valorN/5);
                valorN=(valorN%5);
                
                N2 = N2 +(valorN/2);
                valorN=(valorN%2);
        
                M1 = M1 +(valorN/1);
                valorN=(valorN%1);

                M50 = M50 +(valorM/50);
                valorM=valorM%50;

                M25 = M25 +(valorM/25);
                valorM=valorM%25;

                M10 = M10 +(valorM/10);
                valorM=valorM%10;

                M5 = M5 + (valorM/5);
                valorM=valorM%5;
        
            }
        }
        /* As contas abaixo sevem para conferir se o valor das notas armazenados é igual a soma dos valores inseridos.
         * Exemplo: Inserir 150.00
         * valor total: 150
         * Soma das notas: 1*100 + 1*50
        */
        confereSoma=confereSoma.add(new BigDecimal(N100*100.0)); //Multiplica o valor das notas por 100. Por exemplo: Se você tem 3 notas de 100, ele multiplica 3x100
        confereSoma=confereSoma.add(new BigDecimal(N50*50.0));
        confereSoma=confereSoma.add(new BigDecimal(N20*20.0));
        confereSoma=confereSoma.add(new BigDecimal(N10*10.0));
        confereSoma=confereSoma.add(new BigDecimal(N5*5.0));
        confereSoma=confereSoma.add(new BigDecimal(N2*2.0));
        confereSoma=confereSoma.add(new BigDecimal(M1*1.0));
        confereSoma=confereSoma.add(new BigDecimal((M50*50.0)/100.0));
        confereSoma=confereSoma.add(new BigDecimal((M25*25.0)/100.0));
        confereSoma=confereSoma.add(new BigDecimal((M10*10.0)/100.0));
        confereSoma=confereSoma.add(new BigDecimal((M5*5.0)/100.0)); 
        String conferesoma = confereSoma.toString();
        String totalP; //Armazena o novo valor total que terá duas casas decimais.
        DecimalFormat decimal = new DecimalFormat( "0.00" ); //Permite converter em string com duas casas decimais.
        totalP=decimal.format(total);
        
        //Se a diferença entre a soma dos valores iseridos e a soma das notas for maior que 0.01 o programa não prossegue.
        if(total.compareTo(confereSoma.setScale(2,RoundingMode.UP)) > 1 || total.compareTo(confereSoma.setScale(2,RoundingMode.UP)) < -1){
            log.LogMoedas(N100, N50, N20, N10, N5, N2, M1, M50, M25, M10, M5, totalP, conferesoma, "Dados conferidos e OK.",total.compareTo(confereSoma.setScale(2,RoundingMode.UP)));
            SumError erro = new SumError();
            erro = new SumError();
            erro.setLocationRelativeTo(null);
            erro.setVisible(true);
            erro.setResizable(false);
            
        }
        else {
           
            log.LogMoedas(N100, N50, N20, N10, N5, N2, M1, M50, M25, M10, M5, totalP, conferesoma, "Dados conferidos e OK.",total.compareTo(confereSoma.setScale(2,RoundingMode.UP)));
            
            try {
                gerarPdf(N100, N50, N20, N10, N5, N2, M1, M50, M25, M10, M5, totalP);

                /*
                Exibir exb = new Exibir();
                exb.setVisible(true);
                exb.setLocationRelativeTo(null);
                exb.exportaValores(N100, N50, N20, N10, N5, N2, M1, M50, M25, M10, M5, totalP
                */

                Runtime.getRuntime().exec("cmd.exe /c start out.pdf");

            } catch (FileNotFoundException ex) {
                log.pdfException();
                FileError erro;
                erro = new FileError();
                erro.setLocationRelativeTo(null);
                erro.setVisible(true);
                erro.setResizable(false);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_GerarBActionPerformed
Sobre sb = new Sobre();
    private void Table1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Table1KeyPressed
        // TODO add your handling code here:  
    }//GEN-LAST:event_Table1KeyPressed

    private void Table1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Table1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Table1InputMethodTextChanged

    
    private void Table1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Table1PropertyChange
        // TODO add your handling code here:
        
        atualizarTotal();
    }//GEN-LAST:event_Table1PropertyChange

    private void RedIcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RedIcoMouseClicked
        // TODO add your handling code here:
        Sobre sobre;
        sobre = new Sobre();
        sobre.setLocationRelativeTo(null);
        sobre.setVisible(true);
        sobre.setResizable(false);
    }//GEN-LAST:event_RedIcoMouseClicked

    private void RedIcoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RedIcoMouseEntered
        // TODO add your handling code here:
        RedIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("Red.png")));
    }//GEN-LAST:event_RedIcoMouseEntered

    private void RedIcoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RedIcoMouseExited
        // TODO add your handling code here:
        RedIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("Red BW.png")));
    }//GEN-LAST:event_RedIcoMouseExited
    //gerar pdf usando iText 5
    private void gerarPdf(int N100,int N50,int N20,int N10, int N5, int N2, int M1, int M50, int M25, int M10, int M5,String total) throws FileNotFoundException, DocumentException, IOException {
        Document doc = null;
        OutputStream os = null;
        try {
            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);

            //cria a stream de saída
            os = new FileOutputStream(new File("out.pdf"));

            //associa a stream de saída ao os
            PdfWriter.getInstance(doc, os);

            //abre o documento
            doc.open();

            //adiciona o texto ao PDF
            Font title = new Font(FontFamily.HELVETICA, 20, Font.BOLD); //define configurações de texto e fonte
            Font t1 = new Font(FontFamily.HELVETICA, 14);
            Font t2 = new Font(FontFamily.HELVETICA, 16,Font.BOLD);
            Paragraph p1 = new Paragraph("Relatório para o Banco",title); //escreve no pdf com as configurações de texto especificadas
            p1.setSpacingAfter(20);
            doc.add(p1);
            Paragraph p2 = new Paragraph("NOTAS",t2);
            doc.add(p2);
            if (N100 > 0) {
                doc.add(new Paragraph(String.format("R$100,00 -   %s", N100), t1));
            }
            if (N50 > 0) {
                doc.add(new Paragraph(String.format("R$50,00   -   %s", N50), t1));
            }
            if (N20 > 0) {
                doc.add(new Paragraph(String.format("R$20,00   -   %s", N20), t1));
            }
            if (N10 > 0) {
                doc.add(new Paragraph(String.format("R$10,00   -   %s", N10), t1));
            }
            if (N5 > 0) {
                doc.add(new Paragraph(String.format("R$5,00     -   %s", N5), t1));
            }
            if (N2 > 0) {
                doc.add(new Paragraph(String.format("R$2,00     -   %s", N2), t1));
            }
            
            Paragraph p3 = new Paragraph("MOEDAS",t2);
            p3.setSpacingBefore(20);
            doc.add(p3);
            
            if (M1 > 0) {
                doc.add(new Paragraph(String.format("R$1,00  -  %s", M1), t1));
            }
            if (M50 > 0) {
                doc.add(new Paragraph(String.format("R$0,50  -  %s", M50), t1));
            }
            if (M25 > 0) {
                doc.add(new Paragraph(String.format("R$0,25  -  %s", M25), t1));
            }
            if (M10 > 0) {
                doc.add(new Paragraph(String.format("R$0,10  -  %s", M10), t1));
            }
            if (M5 > 0) {
                doc.add(new Paragraph(String.format("R$0,05  -  %s", M5), t1));
            }
            
            Paragraph p4 = new Paragraph(String.format("TOTAL: R$%s", total), t2);
            p4.setSpacingBefore(20);
            doc.add(p4);
            
            Image img = Image.getInstance("Logo.png");
            //img.setAlignment(Element.ALIGN_RIGHT);
            img.setAbsolutePosition(350f, 50f);
            
            doc.add(img);
        } finally {
            if (doc != null) {
                //fechamento do documento
                doc.close();
            }
            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }
        }

    }
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    public static void main(String args[]) throws IOException  {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        /* Create and display the form */
        Log log = new Log();
        log.iniciar();
        java.awt.EventQueue.invokeLater(() -> {
            try{
            new Principal().setVisible(true);
            }
            catch(NumberFormatException e){
                NumError erro = new NumError();
                erro = new NumError();
                erro.setLocationRelativeTo(null);
                erro.setVisible(true);
                erro.setResizable(false);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GerarB;
    private javax.swing.JLabel InserirValor;
    private javax.swing.JButton Insert;
    private javax.swing.JLabel M5;
    private javax.swing.JLabel RS;
    private javax.swing.JLabel RedIco;
    private javax.swing.JButton Remove;
    private javax.swing.JTable Table1;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField value1;
    // End of variables declaration//GEN-END:variables

}
