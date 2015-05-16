/*
 * Created by JFormDesigner on Fri May 15 19:25:31 MDT 2015
 */

package bsaDb.client.home.clientPnls;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * @author User #2
 */
public class AccessRightsPanel extends JPanel {
    public AccessRightsPanel() {
        initComponents();
    }

    @Override
    public void setEnabled(boolean enabled) {
        chkDatabaseSettings.setEnabled(enabled);
        chkUsers.setEnabled(enabled);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        chkDatabaseSettings = new JCheckBox();
        chkUsers = new JCheckBox();

        //======== this ========
        setBorder(new TitledBorder(new LineBorder(new Color(51, 102, 153)), "Access Rights", TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION,
            new Font("Vijaya", Font.PLAIN, 22), new Color(51, 102, 153)));
        setBackground(Color.white);
        setName("this");
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {0, 0, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0};
        ((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

        //---- chkDatabaseSettings ----
        chkDatabaseSettings.setText("Database Settings");
        chkDatabaseSettings.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chkDatabaseSettings.setForeground(Color.black);
        chkDatabaseSettings.setOpaque(false);
        chkDatabaseSettings.setName("chkDatabaseSettings");
        add(chkDatabaseSettings, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(5, 5, 5, 5), 0, 0));

        //---- chkUsers ----
        chkUsers.setText("Users");
        chkUsers.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chkUsers.setForeground(Color.black);
        chkUsers.setOpaque(false);
        chkUsers.setName("chkUsers");
        add(chkUsers, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(5, 5, 5, 5), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JCheckBox chkDatabaseSettings;
    private JCheckBox chkUsers;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}