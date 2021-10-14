package calbill;

public class CalBillForm extends javax.swing.JFrame {

    private BillWater currentBill;

    public CalBillForm() {
        initComponents();
    }

    public void setBill() {
        String currentClientCode = clientCode.getText();
        String currentClientName = clientName.getText();
        int currentAmountMonth = Integer.parseInt(amountMonth.getText());
        int currentVolumn = Integer.parseInt(volumn.getText());

        currentBill = new BillWater(
                currentClientCode,
                currentClientName,
                currentAmountMonth,
                currentVolumn
        );
    }

    public void startCal() {
        setBill();
    }

    public void printBill() {
        ViewBill currentViewBill = new ViewBill(currentBill, this);
        currentViewBill.setVisible(true);
        this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientCode = new javax.swing.JTextField();
        amountMonth = new javax.swing.JTextField();
        clientName = new javax.swing.JTextField();
        volumn = new javax.swing.JTextField();
        startCal = new javax.swing.JButton();
        printBill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clientCode.setText("Client code");

        amountMonth.setText("Amount Month");

        clientName.setText("Client Name");

        volumn.setText("Volumn (m^3)");

        startCal.setText("Start cal");
        startCal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startCalMouseClicked(evt);
            }
        });

        printBill.setText("printBill");
        printBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printBillMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amountMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(clientCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volumn, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(clientName))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(printBill)
                .addGap(57, 57, 57)
                .addComponent(startCal)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientCode, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volumn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printBill, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startCal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startCalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startCalMouseClicked
        startCal();
    }//GEN-LAST:event_startCalMouseClicked

    private void printBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printBillMouseClicked
        printBill();
    }//GEN-LAST:event_printBillMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountMonth;
    private javax.swing.JTextField clientCode;
    private javax.swing.JTextField clientName;
    private javax.swing.JButton printBill;
    private javax.swing.JButton startCal;
    private javax.swing.JTextField volumn;
    // End of variables declaration//GEN-END:variables
}
