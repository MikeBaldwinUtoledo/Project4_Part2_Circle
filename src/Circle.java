import javax.swing.*;

public class Circle {
// Written by: Mike Baldwin
// Computes the average of a set of values entered by the user, e.g. with
//     10.0 5.0 6.0 9.0 0.0
// The average is 7.5

public static void main(String[] args) {
    JPanel panel = new JPanel();
    JTextField xVar = new JTextField(5);
    JTextField yVar = new JTextField(5);
    int x, y, confirmCode;
    boolean isInCircle;


    panel.add(new JLabel("x: "));
    panel.add(xVar);
    panel.add(Box.createHorizontalStrut(15));
    panel.add(new JLabel("y: "));
    panel.add(yVar);

    confirmCode = JOptionPane.showConfirmDialog(null, panel,
            "Enter a point with two coordinates: ", JOptionPane.OK_CANCEL_OPTION);
    if (confirmCode == JOptionPane.OK_OPTION) {
        x = Integer.parseInt(xVar.getText());
        y = Integer.parseInt(yVar.getText());
        isInCircle = Distance(x, y) < 10.0f;
        JOptionPane.showMessageDialog(null, "Point (" + x + ", " + y + ") " +
                (isInCircle ? "is " : "is not ") + "in the circle.");
    }
}

private static float Distance(int x, int y) {
    return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
}
}
