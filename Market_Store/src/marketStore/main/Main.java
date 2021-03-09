package marketStore.main;

import marketStore.cardHolder.CardHolder;
import marketStore.cards.BronzeCard;
import marketStore.cards.Card;
import marketStore.cards.GoldCard;
import marketStore.cards.SilverCard;
import marketStore.payDesk.PayDesk;

import java.text.DecimalFormat;

public class Main {
    private static void printInvoice(int purchaseValue, Card card) {
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println(card.getCardType() + ":\n"
                + "Purchase value: $" + df.format(purchaseValue) + "\n"
                + "Discount rate: " + df.format(PayDesk.discountRate(card)) + " %" + "\n"
                + "Discount: $" + df.format(PayDesk.discount(purchaseValue, card)) + "\n"
                + "Total: $" + df.format(PayDesk.total(purchaseValue, card)) + "\n");
    }

    /* Creating instances of a cardholder and discount card
     * to output the mock data. */
    public static void main(String[] args) {
        // Bronze Card
        CardHolder cardholder = new CardHolder("Abraham", "Lincoln");
        Card card = new BronzeCard(cardholder);
        printInvoice(150, card);

        // Silver Card
        cardholder = new CardHolder("Julius", "Ceaser");
        card = new SilverCard(cardholder);
        card.setTurnover(600);
        printInvoice(850, card);

        // Gold Card 
        cardholder = new CardHolder("Don", "Quixote");
        card = new GoldCard(cardholder);
        card.setTurnover(1500);
        printInvoice(1300, card);
    }
}