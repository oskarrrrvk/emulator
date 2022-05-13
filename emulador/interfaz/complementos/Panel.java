package complementos;

import java.util.LinkedList;

import javax.swing.*;

public class Panel extends JPanel{

    protected void insert(LinkedList<JTextField> textCollection, LinkedList <JLabel> labelCollection){
        int i;
        for(i = 0; i < labelCollection.size(); i++ ){
            add(labelCollection.get(i));
            add(textCollection.get(i));
        }
       
    }    
}

/**
 *  Container container1 = new Panel();
        Container container2 = new Panel();
        BoxLayout box1 = new BoxLayout(container1, BoxLayout.X_AXIS);
        BoxLayout box2 = new BoxLayout(container2, BoxLayout.Y_AXIS);


        for(i = 0; i < textCollection.size(); i++ ){
            container1.add(labelCollection.get(i));
            container2.add(textCollection.get(i));
        }

        for(i = 0; i < textCollection.size();i++){
            add(box1.getTarget());
            add(box2.getTarget());
        }
 */
