/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author ray_m
 */

    
    
    public class CropException extends Exception
    {
       /**
        *	Default constructor
        *	Purpose: Initialises data members to default values
        *	Parameters: none
        *	Returns: none
        */
        public CropException() { }
        /**
        *	Parameterised constructor
        *	Purpose: Initialises data members to value passed as a parameter
        *	Parameters: A string containing the error message
        *	Returns: none
        */
        public CropException(String string)
        {
            super(string);
        }
 
    }
    



