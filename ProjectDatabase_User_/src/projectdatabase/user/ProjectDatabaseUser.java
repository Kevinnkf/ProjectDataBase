/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectdatabase.user;

import projectdatabase.Connection.DBConnection;
import projectdatabase.Frame.UserFrame;

/**
 *
 * @author USER
 */
public class ProjectDatabaseUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBConnection db = new DBConnection();
        System.out.println(db.open()); 
        UserFrame frame = new UserFrame();
        frame.setVisible(true) ;
    }
    
}
