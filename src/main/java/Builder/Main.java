package Builder;

public class Main {
    public static void main(String[] args)
    {
        Manager manager = new Manager();
        ApplicationBuilder builder = new ApplicationBuilder();
        manager.createPicture(builder); //создание графический файлов (картинок)
        Application application = builder.getResult();
        System.out.println("Create picture " + application.getName());

        IconBuilder iconBuilder = new IconBuilder();
        manager.createPicture(iconBuilder);
        Icon icon = iconBuilder.getResult();
        System.out.println("Icon create(short Info) " + icon.shortInfo());
        System.out.println("\nIcon create(complete Info) \n" + icon.completeInfo());
    }
}
