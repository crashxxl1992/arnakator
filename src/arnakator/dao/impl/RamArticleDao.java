package arnakator.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import arnakator.dao.IArticleDao;
import arnakator.model.IArticle;

public class RamArticleDao implements IArticleDao{

	private HashMap<Long, IArticle> articles = new HashMap<>();
	private long lastId = 0;
	
	@Override
	public Collection<IArticle> findAll() {
		Collection<IArticle> result = new ArrayList<>();
		for(IArticle i : articles.values()) {
			result.add(i.clone());
		}
		return result;
	}

	@Override
	public IArticle load(long id) {
		return articles.get(id).clone();
	}

	@Override
	public void save(IArticle article) {
		if(article.getId() == 0) {
			lastId++;
			article.setId(lastId);
			articles.put(lastId, article.clone());
		}
		else {
			articles.put(article.getId(), article.clone());
		}
	}

}
