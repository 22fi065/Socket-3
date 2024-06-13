package sorce;

public class nyan {
    FaceObj[] fobjs= new FaceObj[9];

    for(
    int j = 0;j<3;j++)
    {

        for (int i = 0; i < 3; i++) {

            fobjs[i + 3 * j] = new FaceObj();
            fobjs[i + 3 * j].setPosition(200 * i + 50, 200 * j + 50);
            fobjs[i + 3 * j].setEmotionLevel(i, j);
            fobjs[i + 3 * j].drawFace(g);
        }
    }
}
