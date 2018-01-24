
class Circle {
    public double x; // абсцисса центра
    public double y; // ордината центра
    public double r; // радиус

    //конструктор
    Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    //длина окуружности
    void lenghtCir() {
        double lenCir = Math.PI * 2 * r;
        System.out.println("Длина окружности равна " + lenCir);
    }
    //координаты центра круга в случайном дипазоне
    void rundCen() {
        this.x = ((Math.random() * 198) - 99);
        this.y = ((Math.random() * 198) - 99);
        System.out.println("Координаты центра круга в случайном дипазоне: по X = " + x + " по У = " + y);
    }

    //расстояние между центрами двух окружностей
    double distCen(Circle cir1, Circle cir2) {
        double lenghtX;
        double lenghtY;
        if ((((cir1.x <= 0) && (cir2.x >= 0)) || ((cir1.x >= 0) && (cir2.x <= 0)))) {
            lenghtX = Math.abs(Math.abs(cir1.x) + Math.abs(cir2.x));

        } else {
            lenghtX = Math.abs(Math.abs(cir1.x) - Math.abs(cir2.x));
        }
        if ((((cir1.y <= 0) && (cir2.y >= 0)) || ((cir1.y >= 0) && (cir2.y <= 0)))) {
            lenghtY = Math.abs(Math.abs(cir1.y) + Math.abs(cir2.y));
        } else {
            lenghtY = Math.abs(Math.abs(cir1.y) - Math.abs(cir2.y));
        }

        double lenghtDiag = Math.sqrt(lenghtX * lenghtX + lenghtY * lenghtY);
        return lenghtDiag;

    }

}

