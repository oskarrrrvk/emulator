


import javax.swing.*;

import complementos.*;


public class ControlsFrame extends MainFrame{

    private JTabbedPane menuPanel;
    private GBAPanel gbaPanel;
    private GBCGBPanel gbcPanel;
    private GBCGBPanel gbPanel;

    public ControlsFrame(int width, int height){
        
        super(width,height);
        getFrame().setTitle("CONTROLS"); // set the tittle
        getFrame().setResizable(false); // make the frame static ¡
        getFrame().setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //hide the frame when you close it 

        menuPanel = new JTabbedPane();   
        gbaPanel = new GBAPanel();
        gbcPanel = new GBCGBPanel();
        gbPanel = new GBCGBPanel(); 

        getFrame().add(menuPanel);
                
        gbaPanel.insertScreen();
        gbcPanel.insertScreen();
        gbPanel.insertScreen();

        gbaPanel.setLayout(new BoxLayout(gbaPanel, BoxLayout.Y_AXIS));
        gbcPanel.setLayout(new BoxLayout(gbcPanel, BoxLayout.Y_AXIS));
        gbPanel.setLayout(new BoxLayout(gbPanel, BoxLayout.Y_AXIS));

        menuPanel.add("GBA",gbaPanel);
        menuPanel.add("GBC",gbcPanel);
        menuPanel.add("GB",gbPanel);
    }
    
}
