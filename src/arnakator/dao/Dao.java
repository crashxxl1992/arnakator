package arnakator.dao;

import java.util.Collection;

import arnakator.model.IArticle;

public interface Dao<T> {
	public Collection<T> findAll();
	public T load(long id);
	public void save(T article);
}
