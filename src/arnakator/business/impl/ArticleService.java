package arnakator.business.impl;

import java.util.Collection;

import arnakator.business.IArticleService;
import arnakator.business.IProductPrice;
import arnakator.dao.IArticleDao;
import arnakator.model.IArticle;

public class ArticleService implements IArticleService{

	private IProductPrice productPrice;
	private IArticleDao dao;
	
	@Override
	public void setProductPrice(IProductPrice p) {
		this.productPrice = p;
	}

	@Override
	public void setArticleDao(IArticleDao dao) {
		this.dao = dao;
	}

	@Override
	public IArticle getArticle(long id) {
		IArticle a = dao.load(id);
		a.setPrice(productPrice.getPrice(a)); //arnaque en cours
		return a;
	}

	@Override
	public Collection<IArticle> getAllArticles() {
		Collection<IArticle> articles = dao.findAll();
		for(IArticle i : articles) {
			i.setPrice(productPrice.getPrice(i));
		}
		return articles; //on enfle le consommateur
	}

	@Override
	public IArticle updateOrAdd(IArticle article) {
		dao.save(article);
		return getArticle(article.getId());
	}

}
