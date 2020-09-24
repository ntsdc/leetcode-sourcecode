
public class ListNodeDemo {
    public static void main(String[] args) {

        AddTwoNumbers_Linklist l1 = new AddTwoNumbers_Linklist(2);

        l1.next=new AddTwoNumbers_Linklist(4);
        l1.next.next=new AddTwoNumbers_Linklist(3);

        AddTwoNumbers_Linklist l2 = new AddTwoNumbers_Linklist(5);
        l2.next=new AddTwoNumbers_Linklist(6);
        l2.next.next=new AddTwoNumbers_Linklist(4);

//        System.out.println(addTwoNumbers(l1,l2));
    }


    public static AddTwoNumbers_Linklist addTwoNumbers(AddTwoNumbers_Linklist l1, AddTwoNumbers_Linklist l2) {
        AddTwoNumbers_Linklist res = new AddTwoNumbers_Linklist(0);

//        ListNode node1 = l1;
//        ListNode node2 = l2;
//        int a = 0;
//
//        int i = 0;
//
//        while (true) {
//            a += node1.val * Math.pow(10, i);
//
//            if (node1.next != null) {
//                node1 = node1.next;
//                i++;
//            } else {
//                break;
//            }
//        }
//        int b = 0;
//        int j = 0;
//        while (true) {
//
//
//            b += node2.val * Math.pow(10, j);
//
//            if (node2.next != null) {
//                node2 = node2.next;
//                j++;
//            } else {
//                break;
//            }
//        }
//        int sum = a + b;
//        ListNode node3=res;
//        while (true) {
//            node3.val=sum%10;
//            sum/=10;
//            if(sum!=0){
//                node3.next = new ListNode(0);
//                node3=node3.next;
//            }else break;
//
//
//        }

        return res;
    }

}

class AddTwoNumbers_Linklist {
    int val;
    AddTwoNumbers_Linklist next;

    AddTwoNumbers_Linklist(int x) {
        val = x;
    };
    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }



}
