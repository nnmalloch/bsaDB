/*
 * Created by JFormDesigner on Tue May 12 22:02:42 MDT 2015
 */

package bsaDb.client.home.clientPnls;

import bsaDb.client.customComponents.JPasswordFieldDefaultText;
import bsaDb.client.customComponents.JTextFieldDefaultText;
import bsaDb.client.customComponents.TitlePanel;
import objects.databaseObjects.User;
import util.CacheObject;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author User #2
 */
public class UserPanel extends JPanel {
    public UserPanel() {
        initComponents();

        populateUserNameList();
    }

    private void populateUserNameList() {
        Collection<User> userList = CacheObject.getCachedUsers();
        List<String> userNameList = new ArrayList<String>();
        for (User user : userList) {
            userNameList.add(user.getName());
        }

        listUserNames.setListData(userNameList.toArray());
        listUserNames.revalidate();
    }

    private void txtSearchNameKeyReleased() {
        // instead of the logic get this from a cached list
        Collection<User> userList = CacheObject.getCachedUsers();
        List<String> userNameList = new ArrayList<String>();
        for (User user : userList) {
            userNameList.add(user.getName());
        }

        if (txtSearchName.isMessageDefault()) {
            listUserNames.setListData(userNameList.toArray());
            listUserNames.revalidate();
            return;
        }

        List<String> filteredList = new ArrayList<String>();
        for (User user : userList) {
            if (user.getName().toLowerCase().contains(txtSearchName.getText().toLowerCase())) {
                filteredList.add(user.getName());
            }
        }

        listUserNames.setListData(filteredList.toArray());
        listUserNames.revalidate();
    }

