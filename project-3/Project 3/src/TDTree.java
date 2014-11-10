
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TDTree {

  // TDTree data members here.




  // nested classes (if any) could go here

	


  /*************** PART OF LEVEL 3 FUNCTIONALITY ****/
  /**
  * TODO:  modify so resulting tree is as balanced
  * 		as possible.
  *
  *   Given trivial implementation just calls insert
  *      for each point, but does not control balance
  *      of tree.
  */
  public TDTree(Point [] pts){
    this();
    for(Point p : pts)
	insert(p);
  }

  
  /*************** LEVEL 1 FUNCTIONALITY ************/
  /**
  * TODO
  *   default constructor creates an empty tree.
  */
  public TDTree() {
  }
  /**
  * TODO
  * runtime requirement:  O(1)
  */
  public int size() {
    System.out.println("TDTree unimplemented method:  size()");
    return 0;
  }

  /**
  * TODO
  * runtime requirement:  O(1)
  */
  public int height() {
    System.out.println("TDTree unimplemented method:  height()");
    return 0;
  }
  /**
  * TODO
  */
  public Double minX(){
    return null;
  }
  /**
  * TODO
  */
  public Double minY(){
    return null;
  }
  /**
  * TODO
  */
  public Double maxX(){
    return null;
  }
  /**
  * TODO
  */
  public Double maxY(){
    return null;
  }

  /**
  * TODO
  * returns false if point pt already in tree
  */
  public boolean insert(Point pt) {
    System.out.println("TDTree unimplemented method:  insert()");
    return false;
  }
  public boolean insert(double x, double y) {
    return insert(new Point(x,y));
  }

  /**
  * TODO
  */
  public boolean contains(Point p){
    System.out.println("TDTree unimplemented method:  contains()");
    return false;
  }
  public boolean contains(double x, double y) {
    return contains(new Point(x,y));
  }



  /******************** LEVEL 2 FUNCTIONALITY ******/

  /**
  * TODO
  */
  public boolean delete(Point p) {
    System.out.println("TDTree unimplemented method:  delete()");
    return false;
  }
  /**
  * for convenience
  */
  public boolean delete(double x, double y) {
    return delete(new Point(x,y));
  }

  /**
  * TODO
  */
  public void draw(){

  }

  /***************** PART OF LEVEL 3 FUNCTIONALITY *****/
  /** Note that incremental enforcement of the size-balanced
  *     property is part of LEVEL 3.
  *   It requires modification to insert and delete.
  *******************************************************/
  /**
  * TODO
  *  returns point in tree closest to point p (by 
  *     Euclidean distance).
  *  if tree empty, null is returned.
  */
  public Point nearest(Point p) {
     return null;
  }

  /**
  * for convenience
  */
  public Point nearest(double x, double y) {
     return nearest(new Point(x,y));
  }



  /****************** BONUS METHODS ***************/
  /**
  * TODO
  *
  *   given points indicate the "southwest" and "northeast"
  *     corners of the query rectangle.
  *   populates Collection<Point> result with points in the
  *     rectangle.
  */
  public void rangeQuery(Point sw, Point ne,
                            Collection<Point> result) {
    	System.out.println("TDTree unimplemented method:  rangeQuery()");
  }

  /**
  *  for convenience.  Just calls above method
  */
  public void rangeQuery(double minX, double maxX, 
                            double minY, double maxY, 
                            Collection<Point> result) {

	Point sw = new Point(minX, minY);
	Point ne = new Point(maxX, maxY);

	rangeQuery(sw, ne, result);
  }


  /**
  * TODO
  *   given points indicate the "southwest" and "northeast"
  *     corners of the query rectangle.
  *   given points indicate the "southwest" and "northeast"
  *     corners of the query rectangle.
  *   returns number of points within the rectangle (but NOT
  *     the points themselves).
  *   
  */
  public int rangeSize(Point se, Point ne) {
    	System.out.println("TDTree unimplemented method:  rangeSize()");
	return 0;

  }
  public int rangeSize(double minX, double maxX, 
                            double minY, double maxY){

	Point sw = new Point(minX, minY);
	Point ne = new Point(maxX, maxY);

	return rangeSize(sw, ne);
  }

}
