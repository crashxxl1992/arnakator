package arnakator.business;

import java.util.Collection;

import arnakator.dao.IArticleDao;
import arnakator.model.IArticle;

public interface IArticleService {
	public void setProductPrice(IProductPrice p);
	public void setArticleDao(IArticleDao dao);
	public IArticle getArticle(long id);
	public Collection<IArticle> getAllArticles();
	public IArticle updateOrAdd(IArticle article);
}
