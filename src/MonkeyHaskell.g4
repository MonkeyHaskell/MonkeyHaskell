grammar MonkeyHaskell;

// ==================== PARSER RULES ====================
program: (decl (EOF | newline))*;
newline: NEWLINE;

decl
    : func '::' type                                #TypeSignature
    | func identifier* declval                      #FuncDeclaration;
declval
    : '=' expr
    | gdecl;
gdecl
    : (guards '=' expr) (NEWLINE gdecl)?;
guards
    : '|' guard;
guard
    : infexpr                                       #GuardExpr
    | 'otherwise'                                   #DefaultGuard;
identifier
    : FUNCID;
func
    : FUNCID
    | '(' FUNCSYMBOL ')';
cons
    : CONSID
    | '(' CONSSYMBOL ')';
op
    : funcop
    | consop;
funcop
    : FUNCSYMBOL
    | '`' FUNCID '`';
consop
    : CONSSYMBOL
    | '`' CONSID '`';
literal
    : STRING
    | INTEGER
    | FLOAT
    | CHAR;
type
    : atype ('->' type)?;
atype
    : typecons                                      #TypeCons
    | identifier                                    #TypeId
    | '(' type (',' type)+ ')'                      #TuplType
    | '[' type ']'                                  #ListType
    | '(' type ')'                                  #PareType;
typecons
    : '()'                                          #UnitType
    | '[]'                                          #ListTypeCons
    | '(->)'                                        #FuncTypeCons
    | '(' ','+ ')'                                  #TuplTypeCons;
expr
    : infexpr '::' type
    | infexpr;
aexpr
    : func                                          #FuncExpr
    | cons                                          #ConsExpr
    | literal                                       #LiteExpr
    | '(' expr ')'                                  #PareExpr
    | '(' expr (',' expr)+ ')'                      #TuplExpr
    | '[' expr (',' expr)* ']'                      #ListExpr
    | '[' expr (',' expr)? '..' expr? ']'           #SequExpr
    | '(' infexpr op ')'                            #LeftExpr
    | '(' op infexpr ')'                            #RighExpr;
infexpr
    : lexpr op infexpr                              #InfOpExpr
    | '-' infexpr                                   #NegaExpr
    | lexpr                                         #LambdaExpr;
lexpr
    : 'if' expr ';'? 'then' expr ';'? 'else' expr   #CondExpr
    | fexpr                                         #FExpr;
fexpr
    : aexpr+;

// ==================================== LEXER RULES ====================================
        // reserved id are declared before FUNCID and CONSID
        // to ensure they won't be detected as such.
         RESERVEDID  : 'if' | 'then' | 'else' | 'otherwise';
         
         FUNCID      : LOWERC (LOWERC | UPPERC | DIGIT | '\'')*;
         CONSID      : UPPERC (LOWERC | UPPERC | DIGIT | '\'')*;

         INTEGER     : DECIMAL
                     | ('0o' OCTAL) | ('0O' OCTAL)
                     | ('0x' HEXADECIMAL) | ('0X' HEXADECIMAL);
         FLOAT       : DECIMAL '.' DECIMAL EXPONENT?
                     | DECIMAL EXPONENT;
         CHAR        : '\'' ~('\'' | '\\')* '\'';
         STRING      : '"' ~('"' | '\\')* '"';

         DECIMAL     : DIGIT+;
         OCTAL       : OCTIT+;
         HEXADECIMAL : HEXIT+;
         EXPONENT    : ('e' | 'E') ('+' | '-') DECIMAL;

         WHITESPACE  : (SPACE | TAB) -> channel(HIDDEN);
         SPACE       : ' ';
         TAB         : '\t';
         DASHES      : '--''-'*;
         NEWLINE     : ('\r' | '\n')+;

         LOWERC      : [a-z];
         UPPERC      : [A-Z];
         DIGIT       : [0-9];
         OCTIT       : [0-7];
         HEXIT       : DIGIT | [a-f] | [A-F];
fragment SYMBOL      : '!' | '#' | '$' | '%' | '&' | '⋆' | '+' | '.' | '/' | '<' | '=' | '>' | '?' | '@' | '\\' | '^' | '|' | '-' | '~' | ':';
         SPECIAL     : '(' | ')' | ',' | ';' | '[' | ']' | '`' | '{' | '}';

         // CONSSYMBOL needs to be declared before FUNCSYMBOL to make sure
         // it hides every symbols starting with
         RESERVEDOP  : '..' | ':' | '::' | '=' | '\\' | '|' | '<-' | '->' | '@' | '~' | '=>';
         
         CONSSYMBOL  : ':' SYMBOL*;
         FUNCSYMBOL  :  SYMBOL SYMBOL*;