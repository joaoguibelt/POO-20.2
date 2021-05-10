package tacocat;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Player extends GameObject{
 
   BufferedImage imageParado;
   BufferedImage imageBatendo;
   BufferedImage imageParadoflip;
   BufferedImage imageBatendoflip; 
    Player(int x, int y)throws IOException {
        super(x, y, ID.Player, true);
        File file = new File("");
        
        
            this.imageParado = ImageIO.read(new File(file.getAbsoluteFile()+"\\src\\tacocat\\Sprites\\gatoParado.png"));
      
            
        
      
        
            this.imageBatendo = ImageIO.read(new File(file.getAbsoluteFile()+"\\src\\tacocat\\Sprites\\gatoBatendo.png"));
           
        

            this.imageParadoflip = ImageIO.read(new File(file.getAbsoluteFile()+"\\src\\tacocat\\Sprites\\gatoParadoflip.png"));

  
        

            this.imageBatendoflip = ImageIO.read(new File(file.getAbsoluteFile()+"\\src\\tacocat\\Sprites\\gatoBatendoflip.png"));
       
 
               
    }
    
    
    @Override
    public void tick() {
        this.setX(this.getX());
        this.setY(this.getY());
    }

    @Override
    public void render(Graphics g) {

        if(this.isDireita() == false){
            if(isParado() == true){
                g.drawImage(imageParado, this.getX(), this.getY(), null);
            }
            else if(isParado() == false){
                g.drawImage(imageBatendo, this.getX(), this.getY(), null);
            }
        }
        else if(this.isDireita() == true){
            if(isParado() == true){
                g.drawImage(imageParadoflip, this.getX(), this.getY(), null);
            }
            else if(isParado() == false){
                g.drawImage(imageBatendoflip, this.getX(), this.getY(), null);
            }
        }
    }

    @Override
    public void frenesi() {    }


    
    
    
}
