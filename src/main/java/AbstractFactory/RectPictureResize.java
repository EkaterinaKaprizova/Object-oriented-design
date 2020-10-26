package AbstractFactory;

public class RectPictureResize implements ResizePictures { //изменяющая размеры прямоугольная картинка
    private Point topLeft;
    private Point bottomRight;

    public RectPictureResize(Point topLeft, Point bottomRight) //создание картинки по точкам
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

    public int getWidth() //ширина RectPicture
    {
        return bottomRight.getX() - topLeft.getX() + 1;
    }

    public int getHeight() //высота RectPicture
    {
        return bottomRight.getY() - topLeft.getY() + 1;
    }

    @Override
    public void resize(double ratio) //изменение ширины и длины в ratio раз
    {
        int newWidth = (int) (getWidth() * ratio);
        if (newWidth == 0) {
            newWidth = 1;
        }
        int newHeight = (int) (getHeight() * ratio);
        if (newHeight == 0) {
            newHeight = 1;
        }
        bottomRight.moveTo(topLeft.getX() + newWidth - 1, topLeft.getY() + newHeight - 1);
    }
}
