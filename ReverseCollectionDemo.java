package myprogrammes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("actual: "+list);
        Collections.reverse(list);
        System.out.println("reverse: "+list);
	}

}
