package arnakator.business;

import arnakator.model.IArticle;

/**
 * Stragegy to compute an article price
 * @author Julien Prudhomme
 *
 */
public interface IProductPrice {
	/**
	 * Compute the article effective price.
	 * @param article an article
	 * @return the computed price.
	 */
	public double getPrice(IArticle article);
}
