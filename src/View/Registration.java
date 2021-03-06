package View;


import Dao.GenericDao;
import Domain.Passenger;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nelly
 */
public class Registration extends javax.swing.JFrame {
       DefaultTableModel model;
       
    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
       // model =(DefaultTableModel)TravelersTable.getModel();
    
    view();
    }

         public void view(){
    
  List<Passenger>list=  new GenericDao<Passenger>().all("from Passenger");
  String[]title={"ID","FIRST NAME","LAST NAME","SEX","AGE","TICKET FAIR","DESTINATION","PHONE NO","EMAIL"};
  Object[][]dt = new Object[list.size()][title.length];
          int i=0;
          for(Passenger tr:list){
          dt[i][0]= tr.getId();
          dt[i][1]=tr.getFname();
          dt[i][2]=tr.getLname();
          dt[i][3]=tr.getSex();
          dt[i][4]=tr.getAge();
          dt[i][5]= tr.getTfair();
          dt[i][6]= tr.getDestination();
          dt[i][7]=tr.getPhoneNo();
          dt[i][8]=tr.getEmail();
          
          i++;
          
          
          }
          TravelersTable.setModel(new DefaultTableModel(dt,title));
     }
    
     public void clear()
     {
            
            txtFirstName.setText("");
            txtLastName.setText("");
            txtAge.setText("");
            txtTicketFair.setText("");
            txtDestination.setText("");
            txtPhonenumber.setText("");
            txtEmailAddress.setText("");
            cbMale.setSelected(false);
            cbFemale.setSelected(false);
            txtId.setText("");
                    
     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlabel1 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        cbMale = new javax.swing.JCheckBox();
        cbFemale = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPhonenumber = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        btnregister = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TravelersTable = new javax.swing.JTable();
        jlabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jlabel4 = new javax.swing.JLabel();
        txtDestination = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jlabel5 = new javax.swing.JLabel();
        txtTicketFair = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlabel1.setText("First Name");

        jlabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlabel2.setText("Ticket Fair");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sex");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        cbMale.setText("Male");
        cbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaleActionPerformed(evt);
            }
        });

        cbFemale.setText("Female");
        cbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFemaleActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Phonenumber");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Email Address");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhonenumber, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(txtEmailAddress))
                .addGap(98, 98, 98))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        btnregister.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });

        TravelersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Sex", "Age", "Ticket Fair", "Destination", "Phonenumber", "Email Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TravelersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TravelersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TravelersTable);

        jlabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlabel3.setText("Last Name");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        jlabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlabel4.setText("Destination");

        txtDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinationActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jlabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlabel5.setText("Age");

        txtTicketFair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTicketFairActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(69, 69, 69)
                                .addComponent(cbMale)
                                .addGap(18, 18, 18)
                                .addComponent(cbFemale))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTicketFair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnregister)
                        .addGap(367, 367, 367)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(btnupdate)
                .addGap(18, 18, 18)
                .addComponent(btndelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlabel1)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbMale)
                                .addComponent(cbFemale))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTicketFair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnregister))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate)
                    .addComponent(btndelete))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void cbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMaleActionPerformed

    private void cbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFemaleActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        // TODO add your handling code here:

       // model.insertRow(model.getRowCount(),new Object[]{txtFirstName.getText(),txtLastName.getText(),txtAge.getText(),cbMale.isSelected()?"Male":"Female",txtTicketFair.getText(),txtDestination.getText(),txtPhonenumber.getText(),txtEmailAddress.getText()});

       
       GenericDao dao = new GenericDao();
       Passenger tr = new Passenger();
       tr.setId(Integer.parseInt(txtId.getText()));
       tr.setFname(txtFirstName.getText());
       tr.setLname(txtLastName.getText());
       tr.setDestination(txtDestination.getText());
       tr.setTfair(Integer.parseInt(txtTicketFair.getText()));
       tr.setEmail(txtEmailAddress.getText());
       tr.setAge(Integer.parseInt(txtAge.getText()));
       tr.setPhoneNo(Integer.parseInt(txtPhonenumber.getText()));
       
       
       if(cbMale.isSelected()){
           tr.setSex("Male");
       }else if(cbFemale.isSelected()){
           tr.setSex("Female");
       } 
       
       dao.create(tr);
        //  Object[] row = new Object[]();
        view();
        clear();
    }//GEN-LAST:event_btnregisterActionPerformed

    private void TravelersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravelersTableMouseClicked
        // TODO add your handling code here:

        
