package memory.entity;

import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.ReturnableEvaluator;
import org.neo4j.graphdb.StopEvaluator;
import org.neo4j.graphdb.Traverser;
import org.neo4j.graphdb.Traverser.Order;

@SuppressWarnings("deprecation")
public class MemoryNode extends MemoryEntity implements Node
{
	public MemoryNode(long globalID)
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public Iterable<Relationship> getRelationships()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasRelationship()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Relationship> getRelationships(RelationshipType... types)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Relationship> getRelationships(Direction direction, RelationshipType... types)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasRelationship(RelationshipType... types)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRelationship(Direction direction, RelationshipType... types)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Relationship> getRelationships(Direction dir)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasRelationship(Direction dir)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Relationship> getRelationships(RelationshipType type, Direction dir)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasRelationship(RelationshipType type, Direction dir)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Relationship getSingleRelationship(RelationshipType type, Direction dir)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Relationship createRelationshipTo(Node otherNode, RelationshipType type)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<RelationshipType> getRelationshipTypes()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDegree()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDegree(RelationshipType type)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDegree(Direction direction)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDegree(RelationshipType type, Direction direction)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Traverser traverse(Order traversalOrder, StopEvaluator stopEvaluator, ReturnableEvaluator returnableEvaluator, RelationshipType relationshipType, Direction direction)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Traverser traverse(Order traversalOrder, StopEvaluator stopEvaluator, ReturnableEvaluator returnableEvaluator, RelationshipType firstRelationshipType, Direction firstDirection, RelationshipType secondRelationshipType, Direction secondDirection)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Traverser traverse(Order traversalOrder, StopEvaluator stopEvaluator, ReturnableEvaluator returnableEvaluator, Object... relationshipTypesAndDirections)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addLabel(Label label)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void removeLabel(Label label)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasLabel(Label label)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Label> getLabels()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
