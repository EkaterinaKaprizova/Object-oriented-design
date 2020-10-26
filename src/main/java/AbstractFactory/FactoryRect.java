package AbstractFactory;

public class FactoryRect implements AFactory { //фабрика прямоугольных картинок

    private Point topLeft;
    private Point bottomRight;

    public FactoryRect(Point topLeft, Point bottomRight) //создание картинки по точкам
    {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public PicturesOperation moveR()
    {
        return new RectPicture(topLeft, bottomRight);
    }

    public ResizePictures resizeR()
    {
        return new RectPictureResize(topLeft, bottomRight);
    }
}
