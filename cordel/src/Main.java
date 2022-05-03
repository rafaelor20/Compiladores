import cordel.parser.*;
import cordel.lexer.*;
import cordel.node.*;
import java.io.*;

public class Main
{
 public static void main(String[] args)
 {
  try
  {  
   Parser p =
    new Parser(
    new Lexer(
    new PushbackReader(  
    new FileReader(arquivo), 1024))); 
   
   Start tree = p.parse();

   tree.apply(new ASTDisplay());
   
   //tree.apply(new Semantico());
   
  }
  catch(Exception e)
  {
   System.out.println(e.getMessage());
  }
 }
}