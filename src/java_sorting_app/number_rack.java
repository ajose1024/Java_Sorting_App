/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_sorting_app ;


/**
 * This is the public interface definition for the number_rack class
 * 
 *  * @author  António José Gomes
 */
interface number_rack_interface
{
    /**
     * Method:  add( int ball )
     * 
     * This method adds a ball to the balls existing already on the rack
     * 
     * @access  public
     * @param   ball    int
     * @return  void
     */
    void add( int ball ) ;
    
    
    /**
     * Method:  display()
     * 
     * This method displays the balls already existing in the rack, sorted
     * using the currently active sorting algorithm (through a sorting object),
     * and in the choosen sorting order (either ascending or descending)
     * 
     * @access  public
     * @param   none
     * @return  void
     */
    void display() ;
    
    
    /**
     * Method:  set_sort_algorithm( string sort_algorithm )
     * 
     * This method selects the sorting algoritm to be used from there after
     * from the possible and available sorting algorithms available.
     * 
     * Each sorting algorithm is implements through a "sorting object", obtained
     * from an "sorting object factory", and is saved in the number_rack obbject
     * to be used to sort the "ball's rack", when the display method is used.
     * 
     * This method returns TRUE if the setting of a new sorting algorithm is
     * accomplished successfully or FALSE otherwise.
     * 
     * @access  public
     * @param   sort_algorithm  string
     * @return  boolean
     */
    boolean set_sort_algorithm( String sort_algorithm ) ;
    
    
    
    
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
public class number_rack implements number_rack_interface
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
     * from an "sorting object factory", and is saved in the number_rack obbject
     * to be used to sort the "ball's rack", when the display method is used.
     * 
     * This method returns TRUE if the setting of a new sorting algorithm is
     * accomplished successfully or FALSE otherwise.
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
    
    

    
    

}
