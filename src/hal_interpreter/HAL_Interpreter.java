package hal_interpreter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Test...
public class HAL_Interpreter {

    
    
    
   public static void main(String[] args) throws IOException {
       
        File input = new File("test1.txt");  // Test Datein = test.txt,test1.txt
        Register testReg= new Register();
        ProgramMemory testPM = new ProgramMemory(input);
        Acc testAcc = new Acc();
        
  
        for(int i =0;i<testPM.getProgramSize();i++){
        
        
            
            
            
        
        }
       
        
        
    }
    
    
     public void instructionExecute(String instruction,int isntructionConstant){
       
        switch(instruction){

             case "START":
            
            
            
             break;
             case "STOP":break;
             case "OUT":break; 
             case "IN":break; 
             case "LOAD":break; 
             case "LOADNUM":break; 
             case "STORE":break; 
             case "JUMPNEG":break; 
             case "JUMPPOS":break;       
             case "JUMPNULL":break; 
             case "JUMP":break; 
             case "ADD":break; 
             case "ADDNUM":break; 
             case "SUB":break; 
             case "MUL":break;
             case "DIV":break; 
             case "SUBNUM":break; 
             case "MULNUM":break; 
             case "DIVNUM":break; 
             default:break; 
   }
    
}


/* ProgrammMemory Testen
        File input = new File("test1.txt");
        ProgramMemory test = new ProgramMemory(input);
        System.out.println(test.getInstruktion(12));

*/

/* Register testen

 Register r= new Register();
        
        r.setregister(0, 100);
        r.setregister(3, 130);
        r.setregister(6, 180);
        r.setregister(9, 200);
        r.setregister(20, 1); //muss fehlschlagen
        
        
        for(int i=0;i<10;i++){
        
        System.out.println("Register:"+i+":"+r.getregister(i));
        
        }
*/
