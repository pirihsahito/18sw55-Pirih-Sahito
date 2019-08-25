package lab08;
class Parent
{
    final public String getName()
    {
        return "Pirih Sahito";
    }
}
class Child extends Parent
{
    // This method will gave an Error that final method can't be overriden
        public String getName()
    {
        return "Hittler";
    }    
}