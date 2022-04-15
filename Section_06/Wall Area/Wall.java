public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        if (width < 0 && height < 0) {
            this.width = 0;
            this.height = 0;

        } else if (width < 0) {
            this.height = height;
            this.width = 0;
        } else if (height < 0) {
            this.height = 0;
            this.width = width;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        if (width < 0)
            this.width = 0;
        else
            this.width = width;
    }

    public void setHeight(double height) {
        if (height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    public double getArea() {
        return this.height * this.width;

    }

    public static void main(String[] args) {
        Wall wall = new Wall(-1.25, -1.25);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
