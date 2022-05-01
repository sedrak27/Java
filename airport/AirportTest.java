package airport;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int num = s.nextInt();
//        System.out.println(num);
        Plane plane1 = PlaneService.makePlane();
        PlaneService.printInfo(plane1);

    }
}
