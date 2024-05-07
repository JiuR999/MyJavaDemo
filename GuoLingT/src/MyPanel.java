import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class MyPanel extends JPanel implements ActionListener {
        int x, y ;
        JButton onOff ;
        Timer time ;
        boolean flag ;
        boolean color ;
        File file = new File("/ÐÇÐÇ.png") ;
        URL url = null;
        URI uri = null ;
        ImageIcon icon;
        AudioClip clip = null;
        MyPanel() {
            setLayout(null);
            onOff = new JButton() ;
            icon = new ImageIcon("/ÐÇÐÇ.png");
            icon.setImage(icon.getImage().getScaledInstance(50,50, 0)) ;
            onOff.addActionListener(this) ;
            onOff.setBorder(null) ;
            onOff.setContentAreaFilled(false) ;
            onOff.setBounds(0, 0, 50, 50) ;
            this.add(onOff);
            flag = true ;
            color = true ;
            time = new Timer(300,this) ;
            time.stop() ;
            try {
                uri=file.toURI();
                url = uri.toURL() ;
            }
            catch (MalformedURLException e1) {}
            clip= Applet.newAudioClip(url);
        }
        public void paintComponent(Graphics g) {
            x = 380 ;
            y = 100 ;

            Color red = new Color(255, 0, 0) ;
            Color yellow = new Color(255, 241, 0) ;
            Color blue = new Color(0x2BB1EF) ;
            Color happy = new Color(0xAEF607);
            Color happies = new Color(0xF1C4F1) ;
            Color top1 = new Color(0xFDFA6F8B, true);
            Color top2 = new Color(0x9C44F5);

            if(color) {
                drawDecoration(x, y-25, 0, top1, g);
            }
            else {
                drawDecoration(x, y-25, 0, top2, g);
            }
            drawTree(1, 4, g) ;
            if(color) {
                drawDecoration(x+22, y-44, 6, yellow, g);
                drawDecoration(x, y-22, 8, red, g);
            }
            else {
                drawDecoration(x+22, y-44, 6, red, g);
                drawDecoration(x, y-22, 8, blue, g);
            }
            x = 380-2*22;
            drawTree(3, 6, g) ;
            if(color) {
                drawDecoration(x+22, y-44, 10, blue, g);
                drawDecoration(x, y-22, 12, red, g);
            }
            else {
                drawDecoration(x+22, y-44, 10, red, g);
                drawDecoration(x, y-22, 12, yellow, g);
            }
            x = 380-4*22;
            drawTree(5, 8, g) ;
            if(color) {
                drawDecoration(x+66, y-88, 10, yellow, g);
                drawDecoration(x+44, y-66, 12, red, g);
                drawDecoration(x+22, y-44, 14, blue, g);
                drawDecoration(x, y-22, 16, yellow, g);
            }
            else {
                drawDecoration(x+66, y-88, 10, blue, g);
                drawDecoration(x+44, y-66, 12, yellow, g);
                drawDecoration(x+22, y-44, 14, red, g);
                drawDecoration(x, y-22, 16, blue, g);
            }
            x = 380-1*22;
            drwaRoot(g) ;
            drwafloor(g) ;

            //love
            if(color){
                //L
                for(x=60,y=70;x>20&&y<150;x--,y+=2){
                    drawDecoration(x, y, 0, happy, g);
                }
                for(x=20;x<80;x++){
                    drawDecoration(x, 150, 0, happy, g);
                }

                //O
                for(x=170,y=70;x>130&&y<150;x--,y+=2){
                    drawDecoration(x, y, 0, happy, g);
                }
                for(x=230,y=70;x>190&&y<150;x--,y+=2){
                    drawDecoration(x, y, 0, happy, g);
                }
                for(x=230;x>170;x--){
                    drawDecoration(x, 70, 0, happy, g);
                }
                for(x=190;x>130;x--){
                    drawDecoration(x, 150, 0, happy, g);
                }

                //V
                for(x=20,y=200;x<60&&y<280;x++,y+=3){
                    drawDecoration(x, y, 0, happy, g);
                }
                for(x=80,y=200;x>20&&y<280;x--,y+=3){
                    drawDecoration(x, y, 0, happy, g);
                }

                //E
                for(x=230;x>170;x--){
                    drawDecoration(x, 200, 0, happy, g);
                }
                for(x=210;x>150;x--){
                    drawDecoration(x, 240, 0, happy, g);
                }
                for(x=190;x>130;x--){
                    drawDecoration(x, 280, 0, happy, g);
                }
                for(x=170,y=200;x>130&&y<280;x--,y+=2){
                    drawDecoration(x, y, 0, happy, g);
                }
            }else{
                //L
                for(x=70,y=70;x>30&&y<150;x--,y+=2){
                    drawDecoration(x, y, 0, happies, g);
                }
                for(x=30;x<90;x++){
                    drawDecoration(x, 150, 0, happies, g);
                }

                //O
                for(x=180,y=70;x>140&&y<150;x--,y+=2){
                    drawDecoration(x, y, 0, happies, g);
                }
                for(x=240,y=70;x>200&&y<150;x--,y+=2){
                    drawDecoration(x, y, 0, happies, g);
                }
                for(x=240;x>180;x--){
                    drawDecoration(x, 70, 0, happies, g);
                }
                for(x=200;x>140;x--){
                    drawDecoration(x, 150, 0, happies, g);
                }

                //V
                for(x=30,y=200;x<70&&y<280;x++,y+=3){
                    drawDecoration(x, y, 0, happies, g);
                }
                for(x=90,y=200;x>30&&y<280;x--,y+=3){
                    drawDecoration(x, y, 0, happies, g);
                }

                //E
                for(x=240;x>180;x--){
                    drawDecoration(x, 200, 0, happies, g);
                }
                for(x=220;x>160;x--){
                    drawDecoration(x, 240, 0, happies, g);
                }
                for(x=200;x>140;x--){
                    drawDecoration(x, 280, 0, happies, g);
                }
                for(x=180,y=200;x>140&&y<280;x--,y+=2){
                    drawDecoration(x, y, 0, happies, g);
                }
            }

            //ÍÃ×Ó
            if(color){
                g.setColor(red);
                g.setFont(new Font("¿¬Ìå", Font.HANGING_BASELINE, 20));
                g.drawString("¨q¨r¨q¨r            ¨q¨r¨q¨r", 725, 392);
                g.drawString("¨q£­©Ø©Ø¡ï¨r        ¨q£­©Ø©Ø¡ï¨r", 702, 412);
                g.drawString("©¦¡ò¡¡  ¦à©¦        ©¦¦à¡¡  ¡ò©¦", 699, 432);
                g.drawString("¨t¡ð£­£­¡ð¨s        ¨t¡ð£­£­¡ð¨s", 696, 452);
            }else{
                g.setColor(top2);
                g.setFont(new Font("¿¬Ìå", Font.HANGING_BASELINE, 20));
                g.drawString("¨q¨r¨q¨r            ¨q¨r¨q¨r", 725, 392);
                g.drawString("¨q£­©Ø©Ø¡ï¨r        ¨q£­©Ø©Ø¡ï¨r", 702, 412);
                g.drawString("©¦¡ò¡¡  ¦à©¦        ©¦¦à¡¡  ¡ò©¦", 699, 432);
                g.drawString("¨t¡ð£­£­¡ð¨s        ¨t¡ð£­£­¡ð¨s", 696, 452);
            }

            if(color){
                drawWrite(500,150,0, happy,g);
            }else {
                drawWrite(502,152,0, top1,g);
            }

            if(color){
                drawPhone(550,250,0, happy,g);
                drawPig(600,350,0, happy,g);
            }else {
                drawPhone(552,252,0, top2,g);
                drawPig(602,352,0, top2,g);
            }

        }
        void drawTree(int from, int to, Graphics g)	{
            Color c = new Color(9, 124, 37) ;
            g.setColor(c) ;
            for(int i=from; i<=to; i++) {
                for(int j=0; j<(i*2-1); j++) {
                    g.fillRect(x, y, 20, 20);
                    x += 22 ;
                }
                x = 380-i*22 ;
                y += 22 ;
            }
        }
        void drawDecoration(int tx, int ty, int num, Color c, Graphics g) {
            g.setColor(c) ;
            g.fillRoundRect(tx, ty, 18, 18, 18, 18) ;
            g.fillRoundRect(tx+num*22, ty, 18, 18, 18, 18) ;
        }

        void drawWrite(int tx, int ty, int num, Color c, Graphics g) {
            g.setColor(c);
            g.setFont(new Font("»ªÎÄçúçê", Font.HANGING_BASELINE, 100));
            g.drawString("Merry Christmas", tx, ty);
        }

        void drawPhone(int tx, int ty, int num, Color c, Graphics g) {
            g.setColor(c);
            g.setFont(new Font("»ªÎÄçúçê", Font.HANGING_BASELINE, 50));
            g.drawString("( £þ ¨Œ£þ)o¨q¨s¡î#¨t _©¤©n©¤)¨s ", tx, ty);
        }

        void drawPig(int tx, int ty, int num, Color c, Graphics g) {
            g.setColor(c);
            g.setFont(new Font("»ªÎÄçúçê", Font.HANGING_BASELINE, 50));
            g.drawString("¹ù¡îÁá¡îÍ®¡îÐ¡ÏÉÅ®£¡£¡£¡", tx, ty-40);
            g.drawString("PS:-->£¨¹ùÁáÍ®ÊÇÉµ¹Ï£©£¡£¡£¡", tx, ty+10);
        }

        void drwaRoot(Graphics g) {
            Color c = new Color(131, 78, 0) ;
            g.setColor(c);
            for(int i=0; i<4; i++) {
                for(int j=0; j<3; j++) {
                    g.fillRect(x, y, 20, 20);
                    x += 22 ;
                }
                x = 380-1*22 ;
                y += 22 ;
            }
        }
        void drwafloor(Graphics g) {
            Color c = new Color(0x5BAA0B) ;
            g.setColor(c);
            for(int i=0; i<2; i++) {
                x=0;
                for(int j=0; j<60; j++) {
                    g.fillRect(x, y, 20, 20);
                    x += 22 ;
                }
                y += 22 ;
            }
        }
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == onOff) {
                if(flag) {
                    ImageIcon icon = new ImageIcon("/ÐÇÐÇ.png");
                    icon.setImage(icon.getImage().getScaledInstance(50,50, 0)) ;
                    flag = false ;
                    clip.loop();
                    time.restart() ;
                }
                else {
                    ImageIcon icon = new ImageIcon("/ÐÇÐÇ.png");
                    icon.setImage(icon.getImage().getScaledInstance(50,50, 0)) ;
                    flag = true ;
                    time.stop() ;
                    clip.stop() ;
                }
            }
            else if(e.getSource() == time) {
                repaint() ;
                color = !color ;
            }
        }
    }
    
