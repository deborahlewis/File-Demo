/*
 * Deborah Lewis
 * This program is my practice file as I learn how to malipulate files using Java
 */


/*
 * Learning Notes:
 * 
 * getPath() gets the path string that the File object was constructed with, and it may be relative current directory.
 * getAbsolutePath() gets the path string after resolving it against the current directory if it's relative, 
 *          resulting in a fully qualified path.
 * getCanonicalPath() gets the path string after resolving any relative path 
 *          against current directory, and removes any relative pathing (. and ..), and any file system links to return a path which the file system considers the canonical means to reference the file system object to which it points.
*/

package filedemo;

import java.io.File;
import java.io.IOException;


public class FileDemo {


    public static void main(String[] args) throws IOException {
        File file = new File("Blarg.nothere");  //new file
        System.out.println(file.getCanonicalPath()); //get path string
        if (file.exists()) {  //if file exists
            System.out.println("This exist!"); //inform user
        } else {  //if file does not exist
            System.out.println("not so much"); //inform user
            file.createNewFile(); //create file
        }
        File dir = new File(".");
        for (File next : dir.listFiles()) {
            System.out.println(next.getAbsolutePath());
            if (next.isDirectory()) {
                System.out.println("Dir");
            }
        }
        
        
        
    }
    
}
