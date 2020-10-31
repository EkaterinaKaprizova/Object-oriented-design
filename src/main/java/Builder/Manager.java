package Builder;

public class Manager {
    public void createPicture(Builder builder)
    {
        builder.setName("DefaultPicture");
        builder.setSettings(100, Types.picture);
        builder.setDirectory("C:\\Users\\UserName\\pictures");
        builder.setPermission(Permissions.JPG);
    }

    public void createApplication(Builder builder)
    {
        builder.setName("DefaultApplication");
        builder.setSettings(40000000, Types.application);
        builder.setDirectory("C:\\Program Files\\Games");
        builder.setPermission(Permissions.EXE);
    }

    public void createData_Base(Builder builder)
    {
        builder.setName("DefaultData_Base");
        builder.setSettings(500, Types.data_base);
        builder.setDirectory("C:\\Program Files\\Data_Base");
        builder.setPermission(Permissions.PDB);
    }

    public void createAudio(Builder builder)
    {
        builder.setName("DefaultAudio");
        builder.setSettings(250, Types.audio);
        builder.setDirectory("C:\\Program Files\\AudioFiles");
        builder.setPermission(Permissions.MP3);
    }
}
