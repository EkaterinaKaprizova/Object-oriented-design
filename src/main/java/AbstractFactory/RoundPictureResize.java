package AbstractFactory;

public class RoundPictureResize implements ResizePictures { //изменяющаяся в размерах круглая картинка
    private Point center;
    private int radius;

    public RoundPictureResize(Point center, int radius) //создает картинку по центру, радиусу и формату
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
    public void resize(double ratio)
    {
        this.radius = Math.max((int) (radius * ratio), 1);
    }
}
