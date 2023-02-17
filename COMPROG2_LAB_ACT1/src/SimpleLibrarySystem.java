import javax.swing.JOptionPane;

public class SimpleLibrarySystem {
    public static void main(String[] args) throws Exception {

        System.out.println("WELCOME to the University Library System!");

        String title1 = "The 4-Hour Workweek - Timothy Ferris";
        String title2 = "The Millionaire Fastlane - MJ DeMarco";
        String title3 = "The 48 Laws of Power - Robert Greene";
        String title4 = "How To Win Friends And Influence People - Dale Carnegie";
        String title5 = "Deep Work - Cal Newport";

        int borrowedBook = 0;
        String borrowedTitle = "";

        while (true) {

            int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a transaction [1] View [2] Borrow [3] Return [4] Exit: "));

            switch (choice) {
                // [1] View
                case 1:
                    System.out.println("[1] VIEW BOOKS");

                    System.out.println("\nLIST OF BOOKS\n"
                            + "1. " + title1 + "\n"
                            + "2. " + title2 + "\n"
                            + "3. " + title3 + "\n"
                            + "4. " + title4 + "\n"
                            + "5. " + title5 + "\n");
                    break;
                case 2:
                // [2] Borrow
                    System.out.println("[2] BORROW BOOKS");

                    int borrowBook = Integer.parseInt(JOptionPane.showInputDialog("Choose a book: "));
                    String name = JOptionPane.showInputDialog("Name: ");

                    switch (borrowBook) {
                        case 1:
                            borrowedBook = 1;
                            borrowedTitle = title1;
                            System.out.println(title1 + " is borrowed by " + name);
                            break;
                        case 2:
                            borrowedBook = 2;
                            borrowedTitle = title2;
                            System.out.println(title2 + " is borrowed by " + name);
                            break;
                        case 3:
                            borrowedBook = 3;
                            borrowedTitle = title3;
                            System.out.println(title3 + " is borrowed by " + name);
                            break;
                        case 4:
                            borrowedBook = 4;
                            borrowedTitle = title4;
                            System.out.println(title4 + " is borrowed by " + name);
                            break;
                        case 5:
                            borrowedBook = 5;
                            borrowedTitle = title5;
                            System.out.println(title5 + " is borrowed by " + name);
                            break;
                        default:
                            System.out.println("Book Not Found.");
                        break;
                    }

                    break;
                case 3:
                // [3] Return
                    System.out.println("[3] RETURN BOOKS");

                    int returnBook = Integer.parseInt(JOptionPane.showInputDialog("Choose a book: "));

                    if (returnBook != borrowedBook) {
                        switch (returnBook) {
                            case 1:
                                System.out.println(title1 + " is not borrowed.");
                                break;
                            case 2:
                                System.out.println(title2 + " is not borrowed.");
                                break;
                            case 3:
                                System.out.println(title3 + " is not borrowed.");
                                break;
                            case 4:
                                System.out.println(title4 + " is not borrowed.");
                                break;
                            case 5:
                                System.out.println(title5 + " is not borrowed.");
                                break;
                            default:
                                System.out.println("Book Not Found.");
                                break;
                        }
                    }
                    else {
                        String penalty = JOptionPane.showInputDialog("Penalty [Y] Yes [N] No: ");
                        if (penalty.equalsIgnoreCase("Y")){
                            int days = Integer.parseInt(JOptionPane.showInputDialog("No. of days: "));
                            System.out.println("Penalty is: " + days * 20.00);
                            System.out.println(borrowedTitle + " is now RETURNED");
                        }
                        else {
                            System.out.println(borrowedTitle + " is now RETURNED");
                        }
                    }

                    break;
                case 4:
                    // [4] Exit - Process Completed
                    System.out.println("[4] EXIT");
                    System.out.println("Process Completed.");
                    return;
                default:
                    System.out.println("[] Invalid Option. Please Try Again.");
            }

        }

    }
}
