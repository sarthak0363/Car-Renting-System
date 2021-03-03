package car_rent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manager
{
    
	JFrame manager_frame ;
    JFrame check_frame ;
    JFrame update_details ;
	 
	public void first()
	{
		   manager_frame = new JFrame();
	       manager_frame.getContentPane().setLayout(null);
	       
	       JPanel panel = new JPanel();
	       panel.setBounds(0, 0, 231, 510);
	       manager_frame.getContentPane().add(panel);
	       panel.setLayout(null);
	       
	       JButton checkdetails_button = new JButton("New button");
	       checkdetails_button.setBounds(357, 113, 85, 21);
	       manager_frame.getContentPane().add(checkdetails_button);
	       
	       JButton update_button = new JButton("New button");
	       update_button.setBounds(357, 189, 85, 21);
	       manager_frame.getContentPane().add(update_button);
	       
	       JButton report_button = new JButton("New button");
	       report_button.setBounds(357, 296, 85, 21);
	       manager_frame.getContentPane().add(report_button);
	       manager_frame.setVisible(true);
	   }
	
    public void check()
    {
    	
    }
	
	public static void main(String[] args)
	{
	       Manager ma =new Manager();
	       ma.first();
	
         }
}
