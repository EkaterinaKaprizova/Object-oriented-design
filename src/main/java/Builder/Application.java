package Builder;

public class Application {
    private String name;
    private String directory;
    private int size;
    private Types type;
    private Permissions permission;
    private String nameInstaller = "Installer.exe"; //название папки с утановщиком

    public Application(String name, String directory, int size, Types type, Permissions permission) {
        this.name = name;
        this.directory = directory;
        this.size = size;
        this.type = type;
        this.permission = permission;
    }

    public void setNameInstaller(String nameInstaller) {
        this.nameInstaller = nameInstaller;
    }

    public String getName() {
        return name;
    }

    public String getDirectory() {
        return directory;
    }

    public int getSize() {
        return size;
    }

    public Types getType() {
        return type;
    }

    public Permissions getPermission() {
        return permission;
    }

    public String getNameInstaller() {
        return nameInstaller;
    }
}
