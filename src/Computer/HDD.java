package Computer;

public class HDD {

    private String name;
    private String size;
    private String type;

    public HDD() {
    name = "default";
    size = "default";
    type = "default";

    }
    public HDD(String hddName, String hddSize, String hddType) {
    this.name = hddName;
    this.size = hddSize;
    this.type = hddType;
    }
}
