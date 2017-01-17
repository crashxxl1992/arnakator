package arnakator.business.impl;

import arnakator.business.IProductPrice;
import arnakator.model.IArticle;

public abstract class AbstractRemainingArticleProductPrice implements IProductPrice{

	/**
	 * 
	 * @return the amount of available stocks when the price should be the base price.
	 */
	protected abstract int getBasePriceQuantity();
	
	/**
	 * 
	 * @return the rate that increase the basePrice for each missing article according 
	 * to the value of {@link AbstractRemainingArticleProductPrice#getBasePriceQuantity()}
	 */
	protected abstract double getRate();
	
	@Override
	public double getPrice(IArticle article) {
		if(article.getQuantity() >= getBasePriceQuantity()) {
			return article.getBasePrice();
		}
		return article.getBasePrice()*getRate()*(getBasePriceQuantity() - article.getQuantity());
	}

}
