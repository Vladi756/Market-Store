package marketStore.cards;

import marketStore.cardHolder.CardHolder;
/*
Initial Rate = 0%
If Turnover between $100 & $300 = 1%
If Turnover > $300, then 2.5%
*/
public class BronzeCard extends Card{

	public BronzeCard(CardHolder cardHolder) {
		super(CardType.Bronze, cardHolder, 0);
	}

	@Override
	public double currentRate() {
		
		if(getTurnover() < 100) {
			return getInitialRate();
		}
		
		if(getTurnover() <= 300) { 
			return 1;
		}
		
		return 2.5;
	}	
}
