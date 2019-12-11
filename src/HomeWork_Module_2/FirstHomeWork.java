package HomeWork_Module_2;

public class FirstHomeWork {
    private int first;
    private int first2; // Вторая переменная для первой дроби
    private int second;
    private int second2; // Вторая переменная для второй дроби
    private float number;

    public FirstHomeWork(int first, int first2, int second, int second2, float number) {
        this.first = first;
        this.first2 = first2;
        this.second = second;
        this.second2 = second2;
        this.number = number;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public float getNumber() {
        return number;
    }

    public int getFirst2() {
        return first2;
    }

    public int getSecond2() {
        return second2;
    }

    public void Read(){
        getFirst();
        getFirst2();
        getSecond();
        getSecond2();
        getNumber();
    }

    public void rangeCheck(){

        int resLeft = getFirst()/getSecond2();
        int resRight = getSecond()/getSecond2();

        if (number>resLeft && number<resRight){
            System.out.println("Вы прошли проверку");
        }else {
            System.out.println("Вы не прошли проверку");
        }
    }

    public void Display(){
        System.out.print("Первая дробь: " + getFirst() + "/" + getFirst2());
        System.out.println();
        System.out.println("Вторая дробь: " + getSecond() + "/" + getSecond2());
        rangeCheck();
    }

//    public void PrintFirst(){
//        System.out.println(getFirst()+"/" + getFirst2());
//    }
//
//    public void PrintSecond(){
//        System.out.println(getSecond()+"/"+ getSecond2());
//    }
}
