package arnakator.business.impl;

/**
 * 
 * 
 *
 */
public class RemainingArticleProductPrice extends AbstractRemainingArticleProductPrice{

	@Override
	protected int getBasePriceQuantity() {
		return 50;
	}

	@Override
	protected double getRate() {
		return 1.01;
	}

}
