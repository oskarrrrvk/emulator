package interfaz;

import javax.swing.*;
public class GraphicInterface extends Exception{
    public static void main (String args[]){
        try{
            
            MainFrame mainFrame = new MainFrame(900,700);//instantiation of the first frame
            MainMenu mainMenu = new MainMenu();
            mainFrame.setMenuBar(mainMenu);
            mainFrame.getFrame().setVisible(true);//make the object visible
            mainFrame.insetarPantalla();
            mainFrame.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//control the end of the execution
            
        }catch(NullPointerException nul){System.out.println(nul.getMessage());}
        
    }
}