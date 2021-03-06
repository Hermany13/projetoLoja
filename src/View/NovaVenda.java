
import Controller.ProdutoControlle;
import Dao.FuncionariosDao;
import Dao.ProdutoDao;
import Dao.VendaDao;
import Model.VendasModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lib.Functions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela
 */
public class NovaVenda extends javax.swing.JFrame {
    
    public NovaVenda() throws SQLException {
        initComponents();
        jSpinnerQtdProd.setEnabled(false);
        jTextValorDesconto.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jBtnFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextValorDesconto = new javax.swing.JTextField();
        jSpinnerQtdProd = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResultProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jBtnPesquisarProdToVenda = new javax.swing.JButton();
        jBtnCalcular = new javax.swing.JButton();
        jBtnFecharVenda = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova Venda");
        setMaximumSize(new java.awt.Dimension(1087, 756));
        setMinimumSize(new java.awt.Dimension(1087, 756));
        setPreferredSize(new java.awt.Dimension(1087, 756));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1087, 756));
        jPanel1.setMinimumSize(new java.awt.Dimension(1087, 756));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N

        jBtnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fechar.png"))); // NOI18N
        jBtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFecharActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quantidade.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/codigo 2.png"))); // NOI18N

        jTextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigoActionPerformed(evt);
            }
        });
        jTextCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextCodigoKeyReleased(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/desconto.png"))); // NOI18N

        jTextValorDesconto.setForeground(new java.awt.Color(153, 153, 153));
        jTextValorDesconto.setText(" %");

        jSpinnerQtdProd.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerQtdProd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerQtdProdStateChanged(evt);
            }
        });

        jTableResultProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome Produto", "Cor", "Tamanho", "Preço", "Tipo", "Gênero", "Marca", "Qtd Estoque", "Qtd Mínima Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableResultProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableResultProdutos);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TOTAL RS.png"))); // NOI18N

        jLabelTotal.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelTotal.setText("0,00");

        jBtnPesquisarProdToVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar#1.png"))); // NOI18N
        jBtnPesquisarProdToVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarProdToVendaActionPerformed(evt);
            }
        });

        jBtnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calcular.png"))); // NOI18N
        jBtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalcularActionPerformed(evt);
            }
        });

        jBtnFecharVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/finalizar venda.png"))); // NOI18N
        jBtnFecharVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFecharVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBtnPesquisarProdToVenda))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBtnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)))
                                .addGap(14, 14, 14)
                                .addComponent(jBtnFecharVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinnerQtdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextValorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addComponent(jBtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabelTotal)
                        .addGap(77, 77, 77))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnFecharVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBtnPesquisarProdToVenda)
                                .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jSpinnerQtdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1))
                                            .addGap(35, 35, 35)
                                            .addComponent(jLabel5))
                                        .addComponent(jTextValorDesconto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBtnCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelTotal)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(66, 66, 66)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jBtnFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1137, 795));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFecharActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnFecharActionPerformed

    private void jTextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodigoActionPerformed

    private void jBtnPesquisarProdToVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarProdToVendaActionPerformed
        jSpinnerQtdProd.setValue(1);
        try {
            int codProdVenda = Integer.parseInt(jTextCodigo.getText());
            //int qtdEstq = (int) jSpinnerQtdProd.getValue();
            
            DefaultTableModel tabelaProdutos = (DefaultTableModel) jTableResultProdutos.getModel();
            tabelaProdutos.setNumRows(0);
            
            Functions fn = new Functions();
            
            ProdutoDao objDaoProd = new ProdutoDao();
            ResultSet rsProd = objDaoProd.listar(codProdVenda);
            
            while(rsProd.next()) {
                int cod = rsProd.getInt("ID_PRODUTO");
                String nome = fn.ucFirst(rsProd.getString("TXT_NOME_PROD"));
                String tamanho = fn.ucFirst(rsProd.getString("TXT_TAMANHO"));
                String cor = fn.ucFirst(rsProd.getString("TXT_COR"));
                int preco = rsProd.getInt("INT_PRECO");
                String tipo = fn.ucFirst(rsProd.getString("TXT_TIPO"));
                String genero = fn.ucFirst(rsProd.getString("TXT_GENERO"));
                String marca = fn.ucFirst(rsProd.getString("TXT_MARCA"));
                int qtdEstq = rsProd.getInt("QTD_ESTQ");
                int qtdEstqMin = rsProd.getInt("QTD_MIN_ESTQ");
                tabelaProdutos.addRow(new Object[]{cod,nome,tamanho,cor,preco,tipo,genero,marca,qtdEstq,qtdEstqMin});
                
                
                jLabelTotal.setText(NumberFormat.getCurrencyInstance().format(preco));
            }
            
            if(tabelaProdutos.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null,"Produto não encontrado!","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NovaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnPesquisarProdToVendaActionPerformed

    private void jSpinnerQtdProdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerQtdProdStateChanged
        DefaultTableModel tabelaProdutos = (DefaultTableModel) jTableResultProdutos.getModel();
        int valorProd = (int) tabelaProdutos.getValueAt(0, 4);
        
        int qtdEstq = (int) tabelaProdutos.getValueAt(0, 8);
        
        ProdutoControlle ctrl = new ProdutoControlle();
        
        String spinner = "";
        int myInt = (int) jSpinnerQtdProd.getValue();

        if(myInt > qtdEstq) {
            JOptionPane.showMessageDialog(null,"A quantidade do produto excede o total em estoque!","Atenção", JOptionPane.WARNING_MESSAGE);
            jSpinnerQtdProd.setValue(qtdEstq);
        }
        
        int total = (myInt * valorProd);
        jLabelTotal.setText(NumberFormat.getCurrencyInstance().format(total));
    }//GEN-LAST:event_jSpinnerQtdProdStateChanged

    private void jBtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalcularActionPerformed
        DefaultTableModel tabelaProdutos = (DefaultTableModel) jTableResultProdutos.getModel();
        int valorProd = (int) tabelaProdutos.getValueAt(0, 4);
        int codProd = (int) tabelaProdutos.getValueAt(0, 0);
        
        ProdutoControlle ctrl = new ProdutoControlle();
        
        int qtdProd = (int) jSpinnerQtdProd.getValue();
        int total = (qtdProd * valorProd);
        int valorDesconto = Integer.parseInt(jTextValorDesconto.getText());
        
//        if(valorDesconto == null) {
//            int res = ctrl.geraDesconto(total, valorDesconto);
//            jLabelTotal.setText(NumberFormat.getCurrencyInstance().format(res));
//        } else {
//            jLabelTotal.setText(NumberFormat.getCurrencyInstance().format(total));
//        }
    }//GEN-LAST:event_jBtnCalcularActionPerformed

    private void jBtnFecharVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFecharVendaActionPerformed
        DefaultTableModel tabelaProdutos = (DefaultTableModel) jTableResultProdutos.getModel();

        int qtdInEstq = (int) tabelaProdutos.getValueAt(0, 8);
        int codProd = (int) tabelaProdutos.getValueAt(0, 0);
        int qtdProd = (int) jSpinnerQtdProd.getValue();
        int valorDesconto = Integer.parseInt(jTextValorDesconto.getText());
        String total = jLabelTotal.getText();

        total = total.substring(3);

        if (total.length() > 6) {
            total = total.replaceAll(",", "");
            total = total.substring(0, total.length() - 3);
        } else {
            total = total.replaceAll(",", ".");
        }

        System.out.println("Valor: " + total);
        double totalVenda = Double.parseDouble(total);
