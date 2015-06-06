package gui;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 7446192599263749847L;

	public Window()
    {
        super("GL52 | Bus Network");                 
        setSize(new Dimension(800,600));    

        JPanel pan=new JPanel();
        BoxLayout    bl=new BoxLayout(pan,BoxLayout.Y_AXIS);
        pan.setLayout(bl);       

        JTextField  tf=new JTextField("Editez !");
        pan.add(tf);       


        JPanel  pan2=new   JPanel(); 
        bl=new BoxLayout(pan2,BoxLayout.X_AXIS); 
        pan2.setLayout(bl);       

        String  c[] ={"Add a bus","Add a stop","Add a line"};
        JComboBox<?>   cb=new JComboBox<Object>(c);
        pan2.add(cb);       

        pan.add(pan2);       

        JButton but=new JButton("Validate");
        pan.add(but);       
        JButton but2=new JButton("Run");
        pan.add(but2);  

        
        setContentPane(pan);        
        setVisible(true);    
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}