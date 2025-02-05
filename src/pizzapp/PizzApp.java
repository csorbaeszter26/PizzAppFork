package pizzapp;

import javax.swing.event.ChangeListener;

public class PizzApp extends javax.swing.JFrame {
    
    double meretSzorzo = 1; //32cm
    
    int alapAr = -1; //-1 jelentése: nincs ára a pizzának. ha egyik ifbe se lép be, akkor ezt írja ki, nehát valami nem oké!
    int extrak, db, extra1, extra2, extra3, dbSzorzo;
    double vegsoAr;
    

    public PizzApp() {
        initComponents();  /*ezután kell mert ez indítja a programot*/
        
        /*1. létrehoizunk egy változót, hogypl mi az egyik pizzának az alapára, itt a 2-es indexen lévő pizzának az alapára kellene*/
        alapAr = 1750;
        /*méret szorzót fel kell venni*/
        meretSzorzo = 1;
        
        db = 1;
        
        extra1 = 0;
        extra2 = 0;
        extra3 = 0;
        extrak = extra1 + extra2 + extra3;
        
        /*kéne nekünk egy végső ár is. Ha inttel írom, akkor nem lesz kompatibilis az előbbi double változóval. inteket nem tudjuk berakni doublebe. Ennek tehát doublenek kell lennie!!!*/
        /*itt most utána az történik hogy: */
        /*beszorzom db számmal:*/
        
        szamolasEsKiiras();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblValaszthato = new javax.swing.JLabel();
        cmdValaszthatoPizzak = new javax.swing.JComboBox<>();
        pnlMeret = new javax.swing.JPanel();
        rdbMeret25 = new javax.swing.JRadioButton();
        rdbMeret32 = new javax.swing.JRadioButton();
        pnlFizetendo = new javax.swing.JPanel();
        lblfizDb = new javax.swing.JLabel();
        lblFizFt = new javax.swing.JLabel();
        lblAr = new javax.swing.JLabel();
        numDb = new javax.swing.JSpinner();
        pnlExtrak = new javax.swing.JPanel();
        chbSajt = new javax.swing.JCheckBox();
        chbHagyma = new javax.swing.JCheckBox();
        chbAnanasz = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOsszesito = new javax.swing.JTextArea();
        btnRendel = new javax.swing.JButton();
        lblOsszesito = new javax.swing.JLabel();
        lblKep = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PizzApp");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        lblValaszthato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValaszthato.setText("Választható pizza:");

        cmdValaszthatoPizzak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Margherita", "Hawaii", "Songoku", "Diavola" }));
        cmdValaszthatoPizzak.setSelectedIndex(2);
        cmdValaszthatoPizzak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdValaszthatoPizzakActionPerformed(evt);
            }
        });

        pnlMeret.setBorder(javax.swing.BorderFactory.createTitledBorder("Méret"));

        buttonGroup1.add(rdbMeret25);
        rdbMeret25.setText("25 cm");
        rdbMeret25.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbMeret25ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rdbMeret32);
        rdbMeret32.setSelected(true);
        rdbMeret32.setText("32 cm");
        rdbMeret32.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbMeret32ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlMeretLayout = new javax.swing.GroupLayout(pnlMeret);
        pnlMeret.setLayout(pnlMeretLayout);
        pnlMeretLayout.setHorizontalGroup(
            pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeretLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbMeret25, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbMeret32, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMeretLayout.setVerticalGroup(
            pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeretLayout.createSequentialGroup()
                .addComponent(rdbMeret25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbMeret32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFizetendo.setBorder(javax.swing.BorderFactory.createTitledBorder("Fizetendő"));

        lblfizDb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblfizDb.setText("db:");

        lblFizFt.setText("Ft");

        lblAr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAr.setText("0");

        numDb.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        numDb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                numDbStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlFizetendoLayout = new javax.swing.GroupLayout(pnlFizetendo);
        pnlFizetendo.setLayout(pnlFizetendoLayout);
        pnlFizetendoLayout.setHorizontalGroup(
            pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFizetendoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFizetendoLayout.createSequentialGroup()
                        .addComponent(lblfizDb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numDb, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFizetendoLayout.createSequentialGroup()
                        .addComponent(lblAr, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFizFt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        pnlFizetendoLayout.setVerticalGroup(
            pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFizetendoLayout.createSequentialGroup()
                .addGroup(pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFizFt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFizetendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfizDb))
                .addContainerGap())
        );

        pnlExtrak.setBorder(javax.swing.BorderFactory.createTitledBorder("Extrák"));

        chbSajt.setText("sajt");
        chbSajt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbSajtActionPerformed(evt);
            }
        });

        chbHagyma.setText("hagyma");
        chbHagyma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbHagymaActionPerformed(evt);
            }
        });

        chbAnanasz.setText("ananász");
        chbAnanasz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAnanaszActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlExtrakLayout = new javax.swing.GroupLayout(pnlExtrak);
        pnlExtrak.setLayout(pnlExtrakLayout);
        pnlExtrakLayout.setHorizontalGroup(
            pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbSajt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbHagyma, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbAnanasz, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        pnlExtrakLayout.setVerticalGroup(
            pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrakLayout.createSequentialGroup()
                .addComponent(chbSajt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbHagyma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbAnanasz)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txaOsszesito.setColumns(20);
        txaOsszesito.setRows(5);
        txaOsszesito.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txaOsszesitoPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(txaOsszesito);

        btnRendel.setText("Megrendelem");
        btnRendel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRendelActionPerformed(evt);
            }
        });

        lblOsszesito.setText("Összestő:");

        lblKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/pizza.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValaszthato, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdValaszthatoPizzak, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMeret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRendel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFizetendo, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOsszesito, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlExtrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(lblKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRendel, cmdValaszthatoPizzak, pnlFizetendo, pnlMeret});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlExtrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(lblOsszesito))
                            .addComponent(lblKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblValaszthato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdValaszthatoPizzak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlMeret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlFizetendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRendel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(6, 6, 6))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdValaszthatoPizzakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdValaszthatoPizzakActionPerformed
        //bemásoltam az elejéből ide
        
        //2. combobox ha változik, változik az ár a labelben: ugy, hogy a combobox actionperfbe írom
        // megkéne határozni h milyen alapárú pizzát hozottt a user:
        //index alapján hozzá kell rendlni
        //getselected indexet kell lekérdezni, hogy lássuk mi van választtva
        
        int pizzaIndex = cmdValaszthatoPizzak.getSelectedIndex();
        
       
        //3.radiogombokkal ugyanez a variálás: item state changek
                
        //1. választott pizza alapára:
        /*1. létrehoizunk egy változót, hogy pl mi az egyik pizzának az alapára, itt a 2-es indexen lévő pizzának az alapára kellene*/
        
        
