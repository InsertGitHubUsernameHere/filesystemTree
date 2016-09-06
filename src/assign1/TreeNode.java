/*
 * This file is for Assignment 1 in UNCG's CSC 330 class in Fall 2016.
 */
package assign1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * TreeNode represents a node in a general tree (arbitrary degree)
 * 
 * While there is a tree class, most interesting operations come from this
 * class.
 * 
 * @author srt
 * @param <E> the type of elements stored in each node
 */
public class TreeNode<E> {
    
    /**
     * Constructor to create a node with data but no children
     * 
     * @param initData data to store in this node
     */
    public TreeNode(E initData) {
        // YOUR CODE
    }
    
    /**
     * Return the data stored in this node
     * @return the data
     */
    public E getData() {
        // YOUR CODE
        return null;
    }
    
    /**
     * Set the data stored in this node
     * @param newData the data
     */
    public void setData(E newData) {
        // YOUR CODE
    }

    /**
     * Returns a list of child nodes (may be empty).
     * 
     * Note that a List is Iterable, so you can easily loop through child nodes
     * @return a list of child nodes
     */
    public List<TreeNode<E>> getChildren() {
        // YOUR CODE
        return null;
    }
    
    /**
     * Adds a new child node as the new rightmost child.
     * 
     * Note that a more powerful definition would allow insertion of child
     * nodes at arbitrary positions, not just rightmost.
     * 
     * @param childData data to store in the new child node
     * @return the new node
     */
    public TreeNode<E> addChild(E childData) {
        // YOUR CODE
        return null;
    }
}
