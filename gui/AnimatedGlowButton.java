package com.learnjava.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnimatedGlowButton extends JButton {
    private static final long serialVersionUID = 1L; 

    private Color normalColor;
    private Color hoverColor;
    private Color pressColor;
    private boolean isHovered;
    private boolean isPressed;
    private float glowRadius;
    private Timer glowTimer;

    public AnimatedGlowButton(String text) {
        super(text);

        normalColor  = new Color(30, 30, 60);     
        hoverColor   = new Color(80, 0, 200);      
        pressColor   = new Color(200, 0, 100);     

        isHovered = false;
        isPressed = false;
        glowRadius = 0f;

        setForeground(Color.WHITE);
        setFont(new Font("Segoe UI", Font.BOLD, 16));
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setPreferredSize(new Dimension(220, 55));

        glowTimer = new Timer(20, e -> {
            if (isHovered) {
                glowRadius = Math.min(glowRadius + 1.5f, 18f);
            } else {
                glowRadius = Math.max(glowRadius - 1.5f, 0f);
            }
            repaint();
        });
        glowTimer.start();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                isHovered = true;
                setFont(new Font("Segoe UI", Font.BOLD, 17));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                isHovered = false;
                isPressed = false;
                setFont(new Font("Segoe UI", Font.BOLD, 16));
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                isPressed = true;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                isPressed = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();

        if (glowRadius > 0) {
            for (int i = (int) glowRadius; i > 0; i -= 2) {
                float alpha = (glowRadius - i) / glowRadius * 0.15f;
                g2d.setColor(new Color(120, 0, 255, (int)(alpha * 255)));
                g2d.fillRoundRect(-i, -i, w + i * 2, h + i * 2, 30 + i, 30 + i);
            }
        }

        Color bgColor;
        if (isPressed) {
            bgColor = pressColor;
        } else if (isHovered) {
            bgColor = hoverColor;
        } else {
            bgColor = normalColor;
        }

        g2d.setColor(bgColor);
        g2d.fillRoundRect(0, 0, w, h, 25, 25);

        g2d.setColor(new Color(255, 255, 255, 40));
        g2d.fillRoundRect(4, 4, w - 8, h / 2 - 4, 20, 20);

        g2d.setStroke(new BasicStroke(1.5f));
        g2d.setColor(new Color(180, 100, 255, 180));
        g2d.drawRoundRect(1, 1, w - 2, h - 2, 25, 25);

        FontMetrics fm = g2d.getFontMetrics(getFont());
        int textX = (w - fm.stringWidth(getText())) / 2;
        int textY = (h - fm.getHeight()) / 2 + fm.getAscent();

        g2d.setColor(new Color(0, 0, 0, 100));
        g2d.setFont(getFont());
        g2d.drawString(getText(), textX + 1, textY + 1);

        g2d.setColor(getForeground());
        g2d.drawString(getText(), textX, textY);

        g2d.dispose();
    }
}