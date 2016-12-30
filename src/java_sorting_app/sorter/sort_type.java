/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_sorting_app.sorter ;

/**
 * ENUM with the names of the "sorting algorithms"
 */
public enum sort_type
{
    BUBBLE_SORT
    {
        public String algorithm_name()
        {
            return  "Name: BUBBLE_SORT" ;
        }
    },
    SEQUENTIAL_SORT
    {
        public String algorithm_name()
        {
            return  "Name: SEQUENTIAL_SORT" ;
        }
    }
    
}
