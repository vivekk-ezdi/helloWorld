package memory.entity;

import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;

public class MemoryRelationship extends MemoryEntity implements Relationship
{
	@Override
	public Node getStartNode()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node getEndNode()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node getOtherNode(Node node)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node[] getNodes()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RelationshipType getType()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isType(RelationshipType type)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