//        formatar.format(totalVenda);
        VendasModel objModel = new VendasModel();

        FuncionariosDao objFunc = new FuncionariosDao();
        String nomeVendedor = objFunc.nomeUsuario;

        objModel.setIdProd(codProd);
        objModel.setTxtVendedor(nomeVendedor);
        objModel.setQtdProd(qtdProd);
        objModel.setVlrDesc(valorDesconto);
        objModel.setTotal(totalVenda);

        VendaDao objDao = new VendaDao();
        ProdutoDao objProdDao = new ProdutoDao();
        try {
            objDao.salvar(objModel);
            objProdDao.atualizaEstq("VENDA", qtdInEstq, qtdProd, codProd, 0);
        } catch (SQLException ex) {
            Logger.getLogger(NovaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    

    }//GEN-LAST:event_jBtnFecharVendaActionPerformed

    private void jTextCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCodigoKeyReleased
      jSpinnerQtdProd.setValue(1);
        try {
            int codProdVenda = Integer.parseInt(jTextCodigo.getText());
            //int qtdEstq = (int) jSpinnerQtdProd.getValue();
            
            DefaultTableModel tabelaProdutos = (DefaultTableModel) jTableResultProdutos.getModel();
            tabelaProdutos.setNumRows(0);
            
            Functions fn = new Functions();
            
            ProdutoDao objDaoProd = new ProdutoDao();
            ResultSet rsProd = objDaoProd.listar(codProdVenda);
            
            while(rsProd.next()) {
                int cod = rsProd.getInt("ID_PRODUTO");
                String nome = fn.ucFirst(rsProd.getString("TXT_NOME_PROD"));
                String tamanho = fn.ucFirst(rsProd.getString("TXT_TAMANHO"));
                String cor = fn.ucFirst(rsProd.getString("TXT_COR"));
                int preco = rsProd.getInt("INT_PRECO");
                String tipo = fn.ucFirst(rsProd.getString("TXT_TIPO"));
                String genero = fn.ucFirst(rsProd.getString("TXT_GENERO"));
                String marca = fn.ucFirst(rsProd.getString("TXT_MARCA"));
                int qtdEstq = rsProd.getInt("QTD_ESTQ");
                int qtdEstqMin = rsProd.getInt("QTD_MIN_ESTQ");
                tabelaProdutos.addRow(new Object[]{cod,nome,tamanho,cor,preco,tipo,genero,marca,qtdEstq,qtdEstqMin});
                
                
                jLabelTotal.setText(NumberFormat.getCurrencyInstance().format(preco));
            }
            
            if(tabelaProdutos.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null,"Produto não encontrado!","Atenção", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NovaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        String aux = jTextCodigo.getText();
        if(aux.equals("")){
            jSpinnerQtdProd.setEnabled(false);
            jTextValorDesconto.setEnabled(false);
        }else{
            jSpinnerQtdProd.setEnabled(true);
            jTextValorDesconto.setEnabled(true);
        }
    }//GEN-LAST:event_jTextCodigoKeyReleased
    

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCalcular;
    private javax.swing.JButton jBtnFechar;
    private javax.swing.JButton jBtnFecharVenda;
    private javax.swing.JButton jBtnPesquisarProdToVenda;
    private javax.swing.JButton jButton4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerQtdProd;
    private javax.swing.JTable jTableResultProdutos;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextValorDesconto;
    // End of variables declaration//GEN-END:variables
}
