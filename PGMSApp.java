/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgmsapp;

import java.sql.SQLException;

/**
 *
 * @author urn
 */
public class PGMSApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        new PGMSLogin().setVisible(true);
    }
    
}
