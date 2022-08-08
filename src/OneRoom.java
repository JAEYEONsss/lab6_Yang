public class OneRoom extends Room{
    double sum = 0;

    public OneRoom(String name, String local, double monthlyRent, double area, int option){
        super(name, local, monthlyRent, area, option);
    }

    @Override
    public void showRoomScoreInformation() {
        System.out.printf("(%s) %s %s: %.1f\n", name, "OneRoom", "Score", calc());
    }

    @Override
    public String toString() {
        return String.format("Room: %s\nMonthly Rent:%.1f\nArea: %.1f\nOption: %d\nLocal: %s", name, monthlyRent, area, option, local);
    }

    public double calc() {
        sum = 0;
        sum += super.monthlyRentScore() * 1.5;
        sum += super.areaScore();
        sum += super.optionScore();
        sum += super.localScore();

        return sum;
    }
}
