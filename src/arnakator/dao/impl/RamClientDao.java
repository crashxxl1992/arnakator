package arnakator.dao.impl;

import java.util.Collection;
import java.util.HashMap;

import arnakator.dao.IClientDao;
import arnakator.model.IClient;

public class RamClientDao implements IClientDao{
	private HashMap<Long, IClient> clients = new HashMap<>();
	private long lastId = 0;
	
	@Override
	public Collection<IClient> findAll() {
		return clients.values();
	}

	@Override
	public IClient load(long id) {
		return clients.get(id);
	}

	@Override
	public void save(IClient client) {
		if(client.getId() == 0) {
			lastId++;
			client.setId(lastId);
			clients.put(lastId, client);
		}
		else {
			//bah on fait rien c'est en mémoire, GG WP
		}
	}
}
