package com.tariq.dsnal;

import java.util.Arrays;

public class DynamicArray {
	private int capacity;
	public int length;
	private Object[] data;

	public DynamicArray() {
		this.capacity = 1;
		this.length = 0;
		this.data = new Object[1];
	}

	public Object get(int index) {
		return data[index];
	}

	public void push(Object item) {
		if(capacity == length) {
			data = Arrays.copyOf(data, capacity*2);
			capacity *=2;
		}
		data[length] = item;
		length++;
	}

	public Object pop() {
		Object item = data[length-1];
		data[length-1] = null;
		length--;
		return item;
	}

	public Object delete(int index) {
		Object item = data[index];
		shiftItems(index);
		return item;
	}
	
	public void shiftItems(int index) {
		for(int i = index; i<length-1; i++) {
			data[i] = data[i+1];
		}
		data[length-1] = null;
		length--;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray array = new DynamicArray();
		array.push("Hello");
		array.push("World");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array.get(i));
			
			System.out.println(array.pop());
			System.out.println(array.pop());
			
			System.out.println(array.length);
		}
	}

}
