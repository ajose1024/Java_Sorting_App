/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_sorting_app ;

import  java_sorting_app.sorter.* ;
import  java_sorting_app.sorter.algorithms.* ;


/**
 * This application solves the sorting problem.
 * 
 * @author António José Gomes
 */
public class Java_Sorting_App
{

    /**
     * Method:  Main app execution running point
     * 
     * @type    STATIC method
     * 
     * @param   args    String[]    command line arguments
     */
    public static void main( String[] args )
    {
        // TODO code application logic here
        
        System.out.println( java_sorting_app.sorter.Sort_Type.BUBBLE_SORT.name() ) ;
        System.out.println( java_sorting_app.sorter.Sort_Type.BUBBLE_SORT ) ;
        sort_factory factory = new java_sorting_app.sorter.sort_factory() ;
        String[] sort_algo_list = factory.get_sort_algorithm_list() ;
        for( int i = 0 ; i < sort_algo_list.length ; i++ )
        {
            System.out.println( "Algorithm: " + sort_algo_list[ i ] ) ;
        }
    }
    
}
