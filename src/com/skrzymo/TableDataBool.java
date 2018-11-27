package com.skrzymo;

public class TableDataBool implements TableData {

    private boolean data;

    public TableDataBool()
    {
        data = rnd.nextBoolean();
    }
    public String toString()
    {
        return Boolean.toString(data);
    }
}
