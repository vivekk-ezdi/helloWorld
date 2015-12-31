package memory.index;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.PropertyContainer;
import org.neo4j.graphdb.index.Index;
import org.neo4j.graphdb.index.IndexHits;

public class MemoryIndex<T extends PropertyContainer> implements Index<T>
{

	@Override
	public String getName()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<T> getEntityType()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndexHits<T> get(String key, Object value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndexHits<T> query(String key, Object queryOrQueryObject)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndexHits<T> query(Object queryOrQueryObject)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWriteable()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GraphDatabaseService getGraphDatabase()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(T entity, String key, Object value)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(T entity, String key, Object value)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(T entity, String key)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(T entity)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void delete()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public T putIfAbsent(T entity, String key, Object value)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
