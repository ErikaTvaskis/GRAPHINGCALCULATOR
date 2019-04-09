
//PACKAGE
package Functions;

//IMPORTS
import java.io.Serializable;
import java.text.DecimalFormat;
import static jdk.nashorn.internal.objects.NativeString.trim;

/* *****************************************************************************
* Programmer:           Erika Tvaskis
* Class:                CS40S
* Individual Project:   Graphing Calculator
* Description:          Calculates the solution(s), vertex, intercepts, etc.
* ******************************************************************************
*/

public class Function implements Serializable
{  //Begin class

//VARIABLES
private String Name;
private int aValue;
private int bValue;
private int cValue;
private int x1;
private int x2;
public double Discriminant;
public DecimalFormat twoDForm = new DecimalFormat("#.##");     

//CONSTRUCTORS
   
/******************************************************
Purpose: Creating a new function object
In: None
Out: None
/******************************************************/ 
public Function(){
    Name = null;
    aValue = 0;
    bValue = 0;
    cValue = 0;
    x1 = 0;
    x2 = 0;
} //End default construcor

/******************************************************
Purpose: Creating a new function object with initialized properties
In: None
Out: None
/******************************************************/ 
public Function(String n, int a, int b, int c, int xone, int xtwo){                   
    Name = n;
    aValue = a;
    bValue = b;
    cValue = c;
    x1 = xone;
    x2 = xtwo;
} //End initialized constructor

//ACCESSORS
    
/******************************************************
Purpose: Get entered name
In: None
Out: Name (String)
/******************************************************/   
public String getName(){
    return Name;
} //End String getName()
    
/******************************************************
Purpose: Get aValue
In: None
Out: aValue (integer)
/******************************************************/   
public int getaValue(){
    return aValue;
} //End int getaValue()
    
/******************************************************
Purpose: Get bValue
In: None
Out: bValue (integer)
/******************************************************/   
public int getbValue(){
    return bValue;
} //End int bValue()
    
/******************************************************
Purpose: Get cValue
In: None
Out: cValue (integer)
/******************************************************/   
public int getcValue() {
    return cValue;
} //End int cValue()
    
/******************************************************
Purpose: Get user's first solution if entered
In: None
Out: x1 (integer)
/******************************************************/     
public int getSolution1() {
   return x1;
} //End int getSolution1()
    
/******************************************************
Purpose: Get user's second solution if entered
In: None
Out: x2 (integer)
/******************************************************/       
public int getSolution2() {
    return x2;
} //End int getSolution2()
    
//CALCULATIONS

/******************************************************
Purpose: Get discriminant (for quadratic equation)
In: a, b, an c (all integers, these are the entered values)
Out: Discriminant (integer)
/******************************************************/   
public double getDiscriminant(int a, int b, int c) {
    Discriminant = (b*b) - (4*a*c);
    //System.out.println("d: " + Discriminant); TESTER
    return Double.valueOf(twoDForm.format(Discriminant));
} //End double getDiscriminant(a,b,c)
    
/******************************************************
Purpose: Get solution (only one, for linear equation)
In: b and c (both integers)
Out: the calculation for the solution
/******************************************************/   
public double LinearSolving(int b, int c) {
    return (double) Double.valueOf(twoDForm.format(((c*-1)/ (double) b)));
} //End double LinearSolving(b,c)
    
/******************************************************
Purpose: Get first solution (for quadratic equation)
In: The values a and b from the equation
    d (the calculated discriminant)
    (All integers)
Out: the calculation for the first solution
/******************************************************/ 
public  double getSOLVING1(int a, int b, double d) {
   return Double.valueOf(twoDForm.format(((-b - (Math.sqrt(d)))/(2 * a))));
} //End double getSOLVING1(a,b,d)
    
/******************************************************
Purpose: Get second solution (for quadratic equation)
In: The values a and b from the equation
    d (the calculated discriminant)
    (All integers)
Out: the calculation for the second solution
/******************************************************/ 
public double getSOLVING2(int a, int b,  double d) {
   return Double.valueOf(twoDForm.format(((-b + (Math.sqrt(d)))/(2 * a))));
} //End double getSOLVING2(a,b,d)
   
/******************************************************
Purpose: Calculate the range
In: The values a, b, and c, from the equation
    (All integers)
Out: the calculation for the range
/******************************************************/ 
public double getRange(int a, int b, int c) {
    double xvalue = (double) (((b * -1)/ (double) (2 * a)));
    return (double) Double.valueOf(twoDForm.format((a*xvalue*xvalue + b*xvalue + c)));
} //End getRange(a,b,c)
    
/******************************************************
Purpose: Calculate the y intercept
In: The values a, b, and c, from the equation
    (All integers)
Out: the calculation for the y intercept
/******************************************************/ 
public double getYInt(int a, int b, int c) {
    return (double) c;
} //End getYInt(a,b,c)

//*****************************************************
// Purpose: Override the toString method
// Interface: IN: None
// Returns: Formatted output
// *****************************************************
public String toString(){
    String strout = trim(Name) + ":" + trim(aValue) + ":" + trim(bValue) + ":" + trim(cValue) + ":" + trim(x1) + ":" + trim(x2);// + ":" + trim(AmountofPages) +  ":" + trim(BookType) +  ":" + trim(FictionType) +  ":" + trim(NonFictionType) +  ":" + trim(ReferencePublicationType) + ":" + trim(StyleType);
    return strout;
} //End toString()

}  //End class
