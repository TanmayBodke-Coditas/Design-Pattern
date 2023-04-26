public class ShapeFactoryAbstract implements AbstractFactory{

    public Shape createShape() {
        return new Square();
    }
    public Color createColor() {
        return new Red();
    }
}
