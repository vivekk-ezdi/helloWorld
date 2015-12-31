package memory.index;

import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.schema.ConstraintDefinition;
import org.neo4j.graphdb.schema.ConstraintType;

public class MemoryConstraintDefinition implements ConstraintDefinition
{

	@Override
	public Label getLabel()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RelationshipType getRelationshipType()
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
	public ConstraintType getConstraintType()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isConstraintType(ConstraintType type)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
