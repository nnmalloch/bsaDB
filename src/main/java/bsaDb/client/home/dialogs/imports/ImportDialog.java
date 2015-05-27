/*
 * Created by JFormDesigner on Tue May 26 21:04:00 MDT 2015
 */

package bsaDb.client.home.dialogs.imports;

import constants.IETypeConst;
import objects.objectLogic.IEAdvancementLogic;
import util.Util;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author User #2
 */
public class ImportDialog extends JDialog {

    private static final String IMPORT_SELECT_PAGE = "importSelect";
    private static final String IMPORT_PAGE = "import";

    private ImportSelectPanel pnlSelect;
    private ImportPanel pnlImport;
    private IETypeConst typeConst;

    public ImportDialog(Frame owner) {
        super(owner);
        initComponents();

        pnlSelect = new ImportSelectPanel();
        pnlContent.add(pnlSelect, IMPORT_SELECT_PAGE);

        btnImport.setEnabled(false);
    }

    private void btnCancelActionPerformed() {
        setVisible(false);
        dispose();
    }

    private void btnNextActionPerformed() {
        typeConst = pnlSelect.getSelectedImport();

        if (typeConst == null) {
            JOptionPane.showMessageDialog(this, "Please select an option from the list to import.", "Empty Import Choice", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (pnlImport == null) {
            pnlImport = new ImportPanel(typeConst);
            pnlContent.add(pnlImport, IMPORT_PAGE);
        }

        ((CardLayout)pnlContent.getLayout()).show(pnlContent, IMPORT_PAGE);

        btnNext.setVisible(false);
        btnImport.setEnabled(true);
    }

    private void btnImportActionPerformed() {
        String importPath = pnlImport.getImportPath();

        if (Util.isEmpty(importPath)) {
            JOptionPane.showMessageDialog(this, "Please select a valid location to save your import.", "Empty Import Choice", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean success = false;
        if (typeConst == IETypeConst.ADVANCEMENT) {
            success = IEAdvancementLogic.doImport(this, importPath);
        }

        if (success) {
            setVisible(false);
            dispose();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        JPanel dialogPane = new JPanel();
        pnlContent = new JPanel();
        JPanel buttonBar = new JPanel();
        btnNext = new JButton();
        btnImport = new JButton();
        btnCancel = new JButton();

        //======== this ========
        setName("this");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBackground(Color.white);
            dialogPane.setName("dialogPane");
            dialogPane.setLayout(new BorderLayout());

            //======== pnlContent ========
            {
                pnlContent.setOpaque(false);
                pnlContent.setName("pnlContent");
                pnlContent.setLayout(new CardLayout());
            }
            dialogPane.add(pnlContent, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setOpaque(false);
                buttonBar.setName("buttonBar");
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).rowHeights = new int[] {35};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0, 0.0};

                //---- btnNext ----
                btnNext.setText("Next");
                btnNext.setFont(new Font("Tahoma", Font.PLAIN, 14));
                btnNext.setForeground(Color.white);
                btnNext.setBackground(new Color(51, 156, 229));
                btnNext.setName("btnNext");
                btnNext.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btnNextActionPerformed();
                    }
                });
                buttonBar.add(btnNext, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- btnImport ----
                btnImport.setText("Import");
                btnImport.setFont(new Font("Tahoma", Font.PLAIN, 14));
                btnImport.setForeground(Color.white);
                btnImport.setBackground(new Color(51, 102, 153));
                btnImport.setName("btnImport");
                btnImport.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btnImportActionPerformed();
                    }
                });
                buttonBar.add(btnImport, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- btnCancel ----
                btnCancel.setText("Cancel");
                btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
                btnCancel.setForeground(Color.white);
                btnCancel.setBackground(new Color(207, 0, 0));
                btnCancel.setName("btnCancel");
                btnCancel.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btnCancelActionPerformed();
                    }
                });
                buttonBar.add(btnCancel, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel pnlContent;
    private JButton btnNext;
    private JButton btnImport;
    private JButton btnCancel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
