import java.util.Calendar;

public class Card extends Payment {

    Integer numberCard;
    Calendar dateCard;
    String cvv;

    public Card(Integer id, Integer numberCard, Calendar dateCard, String cvv) {
        super(id);
        this.numberCard = numberCard;
        this.dateCard = dateCard;
        this.cvv = cvv;

    }
}