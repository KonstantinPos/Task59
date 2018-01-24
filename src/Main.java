public class Main {
    public static void main(String[] args) {
        Circle o1 = new Circle(10, 11, 2);
        Circle o2 = new Circle(12, 31, 1);
        o1.lenghtCir();
        o1.rundCen();
        o2.lenghtCir();
        o2.rundCen();

        System.out.println("Расстояние между центрами окружностей " + (o1.distCen(o1, o2)));
        if ((o1.distCen(o1, o2)) > (o1.r + o2.r)) {
            System.out.println("Окружности не касаются в одной точке");
        }
        if (((o1.distCen(o1, o2)) == (o1.r + o2.r))) {
            System.out.println("Окружности касаются в одной точке");
        }
        if (o1.r > o2.r) {
            if ((o1.r - o2.r) == (o1.distCen(o1, o2))) {
                System.out.println("Окружности касаются в одной точке");
            }
        }
        if (o2.r > o1.r) {
            if ((o2.r - o1.r) == (o1.distCen(o1, o2))) {
                System.out.println("Окружности касаются в одной точке");
            }
        }

    }
}

