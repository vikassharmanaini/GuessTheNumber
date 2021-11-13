package com.guibest.prodaction.level.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

class my_first_game{
    public void success(int time){
        Frame succeed=new Frame("Success");
        JLabel label=new JLabel();
        label.setIcon(new ImageIcon("C:\\Users\\SANIANAQVI\\IdeaProjects\\games_and_ds_tester\\image\\success.png"));
        Font font2 = new Font("SansSerif", Font.BOLD, 20);
        label.setFont(font2);
        label.setVisible(true);
        label.setForeground(Color.GREEN);
        label.setBounds(-20,0,500,400);

        Label text=new Label();
        text.setVisible(true);
        text.setBounds(100,400,350,30);
        text.setText("You Have Succeed In "+time+" Attempts");
        text.setFont(font2);
        text.setBackground(Color.GRAY);
        text.setForeground(Color.green);


        Label rights=new Label();
        Font font3 = new Font("SansSerif", Font.PLAIN, 15);
        rights.setFont(font3);
        rights.setText("Used under the Law: International Copyright Order, 1999");
        rights.setBounds(10,450,500,20);
        rights.setForeground(Color.BLACK);
        rights.setVisible(true);
//        You have succeeded in four attempts
        succeed.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                succeed.dispose();
            }
        });
        //regular windows setting

        ImageIcon img=new ImageIcon("C:\\Users\\SANIANAQVI\\IdeaProjects\\games_and_ds_tester\\image\\icon.png");
        succeed.add(rights);
        succeed.setIconImage(img.getImage());
        succeed.add(label);
        succeed.add(text);
        succeed.setResizable(false);
        succeed.setBackground(Color.GRAY);
        succeed.setLayout(null);
        succeed.setVisible(true);
        succeed.setSize(500,500);
        succeed.setLocation(400,130);
    }
    public int deigned(){

        Frame frame=new Frame("Guess The Number");

        Label label =new Label("Let's Start to Guess The Number");
        Font font2 = new Font("SansSerif", Font.BOLD, 20);
        label.setFont(font2);
        label.setVisible(true);
        label.setForeground(Color.GREEN);
        label.setBounds(145,30,200,50);
        label.setForeground(Color.white);

        TextField text=new TextField();
        text.setVisible(true);
        text.setSize(200,30);
        text.setLocation(145,90);
        text.setForeground(Color.white);
        text.setBackground(Color.LIGHT_GRAY);
        text.setFont(font2);


        Label label1 =new Label();
        Font font = new Font("SansSerif", Font.BOLD, 30);
        label1.setFont(font);
        label1.setVisible(true);
        label1.setBounds(50,200,480,300);
        label1.setForeground(Color.green);




        Button submit=new Button("Submit");
        submit.setFont(font);
        submit.setSize(200,30);
        submit.setLocation(145,150);
        Random random=new Random();
        final int ran=random.nextInt(100);
        System.out.println(ran);
        submit.addMouseListener(new MouseListener() {
            int i=0;
            @Override
            public void mouseClicked(MouseEvent e) {
                int enter= Integer.parseInt(text.getText());
                i++;
                if (enter > ran) {
                    label1.setForeground(Color.RED);
                    label1.setText("Your Number Is Too Greater");
                }
                else if (enter<ran){
                    label1.setForeground(Color.RED);
                    label1.setText("Your Number Is Too Smaller");
                }
                else if (enter==ran){
                    success(i);
                    frame.dispose();
                }
                text.setText("");
                System.out.println(i);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                submit.setBackground(Color.GREEN);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                submit.setBackground(Color.WHITE);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        Label rights=new Label();
        Font font3 = new Font("SansSerif", Font.PLAIN, 15);
        rights.setFont(font3);
        rights.setText("Created By Vikas Sharma");
        rights.setBounds(15,450,500,20);
        rights.setForeground(Color.BLACK);
        rights.setVisible(true);

        //frame add component
        frame.add(rights);
        frame.add(submit);
        frame.add(label);
        frame.add(text);
        frame.add(label1);

        //**********************frame working***************************
        //windows listener
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        //regular windows setting
        ImageIcon img=new ImageIcon("C:\\Users\\SANIANAQVI\\IdeaProjects\\games_and_ds_tester\\image\\icon.png");
        frame.setIconImage(img.getImage());
        frame.setBackground(Color.GRAY);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLocation(400,130);
        return 0;

    }

}

