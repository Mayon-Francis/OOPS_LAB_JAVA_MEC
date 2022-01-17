import java.util.Scanner;
import java.io.IOException;

class node{

    int data; // to store data item

    node next = null;  // pointer to next node

    node prev = null;  // pointer to previous node

}

class DLinkedList{

   node head = null; // to store head of doubly linked list
	
	private node createNode( int value )
	{
		node myNode = new node();
		myNode.data = value;
		myNode.next = null;
		myNode.prev = null;
		return myNode;
	}

	void insertEnd(int value)
	{
		node newNode = createNode(value);

		if(head == null)
		{
			head = newNode;
		}
		else
		{
			// Temporary iterator
			node itr = head;
			while(itr.next != null)
			{
				itr = itr.next;
			}
			itr.next = newNode;
			newNode.prev = itr;
		}
	}
	
	void display()
	{
		node itr = head;
		if( head == null)
			System.out.println("Doubly Linked List Empty.");
		else
		{
			System.out.print("Head->");
			while(itr != null)
			{
				System.out.print(itr.data + " ");
				itr = itr.next;
			}
			System.out.println("");
		}
	}
	
	void delete(int value)
	{
		node itr = head;
		if( head == null)
			System.out.println("Doubly Linked List Empty.");
		else
		{
			while(itr != null && itr.data != value )
			{
				itr = itr.next;
			}

			// Not found
			if (itr == null)
			{
				System.out.println("Element not found");
				return;
			}
			
			// element is single entry
			else if( itr.prev == null && itr.next == null)
			{
				head = null;
			}
			// element is at head
			else if(itr == head)
			{
				head.next.prev = null;
				head = head.next;
			}
			// element is at end
			else if(itr.next == null)
			{
				itr.prev.next = null;
			}
			else 
			{
				itr.next.prev = itr.prev;
				itr.prev.next = itr.next;
			}
			
			System.out.println("Element Deleted");

		}
	}

}

public class DoublyMain
{
	public static void clearConsole() {
   	try 
		{
			if (System.getProperty("os.name").contains("Windows")) 
			{
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}
			else 
			{
				System.out.print("\033\143");
			}
		} 
		catch(IOException | InterruptedException ex) {}
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DLinkedList dlist = new DLinkedList(); // create doubly linked list object
		int choice, input;

		do{
			System.out.println("\nDoubly Linked List.");
			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Delete");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();


			
			switch(choice)
			{
				case 1:
					System.out.println("Enter number to be inserted: ");
					input = sc.nextInt();
					dlist.insertEnd(input);
					clearConsole();
					break;
				case 2:
					clearConsole();
					dlist.display();
					break;
				case 3:
					System.out.println("Enter number to be deleted: ");
					input = sc.nextInt();
					clearConsole();
					dlist.delete(input);
					break;
				case 4:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid Choice");
			}

		}while(choice < 4);
		sc.close();
	}

}












