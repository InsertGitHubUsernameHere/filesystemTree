/*
 * This file is for Assignment 1 in UNCG's CSC 330 class in Fall 2016.
 */
package assign1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Expected output with the provided input data:
// Total size = 5631391 blocks
// Number of files = 19096
// Max subtree (size 2319097) is DriverStore

// Note: Will test with DIFFERENT data....

/**
 * This file is the main driver and tester of filesystem tree routines.
 * 
 * @author Steve Tate
 * 
 */

public class Assign1 {
    /**
     * getSize calculates the total size of all files in this directory and
     * all subdirectories (and descendent directories).
     * 
     * @param subTreeRoot the root node of the subtree to compute the size of
     * @return The total size
     */
    static int getSize(TreeNode<A1File> subTreeRoot) {
        // YOUR CODE GOES HERE
        return 0;
    }

    /**
     * getNumFiles gets the number of files (not counting directories) in this
     * directory and all descendent directories.
     * 
     * @param subTreeRoot the root of the subtree to explore
     * @return The number of files
     */
    static int getNumFiles(TreeNode<A1File> subTreeRoot) {
        // YOUR CODE GOES HERE
        return 0;      
    }
    
    /**
     * printLargestSubtree finds the largest subtree of this node and prints
     * a message that gives the size and name of the largest directory below
     * this one.
     * 
     * @param subTreeRoot the root of the subtree to examine
     */
    static void printLargestSubtree(TreeNode<A1File> subTreeRoot) {
        // YOUR CODE GOES HERE
    }

    /**
     * Prints a subtree with appropriate indentation
     *
     * @param subTreeRoot
     * @param depth
     */
    static void printTree(Tree<A1File> tree) {
        printTree(tree.getRoot(), 0);
    }
    
    // Worker function for printTree
    static void printTree(TreeNode<A1File> subTreeRoot, int depth) {
        for (TreeNode<A1File> child : subTreeRoot.getChildren()) {
            for (int i = 0; i < depth; i++) {
                System.out.print(" ");
            }
            A1File data = child.getData();
            if (data.getSize() != 0) {
                System.out.println(data.getName() + " (" + data.getSize() + ")");
            } else {
                System.out.println(child.getData().getName());
            }
            if (child.getData().isDirectory()) {
                printTree(child, depth + 1);
            }
        }
    }

    static boolean loadTreeFromFile_r(BufferedReader in, TreeNode<A1File> node) {
        try {
            String line;
            while ((line = in.readLine()) != null) {
                if (line.length() == 0) {
                    return false;
                } else if (line.charAt(0) == 'D') {
                    TreeNode<A1File> newChild = node.addChild(new A1File(line.substring(2), true));
                    loadTreeFromFile_r(in, newChild);
                } else if (line.charAt(0) == 'U') {
                    return true;
                } else {
                    int spaceAt = line.indexOf(' ');
                    if (spaceAt == -1) {
                        return false;
                    } else {
                        int fileSize = Integer.parseInt(line.substring(0, spaceAt));
                        node.addChild(new A1File(line.substring(spaceAt), false, fileSize));
                    }
                }
            }
        } catch (IOException ex) {
            return false;
        }

        return true;
    }

    static Tree<A1File> readTreeFromFile(String filename) throws FileNotFoundException {
        BufferedReader input = new BufferedReader(new FileReader(filename));
        Tree<A1File> tree = new Tree<>(new A1File("", true));
        loadTreeFromFile_r(input, tree.getRoot());
        return tree;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree<A1File> filesystem = null;
        try {
            filesystem = readTreeFromFile("sizedata.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Filesystem data file (sizedata.txt) is missing!");
            System.exit(1);
        }
//        printTree(filesystem);  // uncomment for testing
        System.out.println("Total size = "+getSize(filesystem.getRoot())+" blocks");
        System.out.println("Number of files = "+getNumFiles(filesystem.getRoot()));
        printLargestSubtree(filesystem.getRoot());
    }
}
