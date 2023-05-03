package queue;

public class queue {
	    private int[] arr;
	    private int head;
	    private int tail;
	    private int capacity;
	    private int count;

	    public queue(int count) {
	        this.arr = new int[count];
	        this.capacity = count;
	        this.head = 0;
	        this.tail = -1;
	        this.count = 0;
	    }

	    public void enqueue(int value) {
	        if (isFull()) {
	            System.out.println("Cannot enqueue because queue is full " + value);
	            return;
	        }
	        tail = (tail + 1) % capacity;
	        arr[tail] = value;
	        count++;
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Cannot dequeue because queue is empty");
	            return -1;
	        }
	        int value = arr[head];
	        head = (head + 1) % capacity;
	        count--;
	        return value;
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }
	        System.out.print("Queue: ");
	        for (int i = 0; i < count; i++) {
	            int index = (head + i) % capacity;
	            System.out.print(arr[index] + " ");
	        }
	        System.out.println();
	    }

	    public void queuehead() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }
	        System.out.println("head of Queue: " + arr[head]);
	    }

	    public boolean isFull() {
	        return count == capacity;
	    }

	    public boolean isEmpty() {
	        return count == 0;
	    }
	    public static void main(String[] args) {
	        queue queue = new queue(5);

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.enqueue(50);

	        queue.display();

	        queue.dequeue();
	        queue.dequeue();
	        queue.dequeue();

	        queue.display();
	        queue.queuehead();
	    }

	}


