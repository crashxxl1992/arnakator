package arnakator.model.article;

/**
 * Represent a description (title and description of the article)
 * @author Julien Prudhomme
 *
 */
public interface IDescription {
	/**
	 * 
	 * @return the title.
	 */
	public String getTitle();
	
	/**
	 * 
	 * @param title the title to set.
	 */
	public void setTitle(String title);
	
	/**
	 * 
	 * @return the description.
	 */
	public String getDescription();
	
	/**
	 * 
	 * @param description the description to set.
	 */
	public void setDescription(String description);
}
