/*
 * This file is for Assignment 1 in UNCG's CSC 330 class in Fall 2016.
 */
package assign1;

/**
 * Represents a file of a directory (similar to java.io.file, but for a fake
 * filesystem).
 * 
 * @author srt
 */
public class A1File {
    private String fileName;
    private boolean isDirectory;
    private int size;

    /**
     * Constructor if size is not known (size is initialized to zero)
     * 
     * @param inName Name of this file or directory
     * @param inDirectory Flag - true if this is a directory
     */
    public A1File(String inName, boolean inDirectory) {
        fileName = inName;
        isDirectory = inDirectory;
    }
    
    /**
     * Constructor if size is known
     * 
     * @param inName Name of this file or directory
     * @param inDirectory Flag - true if this is a directory
     * @param inSize The size (in blocks) of this file
     */
    public A1File(String inName, boolean inDirectory, int inSize) {
        fileName = inName;
        isDirectory = inDirectory;
        size = inSize;
    }

    /**
     * Gets the file name
     * @return The file name
     */
    public String getName() {
        return fileName;
    }
    
    /**
     * Returns true if this object represents a directory
     * @return true if this is a directory
     */
    public boolean isDirectory() {
        return isDirectory;
    }
    
    /**
     * Returns true if this object represents a file
     * @return true if this is a file
     */
    public boolean isFile() {
        return !isDirectory;
    }
    
    /**
     * Returns the size of the file
     * @return the size of the file
     */
    public int getSize() {
        return size;
    }
}
