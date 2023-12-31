import java.util.Arrays;

public class Farm {
    private  String address ;
    private  Sheep [] sheep;
    private  Cow [] cow ;
    private  Horse [] horse ;
    private  String ownerName ;


    public Farm(String address, Sheep[] sheep, Cow[] cow, Horse[] horse, String ownerName) {
        this.address = address;
        this.sheep = sheep;
        this.cow = cow;
        this.horse = horse;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Cow[] getCow() {
        return cow;
    }

    public void setCow(Cow[] cow) {
        this.cow = cow;
    }

    public Horse[] getHorse() {
        return horse;
    }

    public void setHorse(Horse[] horse) {
        this.horse = horse;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", sheep=" + Arrays.toString(sheep) +
                ", cow=" + Arrays.toString(cow) +
                ", horse=" + Arrays.toString(horse) +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