//-1 jelentése: nincs ára a pizzának. ha egyik ifbe se lép be, akkor ezt írja ki, nehát valami nem oké!
        //hozzáírom a 2.  feladatrész miatt:
        if(pizzaIndex == 0){
            alapAr = 1580;
        }else if (pizzaIndex == 1){
            alapAr = 1680;
        }else if (pizzaIndex == 2){
            alapAr = 1750;
        }else if (pizzaIndex == 3){
            alapAr = 2100;
        }
        
        /*méret szorzót fel kell venni*/
        
        
        db = 1;
        
        extra1 = 0;
        extra2 = 0;
        extra3 = 0;
        extrak = extra1 + extra2 + extra3;
        
        /*kéne nekünk egy végső ár is. Ha inttel írom, akkor nem lesz kompatibilis az előbbi double változóval. inteket nem tudjuk berakni doublebe. Ennek tehát doublenek kell lennie!!!*/
        /*itt most utána az történik hogy: */
        /*beszorzom db számmal:*/
        
        szamolasEsKiiras();

        
        
        
        
        
        
        
    }//GEN-LAST:event_cmdValaszthatoPizzakActionPerformed

    private void rdbMeret25ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbMeret25ItemStateChanged
        //meg kel szorozza a végső árnál az alapárat a mérettel tehát vagy 1el vagy 0,75-el
        //előbbi képletekből kéne kiindulni
        //kiszedtem előbbiből meretszorzot és ideraktam
        //kell h mind3 blokk lássa ezt a változót, olyan helyen kel deklarálni, ahol mindenki eléri
        //=> lilaszínűvé kell tenni, ollyan helyen maikívülvan a gombokon
        //doubleket ki kell előlük törölni h mind lila legyen!
        
        meretSzorzo = .75;
        
        
        szamolasEsKiiras();
    }//GEN-LAST:event_rdbMeret25ItemStateChanged

    private void szamolasEsKiiras() {
        //ezeknél is lilává kell tenni tehát ki kell tenni fenntre
        
        vegsoAr = alapAr * meretSzorzo + extrak;
        vegsoAr *= db;
        lblAr.setText(vegsoAr + "");
        
        //eza 3 sor tök sok helyen van és ugyanaz => metódusba kell rakni, hogy csak a metódust kelljen meghívni
    }

    private void rdbMeret32ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbMeret32ItemStateChanged
        meretSzorzo = 1;
        
        szamolasEsKiiras();
    }//GEN-LAST:event_rdbMeret32ItemStateChanged

    private void chbSajtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbSajtActionPerformed
        
        if (chbSajt.isSelected()){
            extra1 += 200;
                  
        }else{
            extra1 -= 200;
        }
        
        extrak = extra1 + extra2 + extra3;
        szamolasEsKiiras();
    }//GEN-LAST:event_chbSajtActionPerformed

    private void chbHagymaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbHagymaActionPerformed
        if (chbHagyma.isSelected()){
            extra2 += 200;
                  
        }else{
            extra2 -= 200;
        }
        
        extrak = extra1 + extra2 + extra3;
        szamolasEsKiiras();
    }//GEN-LAST:event_chbHagymaActionPerformed

    private void chbAnanaszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAnanaszActionPerformed
        if (chbAnanasz.isSelected()){
            extra3 += 200;
                  
        }else{
            extra3 -= 200;
        }
        
        extrak = extra1 + extra2 + extra3;
        szamolasEsKiiras();
    }//GEN-LAST:event_chbAnanaszActionPerformed

    private void numDbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_numDbStateChanged
        int dbIndex = numDb.getModel().getValue().hashCode();
        if (dbIndex == 1){
            db=1;
        }else if (dbIndex == 2){
            db=2;
        }else if (dbIndex == 3){
            db=3;
        }else if (dbIndex == 4){
            db=4;
        }else if (dbIndex == 5){
            db=5;
        }
    
        szamolasEsKiiras();
    }//GEN-LAST:event_numDbStateChanged

    private void txaOsszesitoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txaOsszesitoPropertyChange
        
        //int pizzaIndex = cmdValaszthatoPizzak.getSelectedIndex();
        
        //txaOsszesito.setText("A választott pizza: " + pizzaIndex + "(" + db + ")" );

        //int pizzaIndex = cmdValaszthatoPizzak.getSelectedIndex();
        //if (pizzaIndex == 0) {
            //txaOsszesito.setText("A választott pizza: ");

        //if (rdbMeret25.isSelected()){
            //String meret1 = null;
            //txaOsszesito.setText("A választott pizza: ");
            //meret1 = rdbMeret25.getText();
            
            //setText("25cm, ");
        //}
        
                
                
    }//GEN-LAST:event_txaOsszesitoPropertyChange

    private void btnRendelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRendelActionPerformed

        int pizzaIndex = cmdValaszthatoPizzak.getSelectedIndex();
        //int pizzaMeret = rdbMeret25.hashCode();

        int dbIndex = numDb.getModel().getValue().hashCode();

        txaOsszesito.setText("A választott pizza: " + pizzaIndex + "(" + db + "db)" + "\n" + "mérete: " + meretSzorzo + "\n feltétek:" + "\n" + extrak);
        

        //if (pizzaIndex == 1) {
            //replace("Hawaii");
        //}

    }//GEN-LAST:event_btnRendelActionPerformed

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
            java.util.logging.Logger.getLogger(PizzApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRendel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbAnanasz;
    private javax.swing.JCheckBox chbHagyma;
    private javax.swing.JCheckBox chbSajt;
    private javax.swing.JComboBox<String> cmdValaszthatoPizzak;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAr;
    private javax.swing.JLabel lblFizFt;
    private javax.swing.JLabel lblKep;
    private javax.swing.JLabel lblOsszesito;
    private javax.swing.JLabel lblValaszthato;
    private javax.swing.JLabel lblfizDb;
    private javax.swing.JSpinner numDb;
    private javax.swing.JPanel pnlExtrak;
    private javax.swing.JPanel pnlFizetendo;
    private javax.swing.JPanel pnlMeret;
    private javax.swing.JRadioButton rdbMeret25;
    private javax.swing.JRadioButton rdbMeret32;
    private javax.swing.JTextArea txaOsszesito;
    // End of variables declaration//GEN-END:variables
}