//        GenericDao dao = new GenericDao();
//        
//        int i = TravelersTable.getSelectedRow();
//      
//
//        txtFirstName.setText(model.getValueAt(i, 0).toString());
//        txtLastName.setText(model.getValueAt(i, 1).toString());
//        txtAge.setText(model.getValueAt(i, 2).toString());
//        cbMale.setSelected(model.getValueAt(i, 3).toString().equals("Male"));
//        cbFemale.setSelected(model.getValueAt(i, 3).toString().equals("Female"));        
//        txtTicketFair.setText(model.getValueAt(i, 4).toString());
//        txtDestination.setText(model.getValueAt(i, 5).toString());
//        txtPhonenumber.setText(model.getValueAt(i, 6).toString());
//        txtEmailAddress.setText(model.getValueAt(i, 7).toString());
//        txtId.setText(model.getValueAt(i, 8).toString());
//        
    }//GEN-LAST:event_TravelersTableMouseClicked

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinationActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

                DefaultTableModel model =(DefaultTableModel)TravelersTable.getModel();
        int i= TravelersTable.getSelectedRow();
        if (i==-1)

        {
            JOptionPane.showMessageDialog(null, "Select what to update");
        } else {

        
             GenericDao dao = new GenericDao();
       Passenger tr = new Passenger();
       tr.setId(Integer.parseInt(txtId.getText()));
       tr.setFname(txtFirstName.getText());
       tr.setLname(txtLastName.getText());
       tr.setDestination(txtDestination.getText());
       tr.setTfair(Integer.parseInt(txtTicketFair.getText()));
       tr.setEmail(txtEmailAddress.getText());
       tr.setAge(Integer.parseInt(txtAge.getText()));
       tr.setPhoneNo(Integer.parseInt(txtPhonenumber.getText()));
       
       if(cbMale.isSelected()){
           tr.setSex("Male");
       }else if(cbFemale.isSelected()){
           tr.setSex("Female");
       }
        
       dao.update(tr);
        }
        view();
        clear();
            



//
//            model.setValueAt(txtFirstName.getText(),TravelersTable.getSelectedRow(), 0);
//            model.setValueAt(txtLastName.getText(),TravelersTable.getSelectedRow(), 1);
//             model.setValueAt(txtAge.getText(),TravelersTable.getSelectedRow(), 2);
//            model.setValueAt(cbMale.getText(), TravelersTable.getSelectedRow(), 3);
//            model.setValueAt(cbFemale.getText(), TravelersTable.getSelectedRow(), 3); 
//            model.setValueAt(txtTicketFair.getText(),TravelersTable.getSelectedRow(), 4);
//             model.setValueAt(txtDestination.getText(),TravelersTable.getSelectedRow(), 5);
//            model.setValueAt(txtPhonenumber.getText(),TravelersTable.getSelectedRow(), 6);
//            model.setValueAt(txtEmailAddress.getText(),TravelersTable.getSelectedRow(), 7);
//            
//        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed

       GenericDao dao = new GenericDao();
       Passenger tr = new Passenger();
       tr.setId(Integer.parseInt(txtId.getText()));

       
       dao.delete(tr);
        //  Object[] row = new Object[]();
        view();
        clear();

//        DefaultTableModel model= (DefaultTableModel)TravelersTable.getModel();
//
//        int i = TravelersTable.getSelectedRow();
//        JFrame frame= new JFrame();
//        if (i==-1)
//        {
//            JOptionPane.showMessageDialog(null, "Select what to be deleted");
//        } else if (i>=0){
//            JOptionPane.showMessageDialog(frame, "Are you sure you want to delete?");
//        }{
//            model.removeRow(TravelersTable.getSelectedRow());
//        }
//        clear();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtTicketFairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTicketFairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTicketFairActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed
//     public void clear(){
//    txtFirstName.setText("");
//    txtLastName.setText("");
//    txtAge.setText("");
//    cbMale.setSelected(false);
//    cbFemale.setSelected(false);
//    txtTicketFair.setText("" );
//    txtDestination.setText("");
//    txtEmailAddress.setText("");
//    txtPhonenumber.setText("");
//        
//    }
    
    
    
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TravelersTable;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnregister;
    private javax.swing.JButton btnupdate;
    private javax.swing.JCheckBox cbFemale;
    private javax.swing.JCheckBox cbMale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JLabel jlabel5;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhonenumber;
    private javax.swing.JTextField txtTicketFair;
    // End of variables declaration//GEN-END:variables
}
