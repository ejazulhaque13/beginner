package LC09;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageMatrix extends JFrame {
    private BufferedImage image;
    private int[][] imageMatrix;

    public ImageMatrix() {
        // Load the image
        try {
            image = ImageIO.read(new File("C:\\Users\\ejazb\\OneDrive\\Pictures\\Saved Pictures\\wp4471355-1024x1024-wallpapers.jpg")); // Change the path to your image file
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Convert the image to a matrix
        imageMatrix = convertToMatrix(image);

        // Set up the JFrame
        setTitle("Image Display");
        setSize(image.getWidth(), image.getHeight());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Add a custom JPanel to display the image
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        });
    }

    private int[][] convertToMatrix(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        int[][] matrix = new int[height][width];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixel = image.getRGB(x, y);
                matrix[y][x] = pixel;
            }
        }

        return matrix;
    }

    public void printMatrix() {
        for (int[] row : imageMatrix) {
            for (int pixel : row) {
                System.out.printf("%08X ", pixel); // Print pixel value in hex format
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageMatrix frame = new ImageMatrix();
            frame.setVisible(true);
            frame.printMatrix(); // Print the matrix to the console
        });
    }
}

