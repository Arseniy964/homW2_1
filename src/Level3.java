public final class Level3 extends Level2 {

    public Level3(int id, ComplexType complexField, Status status) {
        super(id, complexField, status);
    }

    @Override
    public void display() {
        System.out.println("Level3 Display - ID: " + getId()
                + ", Status: " + getStatus() + ", ComplexField: "
                + getComplexField());
    }
}