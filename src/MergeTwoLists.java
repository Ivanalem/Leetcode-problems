import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoLists{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<ListNode> mergList = new LinkedList<>();
        mergList.add(list1);
        mergList.add(list2);
        return null;
    }
}
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
