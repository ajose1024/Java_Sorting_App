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
    
    

}
