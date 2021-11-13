import java.io.FileReader;
import java.io.IOException;

class second
{
    public second()
    {
        System.out.println("****\nSecond");//Введите свой путь
        try (FileReader reader = new FileReader("C:\\users\\BumBoks\\IdeaProjects\\Praktitki\\Pr8\\src\\Second.txt"))
        {
            int a;
            while((a=reader.read())!=-1)
            {
                System.out.print((char)a);
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public static void main (String[] args) throws IOException
    {
        second two = new second();
    }
}