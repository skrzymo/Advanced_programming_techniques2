package com.skrzymo;

class TableDataInt implements TableData
{
    private int data;

    public TableDataInt()
    {
        data = 10+rnd.nextInt(90);
    }
    public String toString()
    {
        return Integer.toString(data);
    }
}
