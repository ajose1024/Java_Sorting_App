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
     * @param   int     ball
     * @return  void
     */
    void add( int ball ) ;
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
    @Override
    public void add( int ball )
    {
        
    }
}
