package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CleaningService {

    private List<Cleanable> cleanables = new ArrayList<>();

    void add(Cleanable cleanable){
        cleanables.add(cleanable);
    }

    public int cleanAll(){
        int sum= 0;
        sum = getAllPrice(sum);
        cleanables.clear();
        return sum;
    }

    private int getAllPrice(int sum) {
        for (Cleanable property : cleanables) {
            sum += property.clean();
        }
        return sum;
    }

    public int cleanOnlyOffices(){
        int sum = 0;
        List<Cleanable> houses = new ArrayList<>(cleanables);
        for (Cleanable property : cleanables) {
            if(property instanceof Office){
                sum +=property.clean();
            } else{
                houses.remove(property);
            }
        }
        cleanables.retainAll(houses);
        return sum;
    }

    public List<Cleanable> findByAddressPart(String address){
        List<Cleanable> result = new ArrayList<>();
        for (Cleanable property : cleanables) {
            if(property.getAddress().contains(address)){
                result.add(property);
            }
        }
        return result;
    }

    public String getAddresses(){
        StringBuilder sb = new StringBuilder();
        for (Cleanable property : cleanables) {
            sb.append(property.getAddress()).append(", ");
        }
        return sb.deleteCharAt(sb.length()).deleteCharAt(sb.length()).toString();
    }

    public List<Cleanable> getCleanables() {
        return new ArrayList<>(cleanables);
    }
}
