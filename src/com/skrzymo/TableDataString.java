package com.skrzymo;

import java.nio.charset.Charset;

public class TableDataString implements TableData {

    private String data;

    public TableDataString()
    {
        byte[] array = new byte[7];
        rnd.nextBytes(array);
        data = new String(array, Charset.forName("UTF-8"));
    }
    public String toString()
    {
        return data;
    }
}
