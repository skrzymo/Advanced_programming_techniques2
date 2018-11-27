package com.skrzymo;

import java.text.DecimalFormat;

public class TableDataDouble implements TableData {

    private double data;
    private DecimalFormat df = new DecimalFormat("#.00");

    public TableDataDouble()
    {
        data = 10.0+rnd.nextDouble()*90.0;
    }
    public String toString()
    {
        return df.format(data);
    }
}
