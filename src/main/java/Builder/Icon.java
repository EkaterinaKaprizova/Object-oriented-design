package Builder;

public class Icon {
    private String name;
    private String directory;
    private int size;
    private Types type;
    private Permissions permission;

    public Icon(String name, String directory, int size, Types type, Permissions permission) {
        this.name = name;
        this.directory = directory;
        this.size = size;
        this.type = type;
        this.permission = permission;
    }

    public String shortInfo()
    {
        if (name == null) {
            return "Wrong! Name is null!";
        }
        if (permission == null)
        {
            return "Wrong! Permission is not defined!";
        }
        return "Name: " + name + "\n " + "Permission: " + permission;
    }

    public String completeInfo()
    {
        if (name == null) {
            return "Wrong! Name is null!";
        }
        if (directory == null) {
            return "Wrong! Directory is not defined!";
        }
        if (permission == null)
        {
            return "Wrong! Permission is not defined!";
        }
        return name + "\n" + directory + "\n" + size + "\n" + type + "\n" + permission;
    }
}
