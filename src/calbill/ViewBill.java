package calbill;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class ViewBill extends javax.swing.JFrame {

    private BillWater currentBillWater;
    private CalBillForm currentCalBillForm;

    public ViewBill(BillWater currentBillWater2, CalBillForm currentCalBillForm) {
        this.currentBillWater = currentBillWater2;
        this.currentCalBillForm = currentCalBillForm;

        initComponents();
        setBillValue();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void setBillValue() {
        this.clientCodeValue.setText(currentBillWater.getClientCode());
        this.clientNameValue.setText(currentBillWater.getClienName());
        this.amountMonthValue.setText(Integer.toString(
                currentBillWater.getAmountMonth()));
        this.moneyToPayValue.setText(Integer.toString(
                currentBillWater.getMoneyToPay()));
        this.volumnValue.setText(Integer.toString(
                currentBillWater.getVolumn()));
    }

    public void returnCalbill() {
        this.currentCalBillForm.setVisible(true);
        this.dispose();
    }

    private boolean saveCurrentBill() {
        try {
            FileWriter myWriter = new FileWriter("billSaved.txt",true);
            myWriter.write("{"+currentBillWater.getClientCode());
            myWriter.write("," + currentBillWater.getClienName());
            myWriter.write("," + currentBillWater.getAmountMonth());
            myWriter.write("," + currentBillWater.getVolumn());
            myWriter.write("," + currentBillWater.getMoneyToPay() + "}");

            myWriter.close();
            return true;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientCodeLabel = new javax.swing.JLabel();
        volumnValue = new javax.swing.JLabel();
        clientNameLabel = new javax.swing.JLabel();
        volumnLabel = new javax.swing.JLabel();
        amountMonthValue = new javax.swing.JLabel();
        amountMonthLabel = new javax.swing.JLabel();
        clientCodeValue = new javax.swing.JLabel();
        clientNameValue = new javax.swing.JLabel();
        moneyToPayLabel = new javax.swing.JLabel();
        moneyToPayValue = new javax.swing.JLabel();
        exportBillButton = new javax.swing.JButton();
        saveBillButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        clientCodeLabel.setText("Client Code");

        volumnValue.setText("Volumn");

        clientNameLabel.setText("Client Name");

        volumnLabel.setText("Volumn");

        amountMonthValue.setText("amountMonth");

        amountMonthLabel.setText("Amount Month");

        clientCodeValue.setText("clientCode");

        clientNameValue.setText("clientName");

        moneyToPayLabel.setText("Money To Pay");

        moneyToPayValue.setText("moneyToPay");

        exportBillButton.setText("Export Bill");
        exportBillButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportBillButtonMouseClicked(evt);
            }
        });

        saveBillButton.setText("Save Bill");
        saveBillButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBillButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountMonthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volumnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneyToPayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountMonthValue, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientCodeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volumnValue, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneyToPayValue, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(exportBillButton)
                .addGap(57, 57, 57)
                .addComponent(saveBillButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientCodeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountMonthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountMonthValue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volumnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volumnValue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneyToPayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneyToPayValue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exportBillButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(saveBillButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        returnCalbill();
    }//GEN-LAST:event_formWindowClosing

    private void exportBillButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportBillButtonMouseClicked

    }//GEN-LAST:event_exportBillButtonMouseClicked

    private void saveBillButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBillButtonMouseClicked
        if (saveCurrentBill()) {
            JOptionPane.showMessageDialog(this, "Saved");
        } else {
            JOptionPane.showMessageDialog(this, "Cannot save, an error occur");
        }
    }//GEN-LAST:event_saveBillButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountMonthLabel;
    private javax.swing.JLabel amountMonthValue;
    private javax.swing.JLabel clientCodeLabel;
    private javax.swing.JLabel clientCodeValue;
    private javax.swing.JLabel clientNameLabel;
    private javax.swing.JLabel clientNameValue;
    private javax.swing.JButton exportBillButton;
    private javax.swing.JLabel moneyToPayLabel;
    private javax.swing.JLabel moneyToPayValue;
    private javax.swing.JButton saveBillButton;
    private javax.swing.JLabel volumnLabel;
    private javax.swing.JLabel volumnValue;
    // End of variables declaration//GEN-END:variables
}
