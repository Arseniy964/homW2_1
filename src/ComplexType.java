public class ComplexType {
    private String name;
    private int value;

    public ComplexType(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ComplexType {name = '' + name + '', value = '' + value +}";
    }
}