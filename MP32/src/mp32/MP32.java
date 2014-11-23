/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp32;

import java.io.File;

/**
 *
 * @author User
 */
public class MP32 {
    public static Tela1 t1 = new Tela1();
    public static Tela2 t2 = new Tela2();
    public static Tela3 t3 = new Tela3();
    public static Tela4 t4 = new Tela4();
    public static Tela5 t5 = new Tela5();
    public static Tela6 t6 = new Tela6();
    public static Tela7 t7 = new Tela7();
    public static Tela8 t8 = new Tela8();
    public static Tela9 t9 = new Tela9();
    public static Tela10 t10 = new Tela10();
    
    public static void main(String[] args) {
        File a = new File("C:\\UrlSam.txt");
        EscritorDocumento es = new EscritorDocumento();
        
        if(!a.exists()){
        es.escritorDocumento();        
        Tela1 n = new Tela1();
        n.setVisible(true);
        }
        else{
        Tela1 n = new Tela1();
        n.setVisible(true);
}
}}