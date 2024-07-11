public class Level2 extends Level1 {
    private Status status;

    public Level2(int id, ComplexType complexField, Status status) {
        super(id, complexField);
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
    public void display() {
        System.out.println("ID: " + getId() + ", Status: " +
                getStatus() + ", ComplexField: " + getComplexField());
    }

    public void display(String prefix) {
        System.out.println(prefix + " ID: " + getId() + ", Status: " +
                getStatus() + ", ComplexField: " + getComplexField());
    }

    public final void display(String prefix, String suffix) {
        System.out.println(prefix + " ID: " + getId() + ", Status: " +
                getStatus() + ", ComplexField: " + getComplexField() + " " + suffix);
    }
}
