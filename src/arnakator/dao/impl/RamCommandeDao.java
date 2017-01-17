package arnakator.dao.impl;

import java.util.Collection;
import java.util.HashMap;

import arnakator.dao.ICommandeDao;
import arnakator.model.ICommande;

public class RamCommandeDao implements ICommandeDao{
	private HashMap<Long, ICommande> commandes = new HashMap<>();
	private long lastId = 0;
	
	@Override
	public Collection<ICommande> findAll() {
		return commandes.values();
	}

	@Override
	public ICommande load(long id) {
		return commandes.get(id);
	}

	@Override
	public void save(ICommande commande) {
		if(commande.getId() == 0) {
			lastId++;
			commande.setId(lastId);
			commandes.put(lastId, commande);
		}
		else {
			//bah on fait rien c'est en mémoire, GG WP
		}
	}
}
