package marketStore.cards;

import marketStore.cardHolder.CardHolder;

public abstract class Card {
	private CardHolder cardHolder;
	private CardType cardType;
	private double initialRate;
	private double turnover; 

	Card(CardType cardType, CardHolder cardHolder, double initialRate) {
		this.cardType = cardType;
		this.cardHolder = cardHolder;
		this.initialRate = initialRate;
	}
	
	public abstract double currentRate();
	
	// Get
	public CardType getCardType() {
		return cardType;
	}
	
	CardHolder getCardHolder() {
		return cardHolder;
	}
	
	double getTurnover() {
		return turnover;
	}
	
	double getInitialRate() {
		return initialRate;
	}
	
	
	// Set 
	public void setTurnover(double turnover) {
		this.turnover = turnover;
		
	}
}
