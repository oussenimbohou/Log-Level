public class LogLevels {
    
    public static String message(String logLine) {
    if(logLine.contains("ERROR") || logLine.contains("WARNING") ||logLine.contains("INFO"))return logLine.split(":")[1].trim();
    return null;
    }

    public static String logLevel(String logLine) {
        return logLine.split(":")[0].split("\\[")[1].split("\\]")[0].toLowerCase();
    }

    public static String reformat(String logLine) {      
        String info = logLine.split(":")[0].split("\\[")[1].split("\\]")[0].toLowerCase();
        String msg = logLine.split(":")[1].trim();
        return msg + " ("+info+")";
    }
}
