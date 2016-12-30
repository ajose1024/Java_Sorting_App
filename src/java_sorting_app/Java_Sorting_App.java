/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_sorting_app ;

import  java_sorting_app.number_rack ;
import  java_sorting_app.sorter.* ;


/**
 *
 * @author António José Gomes
 */
public class Java_Sorting_App
{

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args )
    {
        // TODO code application logic here
        
        System.out.println( java_sorting_app.sorter.sort_type.BUBBLE_SORT.name() ) ;
        System.out.println( java_sorting_app.sorter.sort_type.BUBBLE_SORT ) ;
        sort_factory factory = new java_sorting_app.sorter.sort_factory() ;
        String[] sort_algo_list = factory.get_sort_algorithm_list() ;
        for( int i = 0 ; i < sort_algo_list.length ; i++ )
        {
            System.out.println( "Algorithm: " + sort_algo_list[ i ] ) ;
        }
    }
    
}
