package hu.nive.ujratervezes.zarovizsga.words;

public class Words {

    public boolean hasMoreDigits(String s){
        int numberCounter = 0;
        for (char c: s.toCharArray()) {
        if(Character.isDigit(c)){
            numberCounter++;
            if(numberCounter > s.length()/2){
                return true;
            }
        }
        }
        return false;
    }
}
