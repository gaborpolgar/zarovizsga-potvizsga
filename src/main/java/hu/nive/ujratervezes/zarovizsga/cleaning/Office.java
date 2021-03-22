package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable {

    private String address;
    private int place;
    private int floors;
    private static final int PRICE_PER_SQUARE = 100;


    public Office(String address, int place, int floors) {
        this.address = address;
        this.place = place;
        this.floors = floors;
    }

    @Override
    public int clean() {
        return place * PRICE_PER_SQUARE*floors;
    }

    @Override
    public String getAddress() {
        return address;
    }


}
