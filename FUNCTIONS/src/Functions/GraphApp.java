
/* *****************************************************************************
* Programmer:           Erika Tvaskis
* Class:                CS40S
* Individual Project:   Graphing Calculator
* Description:          Creates the graph drawing application 
* ******************************************************************************
*/

//PACKAGE
package Functions;

//IMPORTS
import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class GraphApp extends JFrame 
{ //Begin class
    
int x,y;
private Function p;
private FunctionGUI ui;	
private String[] tokens; 
public int N = 9;
public double x1 = 0;
public double x2 = 0;
public double yyy = 0;
public int FINALSCALE = 0;

public int THEA = 0;
public int THEB = 0;
public int THEC = 0;
//VARIABLES
BufferedReader fin = null;  //Declaring fin as BufferedReader
String strin;               //String that reads file
String delim = "[ ]+";      //Delimiter string for splitting input string
String delimabc = "[:]+";

/******************************************************
Purpose: Creating initialized constructor
In: None
Out: None
/******************************************************/ 
public GraphApp(){ 
    setTitle("THE GRAPH");
    setSize(368,360);	
    setResizable(false);
    setVisible(true);		
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    x = 30;
    y = 180;
    this.setLocation(658, 92);
} //End GraphApp()
        
/******************************************************
Purpose: Creating the scale, labels, etc. and drawing the points
In: g (Graphics)
Out: None
/******************************************************/            
public void paint(Graphics g){
    //DATA FILE
    try {
        fin = new BufferedReader(new FileReader("solutions.txt"));
    } //End try statement 
    catch (FileNotFoundException e) {
        System.out.println("file not found");
    } //End catch statement

    try {
        strin = fin.readLine();
    } //End try statement  
    catch (IOException ex) {
        Logger.getLogger(GraphApp.class.getName()).log(Level.SEVERE, null, ex);
    } //End catch statement 

    int Counter = 0;
    while (strin != null) {
        tokens = strin.split(delim);
        if (Counter == 0) {
            x1 = Double.parseDouble(tokens[0]);
            Counter = 1;
        } //End if Counter = 0
        if (Counter == 1) {
            try {
                x2 = Double.parseDouble(fin.readLine());
            } //End try statement
            catch (IOException ex) {
                Logger.getLogger(GraphApp.class.getName()).log(Level.SEVERE, null, ex);
            } //End catch statement
            Counter++;
        } //End if Counter = 1
        else {
            yyy = Double.parseDouble(tokens[0]);
        } //End else statement

        try {
            strin = fin.readLine();
        } //End try statement
        catch (IOException ex) {
            Logger.getLogger(GraphApp.class.getName()).log(Level.SEVERE, null, ex);
        } //End catch statement
    } //END WHILE
    
   // System.out.println("1: " + x1 + " 2: " + x2 + " y: " + yyy);
               
    int scale = 0;
    int posx1 = (int) Math.abs(x1);
    int posx2 = (int) Math.abs(x2);
    int posyyy = (int) Math.abs(yyy);
            
    if (posx1 > posx2) {
        for (int i = 0; i<10; i++) {
            if ((int) posx1%10 != 0) {
                posx1++;
            } //End if statement
            else {
                scale = (int) posx1;
                i = 10;
            } //End else statement
        } //End for statement
    } //End if statement
    
    if (posx1 < posx2) {
        for (int i = 0; i<10; i++) {
            if ((int) posx2%10 != 0) {
                posx2++;
            } //End if statement
            else {
                scale = (int) posx2;
                i = 10;
            } //End else statement
        } //End for statement
    } //End if statement
            
    int yscale = 0;
    int ycounter = 0;
    
    for (int i = 0; i<11; i++) {
        if ((int) posyyy%10 != 0 || posyyy == 0) {
            posyyy++;
            ycounter++;
        } //End if statement
        else {
            if (ycounter == 0) {
                posyyy = posyyy +10;
            } //End if statement
            yscale = (int)posyyy;
            i = 11;
        } //End else statement
    } //End for loop
     
    g.drawLine(180, 0, 180, 340);
    g.drawLine(20,180,340,180);
    g.setColor(Color.blue);
                
    for (int i=1; i<6;i++){ 
        g.drawLine(180+i*30,175,180+i*30,185); //x coord lines               
        g.drawLine(175,180+i*30,185,180+i*30);
        g.drawLine(180-i*30,175,180-i*30,185); //x coord lines
        g.drawLine(175,180-i*30,185,180-i*30);
    } //End basic black lines making four quadrants
                
    g.setColor(Color.black);
    
    //System.out.println("SCALE: " + scale); TESTER
    //System.out.println("YSCALE: " + yscale); TESTER
    
    if (scale > yscale) {
        FINALSCALE = scale;
    } //End if
    if (scale < yscale) {
        FINALSCALE = yscale;
    } //End if
    else {
        FINALSCALE = scale;
        //if theyre equal doesnt matter equal to either
    } //End else

    String STRINGFINALSCALE = String.valueOf(FINALSCALE/5);
    String STRINGFINALSCALENEGATIVE = String.valueOf(-FINALSCALE/5);

    //DRAWING SCALE AND LABELS TIME
    g.drawString(STRINGFINALSCALE, 210, 200);
    
    for (int i=2; i<6;i++){ 
        g.drawString(Integer.toString(i*(FINALSCALE/5)), 180+i*30, 200); //positive x
    } //End positive x scale          
    g.drawString(STRINGFINALSCALENEGATIVE, 150, 200);
    
    for (int i=2; i<6;i++){ 
        g.drawString(Integer.toString(-i*(FINALSCALE/5)), 180-i*30,200); //negative x
    } //End negative x scale
    g.drawString(STRINGFINALSCALE, 160, 160);
    
    for (int i=2; i<6;i++){ 
        g.drawString(Integer.toString(i*(FINALSCALE/5)), 160, 190-i*30); //postive y
    } //End positive y scale
    g.drawString(STRINGFINALSCALENEGATIVE, 150, 220); 
                 
    for (int i=2; i<6;i++){ 
        g.drawString(Integer.toString(-i*(FINALSCALE/5)), 150, 190+i*30); //negative y
    } //End negative y scale
    
    //DATA FILE
    try {
        fin = new BufferedReader(new FileReader("solutions.txt"));
    } //End try statement 
    catch (FileNotFoundException e) {
        System.out.println("file not found");
    } //End catch statement

    try {
        strin = fin.readLine();
    } catch (IOException ex) {
        Logger.getLogger(GraphApp.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    int Counter2 = 0;
    
    while (strin != null) {
  
        tokens = strin.split(delim);
        if (Counter2 == 0) {
            x1 = Double.parseDouble(tokens[0]);
            Counter2 = 1;
        } //End if Counter = 0
        else {
            yyy = Double.parseDouble(tokens[0]);
        } //End else statement

        try {
            strin = fin.readLine();
        } //End try statement
        catch (IOException ex) {
            Logger.getLogger(GraphApp.class.getName()).log(Level.SEVERE, null, ex);
        } //End catch statement
    } //END WHILE
              
    g.setColor(Color.red);
    String reading = readFile();
    tokens = reading.split(delimabc);
    THEA = Integer.parseInt(tokens[0]);
    
    //QUADRATIC
    if (THEA != 0) {
        int xc = 180 - (180 - x) * (30/(FINALSCALE/5));
        int yc = 180 - (180 - y) * (30/(FINALSCALE/5));
        g.fillOval(xc, yc, 6, 6);
    } //End if quadratic
    
    //LINEAR
    else {
      g.fillOval(x, y, 3, 3);
    } //End else (linear)
    
    try {
        run();
    } //End try statement
    catch (InterruptedException ex) {
        Logger.getLogger(GraphApp.class.getName()).log(Level.SEVERE, null, ex);
    } //End catch statement
    
    repaint();
    
    x1 = 0;
    x2 = 0;
    yyy = 0;
} //End pain method      
        
public String readFile() {
    
    try{
     //DATA FILE
    try {
        fin = new BufferedReader(new FileReader("abc.txt"));
    } //End try statement 
    catch (FileNotFoundException e) {
        System.out.println("file not found");
    } //End catch statement

    try {
        strin = fin.readLine();
    } catch (IOException ex) {
        Logger.getLogger(GraphApp.class.getName()).log(Level.SEVERE, null, ex);
    }
           
    
    
    while (strin != null) {
        
        tokens = strin.split(delimabc);
       
           THEA = Integer.parseInt(tokens[0]);
           
           THEB = Integer.parseInt(tokens[1]);
//           System.out.println("THE B: " + THEB);
           THEC = Integer.parseInt(tokens[2]);
    
        try {
            strin = fin.readLine();
        } //End try statement
        catch (IOException ex) {
            Logger.getLogger(GraphApp.class.getName()).log(Level.SEVERE, null, ex);
        } //End catch statement
               
    }
    }catch(Exception e){
			System.out.println("ERROR");
		}
    
    
    return THEA + ":" + THEB + ":" + THEC;
}

/******************************************************
Purpose: Calculating the points according to the coordinates of graph application
In: None
Out: None
/******************************************************/       
public void run() throws InterruptedException{              
    String reading = readFile();
    tokens = reading.split(delimabc);
    THEA = Integer.parseInt(tokens[0]);
    THEB = Integer.parseInt(tokens[1]);
    THEC = Integer.parseInt(tokens[2]);
			
    int ax;
    int by;
                        
    if(x<300&&x>0){
	ax = x-180;
        ax++;

        //LINEAR
        if (THEA == 0) {
            by = (THEB * ax + THEC);              
            int ysclfactor = (30 * THEC / (FINALSCALE / 5)) - THEC; 
            by = ysclfactor + by;            
        } //End if linear
        //QUADRATIC
        else {
            by = (int) (THEA * Math.pow((ax), 2) + THEB * (ax) + THEC);
        } //End else
        
        x = 180 + ax;
        y = 180 - by;

        //System.out.println("x: " + x + " ax: " + ax + " by: " + by + " y: " + y); TESTER
    } //End if
               
} //End run()    
        
} //End class