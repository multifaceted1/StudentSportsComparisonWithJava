package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	String A = JOptionPane.showInputDialog("Enter all of the Sports that Student A plays.");
	String B = JOptionPane.showInputDialog("Enter the sports that Student B plays.");

	String arrA[] = A.split(" ");
	String arrB[] = B.split(" ");

	if (arrA.length > arrB.length)
	{
		System.out.println("Student A plays more types of sports than Student B. " + '\n' + "Student A plays: ");
		for(int i = 0; i < arrA.length; i++) {
			System.out.println(arrA[i]);}
	} else if (arrA.length == arrB.length) {
		System.out.println("The students play the same number of sports.");
	} else {
		System.out.println("Student B plays more types of sports than Student A plays." + '\n' + "Student B plays: ");
		for(int j = 0; j < arrB.length; j++){
			System.out.println(arrB[j]);}
	}

    }
}
