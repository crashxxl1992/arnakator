package arnakator.model.article;

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
	 * @return the base price (before any operation) of the article.
	 */
	public double getBasePrice();
	
	/**
	 * 
	 * @return the remaining quantity of article that can be ordered.
	 */
	public int getQuantity();
	
	/**
	 * 
	 * @return a {@link Collection} of {@link IDescription}<br>
	 * In most case a single (the first) description is required.<br>
	 * The nexts can be description of other articles associated with this.
	 */
	public Collection<IDescription> getDescriptions();
}
