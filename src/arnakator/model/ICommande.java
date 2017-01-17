package arnakator.model;

import java.util.Collection;

public interface ICommande {
	public long getId();
	public void setId(long id);
	public void addArticle(IArticle article, int nb);
	public void removeArticle(IArticle article, int nb);
	public Collection<IArticle> getArticles();
	public int getNumber(IArticle article);
}
