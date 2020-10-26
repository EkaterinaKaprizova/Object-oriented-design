package AbstractFactory;

    public class Point {//отдельный класс, по которому созданы картинки
        private int x;
        private int y;

        public Point(int x, int y) //конструктор точки
        {
            this.x = x;
            this.y = y;
        }

        public Point() //точка с 0.0
        {
            this(0, 0);
        }

        public int getX() //возвращает x
        {
            return x;
        }

        public int getY() //возвращает y
        {
            return y;
        }

        public void setX(int x) //устанавливает новую координату x
        {
            this.x = x;
        }

        public void setY(int y) //устанавливает новую координату y
        {
            this.y = y;
        }

        public void moveTo(int x, int y) //смещение точки
        {
            this.x = x;
            this.y = y;
        }

        public void moveRel(int dx, int dy) //смещение на dx, dy
        {
            x += dx;
            y += dy;
        }
}
