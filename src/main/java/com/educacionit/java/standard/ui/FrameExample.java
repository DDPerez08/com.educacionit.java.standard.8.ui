
package com.educacionit.java.standard.ui;


import java.awt.*;


public class FrameExample extends Frame {


    public FrameExample () {

        super ();

        Button b = new Button ("Enter");

        // setting button position on screen
        b.setBounds(50,50,50,50);

        // adding button into frame
        add (b);

        // Setting Frame width and height
        setSize (500,300);

        // Setting the title of Frame
        setTitle ("Educacion IT");

        // Setting the layout for the Frame
        setLayout (new FlowLayout ());

        /* By default frame is not visible so
         * we are setting the visibility to true
         * to make it visible.
         */
        setVisible (true);
    }


    public static void main (String args[]) {

        // Creating the instance of Frame
        FrameExample fr = new FrameExample ();
    }
}