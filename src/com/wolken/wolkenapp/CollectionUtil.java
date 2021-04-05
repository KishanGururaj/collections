package com.wolken.wolkenapp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.wolken.wolkenapp.DTO.BooksDTO;

public class CollectionUtil {
	public static void main(String[] args) {
		
		List<Object> collection=new LinkedList<Object>();
		collection.add(new BooksDTO("sajdh","dhsd ",8,7685));
		collection.add(new BooksDTO("jsg","asmd ",1,7655));
		System.out.println(collection.size());
		
		for (Object object :collection) {
			System.out.println(object);
		}
		Iterator<Object> itr=collection.iterator();
		while(itr.hasNext()) {
			Object obj=itr.next();
			System.out.println(obj);
		}
	}

}
