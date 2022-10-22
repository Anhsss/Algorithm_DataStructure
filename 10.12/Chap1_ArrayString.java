package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.Collections;
import java.util.HashSet;

public class Chap1_ArrayString {
    public static String[] removeElement1(String[] arr, String item) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.remove(item);
        return list.toArray(String[]::new);
    }
	public static void main(String[] args) {
		
		String[] arr1 ={"서울","북경","상해"};        
        String[] arr2 ={"서울","북경","상해", "로마"};     
        System.out.println("Result is "+ Arrays.compare(arr1,arr2));
        
//		String a = "hello", b = "good";
//		String temp;
//		temp = a;
//		a = b;
//		b= temp;
//		System.out.println(a);
//		System.out.println(b);
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");


		list.add("런던");
		list.add("로마");
		list.add("방콕");
		list.add("북경");
		list.add("도쿄");
		list.add("서울");

		list.add(1, "LA");
		
		//sort - 오름차순으로 정렬, 내림차순으로 정렬, 중복 제거하는 코딩
		System.out.println("collection.sort()::");
//	    Collections.sort(list);
	    for ( String city: list)
	    	System.out.println(city);
	    
	    String cities[] = new String[0];
	    //배열 -> 정렬
	    cities = list.toArray(cities);
	    System.out.println("배열->정렬::");
	    for ( int i = 0; i < cities.length; i++) {
	    	System.out.println(cities[i]);
	    }
	    
	    System.out.println("정렬후::");
	    for ( String city: cities)
	    	System.out.println(city);
	    //중복제거
	    System.out.println("중복제거::");
//	    int m = 0, n = 1;
//
//	    ArrayList<String> lst = new ArrayList<String>(Arrays.asList(cities));
//	    for ( String city: lst)
//	    	System.out.println(city);
	    // 배열을 TreeSet으로 변환 (중복 제거/자동 정렬)
	    TreeSet<String> TreeSet = new TreeSet<>(Arrays.asList(cities));
	    String remove[] = TreeSet.toArray(new String[0]);
	    System.out.println(Arrays.toString(remove));
	    
	    //정렬 -> 배열
	    List strList = new ArrayList(Arrays.asList(cities));
	    Collections.reverse(strList);
	    
	    System.out.println("정렬->배열::");
	    String[] sortedStrs = (String[]) strList.toArray(new String[strList.size()]);
		
	    for (String city : sortedStrs) {
	    	System.out.println(city);
	    }   
	    //compare
	    System.out.println("Result is "+ Arrays.equals(cities,cities));
	}
}