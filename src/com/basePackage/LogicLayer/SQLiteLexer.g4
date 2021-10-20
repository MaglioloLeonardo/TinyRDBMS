/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2020 by Martin Mirchev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * Project : sqlite-parser; an ANTLR4 grammar for SQLite https://github.com/bkiers/sqlite-parser
 * Developed by : Bart Kiers, bart@big-o.nl
 */
lexer grammar SQLiteLexer;

SCOL: ';';


DOT: '.';
OPEN_PAR: '(';
CLOSE_PAR: ')';
COMMA: ',';
ASSIGN: '=';
STAR: '*';
PLUS: '+';
MINUS: '-';
TILDE: '~';
PIPE2: '||';
DIV: '/';
MOD: '%';
LT2: '<<';
GT2: '>>';
AMP: '&';
PIPE: '|';
LT: '<';
LT_EQ: '<=';
GT: '>';
GT_EQ: '>=';
EQ: '==';
NOT_EQ1: '!=';
NOT_EQ2: '<>';

// http://www.sqlite.org/lang_keywords.html
ABORT: A B O R T;
ACTION: A C T I O N;
ADD: A D D;
AFTER: A F T E R;
ALL: A L L;
ALTER: A L T E R;
AND: A N D;
AS: A S;
ASC: A S C;
ATTACH: A T T A C H;
BEFORE: B E F O R E;
BEGIN: B E G I N;
BETWEEN: B E T W E E N;
BY: B Y;
IF: I F;
EXCEPT: E X C E P T;
CASCADE: C A S C A D E;
COLUMN: C O L U M N;
COMMIT: C O M M I T;
CONFLICT: C O N F L I C T;
CONSTRAINT: C O N S T R A I N T;
CREATE: C R E A T E;
CROSS: C R O S S;
CURRENT_DATE: C U R R E N T '_' D A T E;
CURRENT_TIME: C U R R E N T '_' T I M E;
CURRENT_TIMESTAMP: C U R R E N T '_' T I M E S T A M P;
DATABASE: D A T A B A S E;
DEFAULT: D E F A U L T;
DELETE: D E L E T E;
DESC: D E S C;
DETACH: D E T A C H;
DISTINCT: D I S T I N C T;
DROP: D R O P;
EXCLUSIVE: E X C L U S I V E;
EXISTS: E X I S T S;
FOREIGN: F O R E I G N;
FROM: F R O M;
FULL: F U L L;
GROUP: G R O U P;
HAVING: H A V I N G;
IN: I N;
INNER: I N N E R;
INSERT: I N S E R T;
INSTEAD: I N S T E A D;
INT: I N T;
INTERSECT: I N T E R S E C T;
INTO: I N T O;
IS: I S;
ISNULL: I S N U L L;
JOIN: J O I N;
KEY: K E Y;
LEFT: L E F T;
LIKE: L I K E;
LIMIT: L I M I T;
MATCH: M A T C H;
NATURAL: N A T U R A L;
NO: N O;
NOT: N O T;
NOTNULL: N O T N U L L;
NULL: N U L L;
OF: O F;
OFFSET: O F F S E T;
ON: O N;
OR: O R;
ORDER: O R D E R;
OUTER: O U T E R;
PRIMARY: P R I M A R Y;
QUERY: Q U E R Y;
RECURSIVE: R E C U R S I V E;
REFERENCES: R E F E R E N C E S;
RELEASE: R E L E A S E;
RENAME: R E N A M E;
REPLACE: R E P L A C E;
RESTRICT: R E S T R I C T;
RIGHT: R I G H T;
SELECT: S E L E C T;
SET: S E T;
SHOW: S H O W;
TABLE: T A B L E;
TABLES: T A B L E S;
THEN: T H E N;
TO: T O;
TRANSACTION: T R A N S A C T I O N;
UNION: U N I O N;
UNIQUE: U N I Q U E;
UPDATE: U P D A T E;
VALUES: V A L U E S;
VARCHAR: V A R C H A R;
WHEN: W H E N;
WHERE: W H E R E;
WITH: W I T H;
WITHOUT: W I T H O U T;
TRUE: T R U E;
FALSE: F A L S E;
NULLS: N U L L S;
FIRST: F I R S T;
LAST: L A S T;
EXCLUDE: E X C L U D E;

IDENTIFIER:
	'"' (~'"' | '""')* '"'
	| '`' (~'`' | '``')* '`'
	| '[' ~']'* ']'
	| [a-zA-Z_] [a-zA-Z_0-9]*; // TODO check: needs more chars in set

NUMERIC_LITERAL:
	((DIGIT+ ('.' DIGIT*)?) | ('.' DIGIT+)) (E [-+]? DIGIT+)?
	| '0x' HEX_DIGIT+;

BIND_PARAMETER: '?' DIGIT* | [:@$] IDENTIFIER;

STRING_LITERAL: '\'' ( ~'\'' | '\'\'')* '\'';


SINGLE_LINE_COMMENT:
	'--' ~[\r\n]* (('\r'? '\n') | EOF) -> channel(HIDDEN);

MULTILINE_COMMENT: '/*' .*? ( '*/' | EOF) -> channel(HIDDEN);

SPACES: [ \u000B\t\r\n] -> channel(HIDDEN);

UNEXPECTED_CHAR: .;

fragment HEX_DIGIT: [0-9a-fA-F];
fragment DIGIT: [0-9];

fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];
