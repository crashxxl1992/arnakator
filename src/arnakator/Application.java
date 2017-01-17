package arnakator;

import arnakator.business.ArticleServiceBuilder;
import arnakator.business.IArticleService;

public class Application {
	private static Application instance = new Application();
	
	IArticleService articleService = ArticleServiceBuilder.createInstance();
	
	
	
	private Application() {}
	
	public static Application getInstance() {
		return instance;
	}
	
	public IArticleService getArticleService() {
		return articleService;
	}
	
}
