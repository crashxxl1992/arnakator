package arnakator.model.impl;

import arnakator.model.IClient;
import arnakator.model.ICommande;

public class Client implements IClient{

	private long id;
	private String name;
	private String email;
	private ICommande basket;
	
	@Override
	public long getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public ICommande getBasket() {
		return basket;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void setBasket(ICommande basket) {
		this.basket = basket;
	}

}
