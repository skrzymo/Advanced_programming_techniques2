package com.skrzymo;

import java.text.DecimalFormat;

public class TableDataFloat implements TableData {

    private float data;
    private DecimalFormat df = new DecimalFormat("#.00");

    public TableDataFloat()
    {
        data = 10+rnd.nextFloat()*90;
    }
    public String toString()
    {
        return df.format(data);
    }
}
