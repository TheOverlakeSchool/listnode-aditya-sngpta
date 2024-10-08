public class LinkedIntList {

    private ListNode front;

    public LinkedIntList() {
        front = null;
    }

    // Adds the given value to the end of the list.
    public void add(int value) {
        if (front == null) {
            // adding to an empty list
            front = new ListNode(value);
        } else {
            // adding to the end of an existing list
            ListNode current = front;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    public void add(int index, int value) {
        if (index == 0)
        {
            front = new ListNode(value, front);
        } else {
            ListNode current = front;
            for(int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next =  new ListNode(value, current.next);

        }

        /*
        ListNode current = front;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        int temp = current.data;
        current.data = value;
        while (current.next != null) {
            value = temp;
            temp = current.data;
            current.data = value;
            current = current.next;
        }
        front.add(temp);
    }

    public int get(int index) {
        ListNode current = front;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
        */
    }
}
