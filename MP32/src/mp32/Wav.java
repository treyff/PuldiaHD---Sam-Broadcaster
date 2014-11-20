package mp32;

//sons  
  

import java.io.File;  
import java.applet.*;  
import java.io.IOException;

  
public class Wav {  

    private AudioClip   wav;
    
    
    public void Sons(String path) {  
          
                try{
            wav   = Applet.newAudioClip(new File(path).toURL());  
              
        }  
        catch (IOException e) {  
              
         System.out.println("Erro. Verifique o diretorio da Vinheta.");  
        }  
    } 
    
   
    public void tocarWav() {  
          
        wav.play(); 
        
    }
    public void close() {  
          
        wav.stop(); 
        
    }
            
}  