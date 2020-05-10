import java.util.ArrayList;
import java.util.List;

// Template code of "PA1.java"
// Do not change the format of the class and method in "PA1.java"
// Do not use java.util.LinkedList package

class Node<T> {
	T value = null;
	
	Node<T> prev = null;
	Node<T> next = null;
	
	Node (T val) {
		this.value = val;
	}
}

class Linkedlist<T> {
	Node<T> head = null;
	Node<T> tail = null;
	
	void addList(Linkedlist<T> list) {
		tail.next=list.head;
		list.head.prev=tail;
		tail=list.tail;
	}
	
	boolean equals(Linkedlist<T> list) {
		boolean result = true;
		Node<T> a=head;
		Node<T> b=list.head;
		while(true) {
			if(a == null && b == null) {
				break;
			}
			if(a == null || b == null) {
				result = false;
				break;
			}
			if(a.value != b.value) {
				result=false;
			}
			a=a.next;
			b=b.next;
		}
		return result;
	}
	int size() {
		int len = 0;
		Node<T> a = head;
		while(a != null){
			a=a.next;
			len++;
		};
		return len;
	}
	void push_back(T val) {
		Node<T> node = new Node<T>(val);
		if(head == null) {
			head=node;
			tail=node;
			return;
		}
		tail.next=node;
		node.prev=tail;
		tail=node;
	}
	void push_front(T val) {
		Node<T> node = new Node<T>(val);
		if(head == null) {
			head=node;
			tail=node;
			return;
		}
		node.next=head;
		head.prev=node;
		head=node;
	}
	
	String print_list() {
		Node<T> tmp = this.head;
		String res = "";
		while(tmp != null) {
			System.out.print(tmp.value + " ");
			res = res + tmp.value.toString() + " ";
			tmp = tmp.next;
		}
		System.out.println();
		return res;
	}
	
	T get(int n) {
		T value = null;
		if(size() > n) {
			Node<T> node = head;
			int index=0;
			while(index<n) {
				node=node.next;
				index++;
			}
			value=node.value;
		}
		return value;
	}
	
	void set(int n, T val) {
		if(size() > n) {
			Node<T> node = head;
			int index=0;
			while(index<n) {
				node=node.next;
				index++;
			}
			node.value=val;
		}
	}
	void add(int n, T val) {
		if(size() > n) {
			Node<T> node = head;
			int index=0;
			while(index<n-1) {
				node=node.next;
				index++;
			}
			Node<T> nNode = new Node<T>(val);
			node.next.prev=nNode;
			nNode.next=node.next;
			node.next=nNode;
			nNode.prev=node;
		}
	}
	void erase (int n) {
		if(size() > n) {
			Node<T> node = head;
			int index=0;
			while(index<n-1) {
				node=node.next;
				index++;
			}
			Node<T> nextNode = node.next.next;
			node.next=nextNode;
			nextNode.prev=node;
		}
	}
	
	void pop_back() {
		if(size()==0)	return;
		if(size()==1) {
			head=null;
			tail=null;
			return;
		}
		Node<T> newTail = tail.prev;
		newTail.next = null;
		tail=newTail;
	}
	void pop_front() {
		if(size()==0)	return;
		if(size()==1) {
			head=null;
			tail=null;
			return;
		}
		Node<T> newHead = head.next;
		newHead.prev=null;
		head = newHead;
	}
	List<Linkedlist<T>> split(T val) {
		List<Linkedlist<T>> arr = new ArrayList<Linkedlist<T>>();
		Node<T> node = head;
		Linkedlist<T> backup = new Linkedlist<T>();
		while(true) {
			if(node == null)	break;
			Linkedlist<T> temp = new Linkedlist<T>();
			temp.head=node;
			temp.head.prev=null;
			while(true) {
				if(node.next == null)		break;
				if(node.next.value == val)	break;
				backup.push_back(node.value);
				node=node.next;
			}
			temp.tail=node;
			backup.push_back(node.value);
			node = node.next;
			if(node != null) {
				backup.push_back(node.value);
				node = node.next;
			}
			temp.tail.next=null;
			arr.add(temp);
		}
		head=backup.head;
		tail=backup.tail;
		return arr;
	}
	Linkedlist() {}
	
	Linkedlist(T val) {
		head = new Node<T>(val);
		tail = head;
	}
}



public class PA1 {
	public static void main(String[] args) {
		// example of using Linkedlist with generic type
		
	}
}
