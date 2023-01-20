import java.util.Scanner;
class Array
{
public static void main(String[] args)
{
int a[][] = new int[2][5];
Scanner Scan = new Scanner(System.in);

for(int i =0;i<=a.length-1;i++)
{
for(int j =0;j<=a[i].length-1;j++)
{
System.out.println("Enter the ages of class "+i+"Student"+j);
a[i][j]= Scan.nextInt();
}
}

System.out.println("The ages are");
for(int i =0;i<=a.length-1;i++)
{
for(int j =0;j<=a[i].length-1;j++)
{
System.out.println(a[i][j]);
}
}
}
}


