package memory.index;

import java.util.Map;

import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.PropertyContainer;
import org.neo4j.graphdb.index.AutoIndexer;
import org.neo4j.graphdb.index.Index;
import org.neo4j.graphdb.index.IndexManager;
import org.neo4j.graphdb.index.RelationshipAutoIndexer;
import org.neo4j.graphdb.index.RelationshipIndex;

@SuppressWarnings("deprecation")
public class MemoryIndexManager implements IndexManager
{

	@Override
	public boolean existsForNodes(String indexName)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Index<Node> forNodes(String indexName)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Index<Node> forNodes(String indexName, Map<String, String> customConfiguration)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] nodeIndexNames()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsForRelationships(String indexName)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RelationshipIndex forRelationships(String indexName)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RelationshipIndex forRelationships(String indexName, Map<String, String> customConfiguration)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] relationshipIndexNames()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getConfiguration(Index<? extends PropertyContainer> index)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setConfiguration(Index<? extends PropertyContainer> index, String key, String value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeConfiguration(Index<? extends PropertyContainer> index, String key)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AutoIndexer<Node> getNodeAutoIndexer()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RelationshipAutoIndexer getRelationshipAutoIndexer()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
