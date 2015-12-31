package memory.index;

import java.util.concurrent.TimeUnit;

import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.schema.ConstraintCreator;
import org.neo4j.graphdb.schema.ConstraintDefinition;
import org.neo4j.graphdb.schema.IndexCreator;
import org.neo4j.graphdb.schema.IndexDefinition;
import org.neo4j.graphdb.schema.Schema;
import org.neo4j.kernel.impl.api.index.IndexPopulationProgress;

public class MemorySchema implements Schema
{
	@Override
	public IndexCreator indexFor(Label label)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<IndexDefinition> getIndexes(Label label)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<IndexDefinition> getIndexes()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndexState getIndexState(IndexDefinition index)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndexPopulationProgress getIndexPopulationProgress(IndexDefinition index)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIndexFailure(IndexDefinition index)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConstraintCreator constraintFor(Label label)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ConstraintDefinition> getConstraints(Label label)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ConstraintDefinition> getConstraints(RelationshipType type)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ConstraintDefinition> getConstraints()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void awaitIndexOnline(IndexDefinition index, long duration, TimeUnit unit)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void awaitIndexesOnline(long duration, TimeUnit unit)
	{
		// TODO Auto-generated method stub

	}
}
