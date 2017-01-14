package arnakator.model.article.impl;

import java.util.ArrayList;
import java.util.Collection;

import arnakator.model.article.IArticle;
import arnakator.model.article.IDescription;

/**
 * A pack is an article that can contain several other articles.
 * @author Julien Prudhomme
 *
 */
public class Pack extends Article{
	
	
	private Collection<IArticle> articles;
	private IDescription description;
	
	
	/**
	 * Set the description of this pack.
	 * @param description
	 */
	public void setDescription(IDescription description) {
		this.description = description;
	}
	
	/**
	 * 
	 * @return a {@link Collection} of {@link IArticle} that are in this pack.
	 */
	public Collection<IArticle> getArticles() {
		return articles;
	}

	@Override
	public Collection<IDescription> getDescriptions() {
		ArrayList<IDescription> descriptions = new ArrayList<>();
		descriptions.add(description);
		for(IArticle i: articles) {
			if(!i.getDescriptions().isEmpty()) {
				descriptions.add(i.getDescriptions().iterator().next());
			}
		}
		return descriptions;
	}
	
}
