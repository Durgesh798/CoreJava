interface Writer
{
    void write();
}
class Pen implements Writer
{
    public void write()
    {
        System.out.println("I am a pen");
    }
}
class Pencil implements Writer
{
    public void write()
    {
        System.out.println("I am a pencil");
    }
}
class Kit
{
    public void show(Writer w)
    {
        w.write();
    }
}
public class InterfaceEx
{
    public static void main(String[] args)
    {
        Kit k=new Kit();
        Writer p=new Pen();
        Writer pn=new Pencil();
        p.write();
        pn.write();
    }


}
