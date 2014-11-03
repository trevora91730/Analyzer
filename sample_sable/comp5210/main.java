package comp5210;

//import comp5210.parser.*;
import comp5210.lexer.*;
import comp5210.node.*;
//import comp5210.semantic.SemanticAnalyzer;

import java.io.*;

public class main {
   public static void main(String[] args) {
      if (args.length < 1) {
         System.out.println("Usage:");
         System.out.println("java comp5210.main <filename>");
         return;
      }
      try {
         // create lexer
         Lexer lexer = new Lexer(new PushbackReader(new BufferedReader(
            new FileReader(args[0])),1024));
         Token token=null;
         boolean b;
         b = true;
         while (b) {

            try {
               token = lexer.next();
               // print out the token class
               System.out.print(token.getClass().getName());
               System.out.println("\"" + token.getText() + "\"" + " line: " + token.getLine() +
                 " column: " + token.getPos());
            }
            catch (Exception e) {
               System.out.println(e);
            }
            b = token!=null && !token.getText().isEmpty();
         }
         // create parser
  //       Parser parser = new Parser(lexer);

 //        Start ast = parser.parse();
 //        System.out.println("---------------------------------");
 //        System.out.println("!!File is syntatically correct!!");
 //        System.out.println("---------------------------------");
         // ast.apply(new SemanticAnalyzer());
      }
      catch (Exception e) {
         System.out.println(e);
      }
   }
}
