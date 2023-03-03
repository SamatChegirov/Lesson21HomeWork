/*Параллелепипед:
        - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
        - Фигуранын коломун эсептеген формула: (length*width*height);
        -Формулалар Parallelepiped классында жазылуусу керек*/

public class Parallelepiped {
    private int height;   //высота
    private int length;   //длина
    private int width;    //ширина

    public Parallelepiped() {
    }

    public void searchSquarePar() {
        System.out.println(2 * ((height * length) + (length * width) + (height * width)));
    }

    public void searchSizePar() {
        System.out.println(length * width * height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Parallelepiped: " + "height " + height + ", length " + length + ", width " + width;
    }
}
