import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class SimpleCodeCompletion 
{
    public static void main( String[] args) throws Exception 
    {    	
    	String fileName = "tests/simpletest1.lang";
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);

        CharStream input = CharStreams.fromStream(fis);

        SimpleCodeCompletionLexer lexer = new SimpleCodeCompletionLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SimpleCodeCompletionParser parser = new SimpleCodeCompletionParser(tokens);
        ParseTree tree = parser.query(); // begin parsing at rule 'query'
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}