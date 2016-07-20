
package misClases;

import java.io.File;
import java.io.IOException;
import net.coobird.thumbnailator.Thumbnails;


public class Generar_Thumb {
    
    
    public void convertirImgEnThumb() {
        try {
            Thumbnails.of(new File("sharpei.png"))
                    .size(70, 102)
                    .toFile(new File("thumbnail.png"));
            //img = new File("thumbnail.jpg");

        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        
    }
    
    
}
