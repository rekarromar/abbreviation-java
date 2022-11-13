import javax.swing.*;

public class UserInterface {
    Methods db = new Methods();
    public void startApp() {
        while (true) {
            String options = JOptionPane.showInputDialog("1-To search for abbreviation\n2-To add new abbreviation\n3-Exit");

            if (options.equals("1")) {
                String category = JOptionPane.showInputDialog("1-Technology\n2-Biology\n3-Back");
                if (category.equals("1")) {
                    String abbreviation = JOptionPane.showInputDialog("Enter abbreviation you want to find what it stands for: ");
                  db.findAbbreviation("C:\\abbreviation\\technology.txt", abbreviation);
                } else if (category.equals("2")) {
                    String abbreviation = JOptionPane.showInputDialog("Enter abbreviation you want to find what it stands for: ");
                    db.findAbbreviation("C:\\abbreviation\\biology.txt", abbreviation);
                }else {
                    continue;
                }
            } else if (options.equals("2")) {
                String category = JOptionPane.showInputDialog("In what category you want to add new abbreviation\n1-Technology\n2-Biology\n3-Back");
                if (category.equals("1")) {
                    String abbreviationSign = JOptionPane.showInputDialog("Enter abbreviation\n");
                    String standsFor = JOptionPane.showInputDialog("what that abbreviation stands for\n");
                    String abbreviation = abbreviationSign + " " + standsFor;
                    db.addAbbreviation("C:\\abbreviation\\technology.txt", abbreviation);
                } else if (category.equals("2")) {
                    String abbreviation = JOptionPane.showInputDialog("Enter abbreviation you want to add and with what it stands for: \nDon't forget to add space between each of the words: \n");
                    db.addAbbreviation("C:\\abbreviation\\biology.txt", abbreviation);
                } else {
                    continue;
                }
            } else {
                break;
            }
        }
    }

}
