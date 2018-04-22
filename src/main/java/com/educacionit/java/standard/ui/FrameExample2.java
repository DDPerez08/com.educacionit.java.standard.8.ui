
package com.educacionit.java.standard.ui;


import java.awt.*;


public class FrameExample2 {


    public FrameExample2 () {

        super ();

        // Creating Frame
        Frame fr = new Frame ();

        // Creating a label
        Label lb = new Label ("UserId: ");

        // Adding label to the frame
        fr.add (lb);

        // Creating Text Field
        TextField t = new TextField ();

        // Adding text field to the frame
        fr.add (t);

        // Setting frame size
        fr.setSize (500, 300);

        //Setting the layout for the Frame
        fr.setLayout (new FlowLayout ());

        fr.setVisible (true);
    }


    public static void main (String args[]) {

        FrameExample2 ex = new FrameExample2 ();
    }
}