package arnakator.model;

/**
 * Client interface
 * @author Julien Prudhomme
 *
 */
public interface IClient {
	/**
	 * 
	 * @return the client id
	 */
	public long getId();
	
	/**
	 * 
	 * @param id the id to set
	 */
	public void setId(long id);
	
	/**
	 * 
	 * @return the client name
	 */
	public String getName();
	
	
	/**
	 * 
	 * @param name the name to set
	 */
	public void setName(String name);
	
	/**
	 * 
	 * @return the client email
	 */
	public String getEmail();
	
	/**
	 * 
	 * @param email the email to set
	 */
	public void setEmail(String email);
	
	/**
	 * 
	 * @return the client basket
	 */
	public ICommande getBasket();
	
	/**
	 * 
	 * @param basket the basket to set
	 */
	public void setBasket(ICommande basket);
}
