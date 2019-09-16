package Encap1841720075Adam;
public class EncapDemo {
    private String name;
    private int age;   
public String getName()
{
    return name;
}
public void seName(String newName)
{
    name = newName;
}
public int getAge()
{
    return age;
}
public void setAge(int newAge)
{
    if(newAge>30)
    {
        age=30;
    }
    else
    {
        age=newAge;
    }
}
}