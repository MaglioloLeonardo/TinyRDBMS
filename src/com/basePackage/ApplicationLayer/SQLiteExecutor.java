package com.basePackage.ApplicationLayer;
import com.basePackage.UtilityLayer.StringContainer;
import org.antlr.v4.runtime.CharStreams;


public class SQLiteExecutor {
    public static void execCommand(String command, StringContainer result) throws Exception {
        antlrOutput.SQLiteLexer lexer = new antlrOutput.SQLiteLexer(CharStreams.fromString(command));
        antlrOutput.SQLiteParser parser = new antlrOutput.SQLiteParser(new org.antlr.v4.runtime.CommonTokenStream(lexer), result);
        parser.setErrorHandler(new BailErrorStrategy(result));
        parser.parse();
    }
}