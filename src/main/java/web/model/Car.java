package web.model;

public class Car {
    private int seria;
    private String number;
    private String model;

    public Car () {
    }

    public Car (int seria,String number,String model) {
        this.seria = seria;
        this.number = number;
        this.model = model;
    }

    public int getSeria() {
        return seria;
    }

    public void setSeria(int seria) {
        this.seria = seria;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seria=" + seria +
                ", number='" + number + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
