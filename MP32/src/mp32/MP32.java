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