/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp32;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class LeitorDocumento {
    
    FileReader leitor;
    BufferedReader buff;
    
    //Declarando as Linhas!!
    String urlArquivo;    
    String intro = new String();
    String Aba1 = new String();
    String a1l1 = new String();
    String a1l2 = new String();
    String a1l3 = new String();
    String a1l4 = new String();
    String a1l5 = new String();
    String a1l6 = new String();
    String a1l7 = new String();
    String a1l8 = new String();
    String a1l9 = new String();
    String a1l10 = new String();
    
    String Aba2 = new String();
    String a2l1 = new String();
    String a2l2 = new String();
    String a2l3 = new String();
    String a2l4 = new String();
    String a2l5 = new String();
    String a2l6 = new String();
    String a2l7 = new String();
    String a2l8 = new String();
    String a2l9 = new String();
    String a2l10 = new String();
    
    String Aba3 = new String();
    String a3l1 = new String();
    String a3l2 = new String();
    String a3l3 = new String();
    String a3l4 = new String();
    String a3l5 = new String();
    String a3l6 = new String();
    String a3l7 = new String();
    String a3l8 = new String();
    String a3l9 = new String();
    String a3l10 = new String();
    
    String Aba4 = new String();
    String a4l1 = new String();
    String a4l2 = new String();
    String a4l3 = new String();
    String a4l4 = new String();
    String a4l5 = new String();
    String a4l6 = new String();
    String a4l7 = new String();
    String a4l8 = new String();
    String a4l9 = new String();
    String a4l10 = new String();
    
    String Aba5 = new String();
    String a5l1 = new String();
    String a5l2 = new String();
    String a5l3 = new String();
    String a5l4 = new String();
    String a5l5 = new String();
    String a5l6 = new String();
    String a5l7 = new String();
    String a5l8 = new String();
    String a5l9 = new String();
    String a5l10 = new String();
    
    String Aba6 = new String();
    String a6l1 = new String();
    String a6l2 = new String();
    String a6l3 = new String();
    String a6l4 = new String();
    String a6l5 = new String();
    String a6l6 = new String();
    String a6l7 = new String();
    String a6l8 = new String();
    String a6l9 = new String();
    String a6l10 = new String();
      
    
  public void leitura(){
  try{      urlArquivo = "C:\\vinhetas.txt";
            leitor = new FileReader(urlArquivo);
            buff = new BufferedReader(leitor);
            
            //Lendo as Linhas AQUI!
                   
            intro  = buff.readLine();
            Aba1  = buff.readLine();
            a1l1 = buff.readLine();
            a1l2 = buff.readLine();
            a1l3 = buff.readLine();
            a1l4 = buff.readLine();
            a1l5 = buff.readLine();
            a1l6 = buff.readLine();
            a1l7 = buff.readLine();
            a1l8 = buff.readLine();
            a1l9 = buff.readLine();
            a1l10 = buff.readLine();
            
            Aba2  = buff.readLine();
            a2l1 = buff.readLine();
            a2l2 = buff.readLine();
            a2l3 = buff.readLine();
            a2l4 = buff.readLine();
            a2l5 = buff.readLine();
            a2l6 = buff.readLine();
            a2l7 = buff.readLine();
            a2l8 = buff.readLine();
            a2l9 = buff.readLine();
            a2l10 = buff.readLine();
            
            Aba3  = buff.readLine();
            a3l1 = buff.readLine();
            a3l2 = buff.readLine();
            a3l3 = buff.readLine();
            a3l4 = buff.readLine();
            a3l5 = buff.readLine();
            a3l6 = buff.readLine();
            a3l7 = buff.readLine();
            a3l8 = buff.readLine();
            a3l9 = buff.readLine();
            a3l10 = buff.readLine();
            
            Aba4  = buff.readLine();
            a4l1 = buff.readLine();
            a4l2 = buff.readLine();
            a4l3 = buff.readLine();
            a4l4 = buff.readLine();
            a4l5 = buff.readLine();
            a4l6 = buff.readLine();
            a4l7 = buff.readLine();
            a4l8 = buff.readLine();
            a4l9 = buff.readLine();
            a4l10 = buff.readLine();
            
            Aba5  = buff.readLine();
            a5l1 = buff.readLine();
            a5l2 = buff.readLine();
            a5l3 = buff.readLine();
            a5l4 = buff.readLine();
            a5l5 = buff.readLine();
            a5l6 = buff.readLine();
            a5l7 = buff.readLine();
            a5l8 = buff.readLine();
            a5l9 = buff.readLine();
            a5l10 = buff.readLine();
            
            Aba6  = buff.readLine();
            a6l1 = buff.readLine();
            a6l2 = buff.readLine();
            a6l3 = buff.readLine();
            a6l4 = buff.readLine();
            a6l5 = buff.readLine();
            a6l6 = buff.readLine();
            a6l7 = buff.readLine();
            a6l8 = buff.readLine();
            a6l9 = buff.readLine();
            a6l10 = buff.readLine();
            
            
            buff.close();
              
            
    }
  catch(IOException e){
      
  }}
    
}
