import java.util.ArrayList;

public class Credit {
    public ArrayList<Integer> CreditList;

    Credit() {
        CreditList = new ArrayList<Integer>();
    }

    void addCredit(int amount) {
        CreditList.add(amount);
    }

    ArrayList<Integer> getCredit() {
        return CreditList;
    }
}
