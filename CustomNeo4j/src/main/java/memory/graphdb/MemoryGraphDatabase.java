package memory.graphdb;

import java.util.HashMap;
import java.util.Map;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.QueryExecutionException;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.ResourceIterable;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.event.KernelEventHandler;
import org.neo4j.graphdb.event.TransactionEventHandler;
import org.neo4j.graphdb.index.IndexManager;
import org.neo4j.graphdb.schema.Schema;
import org.neo4j.graphdb.traversal.BidirectionalTraversalDescription;
import org.neo4j.graphdb.traversal.TraversalDescription;

import memory.entity.MemoryNode;

public class MemoryGraphDatabase implements GraphDatabaseService
{
	private long			globalID	= 0;

	private Map<Long, Node>	nodeMap		= null;

	//****************************************************************//
	public MemoryGraphDatabase()
	{
		this.nodeMap = new HashMap<Long, Node>();
	}

	//****************************************************************//
	@Override
	public boolean isAvailable(long timeout)
	{
		// TODO Auto-generated method stub
		return false;
	}

	//****************************************************************//
	@Override
	public void shutdown()
	{
		// TODO Auto-generated method stub
	}

	//****************************************************************//
	@Override
	public Transaction beginTx()
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public Schema schema()
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public IndexManager index()
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public Node getNodeById(long id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public Relationship getRelationshipById(long id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public Node createNode()
	{
		globalID++;
		Node n = new MemoryNode(globalID);
		nodeMap.put(globalID, n);
		return n;
	}

	//****************************************************************//
	@Override
	public Node createNode(Label... labels)
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public Result execute(String query) throws QueryExecutionException
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public Result execute(String query, Map<String, Object> parameters) throws QueryExecutionException
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public Iterable<Node> getAllNodes()
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public ResourceIterator<Node> findNodes(Label label, String key, Object value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public Node findNode(Label label, String key, Object value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public ResourceIterator<Node> findNodes(Label label)
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public ResourceIterable<Node> findNodesByLabelAndProperty(Label label, String key, Object value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public Iterable<RelationshipType> getRelationshipTypes()
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public <T> TransactionEventHandler<T> registerTransactionEventHandler(TransactionEventHandler<T> handler)
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public <T> TransactionEventHandler<T> unregisterTransactionEventHandler(TransactionEventHandler<T> handler)
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public KernelEventHandler registerKernelEventHandler(KernelEventHandler handler)
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public KernelEventHandler unregisterKernelEventHandler(KernelEventHandler handler)
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public TraversalDescription traversalDescription()
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
	@Override
	public BidirectionalTraversalDescription bidirectionalTraversalDescription()
	{
		// TODO Auto-generated method stub
		return null;
	}

	//****************************************************************//
}
