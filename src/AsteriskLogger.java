import java.util.Date;

public class AsteriskLogger implements Logger {
  
  public String asterisk = "***";
  
  
  

  @Override
  public String Log(String Log) {
    return (asterisk + Log + asterisk);
    
  }


  @Override
  public String Error(String Error) {
    
    String line = asterisk + "ERROR: " + Error + asterisk;
    StringBuilder asteriskLine = new StringBuilder();
    
    for (int i = 0; i < line.length(); i++) {
      asteriskLine.append("*");
      
    }
    
    return (asteriskLine + "\n" + line + "\n" + asteriskLine);
    
    // TODO Auto-generated method stub
    
  }



  }
   


