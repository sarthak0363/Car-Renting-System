package car_rent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Car  
{
	JFrame car_frame ;
	
	public void show_car()
	{
		car_frame = new JFrame ();
	}
	
	public static void main(String[] args)
	{
		Car cr = new Car();
		cr.show_car();
	}

	

}
