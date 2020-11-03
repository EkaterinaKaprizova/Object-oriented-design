package Prototype;

import java.util.Objects;

public abstract class DiskFile { //общий класс для всех файлов, существующих на диске
    public Permissions permission;
    public Types type;
    public String nameFile;

    public DiskFile(){}

    public DiskFile(DiskFile target)
    {
        if (target != null)
        {
            this.permission = target.permission;
            this.type = target.type;
            this.nameFile = target.nameFile;
        }
    }

    public abstract DiskFile clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiskFile diskFile = (DiskFile) o;
        return permission == diskFile.permission &&
                type == diskFile.type &&
                Objects.equals(nameFile, diskFile.nameFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, type, nameFile);
    }
}
