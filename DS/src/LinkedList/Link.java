package LinkedList;



public class Link {

	String bookName;
	
		int millionSold;
		 Link next;
		
public Link(String bookName,int millionSold) {
	// TODO Auto-generated constructor stub
	
	this.bookName=bookName;
	this.millionSold = millionSold;
}


public void display()
{
	System.out.println(bookName+ " : "+ millionSold + ",000,000");
}

public String toString()
{
	return bookName;
}

public static void main(String[] args) {
	LinkedList theLinkList = new LinkedList();
	theLinkList.insertLink(" A tale of 1 cities", 100);
	theLinkList.insertLink(" A tale of 2 cities", 200);
	theLinkList.insertLink(" A tale of 3 cities", 300);
	theLinkList.insertLink(" A tale of 4 cities", 400);
	
	theLinkList.display();
	
	theLinkList.removeFirst();
	theLinkList.display();
	System.out.println(theLinkList.find("A tale of 2 cities").bookName+"was found");

	theLinkList.removeLink("A tale of 2 cities");
	theLinkList.display();
	
}

		
	}

class LinkedList
{
	public Link firstLink;
	
	public LinkedList() {
		firstLink=null;
		
		
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty()
	{
		return(firstLink==null);
	}
	
	public void insertLink(String bookName , int millionSold)
	{
		Link newLink = new Link(bookName,millionSold);
		newLink.next=firstLink;
		firstLink=newLink;
		
	}
	
	public Link removeFirst()
	{
		Link linkRefrence = firstLink;
		
		if(!isEmpty())
		{
			firstLink = firstLink.next;
		}
		else
		{
			System.out.println("Empty linkedList");
		}
		
		return linkRefrence;
	}
	
	public void display()
	{
		Link theLink = firstLink;
		while(theLink!=null)
		{
			theLink.display();
			System.out.println("next Link : "+ theLink.next);
			theLink=theLink.next;
			System.out.println();
		}
	}
	
	public Link find(String bookName)
	{
		Link theLink = firstLink;
	 	if(!isEmpty())
		{
			while(theLink.bookName != bookName)
			{
				if(theLink.next==null)
				{
					return null;
				}
				else
				{
					theLink=theLink.next;
				}
			}
		}
	 	
	 	else
	 	{
	 		System.out.println("Empty LinkedList");
		}
	 	return theLink;
	}
	
	
	public Link removeLink(String bookName)
	{
		Link currentLink = firstLink;
		Link previousLink = firstLink;
		
		while(currentLink.bookName!=bookName)
		{
			if(currentLink.next==null)
			{
				return null;
			}
			else
			{
				previousLink=currentLink;
				currentLink = currentLink.next;
			}
		}
		if(currentLink==firstLink)
		{
			firstLink=firstLink.next;
		}
		else
		{
			previousLink.next=currentLink.next;
		}
		return currentLink;
	}
}