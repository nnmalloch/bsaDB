/*
 * Created by JFormDesigner on Mon May 04 13:38:28 MDT 2015
 */

package bsaDb.client;

import bsaDb.client.home.HomePanel;
import bsaDb.client.home.clientPnls.NoServerConnectionPanel;
import bsaDb.client.home.dialogs.MessageDialog;
import util.CacheObject;
import util.MySqlConnector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Nathanael
 */
public class BaseFrame extends JFrame {
    public final static String NO_SERVER_CONNECTION_PAGE = "noServerConnection";
    public final static String NO_DATABASE_CONNECTION_PAGE = "noDataBaseConnection";
    public final static String SIGN_IN_PAGE = "signIn";
    public final static String HOME_PAGE = "home";

    private HomePanel pnlHome;

    public BaseFrame() {
        initComponents();

        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );

        pnlCards.add(new NoServerConnectionPanel(this), NO_SERVER_CONNECTION_PAGE);
        pnlCards.add(new NoServerConnectionPanel(this), NO_DATABASE_CONNECTION_PAGE);
        pnlCards.add(new SignInPanel(this), SIGN_IN_PAGE);

        switch (MySqlConnector.getInstance().checkConnection()) {
            case NO_SERVER_CONNECTION:
                slideCard(NO_SERVER_CONNECTION_PAGE);
                break;
            case NO_DATABASE_CONNECTION:
                slideCard(NO_DATABASE_CONNECTION_PAGE);
                break;
            default:
                CacheObject.setupCache();
                slideCard(SIGN_IN_PAGE);
        }

        setVisible(true);
    }

    public void slideCard(final String moveToPage) {
        ((CardLayout)pnlCards.getLayout()).show(pnlCards, moveToPage);
    }

    public void addCard(String pageName) {
        if (pageName.equals(HOME_PAGE)) {
            if (pnlHome == null) {
                pnlHome = new HomePanel(this);
            }
            pnlCards.add(pnlHome, pageName);
        }
    }

    public void clearHomePnl() {
        pnlCards.remove(pnlHome);
        pnlHome = null;
    }

    public void exit() {
        MessageDialog dialog = new MessageDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Exit", "Are you sure you want to close BSA Database?", MessageDialog.MessageType.QUESTION, MessageDialog.ButtonType.OKAY_CANCEL);
        if (dialog.getChoice() != MessageDialog.OPTION_YES) {
            return;
        }

        CacheObject.clear();
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        pnlCards = new JPanel();

        //======== this ========
        setTitle("BSA Database");
        setIconImage(new ImageIcon(getClass().getResource("/images/flurDeLis16.png")).getImage());
        setMinimumSize(new Dimension(650, 500));
        setName("this");
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

        //======== pnlCards ========
        {
            pnlCards.setPreferredSize(new Dimension(1050, 710));
            pnlCards.setName("pnlCards");
            pnlCards.setLayout(new CardLayout());
        }
        contentPane.add(pnlCards, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel pnlCards;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
