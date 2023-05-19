package Computer;

public class RAM {

    private String name;
    private String size;

    public RAM() {
    name = "default";
    size = "default";
    }

    public RAM(String ramName, String ramSize) {
    this.name = ramName;
    this.size = ramSize;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
}
