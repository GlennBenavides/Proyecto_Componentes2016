
package misClases;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import net.coobird.thumbnailator.*;
import net.coobird.thumbnailator.geometry.Positions;

/**
 * Using Thumbnailator, this application will produce a thumbnail
 * from a JPEG file and write that out to another JPEG file.  
 * @author Glenn
 */
public class Principal {
    
    public static void main(String[] args) throws IOException{
        
        // Se debe correr esta clase para probar el THUMBNAILATOR
        // Así como está,sólo se puede probar una vez.
        // Antes de correr esta clase por primera vez, cerciórese de que el archivo llamado
        // thumbnail.png  que está dentro del proyecto, no tiene una foto...
        // El sistema lo que hará es construir un thumbnail de una foto que existe
        // por aparte e imprimirla en este archivo de tipo .png  ya con el tamaño
        // apropiado de un thumbnail...
        // Según la investigación del otro grupo y la nuestra, ésta es la mejor librería..!!
        // Y al Profe le encantó que es lo principal...!!!!
        
        
        Generar_Thumb fotito = new Generar_Thumb();
        fotito.convertirImgEnThumb();
    
    }
    
}
    
         
/*
        Thumbnails.of(new File("/imagenes/fotoGlenn.png"))
        .size(175, 255)
        .toFile(new File("thumbnail.jpg"));
 */
 /*   BufferedImage originalImage = ImageIO.read(new File("fotoGlenn.png"));
    BufferedImage watermarkImage = ImageIO.read(new File("fotoGlenn.png"));

    BufferedImage thumbnail = Thumbnails.of(originalImage)
            .size(200, 200)
            .watermark(Positions.BOTTOM_RIGHT, watermarkImage, 0.5f)
            .asBufferedImage();
 */


