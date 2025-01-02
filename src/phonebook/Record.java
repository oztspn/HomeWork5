package phonebook;

public class Record {
    private String phone;
    private String name;

    public Record(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name + " - phone: " + phone;
    }
}
