package ru.job4j.condition;
public class TrgArea {
    private Point first;
    private Point second;
    private Point third;
    public TrgArea(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    /**Метод принимает длины сторон треугольника и вычисляет периметр
     * @param a
     * @param b
     * @param c
     * @return
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    /** Метод вычисляет площадь треугльника
     *
     * @return
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
    /** Метод принимает вычисленные длины сторон треугольника и определяет возможность существования треугольника с такими параметрами
     * @param a
     * @param c
     * @param b
     * @return
     */
    private boolean exist(double a, double c, double b) {
        return (a + b > c && a + c > b && a + c > b);
    }
}
