package grid_parsys.core;

import java.util.Map;

public class Columns {

    private long numberColumns;

    private Map<String, String> attribut;


    public long getNumberColumns() {
        return numberColumns;
    }

    public void setNumberColumns(long numberColumns) {
        this.numberColumns = numberColumns;
    }

    public Map<String, String> getAttribut() {
        return attribut;
    }

    public void setAttribut(Map<String, String> attribut) {
        this.attribut = attribut;
    }
}
