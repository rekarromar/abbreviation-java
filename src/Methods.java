import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Methods {

    public void addAbbreviation(String path, String abbreviation) {
        try {
            FileWriter writer = new FileWriter(path, true);
            String storeLine = abbreviation.toLowerCase();
            writer.write("\n" + storeLine);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void findAbbreviation(String path, String abbreviation) {
        try {
            FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            String standsFor = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineParts = line.split(" ");

                if (lineParts[0].equals(abbreviation)) {
                    for (int i = 1; i < lineParts.length; i++) {
                        standsFor += lineParts[i] + " ";
                    }
                    break;
                }
            }

            if (!standsFor.equals("")) {
                JOptionPane.showMessageDialog(null,abbreviation + " stands for: " + standsFor);
            } else {
                JOptionPane.showMessageDialog(null,"End of Search Maybe your abriviation is not valid");
            }


            reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
