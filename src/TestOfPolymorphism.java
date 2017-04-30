/**
 * Created by a1 on 2017-04-30.
 */
public class TestOfPolymorphism {
    public static void main(String... args){
        Bicycle temp1 = new Bicycle(4, 50);
        temp1.printDescription();

        MountainBike temp2 = new MountainBike(4,5,22);
        temp2.printDescription();

        RoadBike temp3 = new RoadBike(3, 55, 45);
    }
}

class Bicycle{
    private int gear, speed;

    public Bicycle(int startGear, int startSpeed){
        gear = startGear;
        speed = startSpeed;
    }

    public void setGear(int gear){
        this.gear = gear;
    }
    public int getGear(){
        return gear;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }

    public void printDescription(){
        System.out.println("Bike is in gear " + this.gear + " with speed of " + this.speed);
    }
}

class MountainBike extends Bicycle{
    private int seatHeight;

    public MountainBike(int startGear, int startSpeed, int seatHeightType){
        super(startGear, startSpeed);
        this.setSeatHeight(seatHeightType);
    }

    public int getSeatHeight(){
        return this.seatHeight;
    }
    public void setSeatHeight(int seatHeightType){
        this.seatHeight = seatHeightType;
    }

    public void printDescription(){
        super.printDescription();
        System.out.println("Bike also have " + this.seatHeight + " over mm");
    }
}

class RoadBike extends Bicycle{
    private int tireOption;

    public RoadBike(int startGear, int speedOnStart, int tireOptionStatus){
        super(startGear, speedOnStart);
        this.setTireOption(tireOptionStatus);
    }

    public void setTireOption(int tireOptionStatus) {
        this.tireOption = tireOptionStatus;
    }

    public void printDescription(){
        super.printDescription();
        System.out.println("Bike also have too " + this.tireOption + " in mm");
    }
}