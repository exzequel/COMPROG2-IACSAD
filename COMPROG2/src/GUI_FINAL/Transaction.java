package GUI_FINAL;

// PACKAGE EXERCISE #6
import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Transaction extends JFrame {
    private static final long serialVersionUID = 1L;
    JLabel lblUsername;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Transaction window = new Transaction();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Transaction() {
        setTitle("TRANSACTION");
        initialize();
    }

    private void initialize() {
        new JFrame();
        setBounds(100, 100, 468, 245);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // headers for the table
        String[] columns = new String[] {
                "ID", "NAME", "AGE", "SEX"
        };

        // actual data for the table in a 2d array
        Object[][] data = new Object[][] {
                { 101, "Darrel", 21, 'M' },
                { 102, "Ayien", 15, 'F' },
                { 103, "Raine", 14, 'F' },
        };
        // create table with data
        JTable table = new JTable(data, columns);

        // add the table to the frame
        getContentPane().add(new JScrollPane(table));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
