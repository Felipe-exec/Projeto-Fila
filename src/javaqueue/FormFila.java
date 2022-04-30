package javaqueue;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class FormFila extends javax.swing.JFrame {
    Queue<Pessoa> filaNormal = 
            new ArrayDeque<Pessoa>();
    Queue<Pessoa> filaPrioridade = 
            new ArrayDeque<Pessoa>();
    private int atendimento = 3;
    
    public FormFila() {
        initComponents();
        carregaArquivo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProx = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtRG = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listFilaNormal = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        listFilaPreferencial = new javax.swing.JTextArea();
        btnAtender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Medicos CIA");
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaqueue/medico simbol.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 230, 230));

        lblProx.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        lblProx.setForeground(new java.awt.Color(255, 255, 255));
        lblProx.setText("Prox:");
        jPanel1.add(lblProx, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 540, 121));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 323));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar na Fila", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.setBackground(new java.awt.Color(0, 153, 153));
        txtNome.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 262, -1));

        txtRG.setBackground(new java.awt.Color(0, 153, 153));
        txtRG.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtRG.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        jPanel2.add(txtRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 157, 260, -1));

        txtIdade.setBackground(new java.awt.Color(0, 153, 153));
        txtIdade.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtIdade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Idade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        jPanel2.add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 247, 260, -1));

        btnAdd.setBackground(new java.awt.Color(0, 153, 153));
        btnAdd.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaqueue/add-user.png"))); // NOI18N
        btnAdd.setText("Adicionar Pessoa");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 231, 82));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 329, -1, 610));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controle de Filas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listFilaNormal.setEditable(false);
        listFilaNormal.setBackground(new java.awt.Color(0, 153, 153));
        listFilaNormal.setColumns(20);
        listFilaNormal.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        listFilaNormal.setRows(5);
        listFilaNormal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fila Normal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jScrollPane1.setViewportView(listFilaNormal);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 430, 450));

        listFilaPreferencial.setEditable(false);
        listFilaPreferencial.setBackground(new java.awt.Color(0, 153, 153));
        listFilaPreferencial.setColumns(20);
        listFilaPreferencial.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        listFilaPreferencial.setRows(5);
        listFilaPreferencial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fila Preferencial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jScrollPane2.setViewportView(listFilaPreferencial);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 470, 450));

        btnAtender.setBackground(new java.awt.Color(0, 153, 153));
        btnAtender.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAtender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaqueue/doctor-atend.png"))); // NOI18N
        btnAtender.setText("Atender");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });
        jPanel3.add(btnAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 173, 82));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 930, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    void addFila(Pessoa p){
       if(p.getIdade() < 60)
           filaNormal.add(p);
       else
           filaPrioridade.add(p);
    }
    private void carregaArquivo(){
        String csvFile = "dados.csv";
        String line = "";
        String[] leitura = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                Pessoa p = new Pessoa();
                leitura = line.split(",");
                System.out.println(leitura[0]+ ":" + leitura[1] + ":" + leitura[2] + "");
                p.setNome(leitura[0]);
                p.setRg(leitura[1]);
                int idade = (Integer.parseInt(leitura[2]));
                p.setIdade(idade);
                addFila(p); // separar
            }// fim percurso no arquivo
            mostra();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void mostra(){
        listFilaNormal.setText("");
        if(!filaNormal.isEmpty())
           for(Pessoa p:filaNormal)
               listFilaNormal.append(p+"\n");
        
        listFilaPreferencial.setText(""); //novo
        if(!filaPrioridade.isEmpty())
           for(Pessoa p:filaPrioridade)
               listFilaPreferencial.append(p+"\n");
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Pessoa p = new Pessoa();
        p.setNome(txtNome.getText());
        p.setRg(txtRG.getText());
        p.setIdade(Integer.parseInt(txtIdade.getText()));
        addFila(p);
        mostra();
        System.out.println(filaNormal);// console
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        Pessoa p = new Pessoa();
        if (filaPrioridade.isEmpty() && filaNormal.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Não há pessoas para atender.");
        }
        
        else
        {
            if (atendimento == 0 || filaPrioridade.isEmpty())
            {
                if(!filaNormal.isEmpty())
                {
                    p = filaNormal.remove();// dequeue
                    lblProx.setText("Próximo:"+p.getNome());
                    mostra();
                    atendimento = 3;
                }// fim if
                else
                {
                    JOptionPane.showMessageDialog(null, "Não há pessoas com menos de 60 anos para atender.");
                    atendimento = 3;
                }
            }
            else
            {
                p = filaPrioridade.remove();
                lblProx.setText("Próximo:" + p.getNome());
                mostra();
                if (!filaNormal.isEmpty())
                {
                    atendimento = atendimento - 1;
                }
                
            }
    }

    }//GEN-LAST:event_btnAtenderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAtender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblProx;
    private javax.swing.JTextArea listFilaNormal;
    private javax.swing.JTextArea listFilaPreferencial;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRG;
    // End of variables declaration//GEN-END:variables
}
