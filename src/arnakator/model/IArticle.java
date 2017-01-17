package arnakator.model;

import java.util.Collection;

/**
 * This interface intends to represents any article that can be ordered.<br>
 * An article can either be a single product or a promotion pack.<br>
 * In all case the first description returned by {@link IArticle#getDescriptions()} <br>
 * is the description of the article itself. The next (if any) represent other description<br>
 * for example other article descriptions of a promo pack.
 * @author Julien Prudhomme
 *
 */
public interface IArticle {
	/**
	 * 
	 * @return the unique id that identify an article.
	 */
	public long getId();
	
	/**
	 * 
	 * @param id the id to set
	 */
	public void setId(long id);
	
	/**
	 *
	 * @return the base price (before any operation) of the article.
	 */
	public double getBasePrice();
	
	
	/**
	 * 
	 * @return the actual price
	 */
	public double getPrice();
	
	/**
	 * 
	 * @param price set the actual price. Generally it should be settled according to basePrice
	 */
	public void setPrice(double price);
	
	/**
	 * 
	 * @param basePrice the basePrice to set
	 */
	public void setBasePrice(double basePrice);
	
	/**
	 * 
	 * @return the remaining quantity of article that can be ordered.
	 */
	public int getQuantity();
	
	/**
	 * 
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity);
	
	/**
	 * 
	 * @return a {@link Collection} of {@link IDescription}<br>
	 * In most case a single (the first) description is required.<br>
	 * The nexts can be description of other articles associated with this.
	 */
	public Collection<IDescription> getDescriptions();
}
