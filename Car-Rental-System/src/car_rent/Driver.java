package car_rent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Driver 
{
	JFrame driver_frame ;

	public void location()
	{
		driver_frame = new JFrame ();
		driver_frame.setVisible(true);
		
	   }

	
	public static void main(String[] args) 
	{
		Driver d =new Driver();
		d.location();
	       }



    }  // End of DRIVER CLASS
