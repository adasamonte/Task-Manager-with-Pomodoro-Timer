package MyApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TimerApp extends JFrame {
    private int count = 3600; // default: 1 hour
    private boolean isRunning = false;

    private JLabel label;
    private JLabel messageLabel;
    private JLabel titleLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer swingTimer;

    public TimerApp() {
        // === Window setup ===
        setTitle("Timer");
        setSize(400, 400);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        // Position at right side of screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int margin = 50;
        int xLocation = (int) (screenSize.getWidth() - getWidth() - margin);
        int yLocation = 50;
        setLocation(xLocation, yLocation);

        getContentPane().setBackground(new Color(248, 250, 240));

        // === Header panel ===
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(0x7DA060));
        topPanel.setBounds(0, 0, getWidth(), 85);

        titleLabel = new JLabel("TIMER");
        titleLabel.setFont(new Font("Georgia", Font.BOLD, 36));
        titleLabel.setForeground(new Color(248, 250, 240));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(18, 5, 13, 13));

        topPanel.add(titleLabel);
        add(topPanel);

        // === Countdown label ===
        label = new JLabel("01:00:00", SwingConstants.CENTER);
        label.setFont(new Font("Georgia", Font.BOLD, 60));
        label.setBounds(20, 140, 350, 60);
        add(label);

        // Right-click to edit time
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    String newDuration = JOptionPane.showInputDialog(
                            "Enter new duration (HH:MM:SS):");
                    try {
                        String[] parts = newDuration.split(":");
                        if (parts.length == 3) {
                            int hours = Integer.parseInt(parts[0]);
                            int minutes = Integer.parseInt(parts[1]);
                            int seconds = Integer.parseInt(parts[2]);
                            count = hours * 3600 + minutes * 60 + seconds;
                            updateLabel();
                        } else {
                            showError("Invalid format. Use HH:MM:SS.");
                        }
                    } catch (Exception ex) {
                        showError("Invalid input. Please enter numbers.");
                    }
                }
            }
        });

        // === Break message label ===
        messageLabel = new JLabel("Take a Break", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Georgia", Font.BOLD, 20));
        messageLabel.setBounds(20, 100, 350, 40);
        add(messageLabel);

        // Click to edit message
        messageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    String newMessage = JOptionPane.showInputDialog(
                            "Enter a new message:", messageLabel.getText());
                    if (newMessage != null && !newMessage.trim().isEmpty()) {
                        messageLabel.setText(newMessage);
                    }
                }
            }
        });

        // === Buttons ===
        startButton = createButton("Start", 50);
        stopButton = createButton("Stop", 150);
        resetButton = createButton("Reset", 250);

        add(startButton);
        add(stopButton);
        add(resetButton);

        // === Timer logic ===
        swingTimer = new Timer(1000, e -> {
            if (count > 0) {
                count--;
                updateLabel();
            } else {
                swingTimer.stop();
                isRunning = false;
                JOptionPane.showMessageDialog(this,
                        "'" + messageLabel.getText() + "' is done!",
                        "Information",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Button listeners
        startButton.addActionListener(e -> {
            if (!isRunning) {
                isRunning = true;
                swingTimer.start();
            }
        });

        stopButton.addActionListener(e -> {
            isRunning = false;
            swingTimer.stop();
        });

        resetButton.addActionListener(e -> {
            isRunning = false;
            swingTimer.stop();
            count = 3600; // reset to 1 hour
            updateLabel();
        });

        // Confirm on close
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int choice = JOptionPane.showConfirmDialog(
                        TimerApp.this,
                        "Exiting will end the timer. Continue?",
                        "Confirmation",
                        JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });

        // Initial display
        updateLabel();
    }

    private JButton createButton(String text, int x) {
        JButton button = new JButton(text);
        button.setBounds(x, 240, 90, 50);
        button.setFont(new Font("Georgia", Font.BOLD, 15));
        button.setBackground(new Color(0x7DA060));
        button.setForeground(Color.WHITE);
        return button;
    }

    private void updateLabel() {
        int hours = count / 3600;
        int minutes = (count % 3600) / 60;
        int seconds = count % 60;
        label.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error",
                JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TimerApp().setVisible(true));
    }
}
