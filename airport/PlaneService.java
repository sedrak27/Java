package airport;

import java.util.Scanner;

public class PlaneService {
    public static Plane makePlane(){
        Scanner s = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("Enter model");
        plane.setModel(s.next());
        System.out.println("Enter country");
        plane.setCountry(s.next());
        System.out.println("Enter year");
        plane.setYear(s.nextInt());
        System.out.println("Enter hours");
        plane.setHours(s.nextInt());
        System.out.println("Enter military");
        plane.setMilitary(s.nextBoolean());
        System.out.println("Enter engin type");
        plane.setEngineType(s.next());
        System.out.println("Enter weight");
        plane.setWingspan(s.nextInt());
        System.out.println("Enter wingspan");
        plane.setWeight(s.nextInt());
        System.out.println("Enter top speed");
        plane.setTopSpeed(s.nextInt());
        System.out.println("Enter seats");
        plane.setSeats(s.nextInt());
        System.out.println("Enter cost");
        plane.setCost(s.nextFloat());
        return plane;
    }
    public static void printInfo (Plane plane){
        System.out.printf("model: %s, country: %s, year: %d, hours: %d, military: %b, engine type: %s, weight: %d, wingspan: %d, top speed: %d, seats: %d, cost: %f",plane.getModel(), plane.getCountry(), plane.getYear(), plane.getHours(), plane.isMilitary(), plane.getEngineType(), plane.getWeight(), plane.getWingspan(), plane.getTopSpeed(), plane.getSeats(), plane.getCost());
    }

    public static void printNameAndAge(Plane plane){
        if(plane.isMilitary()){
            System.out.println("cost: " + plane.getCost() + "top speed: " + plane.getTopSpeed());
        }else{
            System.out.println("model: " + plane.getModel() + "country: " + plane.getCountry());
        }
    }

    public static Plane newerPlane(Plane plane1, Plane plane2){
        if(plane2.getYear() > plane2.getYear()){
            return plane2;
        } else{
            return plane1;
        }
    }

    public static String biggerWingspan(Plane plane1, Plane plane2){
        if(plane1.getWingspan() > plane1.getWingspan()){
            return plane1.getModel();
        } else{
            return plane2.getModel();
        }
    }

    public static Plane highestCost(Plane plane1, Plane plane2, Plane plane3){
        if(plane3.getCost() > plane2.getCost() && plane3.getCost() > plane1.getCost()){
            return plane3;
        }else if(plane2.getCost() > plane3.getCost() && plane2.getCost() > plane1.getCost()){
            return plane2;
        }else{
            return plane1;
        }
    }

    public static void highestCost(Plane plane1, Plane plane2, Plane plane3){
        if(plane3.getSeats() < plane2.getSeats() && plane3.getSeats() < plane1.getSeats()){
            System.out.println(plane3.getCountry();)
        }else if(plane2.getSeats() < plane3.getSeats() && plane2.getSeats() < plane1.getSeats()){
            System.out.println(plane2.getCountry());
        }else{
            System.out.println(plane1.getCountry());
        }
    }
}
