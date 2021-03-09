package marketStore.cards;

import marketStore.cardHolder.CardHolder;
/*
 Initial Rate = 2
 For every $100 = +1
 */
public class GoldCard extends Card {

	public GoldCard(CardHolder cardHolder) {
		super(CardType.Gold, cardHolder, 2);
	}

	@Override
	public double currentRate() {
		
		// When turnover > 100, discount rate needs to be calculated. 
		
		double turnoverGrowth = 100; 
		int rateOfGrowth = 1;
		int maxRate = 10;
		
		/* Turnover divided by Turnover Growth determines how many times turnover has increased 
		by 100. This is then multiplied by the rate of growth (i.e. 1) to determine the total
		extra rate. */
	
		double extraRate = rateOfGrowth * (int)(getTurnover() / turnoverGrowth);
		double currentRate = getInitialRate() + extraRate;
		
		if(currentRate > maxRate) {
			return maxRate;
		}
	
		return currentRate;
	}

}
