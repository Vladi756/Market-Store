package marketStore.cards;

import marketStore.cardHolder.CardHolder;
/*
Initial Rate = 2%
If turnover > $300 = 3.5%
*/
public class SilverCard extends Card{

	public SilverCard(CardHolder cardHolder) {
		super(CardType.Silver, cardHolder, 2);
	}

	@Override
	public double currentRate() {
		
		if(getTurnover() <= 300) {
			return getInitialRate();
		}
		
		return 3.5;
	}
}
