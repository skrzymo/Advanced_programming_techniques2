package com.skrzymo;

public class TableHeaderBool implements TableHeader {

    private String name;

    public TableHeaderBool()
    {
        name = "Boolean";
    }
    public String toString()
    {
        return name;
    }
}
