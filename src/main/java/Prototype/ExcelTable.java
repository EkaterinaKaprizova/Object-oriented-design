package Prototype;

import java.util.Objects;

public class ExcelTable extends DiskFile{ //таблица в Excel
    public int columns; //количество столбцов в таблице
    public int lines; //количество строк в таблице
    public String text; //текст в ячейке

    public ExcelTable(){}

    public ExcelTable(ExcelTable target)
    {
        super(target);
        if(target != null)
        {
            this.columns = target.columns;
            this.lines = target.lines;
            this.text = target.text;
        }
    }

    @Override
    public DiskFile clone()
    {
        return new ExcelTable(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ExcelTable that = (ExcelTable) o;
        return columns == that.columns &&
                lines == that.lines &&
                Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), columns, lines, text);
    }
}
