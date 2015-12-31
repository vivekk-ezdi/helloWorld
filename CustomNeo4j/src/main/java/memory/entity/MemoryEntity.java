package memory.entity;

import java.util.Map;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.PropertyContainer;

import memory.graphdb.MemoryGraphDatabase;

public class MemoryEntity implements PropertyContainer
{
	protected MemoryGraphDatabase	restGdb			= null;

	protected Map<String, Object>	structuralData	= null;
	protected Map<String, Object>	metadataMap		= null;
	protected Map<String, Object>	propertyData	= null;

	protected long					id				= (long) -1;

	public long getId()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public GraphDatabaseService getGraphDatabase()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasProperty(String key)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getProperty(String key)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getProperty(String key, Object defaultValue)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProperty(String key, Object value)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Object removeProperty(String key)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<String> getPropertyKeys()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getProperties(String... keys)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getAllProperties()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
