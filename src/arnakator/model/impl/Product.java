package arnakator.model.impl;

import java.util.ArrayList;
import java.util.Collection;

import arnakator.model.IDescription;

/**
 * A product is a simple article.
 * The first result of {@link Product#getDescriptions()} is the {@link Product#description} attribute.
 * @author Julien Prudhomme
 *
 */
public class Product extends Article {

	private IDescription description;
	
	/**
	 * Set the description
	 * @param description
	 */
	public void setDescription(IDescription description) {
		this.description = description;
	}

	@Override
	public Collection<IDescription> getDescriptions() {
		ArrayList<IDescription> descriptions = new ArrayList<>();
		descriptions.add(description);
		return descriptions;
	}
	
	

}
