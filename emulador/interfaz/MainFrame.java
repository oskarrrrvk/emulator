package interfaz;

import java.awt.BorderLayout;

import javax.swing.*;

public class MainFrame{
    
    
    //Attributes
    private JFrame frame = new JFrame("EMULATOR");
    private JPanel pantalla = new JPanel();
    //Constructors
    public MainFrame(int width, int height){
        this.frame.setSize(width, height);
        this.frame.setLocation(0, 0);
    }
    //Getter
    public JFrame getFrame(){return this.frame;}
    //Setter
    public void setMenuBar(MainMenu mainMenu){
        this.frame.add(mainMenu.getMenuBar());
        this.frame.getContentPane().add(BorderLayout.NORTH,mainMenu.getMenuBar());
    }
    
    //Metodo
    public void insetarPantalla(){
        this.frame.add(this.pantalla);
        this.frame.getContentPane().add(BorderLayout.CENTER,this.pantalla);
    }
}
