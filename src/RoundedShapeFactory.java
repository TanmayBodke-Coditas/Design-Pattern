public class RoundedShapeFactory implements AbstractFactory{
    public Shape createShape() {
        return new Circle();
    }
    public Color createColor() {
        return new Blue();
    }
}
