
public class SpacedLogger implements Logger{
    

  


  public String Log(String Log) {
    StringBuilder input = new StringBuilder();
    for (int i =0; i < Log.length(); i++) {
      if (i > 0) {
        input.append(" ");
      }
        
        input.append(Log.charAt(i));
    }  
    
    return(input.toString());
    
  }

  
 public String Error(String Error) {
   StringBuilder input = new StringBuilder();
   for (int i = 0; i < Error.length(); i++) {
     if (i > 0) {
       input.append(" ");
     }
       
       input.append(Error.charAt(i));
   }  
   
   return("ERROR: " + input.toString());
   
 }
   
    
  }


