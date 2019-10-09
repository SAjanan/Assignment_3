package assignment_3;

public class operq3p3 {
    private String key;
    private int value;

    public operq3p3(String key, int value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return key;
    }

    public String getKey()
    {
        return key;
    }

    public int getValue()
    {
        return value;
    }
}
