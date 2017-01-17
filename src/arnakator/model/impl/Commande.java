package arnakator.model.impl;

import java.util.Collection;
import java.util.HashMap;

import arnakator.model.IArticle;
import arnakator.model.ICommande;

public class Commande implements ICommande{

	private long id;
	private HashMap<IArticle, Integer> articles = new HashMap<>();
	
	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public void addArticle(IArticle article, int nb) {
		int prevNb = articles.get(article);
		articles.put(article, prevNb + nb);
	}

	@Override
	public void removeArticle(IArticle article, int nb) {
		int prevNb = articles.get(article);
		if(prevNb - nb <= 0) {
			articles.remove(article);
		}
		else {
			articles.put(article, prevNb - nb);
		}
	}

	@Override
	public Collection<IArticle> getArticles() {
		return articles.keySet();
	}

	@Override
	public int getNumber(IArticle article) {
		return articles.get(article);
	}

}
