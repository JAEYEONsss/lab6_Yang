import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num;
        int[] check = {0, 0, 0};
        int[] option = new int[3];
        double[] monthlyRent = new double[3];
        double[] area = new double[3];
        double[] temp = {-1, -1, -1};
        String[] name = new String[3];
        String[] local = new String[3];
        int jCheck, jOption;
        double jMonthlyRent, jArea;
        String jName, jLocal;

        while (true) {
            num = input.nextInt();

            if (num == 1) {
                jName = input.next();
                jMonthlyRent = input.nextDouble();
                jArea = input.nextDouble();
                jOption = input.nextInt();
                jLocal = input.next();

                OneRoom one = new OneRoom(jName, jLocal, jMonthlyRent, jArea, jOption);

                if (temp[0] < one.calc()) {
                    temp[0] = one.calc();
                    name[0] = jName;
                    local[0] = jLocal;
                    monthlyRent[0] = jMonthlyRent;
                    area[0] = jArea;
                    option[0] = jOption;
                }
                check[0] = 1;
            } else if (num == 2) {
                jName = input.next();
                jMonthlyRent = input.nextDouble();
                jArea = input.nextDouble();
                jOption = input.nextInt();
                jLocal = input.next();

                RooftopRoom roof = new RooftopRoom(jName, jLocal, jMonthlyRent, jArea, jOption);

                if (temp[1] < roof.calc()) {
                    temp[1] = roof.calc();
                    name[1] = jName;
                    local[1] = jLocal;
                    monthlyRent[1] = jMonthlyRent;
                    area[1] = jArea;
                    option[1] = jOption;
                }
                check[1] = 1;
            } else if (num == 3) {
                jName = input.next();
                jMonthlyRent = input.nextDouble();
                jArea = input.nextDouble();
                jOption = input.nextInt();
                jLocal = input.next();

                OfficetelRoom office = new OfficetelRoom(jName, jLocal, jMonthlyRent, jArea, jOption);

                if (temp[2] < office.calc()) {
                    temp[2] = office.calc();
                    name[2] = jName;
                    local[2] = jLocal;
                    monthlyRent[2] = jMonthlyRent;
                    area[2] = jArea;
                    option[2] = jOption;
                }
                check[2] = 1;
            } else if (num == 0) {
                break;
            }
        }

        if (check[0] == 1) {
            OneRoom one = new OneRoom(name[0], local[0], monthlyRent[0], area[0], option[0]);
            System.out.println("---------------");
            System.out.println(one.toString());
            System.out.println("---------------");
            one.showRoomScoreInformation();
        }
        if (check[1] == 1) {
            RooftopRoom roof = new RooftopRoom(name[1], local[1], monthlyRent[1], area[1], option[1]);
            System.out.println("---------------");
            System.out.println(roof.toString());
            System.out.println("---------------");
            roof.showRoomScoreInformation();
        }
        if (check[2] == 1) {
            OfficetelRoom office = new OfficetelRoom(name[2], local[2], monthlyRent[2], area[2], option[2]);
            System.out.println("---------------");
            System.out.println(office.toString());
            System.out.println("---------------");
            office.showRoomScoreInformation();
        }
    }
}
