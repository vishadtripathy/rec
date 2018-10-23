class Link
{
	int data;
	Link next;
	Link previous;
	Link(int d)
	{
		data=d;
	}
	void DisplayLink()
	{
		System.out.println(data+" ");
	}
	class DoubleLinkedList
	{
		Link first;
		Link last;
		DoubleLinkedList()
		{
			first=null;
			last=null;
		}
		void insert(int dd)
		{
			Link newLink=new Link(dd);
			if(isEmpty())
			{
				last=newLink;
				else
				{
				first.previous=newLink;
				newLink.next=first;
				}
				first=newLink;

			}

			void insert(int dd)
			{
				Link newLink=new Link(dd);
				if(isEmpty())
				first=newLink;
				else
				{
					last.next=newLink;
					newLink.previous=last;
				}
				last=newLink;
			}
			Link deleteFirst()
			{
				Link temp=first;
				if(first.next==null)
				last=null;
				else
				first.next.previous=null;
		        	first=first.next;
				return temp;
			}
			Link deletelast()
			{
				Link temp=last;
				if(first.next==null)
					first=null;
				else

				last.previous.next=null;
				last=last.previous;
				return temp;
			}
			boolean insertAfter(int key,int dd)
			{
				link current=first;
				while(current.data!=key)
				{
					current=current.next;
					if (current==null)
					return false;
				}
				Link newLink=new Link(dd);
				if(cuurent==last)
				{
					newLink.next=null;
					last=newLink;
				}
				else
				{
					newLink.next=current.next;
					current.next.previous=newlink;
				}
				newlink.previous=current;
				current.next=newLink;
				return true;
			}
			link deletekey(int key)
			{
				Link current=first;
				while(current.data!=key)
				{
					current=current.next;
					if(current==null)
						return null;
					if(current==first)
					{
						first=current.next;
						
					)




				
























