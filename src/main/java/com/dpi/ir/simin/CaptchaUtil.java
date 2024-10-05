package com.dpi.ir.simin;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

public class CaptchaUtil {

    // Generate random CAPTCHA text of a given length
    public static String generateCaptchaText(int captchaLength) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder captchaStrBuilder = new StringBuilder();
        Random rnd = new Random();
        while (captchaStrBuilder.length() < captchaLength) {
            int index = (int) (rnd.nextFloat() * chars.length());
            captchaStrBuilder.append(chars.charAt(index));
        }
        return captchaStrBuilder.toString();
    }

    // Generate a CAPTCHA image from the CAPTCHA text
    public static byte[] generateCaptchaImage(String captchaText) throws IOException {
        int width = 160;
        int height = 40;
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = bufferedImage.createGraphics();
        Font font = new Font("Arial", Font.BOLD, 24);
        g2d.setFont(font);

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHints(rh);

        GradientPaint gp = new GradientPaint(0, 0,
                Color.blue, 0, height / 2, Color.white, true);

        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);

        g2d.setColor(Color.black);
        g2d.drawString(captchaText, 20, 30);

        g2d.dispose();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "png", baos);
        return baos.toByteArray();
    }
}
