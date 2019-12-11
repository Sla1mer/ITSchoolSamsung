package HomeWork_Module_2;

class ArrayClass
{
    private String[] arr;

    public ArrayClass(int lenght)
    {
        Create(lenght);
    }

    private String[] Create(int lenght)
    {
        return arr = new String[lenght];
    }

    public void Add(String[] str)
    {
        if(str.length <= arr.length)
            arr = str;
    }

    public String getElement(int index)
    {
        if(index < arr.length && index >= 0)
        {
            return arr[index];
        }
        else
        {
            return "Выход за пределы массива";
        }
    }

//    public String[] ConcatWithCheck(ArrayClass obj)
//    {
//        return arr.Contact(obj.arr).Distinct().ToArray();
//    }

    public void Show(int index)
    {
        System.out.println("Элемент = " + arr[index]);
    }

    public void ShowArray()
    {
        String result = null;
        for (String s : arr)
        {
            result += s + ", ";
        }
        System.out.println(result);
    }
}
