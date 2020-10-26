package AbstractFactory;

public class RoundPicture implements PicturesOperation { //передвигающаяся круглая картинка
    private Point center;
    private int radius;

    public RoundPicture(Point center, int radius) //создает картинку по центру, радиусу и формату
    {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() //возвращает центр
    {
        return center;
    }

    public int getRadius() //возвращает радиус
    {
        return radius;
    }

    public void setCenter(int x, int y) //устанавливает центр
    {
        center = new Point(x, y);
    }

    public void setRadius(int radius) //устанавливает радиус
    {
        this.radius = radius;
    }
    @Override
    public void moveTo(int x, int y) //передвигает центр в x,y
    {
        center = new Point(x, y);
    }

}
