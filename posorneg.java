import java.lang.*;
import java.io.*;
import java.util.*;
public Static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n<=1 && n>=100000)
{
System.out.println("positive");
}
else if(n<0)
{
System.out.println("negative");
}
else
{
System.out.println("zero");
}
}
