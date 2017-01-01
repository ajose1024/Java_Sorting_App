/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_sorting_app ;


/**
 * This is the public interface definition for the Number_Rack class
 * 
 * This class implement the "number rack", holding the random extracted balls
 * (numered from "ball 0" to "ball 59").
 * 
 * This class has the following methods:
 * 
.* ->To add a new ball to the "Number_Rack":
.*      add_ball( int ball )
 *.
 * ->To display all balls currently in the "Number_Rack" in sorterd order:
 *      display_balls()
 *.
 * ->To set the "sorting_algorithm" from the pool of available sorting algorithms:
 *      set_sorting_algorithm( sort_type sort_algorithm )
.*.
 * ->To set the "sorting_order" from ASCENDING or DESCENDING:
 *      set_sorting_order( sort_order sort_order )
 * 
 * ->To clear the "number_rack" of all stored balls:
 *      rack_clear()
 * 
 * ->To list available "sorting_algorithms":
 *      sorting_algorithms_list()
 * 
 * To list available "sorting_order":
 *      sorting_order_list()
.* 
 * The way this class will be normally used is given by the following example:
 * 
 *      Number_Rack rack = new Number_Rack ;
 *      rack.set_sorting_algorithm( BUBBLE_SORT ) ;
 *      rack.set_sorting_order( ASCENDING ) ;
 *      rack.add_ball( 58 ) ;
 *      rack.dislay_balls() ;
 *          >> BALLS IN RACK (ASCENDING): 58
 *      rack.add_ball( 34 ) ;
 *      rack.display_balls() ;
 *          >> BALLS IN RACK (ASCENDING): 34 58
 *      rack.add_ball( 4 ) ;
 *      rack.display_balls() ;
 *          >> BALLS IN RACK (ASCENDING): 4 34 58
 *      rack.add_ball( 3 ) ;
 *      rack.display_balls() ;
 *          >> BALLS IN RACK (ASCENDING): 3 4 34 58
 *      rack.set_sorting_order( DESCENDING ) ;
 *      rack.display_balls() ;
 *          >> BALLS IN RACK (DESCENDING): 58 34 4 3
 *      rack.rack_clear() ;
 *      rack.display_balls() ;
 *          >> BALLS IN RACK (DESCENDING): <empty rack>
  * 
  * @author  António José Gomes
 */
interface number_rack_interface
{
    /**
     * Method:  add_ball( int ball )
     * 
     * This method adds a ball to the balls existing already on the rack
     * 
     * @access  public
     * @param   ball    int
     * @return  void
     */
    public void add_ball( int ball );
    
    
    /**
     * Method:  display_balls()
     * 
     * This method displays the balls already existing in the rack, sorted
     * using the currently active sorting algorithm (through a sorting object
     * obtained through the Sort_Factory object factory), and in the choosen
     * sorting order (either ASCENDING or DESCENDING)
     * 
     * @access  public
     * @param   none
     * @return  void
     */
    public void display_balls();
    
    
    /**
     * Method:  set_sort_algorithm( Sort_Type sort_algorithm )
     * 
     * This method selects the sorting algoritm to be used from there after
     * from the possible and available sorting algorithms available.
     * 
     * Each sorting algorithm is implements through a "sorting object", obtained
 from an "sorting object factory", and is saved in the Number_Rack obbject
 to be used to sort the "ball's rack", when the display method is used.
 
 This method returns TRUE if the setting of a new sorting algorithm is
 accomplished successfully or FALSE otherwise.
     * 
     * @access  public
     * @param   sort_algorithm  string
     * @return  boolean
     */
    boolean set_sort_algorithm( String sort_algorithm );
    
    
    
    
}


/**
 * Class: Number_rack
 * 
 * This class is where the random taken numbers are stored and from which the
 * appropriated method is called to show them, in sorted order, whenever needed
 * 
 * Since we can have more than one sorting algorithm, through a class factory,
 * this class also presents a public interface for active sorting algorithm
 * selection
 * 
 * @author  António José Gomes
 */
public class Number_Rack implements number_rack_interface
{
    /**
     * Method:  add( int ball )
     * 
     * This method adds a ball to the balls existing already on the rack
     * 
     * @access  public
     * @param   ball    int
     */
    @Override
    public void add( int ball )
    {
        
    }
    
    
    /**
     * Method:  display()
     * 
     * This method displays the balls already existing in the rack, sorted
     * using the currently active sorting algorithm (through a sorting object),
     * and in the choosen sorting order (either ascending or descending)
     * 
     * @access  public
     */
    @Override
    public void display()
    {
        
    }
    
    
    /**
     * Method:  set_sort_algorithm( string sort_algorithm )
     * 
     * This method selects the sorting algoritm to be used from there after
     * from the possible and available sorting algorithms available.
     * 
     * Each sorting algorithm is implements through a "sorting object", obtained
 from an "sorting object factory", and is saved in the Number_Rack obbject
 to be used to sort the "ball's rack", when the display method is used.
 
 This method returns TRUE if the setting of a new sorting algorithm is
 accomplished successfully or FALSE otherwise.
     * 
     * @access  public
     * @param   sort_algorithm  string
     * @return  boolean
     */
    @Override
    public boolean set_sort_algorithm( String sort_algorithm )
    {
        
        return  true ;
    }

    @Override
    public void add_ball(int ball) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display_balls() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
    

}
