package interfaz;

import javax.swing.*;

public class ControlsFrame extends MainFrame{

    private JPanel GBAPanel;
    private JPanel GBCPanel;
    private JPanel GBPanel;
    private JTabbedPane menuPanel = new JTabbedPane();

    public ControlsFrame(int width, int height){
        
        super(width,height);
        getFrame().setTitle("CONTROLS"); // set the tittle
        getFrame().setResizable(false); // make the frame static ¡
        getFrame().setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //hide the frame when you close it 

        GBAPanel = new JPanel();
        GBCPanel = new JPanel();
        GBPanel = new JPanel();

        

        getFrame().add(menuPanel);
        menuPanel.addTab("GBA",GBAPanel);
        menuPanel.addTab("GBC",GBCPanel);
        menuPanel.addTab("GB",GBPanel);

    }
    
}
