/*Цилиндр:
        - Фигуранын аянтын (square) эсептеген формула: 2*PI * radius*( height + radius);
        - Фигуранын коломун эсептеген формула: (PI*radius*radius*height);
        -Формулалар Cylinder классында жазылуусу керек*/
public class Cylinder {
    private int height;
    private int radius;

    public Cylinder() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void searchSquare() {
        System.out.println(2 * 3.14 * radius * (height + radius));

    }

    public void searchSize() {
        System.out.println(3.14 * radius * radius * height);
    }


    @Override
    public String toString() {
        return "Cylinder: " + "height " + height + ", radius " + radius;
    }
}
