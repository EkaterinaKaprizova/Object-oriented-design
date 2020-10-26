package AbstractFactory;

public class FactoryRound { //фабрика круглых картинок
    private Point center;
    private int radius;

    public FactoryRound(Point center, int radius) //создает картинку по центру, радиусу и формату
    {
        this.center = center;
        this.radius = radius;
    }

    public PicturesOperation moveR()
    {
        return new RoundPicture(center,radius);
    }

    public ResizePictures resizeR()
    {
        return new RoundPictureResize(center, radius);
    }
}
