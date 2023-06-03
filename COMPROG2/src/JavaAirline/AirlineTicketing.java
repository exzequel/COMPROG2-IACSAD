import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class AirlineTicketing {

    private static final String[] AIRLINE_TYPES = {"Air India", "Jet Airways", "SpiceJet", "Vistara"};
    private static final String[] DESTINATIONS = {"New Delhi", "Mumbai", "Chennai", "Bangalore"};

    private JFrame frame;
    private JComboBox airlineTypeComboBox;
    private JComboBox destinationComboBox;
    private JTextField passengerNameTextField;
    private JTextField passengerAgeTextField;
    private JComboBox travelTypeComboBox;
    private JButton bookFlightButton;

    public AirlineTicketing() {
        frame = new JFrame("Airline Ticketing");
        frame.setLayout(new GridLayout(0, 2));

        airlineTypeComboBox = new JComboBox(AIRLINE_TYPES);
        destinationComboBox = new JComboBox(DESTINATIONS);
        passengerNameTextField = new JTextField();
        passengerAgeTextField = new JTextField();
        travelTypeComboBox = new JComboBox(new String[]{"Local", "International"});
        bookFlightButton = new JButton("Book Flight");

        frame.add(airlineTypeComboBox);
        frame.add(destinationComboBox);
        frame.add(passengerNameTextField);
        frame.add(passengerAgeTextField);
        frame.add(travelTypeComboBox);
        frame.add(bookFlightButton);

        bookFlightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bookFlight();
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

private void bookFlight() {
    String airlineType = (String) airlineTypeComboBox.getSelectedItem();
    String destination = (String) destinationComboBox.getSelectedItem();
    String passengerName = passengerNameTextField.getText();
    int passengerAge = Integer.parseInt(passengerAgeTextField.getText());
    String travelType = (String) travelTypeComboBox.getSelectedItem();

    // Generate a control number.
    Random random = new Random();
    int controlNumber = random.nextInt(999999999);

    // Create a transaction object.
    Transaction transaction = new Transaction();
    transaction.setControlNumber(controlNumber);
    transaction.setAirlineType(airlineType);
    transaction.setPassengerName(passengerName);
    transaction.setPassengerAge(passengerAge);
    transaction.setTravelType(travelType);
    transaction.setDestination(destination);

    // Display the transaction details.
    JOptionPane.showMessageDialog(frame, transaction);

    // Print the transaction details to a file.
    File file = new File("transaction.txt");

    try {
        PrintWriter writer = new PrintWriter(file);
        writer.println(transaction);
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public static void main(String[] args) {

        AirlineTicketing application = new AirlineTicketing();
    }
}
