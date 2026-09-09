package com.learnjava.gui;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class AnalogClockWidget extends JPanel {
    private static final long serialVersionUID = 1L; 

    public AnalogClockWidget() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(new Color(20, 20, 30));

        Timer timer = new Timer(1000, e -> repaint());
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width  = getWidth();
        int height = getHeight();
        int cx = width / 2;
        int cy = height / 2;
        int radius = Math.min(width, height) / 2 - 20;

        g2d.setColor(new Color(30, 30, 50));
        g2d.fillOval(cx - radius, cy - radius, 2 * radius, 2 * radius);

        g2d.setStroke(new BasicStroke(6));
        g2d.setColor(new Color(100, 180, 255));
        g2d.drawOval(cx - radius, cy - radius, 2 * radius, 2 * radius);

        for (int i = 0; i < 12; i++) {
            double angle = Math.toRadians(i * 30);
            int x1 = (int) (cx + (radius - 15) * Math.sin(angle));
            int y1 = (int) (cy - (radius - 15) * Math.cos(angle));
            int x2 = (int) (cx + (radius - 5)  * Math.sin(angle));
            int y2 = (int) (cy - (radius - 5)  * Math.cos(angle));
            g2d.setStroke(new BasicStroke(3));
            g2d.setColor(new Color(100, 180, 255));
            g2d.drawLine(x1, y1, x2, y2);
        }

        for (int i = 0; i < 60; i++) {
            if (i % 5 == 0) continue;
            double angle = Math.toRadians(i * 6);
            int x1 = (int) (cx + (radius - 8)  * Math.sin(angle));
            int y1 = (int) (cy - (radius - 8)  * Math.cos(angle));
            int x2 = (int) (cx + (radius - 3)  * Math.sin(angle));
            int y2 = (int) (cy - (radius - 3)  * Math.cos(angle));
            g2d.setStroke(new BasicStroke(1));
            g2d.setColor(new Color(80, 120, 180));
            g2d.drawLine(x1, y1, x2, y2);
        }

        g2d.setFont(new Font("SansSerif", Font.BOLD, 16));
        g2d.setColor(new Color(200, 220, 255));
        FontMetrics fm = g2d.getFontMetrics();
        for (int i = 1; i <= 12; i++) {
            double angle = Math.toRadians(i * 30);
            String num = String.valueOf(i);
            int tx = (int) (cx + (radius - 32) * Math.sin(angle)) - fm.stringWidth(num) / 2;
            int ty = (int) (cy - (radius - 32) * Math.cos(angle)) + fm.getAscent() / 2;
            g2d.drawString(num, tx, ty);
        }

        Calendar cal = Calendar.getInstance();
        int hours   = cal.get(Calendar.HOUR);
        int minutes = cal.get(Calendar.MINUTE);
        int seconds = cal.get(Calendar.SECOND);

        double hourAngle   = Math.toRadians((hours * 30) + (minutes * 0.5));
        double minuteAngle = Math.toRadians((minutes * 6) + (seconds * 0.1));
        double secondAngle = Math.toRadians(seconds * 6);

        drawHand(g2d, cx, cy, hourAngle, (int)(radius * 0.50), 7, new Color(200, 220, 255));
        drawHand(g2d, cx, cy, minuteAngle, (int)(radius * 0.70), 5, new Color(150, 200, 255));
        drawHand(g2d, cx, cy, secondAngle, (int)(radius * 0.85), 2, new Color(255, 80, 80));

        g2d.setColor(new Color(255, 80, 80));
        g2d.fillOval(cx - 7, cy - 7, 14, 14);
        g2d.setColor(Color.WHITE);
        g2d.fillOval(cx - 3, cy - 3, 6, 6);
    }

    private void drawHand(Graphics2D g2d, int cx, int cy,
                          double angle, int length, int width, Color color) {
        int x = (int) (cx + length * Math.sin(angle));
        int y = (int) (cy - length * Math.cos(angle));
        g2d.setStroke(new BasicStroke(width, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.setColor(color);
        g2d.drawLine(cx, cy, x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Analog Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new AnalogClockWidget());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}