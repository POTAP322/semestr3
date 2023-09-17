package Sem3Task1;

import Sem3Task1.DrawingElements.Sun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class DrawPanel extends JPanel {
    Sun sun1;
    public DrawPanel() {
        sun1 = new Sun(200, 200, 150, 50, 10, Color.orange);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sun1.setX(sun1.getX()+10);
                repaint();
            }
        });
    }


    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
//      g.rotate(Math.toRadians(90),400,300);

        //небо
        g.setPaint(new LinearGradientPaint(400, 0, 400, 600,
                new float[]{0.2f, 0.7f},
                new Color[]{Color.decode("#7FB4DC"), Color.decode("#D3F2FF")}));
        g.fillRect(0, 0, 800, 600);


        //ОБЛАКА
        g.setColor(Color.white);
        int[] x10 = {670,667,604,595,565,563,530,534,498,374,375,425,435,473,473,484,487,524,524,539,540,564,565,582,584,598,605};
        int[] y10 = {360,280,274,222,221,183,180,158,155,159,204,206,237,239,280,281,303,305,312,312,319,320,335,334,346,348,358};
        g.fillPolygon(x10,y10,x10.length);
        int[] x11 = {376,379,394,395,388,387,293,256,254,258,261,271,272,300,300,362};
        int[] y11 = {157,125,122,100,95,80,76,80,104,105,131,132,137,137,158,161};
        g.fillPolygon(x11,y11,x11.length);
        int[] x12 = {171,209,208,212,211,207,194,194,190,172,170,135,121,120,132,132,134,145,145,168};
        int[] y12 = {236,235,230,231,215,207,206,186,174,171,166,166,168,208,209,214,215,215,218,218};
        g.fillPolygon(x12,y12,x12.length);
        int[] x14 = {134,134,130,127,126,99,97,92,92,71,71,45,42,42,7,5,12,12,21,24,38,37};
        int[] y14 = {162,131,128,128,117,116,101,101,98,97,95,95,94,91,91,112,113,120,122,130,130,161};
        g.fillPolygon(x14,y14,x14.length);
        int[] x13 = {185,208,208,246,246,185};
        int[] y13 = {78,78,81,81,52,51};
        g.fillPolygon(x13,y13,x13.length);
        int[] x15 = {381,415,449,451,419,383};
        int[] y15 = {151,153,150,126,123,126};
        g.fillPolygon(x15,y15,x15.length);
        int[] x16 = {607,644,643,606};
        int[] y16 = {270,271,258,259};
        g.fillPolygon(x16,y16,x16.length);



        //ДОМ НА ЗАДНЕМ ПЛАНЕ
        g.setColor(Color.decode("#A0999C"));
        int[] x5 = {800,778,778,742,742,760,740,690,675,632,632,612,612,563,574,532,517,500,495,460,460,800};
        int[] y5 = {444,444,423,423,400,400,370,365,337,337,341,341,360,360,345,345,358,358,366,366,530,540};
        g.fillPolygon(x5,y5,x5.length);

        //ДОМ ЗАДНЯЯ ЧАСТЬ
        g.setColor(Color.decode("#372B2F"));
        int[] x = {0,0,70,70,100,105,147,145,155,155,200,200,190};
        int[] y = {470,180,180,195,195,220,230,265,265,275,275,300,480};
        g.fillPolygon(x,y,x.length);
        int[] x4 = {405,422,422,450,451,400};
        int[] y4 = {250,250,266,265,310,310};
        g.fillPolygon(x4,y4,x4.length);

        //ЗЕМЛЯ
        g.setColor(Color.decode("#77676C"));
        int[] x1 = {0,500,506,510,610,616,800,800,0};
        int[] y1 = {490,500,510,510,510,520,522,600,600};
        g.fillPolygon(x1,y1,9);
        //ДОМ ПЕРЕДНЯЯ ЧАСТЬ
        g.setColor(Color.decode("#544649"));
        int[] x2 = {465,470,478,478,470,471,420,421,415,413,330,333,283,280,240,237,225,222,165,163,142,141,110,113,90,91,30,34,56,55,20,24,180,183,160,162,140,135,102,100,75,75,68,68,60,60,40,35,0,0};
        int[] y2 = {515,380,378,362,360,290,280,292,295,240,237,182,180,210,212,243,242,293,295,317,320,340,341,250,251,166,167,255,260,340,341,370,378,410,411,440,444,466,465,435,435,442,442,454,454,463,463,470,470,512};
        g.fillPolygon(x2,y2,x2.length);
        int[] x3 = {242,90,90,250};
        int[] y3 = {250,250,264,264};
        g.fillPolygon(x3,y3,x3.length);
        //ДВЕРЬ ОКНО
        g.setColor(Color.decode("#372B2F"));
        int[] x6 = {207,207,290,290};
        int[] y6 = {482,357,356,480};
        g.fillPolygon(x6,y6,x6.length);
        int[] x7 = {400,450,450,404};
        int[] y7 = {450,450,385,383};
        g.fillPolygon(x7,y7,x7.length);
        //КАРНИЗ
        g.setColor(Color.decode("#372B2F"));
        int[] x8 = {470,295,295,460};
        int[] y8 = {380,380,374,375};
        g.fillPolygon(x8,y8,x8.length);
        g.setColor(Color.decode("#735E62"));
        int[] x9 = {475,412,414,473};
        int[] y9 = {360,360,363,363};
        g.fillPolygon(x9,y9,x9.length);
        g.setColor(Color.decode("#2F1F24"));
        g.drawRoundRect(383,323,80,30,7,7);
        g.setColor(Color.decode("#dbe9ff"));
        g.fillRoundRect(383,323,80,30,7,7);
        g.setColor(Color.decode("#2F1F24"));
        //g.scale(1.2,1.2);
        Font font = new Font("Lucida Sans Regular", Font.ROMAN_BASELINE, 13);
        g.setFont(font);
        g.drawString("ulica",408,336);
        g.drawString("Prózna",402,348);








    }

}
