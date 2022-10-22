package Algorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;

public class Chap1_merge_assignment {
	public static void main(String[] args) {
		
				//컬렉션 생성
				ArrayList<String> list1 = new ArrayList<String>();
				list1.add("서울");
				list1.add("북경");
				list1.add("상해");
				list1.add("서울");
				list1.add("도쿄");
				list1.add("뉴욕");
				//컬렉션 생성
				ArrayList<String> list2 = new ArrayList<String>();
				list2.add("런던");
				list2.add("로마");
				list2.add("방콕");
				list2.add("북경");
				list2.add("도쿄");
				list2.add("서울");
				list2.add(1, "LA");
				
				System.out.println("merge 중복 제거::");
				List<String> mergeList = new ArrayList<>(list1);
				mergeList.removeAll(list2);
				mergeList.addAll(list2);
				 for ( String city: mergeList)
				    	System.out.print(city+ " ");
				 		System.out.println("\n");
				
				System.out.println("collection.sort()::");
			    Collections.sort(list1);
			    for (String s : list1) {
			    	System.out.printf("%s \n",s);
			    }
			    
			    System.out.println("list1::");
			    for ( String city: list1)
			    	System.out.print(city+ " ");
			    System.out.println();
			    System.out.println("list2::");
			    Collections.sort(list2);
			    for ( String city: list2)
			    	System.out.print(city+ " ");
			    
				ArrayList<String> list3 = new ArrayList<String>();
				// iterator 획득
				Iterator<String> iter1 = list1.iterator();
				
				while(iter1.hasNext()) {
					String obj = (String)iter1.next();
					list3.add(obj);
				}
				
				Iterator<String> iter2 = list2.iterator();
				
				while(iter2.hasNext()) {
					String obj = (String)iter2.next();
					list3.add(obj);
				}
				
				Collections.sort(list3);
				System.out.println();
			    System.out.println("merge:: ");
			    // for-each문 사용
			    for ( String city: list3)
			    	System.out.print(city+ " ");
			    
			}	
}