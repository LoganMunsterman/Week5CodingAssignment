
public class App {
  
    static Logger logger = new AsteriskLogger();
    static Logger logger2 = new SpacedLogger();

  public static void main(String[] args) {
    
   System.out.println(logger.Log("hello"));
   System.out.println(logger.Error("hello"));
   System.out.println(logger2.Log("Hello"));
   System.out.println(logger2.Error("Hello"));
  
}


}