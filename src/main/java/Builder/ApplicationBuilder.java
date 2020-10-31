package Builder;

public class ApplicationBuilder implements Builder { //строитель приложения и других объектов
    private String name;
    private String directory;
    private int size;
    private Types type;
    private Permissions permission;

    public Application getResult()
    {
        return new Application(name, directory, size, type, permission);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @Override
    public void setPermission(Permissions permission) {
        this.permission = permission;
    }

    @Override
    public void setSettings(int size, Types type) {
        this.size = size;
        this.type = type;
    }
}
