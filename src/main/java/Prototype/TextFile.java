package Prototype;

import java.util.Objects;

public class TextFile extends DiskFile{ //текстовый файл
    public String text; //текст, который может находиться в файле

    public TextFile(){}

    public TextFile(TextFile target)
    {
        super(target);
        if(target != null)
        {
            this.text = target.text;
        }
    }

    @Override
    public DiskFile clone()
    {
        return new TextFile(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(text, textFile.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }
}
