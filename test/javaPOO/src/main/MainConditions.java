package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainConditions {

	public static void main(String[] args) {
		System.out.println(compareNumbers(1,3,5));
		System.out.println(compareNumbers(3,9,0));
		System.out.println(compareNumbers(5,12,1));
		System.out.println(compareNumbers(30,20,1));
		System.out.println(equalNumbers(4, 5, 4));
		System.out.println(equalNumbers(4, 4, 3));
		System.out.println(equalNumbers(1, 3, 3));
		System.out.println(equalNumbers(1, 2, 3));
		System.out.println(arrayCompare(new int[]{4,11,20},true));
		System.out.println(arrayCompare(new int[]{40,11,20},true));
		System.out.println(arrayCompare(new int[]{40,11,60},true));
		System.out.println(arrayCompare(new int[]{4,14,20},false));
		System.out.println(arrayCompare(new int[]{4,11,20},false));
		System.out.println(arrayCompare(new int[]{40,11,8},false));
		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(10);
		list.add(60);
		list.add(2);
		System.out.println(compareGreaterList(list));
		Collections.sort(list);
		System.out.println(list.get(0));
		Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				return Integer.compare(arg1, arg0);
			}
		});
		System.out.println(list.get(0));

	}
	
	public static int compareNumbers(int num1, int num2, int num3){
		int mayor=0;
		if (num1>num2 && num1>num3){
			mayor=num1;
		}
		else if (num2>num1 && num2>num3){
			mayor=num2;
		}
		else{
			mayor=num3;
		}
		return mayor;
	}
	
	public static boolean equalNumbers(int num1,int num2, int num3){
		if (num1==num2 || num1==num3 || num2==num3){
			return true;
		}
		return false;
	}
	
	public static int arrayCompare(int numbers[],boolean cond){
		int numb=0;
		if (cond){
			numb=Integer.MIN_VALUE;
		}
		else{
			numb=Integer.MAX_VALUE;
		}
		for (int i=0;i<numbers.length;i++){
			if (cond){
				if (numbers[i]>numb){
					numb=numbers[i];
				}
			}
			else{
				if (numbers[i]<numb){
					numb=numbers[i];
				}
			}
		}
		return numb;
	}
	
	public static int compareGreaterList(List<Integer> list){
		int numb=Integer.MIN_VALUE;
		for (Integer number: list){
			if (number>numb){
				numb=number;
			}
		}
		
		return numb;
	}

}
