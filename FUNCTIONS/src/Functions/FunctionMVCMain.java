
//PACKAGE
package Functions;

/* *****************************************************************************
* Programmer:           Erika Tvaskis
* Class:                CS40S
* Individual Project:   Graphing Calculator
* Description:          Run the project from this class
* ******************************************************************************
*/
 
public class FunctionMVCMain 
 { //Begin class
    
public static void main(String[] args) 
 { //Begin main
    
//PRINT OUTPUT BANNER
System.out.println("*******************************************");
System.out.println("Name:		Erika Tvaskis");
System.out.println("Class:		CS40S");
System.out.println("Individual Project:	Graphing Calculator");
System.out.println("*******************************************");

//PROCESSING
FunctionGUI FunctionUI = new FunctionGUI();
FunctionUI.setVisible(true);

Controller controller = new Controller();
controller.addUI(FunctionUI); //Register view with controller
FunctionUI.addController(controller); //Register controller with view

//CLOSING MESSAGE  
System.out.println("End of processing.");
    
} //End main

} //End class
