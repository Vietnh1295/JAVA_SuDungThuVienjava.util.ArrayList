public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>(1);
        list.add(12);
        list.add(122);
        list.remove(1);
        MyList<Integer> newlist=list.clone();
        System.out.println(list.size()+"  "+list.contain(122));

        list.print();
      newlist.print();
    }
}
