/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp32;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class EscritorDocumento {
    FileWriter can;
    BufferedWriter buff;
    public void escritorDocumento(){
        File file = new File("C:\\UrlSam.txt");
        if(file.exists()){
        try {
            can = new FileWriter(file);
            buff = new BufferedWriter(can);
            buff.write(JOptionPane.showInputDialog(null, 
                    "ATENÇÃO:\b"
                            + "1°Passo:\n"
                            + "-Se o seu Sam for o Novo (4.9.1):\n"
                            + "Abra o SamBroadcaster vá em tools> Jump to> Data Path.\n"
                            + "ele deve abri uma pasta do SAM, agora vá até SAM DB.\n"
                            + "no arquivo SAMDB.FDB clique com o botão direito vá em propriedades.\n"
                            + "Agora na aba segurança copie todo o Nome do Objeto\n"
                            + "-Se o seu Sam for o Classico(4.2.2):\n"
                            + "Vá até a pasta de instalação do seu SAM:\n"
                            + "Arquivos de Programas>SpacialAudio>SAMBC>SAMBD\n"
                            + "no arquivo SAMDB.FDB clique com o botão direito vá em propriedades.\n"
                            + "Agora na aba segurança copie todo o Nome do Objeto\n"
                            + "2° Cole o Nome do Objeto!\n"
                            + "Deve ficar como no Exemplo:\n"
                            + "C:\\Users\\User\\AppData\\Local\\SpacialAudio\\SAMBC\\SAMDB\\SAMDB.FDB"));
            buff.close();
        } 
        catch (IOException ex) {
        }
        
    
    }
        else{
            try {
            file.createNewFile();
            can = new FileWriter(file);
            buff = new BufferedWriter(can);
            buff.write(JOptionPane.showInputDialog(null,"ATENÇÃO:\b"
                            + "1°Passo:\n"
                            + "-Se o seu Sam for o Novo (4.9.1):\n"
                            + "Abra o SamBroadcaster vá em tools> Jump to> Data Path.\n"
                            + "ele deve abri uma pasta do SAM, agora vá até SAM DB.\n"
                            + "no arquivo SAMDB.FDB clique com o botão direito vá em propriedades.\n"
                            + "Agora na aba segurança copie todo o Nome do Objeto\n"
                            + "-Se o seu Sam for o Classico(4.2.2):\n"
                            + "Vá até a pasta de instalação do seu SAM:\n"
                            + "Arquivos de Programas>SpacialAudio>SAMBC>SAMBD\n"
                            + "no arquivo SAMDB.FDB clique com o botão direito vá em propriedades.\n"
                            + "Agora na aba segurança copie todo o Nome do Objeto\n"
                            + "2° Cole o Nome do Objeto!\n"
                            + "Deve ficar como no Exemplo:\n"
                            + "C:\\Users\\User\\AppData\\Local\\SpacialAudio\\SAMBC\\SAMDB\\SAMDB.FDB"));
            buff.close();
            } catch (IOException ex) {
                }
            
        }
    
    
}}
