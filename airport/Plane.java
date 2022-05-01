package airport;

public class Plane {
    private String model = "f16";
    private String country = "Armenia";
    private int year = 1903;
    private int hours = 0;
    private boolean isMilitary = false;
    private String engineType = "100";
    private int weight = 1000;
    private int wingspan = 15;
    private int topSpeed = 300;
    private int seats = 90;
    private float cost = 300.4f;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.equals("") || (model == null)){
            System.out.println("Entered invalid value");
        }else{
            this.model = model;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(model == "" || model == null){
            System.out.println("Entered invalid value");
        }else{
            this.country = country;
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 1903 || year > 2022){
            System.out.println("Entered invalid value");
        }else{
            this.year = year;
        }

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours < 0 || hours > 10000){
            System.out.println("Entered invalid value");
        }else{
            this.hours = hours;
        }

    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if(model == "" || model == null){
            System.out.println("Entered invalid value");
        }else{
            this.engineType = engineType;
        }

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight < 1000 || weight > 100000){
            System.out.println("Entered invalid value");
        }else{
            this.weight = weight;
        }

    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if(wingspan < 10 || wingspan > 45){
            System.out.println("Entered invalid value");
        }else{
            this.wingspan = wingspan;
        }

    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if(topSpeed < 0 || topSpeed > 1000){
            System.out.println("Entered invalid value");
        }else{
            this.topSpeed = topSpeed;
        }

    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if(seats < 0){
            System.out.println("Entered invalid value");
        }else{
            this.seats = seats;
        }

    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if(cost < 0){
            System.out.println("Entered invalid value");
        }else{
            this.cost = cost;
        }

    }
}
