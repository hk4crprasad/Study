package com.piro;
import java.util.*;
class A {
	public static void main(String[] args) {
		System.out.println("     Program To Find Percent of student\n");
		System.out.println("     ENTER MARKS ONE BY ONE\n");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter name of student :- ");
		String Name = s.nextLine();
        System.out.print("JAVA (60) :- ");
        int a = s.nextInt();
        System.out.print("PYTHON(60) :- ");
        int b = s.nextInt();
        System.out.print("MATH (80) :- ");
        int c = s.nextInt();
        System.out.print("COMP. ORGANIZATION (80) :- ");
        int d = s.nextInt();
        System.out.print("ACCOUNTING (80) :- ");
        int e = s.nextInt();
        float full = (a+b+c+d+e)/360f;
        float per = full*100.0f;
        System.out.print("Percentage of Student "+Name+" is "+per+" %\n");
    }
}