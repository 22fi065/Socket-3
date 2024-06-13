import java.awt.Color;
import java.awt.Graphics;

public class Otamsinyann {
    int h = 100;
    int w = 100;

    int xStart = 0;
    int yStart = 0;

    public void setXY(int x, int y) {
        this.xStart = x;
        this.yStart = y;
    }

    public void setSize(int h, int w) {
        this.h = h;
        this.w = h;
    }

    void makeFace(Graphics g) {
        // makeRim(g);
        makeEyes(g, w / 5);
        makeNose(g, h / 5);
        makeMouth(g, w / 2);
    }

    public void makeFace(Graphics g, String emotion) {
        // **ここにemotion毎の顔を用意する。*///
        if (emotion.equals("normal")) {
            makeEyes(g, w / 5);
            makeNose(g, h / 5);
            makeMouth(g, w / 2);
            drawBrow(g, 10);
        } else {
            emotion.equals("angly");
            makeEyes(g, w / 5);
            makeNose(g, h / 5);
            makeMouth(g, w / 2);
            drawBrow(g, 10);

        }

    }

    /*
     * public void makeRim(Graphics g) { g.drawLine(xStart, yStart, xStart + h,
     * yStart); g.drawLine(xStart, yStart, xStart, yStart + w);
     * g.drawLine(xStart, yStart + w, xStart + h, yStart + w); g.drawLine(xStart
     * + h, yStart, xStart + h, yStart + w); }
     */

    void makeEyes(Graphics g, int eyeSize) {
        // setColor(Color.red);
        // g.fillRect(xStart + (h * 1 / 3) - 20, yStart + (w * 1 / 3) - 10,
        // 10, 10);

        g.setColor(Color.blue);

        g.fillArc(xStart + (h * 2 / 7), yStart + (w * 1 / 3), eyeSize, eyeSize,
                0, 300);
        g.setColor(Color.black);
        g.drawOval(xStart + (h * 2 / 7), yStart + (w * 1 / 3), eyeSize, eyeSize);
        g.drawOval(xStart + (h * 4 / 7), yStart + (w * 1 / 3), eyeSize, eyeSize);
    }// makeEyes()

    public void makeNose(Graphics g, int noseSize) {
        g.drawLine(xStart + (h * 1 / 2), yStart + (w * 2 / 4), xStart
                + (h * 1 / 2), yStart + (w * 2 / 4) + noseSize);
    }// makeNose() end

    public void drawBrow(Graphics g, int updown) { // xは目の幅 呼ばれる方(=定義する方)
        int wx1 = xStart + w * 2 / 8;
        int wx2 = xStart + w * 5 / 8;
        int wy = yStart + h / 5;
        g.drawLine(wx1, wy + updown, wx1 + w * 1 / 8, wy);
        g.drawLine(wx2, wy, wx2 + w * 1 / 8, wy + updown);
    }

    public void makeMouth(Graphics g, int mouseSize) {
        int xMiddle = xStart + h / 2;
        int yMiddle = yStart + 3 * w / 4;
        g.drawLine(xMiddle - mouseSize / 2, yMiddle, xMiddle + mouseSize / 2,
                yMiddle);
    }

}
