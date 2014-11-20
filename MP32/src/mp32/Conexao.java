/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp32;

import java.io.*;
import java.sql.*;

/**
 *
 * @author User
 */
public class Conexao {

    FileReader leitor;
    BufferedReader buff;
    String data;
    String path;
    private final String drive = "org.firebirdsql.jdbc.FBDriver";
    private String dir;
    private final String usuario = "SYSDBA";
    private final String senha = "masterkey";
    Connection con;
    

       //conectar com diretorios diferentes FUDEU!C:\\Users\\User\\AppData\\Local\\SpacialAudio\\SAMBC\\SAMDB\\SAMDB.FDB
    private void LerDb() {
        try {
            data = "C:\\UrlSam.txt";
            leitor = new FileReader(data);
            buff = new BufferedReader(leitor);

           //Linha
            path = buff.readLine();
            dir = "jdbc:firebirdsql:localhost/3050:"+path;
        } catch (IOException e) {

        }
    }

    public Conexao() {
        try {
            LerDb();
            Class.forName(drive);
        } catch (ClassNotFoundException e) {

        }

    }

    public Connection Conectar() {
        try {
            LerDb();
            con = DriverManager.getConnection(dir, usuario, senha);
        } catch (SQLException e) {
        }
        return con;
    }

}
