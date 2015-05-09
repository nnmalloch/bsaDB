/*
 * Created by JFormDesigner on Fri May 08 20:05:36 MDT 2015
 */

package bsaDb.client.home.clientPnls;

import bsaDb.client.customComponents.JPasswordFieldDefaultText;
import bsaDb.client.customComponents.JTextFieldDefaultText;
import bsaDb.client.customComponents.TitlePanel;

import javax.swing.*;
import java.awt.*;

/**
 * @author User #2
 */
public class DatabaseSettingsPanel extends JPanel {
    public DatabaseSettingsPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        TitlePanel titlePanel1 = new TitlePanel();
        JPanel panel1 = new JPanel();
        JLabel lblConnection = new JLabel();
        lblConnectionName = new JLabel();
        JPanel panel2 = new JPanel();
        txtDatabaseName = new JTextFieldDefaultText();
        lblDatabaseNameError = new JLabel();
        txtServerUserName = new JTextFieldDefaultText();
        lblUserNameError = new JLabel();
        txtServerPassword = new JPasswordFieldDefaultText();
        lblPasswordError = new JLabel();
        JButton btnCreate = new JButton();
        JButton btnConnect = new JButton();

        //======== this ========
        setBackground(Color.white);
        setName("this");
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0};
        ((GridBagLayout)getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 1.0, 1.0E-4};

        //---- titlePanel1 ----
        titlePanel1.setTitle("Database Settings");
        titlePanel1.setName("titlePanel1");
        add(titlePanel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //======== panel1 ========
        {
            panel1.setBackground(Color.white);
            panel1.setName("panel1");
            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 1.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

            //---- lblConnection ----
            lblConnection.setText("Current database connection:");
            lblConnection.setFont(new Font("Vijaya", Font.PLAIN, 22));
            lblConnection.setForeground(new Color(51, 102, 153));
            lblConnection.setName("lblConnection");
            panel1.add(lblConnection, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- lblConnectionName ----
            lblConnectionName.setText("dbName");
            lblConnectionName.setFont(new Font("Vijaya", Font.PLAIN, 22));
            lblConnectionName.setForeground(new Color(32, 154, 26));
            lblConnectionName.setName("lblConnectionName");
            panel1.add(lblConnectionName, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //======== panel2 ========
            {
                panel2.setOpaque(false);
                panel2.setName("panel2");
                panel2.setLayout(new GridBagLayout());
                ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {132, 113, 136, 0, 0};
                ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
                ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0, 1.0E-4};
                ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

                //---- txtDatabaseName ----
                txtDatabaseName.setPreferredSize(new Dimension(14, 40));
                txtDatabaseName.setMinimumSize(new Dimension(14, 40));
                txtDatabaseName.setFont(new Font("Tahoma", Font.PLAIN, 14));
                txtDatabaseName.setDefaultText("Database Name");
                txtDatabaseName.setName("txtDatabaseName");
                panel2.add(txtDatabaseName, new GridBagConstraints(0, 0, 3, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 8, 5), 0, 0));

                //---- lblDatabaseNameError ----
                lblDatabaseNameError.setText("* Error Message");
                lblDatabaseNameError.setForeground(Color.red);
                lblDatabaseNameError.setFont(new Font("Tahoma", Font.ITALIC, 11));
                lblDatabaseNameError.setVisible(false);
                lblDatabaseNameError.setName("lblDatabaseNameError");
                panel2.add(lblDatabaseNameError, new GridBagConstraints(0, 1, 4, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 10, 8, 0), 0, 0));

                //---- txtServerUserName ----
                txtServerUserName.setMinimumSize(new Dimension(14, 40));
                txtServerUserName.setPreferredSize(new Dimension(14, 40));
                txtServerUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
                txtServerUserName.setDefaultText("MySQL server user name");
                txtServerUserName.setName("txtServerUserName");
                panel2.add(txtServerUserName, new GridBagConstraints(0, 2, 3, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 8, 5), 0, 0));

                //---- lblUserNameError ----
                lblUserNameError.setText("* Error Message");
                lblUserNameError.setForeground(Color.red);
                lblUserNameError.setFont(new Font("Tahoma", Font.ITALIC, 11));
                lblUserNameError.setVisible(false);
                lblUserNameError.setName("lblUserNameError");
                panel2.add(lblUserNameError, new GridBagConstraints(0, 3, 4, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 10, 8, 0), 0, 0));

                //---- txtServerPassword ----
                txtServerPassword.setPreferredSize(new Dimension(14, 40));
                txtServerPassword.setMinimumSize(new Dimension(14, 40));
                txtServerPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
                txtServerPassword.setDefaultText("MySQL server password");
                txtServerPassword.setName("txtServerPassword");
                panel2.add(txtServerPassword, new GridBagConstraints(0, 4, 3, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 8, 5), 0, 0));

                //---- lblPasswordError ----
                lblPasswordError.setText("* Error Message");
                lblPasswordError.setForeground(Color.red);
                lblPasswordError.setFont(new Font("Tahoma", Font.ITALIC, 11));
                lblPasswordError.setVisible(false);
                lblPasswordError.setName("lblPasswordError");
                panel2.add(lblPasswordError, new GridBagConstraints(0, 5, 4, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 10, 8, 0), 0, 0));

                //---- btnCreate ----
                btnCreate.setText("Create");
                btnCreate.setPreferredSize(new Dimension(90, 30));
                btnCreate.setMinimumSize(new Dimension(80, 30));
                btnCreate.setMaximumSize(new Dimension(90, 30));
                btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 14));
                btnCreate.setMargin(new Insets(5, 20, 5, 20));
                btnCreate.setBackground(new Color(51, 102, 153));
                btnCreate.setForeground(Color.white);
                btnCreate.setFocusPainted(false);
                btnCreate.setName("btnCreate");
                panel2.add(btnCreate, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(5, 5, 0, 5), 0, 0));

                //---- btnConnect ----
                btnConnect.setText("Connect");
                btnConnect.setPreferredSize(new Dimension(90, 30));
                btnConnect.setMinimumSize(new Dimension(80, 30));
                btnConnect.setMaximumSize(new Dimension(90, 30));
                btnConnect.setFont(new Font("Tahoma", Font.PLAIN, 14));
                btnConnect.setMargin(new Insets(5, 20, 5, 20));
                btnConnect.setBackground(new Color(51, 102, 153));
                btnConnect.setForeground(Color.white);
                btnConnect.setFocusPainted(false);
                btnConnect.setName("btnConnect");
                panel2.add(btnConnect, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(5, 20, 0, 5), 0, 0));
            }
            panel1.add(panel2, new GridBagConstraints(0, 1, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(10, 0, 0, 0), 0, 0));
        }
        add(panel1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(5, 10, 5, 10), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel lblConnectionName;
    private JTextFieldDefaultText txtDatabaseName;
    private JLabel lblDatabaseNameError;
    private JTextFieldDefaultText txtServerUserName;
    private JLabel lblUserNameError;
    private JPasswordFieldDefaultText txtServerPassword;
    private JLabel lblPasswordError;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}