package com.basePackage.ApplicationLayer;
import com.basePackage.LogicLayer.AntlrOutput.BailErrorStrategy;
import com.basePackage.LogicLayer.AntlrOutput.SQLiteLexer;
import com.basePackage.LogicLayer.AntlrOutput.SQLiteParser;
import com.basePackage.UtilityLayer.StringContainer;
import org.antlr.v4.runtime.CharStreams;


public class SQLiteExecutor {
    public static void execCommand(String command, StringContainer result) throws Exception {
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(command));
        SQLiteParser parser = new SQLiteParser(new org.antlr.v4.runtime.CommonTokenStream(lexer), result);
        parser.setErrorHandler(new BailErrorStrategy(result));
        parser.parse();
    }
}