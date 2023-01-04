import java.util.Scanner;
public class QArray {
int SIZE = 5; 
int front, rear;
int items[] = new int[SIZE];
QArray() {
front = -1;
rear = -1;
}
boolean isFull() {
if (front == 0 && rear == SIZE - 1) {
return true;
}
if (front == rear + 1) {
return true;
}
return false;
}
boolean isEmpty() {
if (front == -1)
return true;
else
return false;
}
void enQueue(int element) {
if (isFull()) {
System.out.println("Queue is full");
} else {
if (front == -1)
front = 0;
rear = (rear + 1) % SIZE;
items[rear] = element;
System.out.println("Inserted " + element);
}
}
int deQueue() {
int element;
if (isEmpty()) {
System.out.println("Queue is empty");
return (-1);
} else {
element = items[front];
if (front == rear) {
front = -1;
rear = -1;
} 
else {
front = (front + 1) % SIZE;
}
return (element);
}
}
void display() {
int i;
if (isEmpty()) {
System.out.println("Empty Queue");
} else {
System.out.println("Front -> " + front);
System.out.println("Items -> ");
for (i = front; i != rear; i = (i + 1) % SIZE)
System.out.print(items[i] + " ");
System.out.println(items[i]);
System.out.println("Rear -> " + rear);
}
}
public static void main(String[] args) {
QArray q = new QArray();

Scanner sc=new Scanner(System.in);
System.out.println("1.Enqueue\t 2.Dequeue \t3.Display \t4.exit");
int ch;
do
{
System.out.println("enter your choice");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("enter data");
int data=sc.nextInt();
q.enQueue(data);
break;
case 2:
int elem = q.deQueue();
if (elem != -1) {
System.out.println("Deleted Element is " + elem);
}
break;
case 3:
q.display();
break;
}
}while(ch<=3);

}
}