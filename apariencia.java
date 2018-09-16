/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofware_contable;

import javax.swing.UIManager;

/**
 *
 * @author Mac
 */
public class apariencia {
    public static void recuadro ()
    {
         try {
                    UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel");
                   
                } catch (Exception e) {
                }
    }
}
