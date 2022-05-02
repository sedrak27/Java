package airport;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int num = s.nextInt();
//        System.out.println(num);
        Plane plane1 = PlaneService.makePlane();
        Plane plane2 = PlaneService.makePlane();
        Plane plane3 = PlaneService.makePlane();
        Plane[] planesArray = {plane1, plane2, plane3};
        PlaneService.printInfo(plane1);

    }
}
