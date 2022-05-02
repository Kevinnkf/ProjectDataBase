/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdatabase.Helper;

import javax.swing.JTable;

/**
 *
 * @author USER
 */
public class UserHelper {
    public String getValueRows(JTable table, int index) {
        return table.getValueAt(table.getSelectedRow(), index).toString();
    }
    
    public String parseLikeQuery(String query) {
        return "%" + query + "%";
    }
}