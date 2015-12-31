package memory.index;

import org.neo4j.graphdb.ConstraintViolationException;
import org.neo4j.graphdb.schema.ConstraintCreator;
import org.neo4j.graphdb.schema.ConstraintDefinition;

public class MemoryConstraintCreator implements ConstraintCreator
{

	@Override
	public ConstraintCreator assertPropertyIsUnique(String propertyKey)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConstraintDefinition create() throws ConstraintViolationException
	{
		// TODO Auto-generated method stub
		return null;
	}

}
