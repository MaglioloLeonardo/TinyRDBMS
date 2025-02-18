<h1>🚀 Relational DBMS with Java & ANTLR</h1>

<p>
This project implements a <strong>Relational Database Management System (RDBMS)</strong> capable of executing <strong>SQL queries</strong> written in Java and parsed using <strong>ANTLR</strong>. 
It features a <strong>multi-threaded architecture</strong> for optimized query execution and a structured design that enables educational analysis of RDBMS implementation.
</p>

<hr>

<h2>📄 Project Overview</h2>

<ul>
  <li><strong>Query Execution:</strong> Supports SQL parsing and execution using a custom-built engine.</li>
  <li><strong>ANTLR Integration:</strong> Implements a lexer and parser for SQL grammar.</li>
  <li><strong>Multi-Threading:</strong> Enables concurrent query processing for performance improvement.</li>
  <li><strong>Custom Data Storage:</strong> Uses a file-based approach with structured data retrieval.</li>
  <li><strong>Optimizations:</strong> Implements logical optimizations to speed up certain queries.</li>
</ul>

<hr>

<h2>🚀 Implementation Details</h2>

<h3>🔍 SQL Syntax Supported</h3>
<p>
The SQL syntax available in this RDBMS follows certain limitations and constraints:
</p>
<ul>
  <li><strong>Supported Data Types:</strong> Only <code>INT</code> and <code>VARCHAR</code> can be defined.</li>
  <li><strong>Indexing:</strong> No support for indexes or materialized views.</li>
  <li><strong>Join Support:</strong> The only declarable join type is <code>JOIN ON (CONSTRAINT)</code>.</li>
</ul>

<h3>🖥️ Multi-Threaded Query Execution</h3>
<p>
The database engine utilizes a multi-threaded approach to handle concurrent query execution efficiently. 
However, performance may degrade when handling queries involving tables larger than the buffer capacity of the page manager.
</p>

<h3>📚 SQL Query Parsing with ANTLR</h3>
<p>
ANTLR is used to define and parse SQL grammar, ensuring a structured and modular implementation. 
This allows efficient transformation of SQL statements into executable commands within the database engine.
</p>

<h3>📂 Storage & Data Management</h3>
<ul>
  <li><strong>File-Based Storage:</strong> Data is stored in structured files instead of a traditional database engine.</li>
  <li><strong>Page Manager:</strong> Handles loading and buffering of data pages.</li>
  <li><strong>Query Execution Pipeline:</strong> Implements an execution plan to optimize certain operations.</li>
</ul>

<hr>

<h2>🚀 How to Run the Project</h2>

<p>The project can be executed using the following command:</p>

<pre><code>java -jar Progetto.jar</code></pre>

<p>The JAR file is located in the <code>Compiled Executable</code> folder. Ensure that the folder containing <code>Progetto.jar</code> includes a directory named <code>DBFolder</code>.</p>

<hr>

<h2>📖 Documentation</h2>

<p>
The project is accompanied by a detailed <strong>Bachelor Thesis</strong> available in both <strong>Italian</strong> and <strong>English</strong>. 
The thesis provides an in-depth analysis of:
</p>

<ul>
  <li><strong>ANTLR and Formal Languages:</strong> Explaining how SQL parsing is implemented.</li>
  <li><strong>Database Architecture:</strong> Details on data storage and query execution.</li>
  <li><strong>Optimization Techniques:</strong> Strategies used to improve performance.</li>
  <li><strong>Future Improvements:</strong> Possible extensions and enhancements for scalability.</li>
</ul>

<p><strong>📄 Thesis available in:</strong> <code>thesis.pdf</code></p>

<hr>

<h2>📈 Performance & Limitations</h2>
<ul>
  <li><strong>Optimized Query Execution:</strong> Logical optimizations improve performance.</li>
  <li><strong>Multi-Threading:</strong> Reduces response time but is constrained by buffer limitations.</li>
  <li><strong>Scalability Constraints:</strong> The absence of advanced indexing may impact execution speed on large datasets.</li>
</ul>

<hr>

<p>🔥 <em>This project demonstrates a fully functional RDBMS implementation with ANTLR and Java. 
Explore the source code, test SQL execution, and consider extending the system with additional optimizations! 🚀</em></p>

<br>
(It is possible that the reports in English contain words or formulas that are difficult to read due to automatic stranslation of the pdf; to read them correctly, consult the Italian version)
