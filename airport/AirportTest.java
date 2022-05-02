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

        System.out.println("printNameAndAge");
        PlaneService.printNameAndAge(plane1);
        System.out.println("--------------------------------------------");

        System.out.println("newerPlane");
        PlaneService.printInfo(PlaneService.newerPlane(plane1, plane2));
        System.out.println("--------------------------------------------");

        System.out.println("biggerWingspan");
        System.out.println(PlaneService.biggerWingspan(plane2, plane3));
        System.out.println("--------------------------------------------");

        System.out.println("highestCost");
        PlaneService.printInfo(PlaneService.highestCost(plane1, plane2, plane3));
        System.out.println("---------------------------------------------------");

        System.out.println("smallestSeats");
        PlaneService.smallestSeats(plane1, plane2, plane3);
        System.out.println("---------------------------------------------------");

        System.out.println("notMilitary");
        PlaneService.notMilitary(planesArray);
        System.out.println("-----------------------------------------------------");

        System.out.println("allMilitary");
        PlaneService.allMilitary(planesArray);
        System.out.println("------------------------------------------------------");

        System.out.println("minimalWeight");
        PlaneService.printInfo(PlaneService.minimalWeight(planesArray));
        System.out.println("-------------------------------------------------------");

        System.out.println("minimalCostOfMilitaryPlanes");
        PlaneService.printInfo(PlaneService.minimalCostOfMilitaryPlanes(planesArray));
        System.out.println("--------------------------------------------------------");

        System.out.println("planesOrderByYear");
        PlaneService.planesOrderByYear(planesArray);
        System.out.println("--------------------------------------------------------");

        System.out.println("planesOrderByNumberOfSeats");
        PlaneService.planesOrderByNumberOfSeats(planesArray);
        System.out.println("----------------------------------------------------------");





    }
}
