package Builder;

public interface Builder {
    void setName(String name);
    void setSettings(int size, Types type);
    void setDirectory(String directory);
    void setPermission(Permissions permission);
}
