package AbstractFactory;

public class RectPicture implements PicturesOperation { //передвигающаяся прямоугольная картинка
    private Point topLeft;
    private Point bottomRight;

    public RectPicture(Point topLeft, Point bottomRight) //создание картинки по точкам
    {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Point getTopLeft() //возвращает левую верхнюю точку
    {
        return topLeft;
    }

    public Point getBottomRight() //возвращает правую нижнюю точку
    {
        return bottomRight;
    }

    public void setTopLeft(Point topLeft) //устанавливает верхнюю левую точку
    {
        this.topLeft = topLeft;
    }

    public void setBottomRight(Point bottomRight) //устанавливает правую нижнюю точку
    {
        this.bottomRight = bottomRight;
    }

    @Override
    public void moveTo(int x, int y) //передвигает RectPicture, левый верхний в х,у
    {
        bottomRight.moveTo(bottomRight.getX() - topLeft.getX() + x, bottomRight.getY() - topLeft.getY() + y);
        topLeft.moveTo(x, y);
    }

}
