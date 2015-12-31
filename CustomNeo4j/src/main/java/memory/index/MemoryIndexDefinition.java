package memory.index;

import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.schema.IndexDefinition;

public class MemoryIndexDefinition implements IndexDefinition
{

	@Override
	public Label getLabel()
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
	public void drop()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isConstraintIndex()
	{
		// TODO Auto-generated method stub
		return false;
	}

}
