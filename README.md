# TinyRDBMS
Relational DBMS able to execute SQL code written in Java and ANTLR implemented using a multi-thread approach.

The project is to be considered complete, however, there are some noteworthy practices as regards the usable sql syntax:
<ul>
  <li>Definable data types are only 'INT' and 'VARCHAR'</li>
  <li>It is not possible to define indexes or materialization of views</li>
  <li>The only type of join declarable using specialized sintax is the JOIN ON (CONSTRAINT)</li>
  <li>Although multi-threaded programming greatly limits the response time due to queries involving tables much larger than the page manager buffer capacity and some logical optimizations have been implemented, not having implemented all of them represents a design limitation that can impact on the speed of execution of some queries</li>
</ul>

The project can be executed with che command 'java -jar Progetto.jar', the jar file is situated in the folder 'Compiled Executable'. The folder containing 'Progetto.jar' must contain a folder called 'DBFolder'.
