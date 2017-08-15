import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class HelloRunner 
{
    public static void main( String[] args) throws Exception 
    {
    	String fileName = "tests/simpletest1.lang";
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);

        CharStream input = CharStreams.fromStream(fis);

        HelloLexer lexer = new HelloLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        HelloParser parser = new HelloParser(tokens);
        ParseTree tree = parser.r(); // begin parsing at rule 'r'
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}