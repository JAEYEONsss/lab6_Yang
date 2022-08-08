import java.lang.Object;

public class Room {
    protected String name, local;
    protected double monthlyRent, area, sum;
    protected int option;

    public Room(String name, String local, double monthlyRent, double area, int option) {
        this.name = name;
        this.local = local;
        this.monthlyRent = monthlyRent;
        this.area = area;
        this.option = option;
    }

    public int monthlyRentScore() {
        if(monthlyRent < 40)
            return 4;
        else if (monthlyRent >= 40 && monthlyRent < 60) {
            return 3;
        } else
            return 2;
    }

    public int areaScore() {
        if (area >= 25.5 && area < 35.6) {
            return 1;
        } else if (area >= 35.6 && area < 45.7) {
            return 2;
        }else
            return 3;
    }

    public int optionScore() {
        if (option == 1) {
            return 1;
        }else
            return 0;
    }

    public int localScore() {
        if (local.equals("lala")) {
            return 1;
        }else
            return 2;
    }

    public void showRoomScoreInformation() {
    }
}
