/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_sorting_app.sorter ;

import  java_sorting_app.* ;

/**
 * This is the public interface definition for the sort_factory class
 * 
 * This is, in fact, an abstract class that will be extended by each actual
 * algorithm implementing class
 * 
 * The "sorting algorithm name" is, as for now, hardwired in this class in an
 * ENUM and for each one there is a string with the name of the "sorting algorithm",
 * which is the parameter to be used when requiring the "sorting object"
 * 
 * Each "sorting algorithm object" will be passed, as parameters, the data to be
 * sorted, and a parameter indicating the sorting order (either ascendent or
 * descendent)
 * 
 * This class has also a method to retrive a list (actualy, an array of strings)
 * of the "sorting algorithms" available
 * 
 * @author António José Gomes
 */
interface sort_factory_interface
{
    /**
     * Method:  get_sorting_filter( String sort_algorithm )
     * 
     * This method returns a "sorting algorithm object", which implements the
     * sorting algorithm choosen
     * 
     * @access  public
     * @param   sort_algorithm  String
     * @return  object
     */
    sort_factory get_sorting_filter( String sort_algorithm ) ;
    
    
    /**
     * Method:  get_sort_algorithm_list()
     * 
     * This metho returns an array of Strings, where each array element has a
     * String with the name of an available "sorting algorithm"
     * 
     * @access  public
     * @param   none
     * @return  String[]
     */
    String[] get_sort_algorithm_list() ;
    
    
}



/**
 * Class: sort_factory
 * 
 * This class is an object factory that is used to create "sorting objects",
 * eachone implementing a sorting algorithm.
 * 
 * Each sorting algorithm is implemented by an appropriated class that implements
 * a Sigleton pattern, so that it will return ALWAYS the same sorting object
 * instance, whenever an object is required.
 * This way we ensure that there is a good used of system resources whithout the
 * unneeded creation of redundant objects, as each sorting object is used as a
 * "sorting filter" without storing stated in itself.
 * 
 * @author António José Gomes
 */
public class sort_factory implements sort_factory_interface
{
    /**
     * Method:  get_sorting_filter( String sort_algorithm )
     * 
     * This method returns a "sorting algorithm object", which implements the
     * sorting algorithm choosen
     * 
     * @access  public
     * @param   sort_algorithm  String
     * @return  object
     */
    @Override
    public sort_factory get_sorting_filter( String sort_algorithm )
    {
        return  new sort_factory() ;
    }
            ;
    
    
    /**
     * Method:  get_sort_algorithm_list()
     * 
     * This method returns an array of Strings, where each array element has a
     * String with the name of an available "sorting algorithm"
     * 
     * @access  public
     * @param   none
     * @return  String[]
     */
    @Override
    public String[] get_sort_algorithm_list()
    {
        sort_type[] sort_types = sort_type.values() ;
        String[] sort_type_names = new String[ sort_types.length ] ;

        for( int i = 0; i < sort_types.length ; i++ )
        {
            sort_type_names[ i ] = sort_types[ i ].name() ;
        }

        return  sort_type_names ;
    }
    
    
}
