/**
 * Define a grammar called Hello
 */
grammar SimpleCodeCompletion;
// Parser
query: Count Fruits EOF;

// Lexer
Count: [Cc] [Oo] [Uu] [Nn] [Tt];
Fruits: '"'[0-9a-zA-Z]'"';
Ws: [\s] -> skip;
