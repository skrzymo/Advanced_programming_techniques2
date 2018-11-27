package com.skrzymo;


import java.util.ArrayList;

public class Table {

    // lista nagłówków
    private ArrayList<TableHeader> headers;
    // lista wierszy (każdy wiersz to lista komórek)
    private ArrayList<ArrayList<TableData>> rows;

    public Table()
    {
        headers = new ArrayList<TableHeader>();
        rows = new ArrayList<ArrayList<TableData>>();
    }
    // dodawanie wiersza
    public void addRow()
    {
        // nowy wiersz
        ArrayList<TableData> row = new ArrayList<TableData>();
        // wypełniamy komórkami - tyle, ile mamy kolumn
        for(TableHeader col:headers)
            if(col.toString().equals("Int")) {
                row.add(new TableDataInt());
            } else if(col.toString().equals("Double")) {
                row.add(new TableDataDouble());
            } else if(col.toString().equals("Boolean")) {
                row.add(new TableDataBool());
            } else if(col.toString().equals("String")) {
                row.add(new TableDataString());
            } else if(col.toString().equals("Float")) {
                row.add(new TableDataFloat());
            }
        // dodajemy do listy wierszy
        rows.add(row);
    }
    // dodawanie kolumny
    public void addCol(TableHeader header)
    {
        // dodajemy do listy nagłówków
        headers.add(header);
        // dodajemy po jednej komórce do każdego wiersza
        for(ArrayList<TableData> row:rows)
            if(header.toString().equals("Int")) {
                row.add(new TableDataInt());
            } else if(header.toString().equals("Double")) {
                row.add(new TableDataDouble());
            } else if(header.toString().equals("Boolean")) {
                row.add(new TableDataBool());
            } else if(header.toString().equals("String")) {
                row.add(new TableDataString());
            } else if(header.toString().equals("Float")) {
                row.add(new TableDataFloat());
            }
    }
    // do wypisywania tabeli
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for(com.skrzymo.TableHeader header : headers)
            result.append("| " + header + " ");
        result.append("|\n");
        for(com.skrzymo.TableHeader header : headers)
            result.append("+----");
        result.append("+\n");
        for(ArrayList<TableData> row : rows)
        {
            for(TableData cell : row)
                result.append("| " + cell + " ");
            result.append("|\n");
        }
        return result.toString();
    }

}
