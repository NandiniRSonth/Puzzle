//patient queuing system
//stores name of patient when he/she enters
//determines which patient has to go next when one patient comes out of doctor's cabin
import java.io.*;
import java.util.*;
public class Demo{
    public static void main(String[] args){
	Queue<String> q=new LinkedList<>();
	Scanner sc=new Scanner(System.in);
        while(true){
	System.out.println("enter choice:1.enter details 2.retrieve details 3.exit");
        int c=sc.nextInt();
		if(c==1){
		System.out.println("enter the name of patient:");
		String s=sc.next();
		q.add(s);
		}
		if(c==2){
		String p=q.remove();
		System.out.println("turn of patient "+p+" has come");
		}
		if(c==3){
		System.exit(0);
		}
	   }
       }
}
		