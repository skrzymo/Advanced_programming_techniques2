package com.skrzymo;

public class TableHeaderString implements TableHeader {

    private String name;

    public TableHeaderString()
    {
        name = "String";
    }
    public String toString()
    {
        return name;
    }
}
