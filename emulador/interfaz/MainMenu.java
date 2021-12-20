package interfaz;

import javax.swing.*;
import java.awt.event.*;
public class MainMenu{

    
    private JMenuBar menuBar;
    private JMenu archive;
    private JMenu settings;
    private JMenuItem controls;
    private JMenuItem open;
    private MainFrame controlsFrame;
    private MainFrame openFrame;
    public MainMenu(){
        menuBar= new JMenuBar();
        archive = new JMenu("Files");
        settings = new JMenu("Settings");
        open = new JMenuItem("Open File");
        controls = new JMenuItem("Controls");
        controlsFrame = new ControlsFrame(700, 900);
        openFrame = new OpenFileFrame(800, 500);
        ActionListener actionControlFrame = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            controlsFrame.getFrame().setVisible(true);
            }
        };
        ActionListener actionOpenFileFrame = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            openFrame.getFrame().setVisible(true);
            }
        };
        menuBar.add(archive);
        open.addActionListener(actionOpenFileFrame);
        archive.add(open);
        menuBar.add(settings);
        controls.addActionListener(actionControlFrame);
        settings.add(controls);
        
    }
    //Getter
    public JMenuBar getMenuBar(){return menuBar;}
    
}
