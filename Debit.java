import java.util.ArrayList;

public class Debit {
    public ArrayList<Integer> DebitList;

    Debit() {
        DebitList = new ArrayList<Integer>();
    }

    void addDebit(Integer amount) {
        DebitList.add(amount);
    }

    ArrayList<Integer> getDebit() {
        return DebitList;
    }
}