    private void listUserNamesKeyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
            listUserNamesMouseReleased();
        }
    }

    private void listUserNamesMouseReleased() {
        if (listUserNames.getSelectedValue() == null) {
            return;
        }

        // clearErrors();

        // loadData();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        TitlePanel pnlTitle = new TitlePanel();
        JPanel pnlContents = new JPanel();
        panel2 = new JPanel();
        pnlSearch = new JPanel();
        txtSearchName = new JTextFieldDefaultText();
        scrollPane1 = new JScrollPane();
        listUserNames = new JList();
        panel3 = new JPanel();
        scrollPane2 = new JScrollPane();
        panel4 = new JPanel();
        lblGeneralInfo = new JLabel();
        lblName = new JLabel();
        txtName = new JTextFieldDefaultText();
        lblPassword = new JLabel();
        txtPassword = new JPasswordFieldDefaultText();
        lblPosition = new JLabel();
        txtPosition = new JTextFieldDefaultText();
        lblNameError = new JLabel();
        lblPasswordError = new JLabel();
        lblContactInfo = new JLabel();
        lblPhoneNumber = new JLabel();
        txtPhoneNumber = new JTextFieldDefaultText();
        lblPhoneNumberError = new JLabel();
        lblStreet = new JLabel();
        txtStreet = new JTextFieldDefaultText();
        lblCity = new JLabel();
        txtCity = new JTextFieldDefaultText();
        lblZip = new JLabel();
        txtZip = new JTextFieldDefaultText();
        lblStreetError = new JLabel();
        lblCityError = new JLabel();
        lblZipError = new JLabel();
        panel6 = new AccessRightsPanel();
        panel5 = new JPanel();
        btnNew = new JButton();
        btnSave = new JButton();
        btnUpdate = new JButton();
        btnDelete = new JButton();

        //======== this ========
        setBackground(Color.white);
        setName("this");
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0};
        ((GridBagLayout)getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 1.0, 1.0E-4};

        //---- pnlTitle ----
        pnlTitle.setTitle("Users");
        pnlTitle.setName("pnlTitle");
        add(pnlTitle, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //======== pnlContents ========
        {
            pnlContents.setOpaque(false);
            pnlContents.setName("pnlContents");
            pnlContents.setLayout(new GridBagLayout());
            ((GridBagLayout)pnlContents.getLayout()).columnWidths = new int[] {0, 0, 0};
            ((GridBagLayout)pnlContents.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)pnlContents.getLayout()).columnWeights = new double[] {0.0, 1.0, 1.0E-4};
            ((GridBagLayout)pnlContents.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //======== panel2 ========
            {
                panel2.setOpaque(false);
                panel2.setName("panel2");
                panel2.setLayout(new GridBagLayout());
                ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0};
                ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0, 0};
                ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 1.0, 1.0E-4};

                //======== pnlSearch ========
                {
                    pnlSearch.setBorder(LineBorder.createBlackLineBorder());
                    pnlSearch.setOpaque(false);
                    pnlSearch.setName("pnlSearch");
                    pnlSearch.setLayout(new GridBagLayout());
                    ((GridBagLayout)pnlSearch.getLayout()).columnWidths = new int[] {188, 0};
                    ((GridBagLayout)pnlSearch.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)pnlSearch.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                    ((GridBagLayout)pnlSearch.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                    //---- txtSearchName ----
                    txtSearchName.setDefaultText("Search by Name");
                    txtSearchName.setFont(new Font("Tahoma", Font.PLAIN, 14));
                    txtSearchName.setBorder(null);
                    txtSearchName.setPreferredSize(new Dimension(101, 20));
                    txtSearchName.setMinimumSize(new Dimension(0, 20));
                    txtSearchName.setName("txtSearchName");
                    txtSearchName.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyReleased(KeyEvent e) {
                            txtSearchNameKeyReleased();
                        }
                    });
                    pnlSearch.add(txtSearchName, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 5, 0, 0), 0, 0));
                }
                panel2.add(pnlSearch, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 8, 0), 0, 0));

                //======== scrollPane1 ========
                {
                    scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                    scrollPane1.setName("scrollPane1");

                    //---- listUserNames ----
                    listUserNames.setFont(new Font("Tahoma", Font.PLAIN, 14));
                    listUserNames.setName("listUserNames");
                    listUserNames.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyReleased(KeyEvent e) {
                            listUserNamesKeyReleased(e);
                        }
                    });
                    listUserNames.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            listUserNamesMouseReleased();
                        }
                    });
                    scrollPane1.setViewportView(listUserNames);
                }
                panel2.add(scrollPane1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            pnlContents.add(panel2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 15), 0, 0));

            //======== panel3 ========
            {
                panel3.setOpaque(false);
                panel3.setName("panel3");
                panel3.setLayout(new GridBagLayout());
                ((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {0, 0, 0};
                ((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {1.0, 0.0, 1.0E-4};
                ((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                //======== scrollPane2 ========
                {
                    scrollPane2.setName("scrollPane2");

                    //======== panel4 ========
                    {
                        panel4.setBackground(Color.white);
                        panel4.setName("panel4");
                        panel4.setLayout(new GridBagLayout());
                        ((GridBagLayout)panel4.getLayout()).columnWidths = new int[] {0, 188, 0, 141, 0, 127, 0, 0};
                        ((GridBagLayout)panel4.getLayout()).rowHeights = new int[] {0, 40, 0, 0, 40, 0, 40, 0, 0, 0, 0};
                        ((GridBagLayout)panel4.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0E-4};
                        ((GridBagLayout)panel4.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0E-4};

                        //---- lblGeneralInfo ----
                        lblGeneralInfo.setText("General Information:");
                        lblGeneralInfo.setFont(new Font("Vijaya", Font.PLAIN, 22));
                        lblGeneralInfo.setForeground(new Color(51, 102, 153));
                        lblGeneralInfo.setName("lblGeneralInfo");
                        panel4.add(lblGeneralInfo, new GridBagConstraints(0, 0, 2, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(10, 8, 10, 5), 0, 0));

                        //---- lblName ----
                        lblName.setText("Name:");
                        lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
                        lblName.setForeground(Color.black);
                        lblName.setName("lblName");
                        panel4.add(lblName, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                            new Insets(0, 0, 10, 5), 0, 0));

                        //---- txtName ----
                        txtName.setFont(new Font("Tahoma", Font.PLAIN, 14));
                        txtName.setDefaultText("John Doe");
                        txtName.setName("txtName");
                        panel4.add(txtName, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 5), 0, 0));

                        //---- lblPassword ----
                        lblPassword.setText("Password:");
                        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
                        lblPassword.setForeground(Color.black);
                        lblPassword.setName("lblPassword");
                        panel4.add(lblPassword, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                            new Insets(0, 5, 10, 5), 0, 0));

                        //---- txtPassword ----
                        txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
                        txtPassword.setDefaultText("Password");
                        txtPassword.setName("txtPassword");
                        panel4.add(txtPassword, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 5), 0, 0));

                        //---- lblPosition ----
                        lblPosition.setText("Position:");
                        lblPosition.setFont(new Font("Tahoma", Font.PLAIN, 14));
                        lblPosition.setForeground(Color.black);
                        lblPosition.setName("lblPosition");
                        panel4.add(lblPosition, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                            new Insets(0, 5, 10, 5), 0, 0));

                        //---- txtPosition ----
                        txtPosition.setFont(new Font("Tahoma", Font.PLAIN, 14));
                        txtPosition.setDefaultText("Scout Master");
                        txtPosition.setName("txtPosition");
                        panel4.add(txtPosition, new GridBagConstraints(5, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 5), 0, 0));

                        //---- lblNameError ----
                        lblNameError.setText("* Error Message");
                        lblNameError.setForeground(Color.red);
                        lblNameError.setFont(new Font("Tahoma", Font.ITALIC, 11));
                        lblNameError.setVisible(false);
                        lblNameError.setName("lblNameError");
                        panel4.add(lblNameError, new GridBagConstraints(1, 2, 2, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 25), 0, 0));

                        //---- lblPasswordError ----
                        lblPasswordError.setText("* Error Message");
                        lblPasswordError.setForeground(Color.red);
                        lblPasswordError.setFont(new Font("Tahoma", Font.ITALIC, 11));
                        lblPasswordError.setVisible(false);
                        lblPasswordError.setName("lblPasswordError");
                        panel4.add(lblPasswordError, new GridBagConstraints(3, 2, 2, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 5), 0, 0));

                        //---- lblContactInfo ----
                        lblContactInfo.setText("Contact Information:");
                        lblContactInfo.setFont(new Font("Vijaya", Font.PLAIN, 22));
                        lblContactInfo.setForeground(new Color(51, 102, 153));
                        lblContactInfo.setName("lblContactInfo");
                        panel4.add(lblContactInfo, new GridBagConstraints(0, 3, 2, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 8, 10, 5), 0, 0));

                        //---- lblPhoneNumber ----
                        lblPhoneNumber.setText("Phone Number:");
                        lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
                        lblPhoneNumber.setForeground(Color.black);
                        lblPhoneNumber.setName("lblPhoneNumber");
                        panel4.add(lblPhoneNumber, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                            new Insets(0, 15, 10, 5), 0, 0));

                        //---- txtPhoneNumber ----
                        txtPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
                        txtPhoneNumber.setDefaultText("(123) 456-7890");
                        txtPhoneNumber.setName("txtPhoneNumber");
                        panel4.add(txtPhoneNumber, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 5), 0, 0));

                        //---- lblPhoneNumberError ----
                        lblPhoneNumberError.setText("* Error Message");
                        lblPhoneNumberError.setForeground(Color.red);
                        lblPhoneNumberError.setFont(new Font("Tahoma", Font.ITALIC, 11));
                        lblPhoneNumberError.setVisible(false);
                        lblPhoneNumberError.setName("lblPhoneNumberError");
                        panel4.add(lblPhoneNumberError, new GridBagConstraints(1, 5, 3, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 5), 0, 0));

                        //---- lblStreet ----
                        lblStreet.setText("Street");
                        lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 14));
                        lblStreet.setForeground(Color.black);
                        lblStreet.setName("lblStreet");
                        panel4.add(lblStreet, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
                            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                            new Insets(0, 0, 10, 5), 0, 0));

                        //---- txtStreet ----
                        txtStreet.setFont(new Font("Tahoma", Font.PLAIN, 14));
                        txtStreet.setDefaultText("100 South 100 West");
                        txtStreet.setName("txtStreet");
                        panel4.add(txtStreet, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 5), 0, 0));

                        //---- lblCity ----
                        lblCity.setText("City");
                        lblCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
                        lblCity.setForeground(Color.black);
                        lblCity.setName("lblCity");
                        panel4.add(lblCity, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
                            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                            new Insets(0, 0, 10, 5), 0, 0));

                        //---- txtCity ----
                        txtCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
                        txtCity.setDefaultText("Scout Town");
                        txtCity.setName("txtCity");
                        panel4.add(txtCity, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 5), 0, 0));

                        //---- lblZip ----
                        lblZip.setText("Zip");
                        lblZip.setFont(new Font("Tahoma", Font.PLAIN, 14));
                        lblZip.setForeground(Color.black);
                        lblZip.setName("lblZip");
                        panel4.add(lblZip, new GridBagConstraints(4, 6, 1, 1, 0.0, 0.0,
                            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                            new Insets(0, 0, 10, 5), 0, 0));

                        //---- txtZip ----
                        txtZip.setFont(new Font("Tahoma", Font.PLAIN, 14));
                        txtZip.setDefaultText("12345");
                        txtZip.setName("txtZip");
                        panel4.add(txtZip, new GridBagConstraints(5, 6, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 5), 0, 0));

                        //---- lblStreetError ----
                        lblStreetError.setText("* Error Message");
                        lblStreetError.setForeground(Color.red);
                        lblStreetError.setFont(new Font("Tahoma", Font.ITALIC, 11));
                        lblStreetError.setVisible(false);
                        lblStreetError.setName("lblStreetError");
                        panel4.add(lblStreetError, new GridBagConstraints(1, 7, 2, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 25), 0, 0));

                        //---- lblCityError ----
                        lblCityError.setText("* Error Message");
                        lblCityError.setForeground(Color.red);
                        lblCityError.setFont(new Font("Tahoma", Font.ITALIC, 11));
                        lblCityError.setVisible(false);
                        lblCityError.setName("lblCityError");
                        panel4.add(lblCityError, new GridBagConstraints(3, 7, 2, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 25), 0, 0));

                        //---- lblZipError ----
                        lblZipError.setText("* Error Message");
                        lblZipError.setForeground(Color.red);
                        lblZipError.setFont(new Font("Tahoma", Font.ITALIC, 11));
                        lblZipError.setVisible(false);
                        lblZipError.setName("lblZipError");
                        panel4.add(lblZipError, new GridBagConstraints(5, 7, 2, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 10, 0), 0, 0));

                        //---- panel6 ----
                        panel6.setName("panel6");
                        panel4.add(panel6, new GridBagConstraints(0, 8, 7, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(10, 8, 20, 8), 0, 0));
                    }
                    scrollPane2.setViewportView(panel4);
                }
                panel3.add(scrollPane2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 15), 0, 0));

                //======== panel5 ========
                {
                    panel5.setOpaque(false);
                    panel5.setName("panel5");
                    panel5.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel5.getLayout()).columnWidths = new int[] {89, 0};
                    ((GridBagLayout)panel5.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
                    ((GridBagLayout)panel5.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                    ((GridBagLayout)panel5.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

                    //---- btnNew ----
                    btnNew.setText("New");
                    btnNew.setBackground(new Color(51, 156, 229));
                    btnNew.setFocusPainted(false);
                    btnNew.setFont(new Font("Tahoma", Font.PLAIN, 14));
                    btnNew.setForeground(Color.white);
                    btnNew.setPreferredSize(new Dimension(56, 40));
                    btnNew.setName("btnNew");
                    panel5.add(btnNew, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 10, 0), 0, 0));

                    //---- btnSave ----
                    btnSave.setText("Save");
                    btnSave.setBackground(new Color(51, 102, 153));
                    btnSave.setFocusPainted(false);
                    btnSave.setForeground(Color.white);
                    btnSave.setFont(new Font("Tahoma", Font.PLAIN, 14));
                    btnSave.setPreferredSize(new Dimension(60, 40));
                    btnSave.setName("btnSave");
                    panel5.add(btnSave, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 10, 0), 0, 0));

                    //---- btnUpdate ----
                    btnUpdate.setText("Update");
                    btnUpdate.setBackground(new Color(51, 102, 153));
                    btnUpdate.setForeground(Color.white);
                    btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
                    btnUpdate.setFocusPainted(false);
                    btnUpdate.setPreferredSize(new Dimension(74, 40));
                    btnUpdate.setName("btnUpdate");
                    panel5.add(btnUpdate, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 10, 0), 0, 0));

                    //---- btnDelete ----
                    btnDelete.setText("Delete");
                    btnDelete.setBackground(new Color(207, 0, 0));
                    btnDelete.setForeground(Color.white);
                    btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
                    btnDelete.setFocusPainted(false);
                    btnDelete.setPreferredSize(new Dimension(68, 40));
                    btnDelete.setName("btnDelete");
                    panel5.add(btnDelete, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 10, 0), 0, 0));
                }
                panel3.add(panel5, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            pnlContents.add(panel3, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        add(pnlContents, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(5, 10, 10, 10), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel2;
    private JPanel pnlSearch;
    private JTextFieldDefaultText txtSearchName;
    private JScrollPane scrollPane1;
    private JList listUserNames;
    private JPanel panel3;
    private JScrollPane scrollPane2;
    private JPanel panel4;
    private JLabel lblGeneralInfo;
    private JLabel lblName;
    private JTextFieldDefaultText txtName;
    private JLabel lblPassword;
    private JPasswordFieldDefaultText txtPassword;
    private JLabel lblPosition;
    private JTextFieldDefaultText txtPosition;
    private JLabel lblNameError;
    private JLabel lblPasswordError;
    private JLabel lblContactInfo;
    private JLabel lblPhoneNumber;
    private JTextFieldDefaultText txtPhoneNumber;
    private JLabel lblPhoneNumberError;
    private JLabel lblStreet;
    private JTextFieldDefaultText txtStreet;
    private JLabel lblCity;
    private JTextFieldDefaultText txtCity;
    private JLabel lblZip;
    private JTextFieldDefaultText txtZip;
    private JLabel lblStreetError;
    private JLabel lblCityError;
    private JLabel lblZipError;
    private AccessRightsPanel panel6;
    private JPanel panel5;
    private JButton btnNew;
    private JButton btnSave;
    private JButton btnUpdate;
    private JButton btnDelete;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
