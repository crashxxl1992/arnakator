package arnakator.model.article.impl;

import java.util.Collection;

import arnakator.model.article.IArticle;
import arnakator.model.article.IDescription;

public abstract class Article implements IArticle{

	protected long id;
	protected double basePrice;
	protected int quantity;
	
	@Override
	public long getId() {
		return id;
	}

	@Override
	public double getBasePrice() {
		return basePrice;
	}

	@Override
	public int getQuantity() {
		return quantity;
	}

	@Override
	public abstract Collection<IDescription> getDescriptions();

}
