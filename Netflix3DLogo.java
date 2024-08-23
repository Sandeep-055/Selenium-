package sandeep1;
	import javax.swing.*;
	import java.awt.*;

	public class Netflix3DLogo extends JPanel {
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Netflix 3D Logo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 400);
	        frame.add(new Netflix3DLogo());
	        frame.setVisible(true);
	    }

	  
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D g2d = (Graphics2D) g;
	        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	        int centerX = getWidth() / 2;
	        int centerY = getHeight() / 2;

	        // Set colors
	        Color netflixRed = new Color(229, 9, 20);
	        Color netflixBlack = new Color(20, 20, 20);

	        // Draw the background
	        g2d.setColor(Color.WHITE);
	        g2d.fillRect(0, 0, getWidth(), getHeight());

	        // Draw the main rectangular shape
	        int logoWidth = 180;
	        int logoHeight = 50;
	        int rectX = centerX - logoWidth / 2;
	        int rectY = centerY - logoHeight / 2;
	        g2d.setColor(netflixRed);
	        g2d.fillRect(rectX, rectY, logoWidth, logoHeight);

	        // Draw the tilted rectangle
	        int tiltHeight = 16;
	        int tiltWidth = 50;
	        int tiltX = rectX + logoWidth;
	        int tiltY = rectY - tiltHeight;
	        int[] xPoints = {tiltX, tiltX + tiltWidth, tiltX, rectX};
	        int[] yPoints = {tiltY, tiltY + tiltHeight, rectY + logoHeight, rectY};
	        g2d.setColor(netflixBlack);
	        g2d.fillPolygon(xPoints, yPoints, 4);

	        // Draw the "N" letter
	        g2d.setColor(Color.WHITE);
	        int fontSize = 38;
	        Font font = new Font("Helvetica", Font.BOLD, fontSize);
	        g2d.setFont(font);
	        String letterN = "N";
	        FontMetrics fontMetrics = g2d.getFontMetrics();
	        int letterWidth = fontMetrics.stringWidth(letterN);
	        int letterHeight = fontMetrics.getHeight();
	        int letterX = centerX - letterWidth / 2;
	        int letterY = centerY + letterHeight / 3;
	        g2d.drawString(letterN, letterX, letterY);
	    }
	}


