package arnakator.business;

import arnakator.business.impl.ArticleService;
import arnakator.business.impl.RemainingArticleProductPrice;
import arnakator.dao.impl.RamArticleDao;

public class ArticleServiceBuilder {
	public static IArticleService createInstance() {
		IArticleService aservice = new ArticleService();
		aservice.setArticleDao(new RamArticleDao());
		aservice.setProductPrice(new RemainingArticleProductPrice());
		return aservice;
	}
}
