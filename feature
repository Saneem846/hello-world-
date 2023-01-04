import java.util.*;
class Chcount{
public static void main(String args[]){
int i,j,x,n,sum=0;
int a[]=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("enter the no.of number");
n=s.nextInt();
System.out.println("enter the number:");
for(i=0;i<n;i++){
a[i]=s.nextInt();
}
int k=0,p=1;
for(i=0;i<n;i++){
k=a[i];
i=i+k-1;
sum=sum+k;
}
for(i=0;i<n;i++){
k=a[i];
System.out.println("frame:"+p);
  for(j=0;j<k+i;j++){
    System.out.println(a[j]);
}
    i=i+k-1;
p++;
}
}
}



