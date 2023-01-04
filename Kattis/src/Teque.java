
public class Teque {
		Node front;
		Node middle;
		Node back;
		int size;
		
		public Teque() {
			this.front = null;
			this.middle = null;
			this.back = null;
			this.size = 0;
		}
		
		public void pushFront(int data) {
			
			if(size > 0) {
				this.front = this.front.prev = new Node(data, null, front);
			} else  {
				this.front = new Node(data, null, null);
			}
			this.size++;
		}
		
		public void pushBack(int data) {
			Node temp = new Node(data, this.back, null);
			this.back = temp;
			this.size++;

		}
		public void pushMiddle(int data) {
			this.size++;

		}
		public int get(int index) {
			return 0;
		}
		
		public void print() {
			Node temp = this.front;
			for(int i = 0; i < this.size; i++) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}

	public class Node {
			int data;
			Node prev;
			Node next;
			
			public Node(int data, Node prev, Node next) {
				this.data = data;
				this.prev = null;
				this.next = null;
			}
		}
	}