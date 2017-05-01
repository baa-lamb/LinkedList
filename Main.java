import org.suai.lab4.List.SortedIntegerList;

public class Main {
    public static void main(String argc[]){
        SortedIntegerList s = new SortedIntegerList(false);
        for(int i = 0; i < 6; i++)
            s.add(i*7 % 11);
        s.add(2);
        s.remove(3);
        System.out.println(s);

        SortedIntegerList m = new SortedIntegerList(true);
        for(int i = 5; i > 1; i--)
            m.add(i * 3 % 7);
        m.add(1);
        m.add(1);
        m.remove(2);
        System.out.println(m);

        if(m.equals(s))
            System.out.println(1);
        else
            System.out.println(0);

        SortedIntegerList res = s.Sum(m, true);
        System.out.println(res);


    }
}

