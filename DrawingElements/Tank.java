package Sem3Task1.DrawingElements;

import java.awt.*;

public class Tank {
    private int x,y;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void draw(Graphics2D gr){
        int x = getX();
        int y = getY();
        //корпус с башней
        gr.setColor(Color.decode("#708090"));
        int[] x1 = {0,15,65,144,147,100,100,147,148,151,151,196,196,200,201,270,272,276,276,293,299,323,323,299,291,273,273,299,301,309,313,381,399,379,51,15,5};
        int[] y1 = {470,448,434,433,425,425,392,386,375,374,367,367,376,376,390,398,401,401,397,397,405,405,420,420,427,427,432,432,435,435,456,458,480,460,452,457,470};
        for (int i = 0; i < x1.length; i++) {
            x1[i] +=x;
            y1[i] +=y;
        }
        gr.fillPolygon(x1,y1,x1.length);
        gr.setColor(Color.decode("#272727"));
        int[] x2 = {7,13,16,75,370,385,386,397,379,52,15,6};
        int[] y2 = {470,470,480,510,510,485,481,480,460,453,459,470};
        for (int i = 0; i < x2.length; i++) {
            x2[i] +=x;
            y2[i] +=y;
        }
        gr.fillPolygon(x2,y2,x2.length);

        gr.setColor(Color.decode("#4F4F4F"));
        int[] x3 = {18,85,85,121,121,155,156,187,187,235,235,280,280,314,315,329,329,340,348,325,78};
        int[] y3 = {492,493,501,501,493,492,501,501,492,492,502,502,492,492,501,501,492,492,529,535,535};
        for (int i = 0; i < x3.length; i++) {
            x3[i] +=x;
            y3[i] +=y;
        }
        gr.fillPolygon(x3,y3,x3.length);

        int r1 =28;
        int r2=20;
        int r3=12;
        //катки
        gr.setColor(Color.decode("#6B6B6B"));
        gr.fillOval(38-r1+x,503-r1+y,r1*2,r1*2);
        gr.fillOval(360-r1+x,506-r1+y,r1*2,r1*2);

        for (int i = 0; i < 6; i++) {
            int a = 44;
            gr.fillOval(95-r2+x+a*i,532-r2+y,r2*2,r2*2);
        }
        gr.fillOval(131-r3+x,483-r3+y,r3*2,r3*2);
        gr.fillOval(201-r3+x,480-r3+y,r3*2,r3*2);
        gr.fillOval(299-r3+x,483-r3+y,r3*2,r3*2);

        //гусеницы

        gr.setStroke(new BasicStroke(5));
        gr.setColor(Color.decode("#708090"));
        int[] x4 = {10,21,118,304,375,390,383,320,81,19,10};
        int[] y4 = {500,479,471,470,479,499,527,550,554,523,500};
        for (int i = 0; i < x4.length; i++) {
            x4[i] +=x;
            y4[i] +=y;
        }
        gr.drawPolyline(x4,y4,x4.length);

        //пулемёт
        gr.setColor(Color.decode("#3E3E3E"));
        gr.fillRect(312+x,444+y,27,5);

        //номер
        gr.setColor(Color.white);
        Font font = new Font("Rockwell Extra Bold", Font.PLAIN, 20);
        gr.setFont(font);
        gr.drawString("381",220,421);






    }


}
