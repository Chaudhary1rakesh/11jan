public class leetcode2 {
    
    
        public ListNode deleteDuplicates(ListNode head) {
            if(head == null) {
                return head;
            }
            
            ListNode temp = head;
            
            while(temp != null && temp.next != null) {
                if(temp.val == temp.next.val) {
                    temp.next = temp.next.next;
                    continue;
                }
                temp = temp.next;
            }
            
            return head;
        }
    }
