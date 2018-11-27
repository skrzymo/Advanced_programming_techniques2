package com.skrzymo;


public class Main {

    public static void main(String[] args) {

            Table table = new Table();
            table.addCol(new TableHeaderInt());
            table.addCol(new TableHeaderDouble());
            table.addCol(new TableHeaderString());
            table.addCol(new TableHeaderFloat());
            table.addCol(new TableHeaderBool());

            table.addRow();
            table.addRow();
            table.addRow();
            table.addRow();
            table.addRow();
            System.out.println(table);


            //table.addCol(new com.skrzymo.TableHeader("IJ"));
            table.addRow();
            table.addRow();
            System.out.println(table);

    }
}
