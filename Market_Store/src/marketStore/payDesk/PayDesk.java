package marketStore.payDesk;

import marketStore.cards.Card;

public class PayDesk {
    public static double discountRate(Card card) {
        // If purchase is without discount card.
        if (card == null) {
            return 0;
        }

        // If purchase is with discount card.
        return card.currentRate();
    }

    public static double discount(double purchaseValue, Card card) {
        return discountRate(card) / 100 * purchaseValue;
    }

    public static double total(double purchaseValue, Card card) {
        return purchaseValue - discount(purchaseValue, card);
    }
}