
//PACKAGE
package Functions;

//IMPORTS
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* *****************************************************************************
* Programmer:           Erika Tvaskis
* Class:                CS40S
* Individual Project:   Graphing Calculator
* Description:          Controls model, view, and function class
* ******************************************************************************
*/

public class Controller
{  //Begin class
 	
//DECLARATION OF VARIABLES
public ArrayList<Function> BookList = new ArrayList();
private Function p;
private FunctionGUI ui;			
private String[] tokens;    
int countcount = 0;
         
//CONSTRUCTORS

/******************************************************
Purpose: Creating a new controller object
In: None
Out: None
/******************************************************/ 
public Controller(){
    System.out.println("Control created.");
} //end Controller constructor
 	
//ACCESSORS
         
/******************************************************
Purpose: Get information on a book and return it to controller
In: i: Index of requested function record
Out: Formatted string of patient info
/******************************************************/
protected String getFunction(int i) throws FileNotFoundException, UnsupportedEncodingException{
    p = (Function) ui.BookListModel.getElementAt(i);
    tokens = p.toString().split(":");
    
    String Name = tokens[0];
    int a = Integer.parseInt(tokens[1]);
    int b = Integer.parseInt(tokens[2]);
    int c = Integer.parseInt(tokens[3]);
    int x1 = Integer.parseInt(tokens[4]);
    int x2 = Integer.parseInt(tokens[5]);
    
    String st = "";
    st+= "Name: " + Name + "\n";
    st+= "Entered Equation: " + a + "x^2 + " + b + "x + " + c + " = 0" + "\n";
    st+= "Your Solutions: x = " + x1 + " x = " + x2 + "\n";
       
    Function SolvingTime = new Function();
    double d;
    double xone;
    double xtwo; 
    
    //QUADRATIC
    if (a != 0) {
        d = SolvingTime.getDiscriminant(a,b,c);
        //IF DISCRIMINANT IS NEGATIVE
        if (d < 0) {
            st+= "The entered equation has no solutions";
        } //End if discriminant is negative
        //IF DISCRIMINANT > 0, AKA SOLUTIONS EXIST
        else {
            xone = SolvingTime.getSOLVING1(a,b,d);
            xtwo = SolvingTime.getSOLVING2(a,b,d);
            
            st+= "Discriminant = " + d + "\n";
            st+= "Calculator's Solutions: x = " + xone + " x = " + xtwo + "\n";
            
            if (x1 == xone && x2 == xtwo || x2 == xone && x1 == xtwo) {
               // amountcorrect++;
                st+= "Your Answer was correct" + "\n";
            } //End if
            else {
                st+= "Your Answer was either not submitted or incorrect" + "\n";
            } //End else

            double range = SolvingTime.getRange(a,b,c);
            if (a < 0) {
                st+= "Range = y < " + range + "\n";  
            } //End if
            if (a > 0) {
                st+= "Range = y > " + range + "\n";
            } //End else
            
            PrintWriter writer = new PrintWriter("solutions.txt", "UTF-8");
            writer.println(xone);
            writer.println(xtwo);
            writer.println(range);
            writer.close();
        } //End else   
    } //End if a is not zero (AKA if equation is quadratic)
        
    else {
        double solution = SolvingTime.LinearSolving(b, c);
        st+= "Calculator's Solution: x = " + solution + "\n";

        if (x1 == solution ) {
        st+= "Your Answer was correct" + "\n";
        } //End if 
        else {
           st+= "Your answer was incorrect or simply not entered" + "\n";
        } //End else

        st+= "Range = y ∈ R" + "\n";

        PrintWriter writer = new PrintWriter("solutions.txt", "UTF-8");
        writer.println(solution);
        writer.println(0);
        writer.println(SolvingTime.getYInt(a,b,c));
        writer.close();
    } //End 
            
    st+= "Domain = x ∈ R" + "\n";
    st+= "Y Intercept: y = " + SolvingTime.getYInt(a,b,c);
            
    PrintWriter writergraph = new PrintWriter("abc.txt", "UTF-8");
    writergraph.println(a + ":" + b + ":" + c);
    writergraph.close();

    if (countcount == 0) {
        GraphApp GA = new GraphApp();
        countcount++;
    } //End if
        return st;
} //End getFunction
 	
//MUTATORS
 	
/******************************************************
Purpose: Creating a new function and add it to the list
In: Function details
Out: None
/******************************************************/ 
protected void submitButtonClickedInView(String n, int a, int b, int c, int xone, int xtwo){
    System.out.println("submit was clicked");
    p = new Function(n, a, b, c, xone, xtwo);
    BookList.add(p);
    ui.BookListModel.addElement(p);
    countcount = 0;
} //End submitButtonClickedInView()

/******************************************************
Purpose: Register the view with the controller
In: view object
Out: None
/******************************************************/ 
protected void addUI(FunctionGUI g){
    this.ui = g;
} //End addUI()
	 
/******************************************************
Purpose: Write the function list to a random access disk file
In: None
Out: None
/******************************************************/ 
protected void writeFunctionList(){
    try{
        FileOutputStream fos = new FileOutputStream("book.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(BookList);
        oos.close();
    } //End try
    catch(IOException e){
    } //End catch IOException
} //End writeBookList()
	 
/******************************************************
Purpose: Get the function list from disk file, called from gui
In: None
Out: None
/******************************************************/ 
protected void getFunctionList(){
    try{
        FileInputStream fis = new FileInputStream("book.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            BookList = (ArrayList<Function>)ois.readObject();
        } //End try loading array list
        catch(ClassNotFoundException e){
        } //End catch class not found			 
    } //End try
    catch(IOException e){	 
    } //End catch IOException on input file stream

    ui.loadBookListModel(BookList);
} //End getBookList
	 
}  //End class