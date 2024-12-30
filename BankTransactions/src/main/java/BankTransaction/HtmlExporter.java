package BankTransaction;

public class HtmlExporter implements Exporter{

    @Override
    public String export(SummaryStatistics summaryStatistics) {
        String result = "<!DOCTYPE HTML>";
        result += "<html lang='en'";
        result += "<body>";
        result += "<ul>";
        result += "<li><strong> The Sum is</strong> : " + summaryStatistics.getSum();
        result += "<li><strong> The Average is</strong> : " + summaryStatistics.getAverage();
        result += "<li><strong> The Min is</strong> : " + summaryStatistics.getMin();
        result += "</ul>";
        result += "</body>";
        result += "</html>";

        return result;
    }
}
