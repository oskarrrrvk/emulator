package complementos;

import java.util.LinkedList;

import javax.swing.*;

public class GBAPanel extends Panel{

    private LinkedList <JTextField> textCollection;
    private LinkedList <JLabel> labelCollection;
   
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JTextField text4;
    private JTextField text5;
    private JTextField text6;
    private JTextField text7;
    private JTextField text8;
    private JTextField text9;
    private JTextField text10;
 
   
   
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;

    public GBAPanel(){
        

        textCollection = new LinkedList<>();
        labelCollection = new LinkedList<>();
        
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();
        text6 = new JTextField();
        text7 = new JTextField();
        text8 = new JTextField();
        text9 = new JTextField();
        text10 = new JTextField();

        label1 = new JLabel("A");
        label2 = new JLabel("B");
        label3 = new JLabel("R");
        label4 = new JLabel("L");
        label5 = new JLabel("START");
        label6 = new JLabel("SELECT");
        label7 = new JLabel("up arrow");
        label8 = new JLabel("down arrow");
        label9 = new JLabel("left arrow");
        label10 = new JLabel("rigth arrow");

    }

    public void insertScreen(){

        textCollection.add(text1);
        textCollection.add(text2);
        textCollection.add(text3);
        textCollection.add(text4);
        textCollection.add(text5);
        textCollection.add(text6);
        textCollection.add(text7);
        textCollection.add(text8);
        textCollection.add(text9);
        textCollection.add(text10);

        labelCollection.add(label1);
        labelCollection.add(label2);
        labelCollection.add(label3);
        labelCollection.add(label4);
        labelCollection.add(label5);
        labelCollection.add(label6);
        labelCollection.add(label7);
        labelCollection.add(label8);
        labelCollection.add(label9);
        labelCollection.add(label10);

        insert(textCollection, labelCollection);
    }

}
