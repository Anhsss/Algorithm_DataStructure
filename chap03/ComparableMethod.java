package Algorithm.java.chap03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Fruit implements Comparable<Fruit> {
	private String name;
	private int price;

	public Fruit(String st, int p) {
		this.name = st;
		this.price = p;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return "[" + name + "," + price + "]";
	}
	@Override
	public int compareTo(Fruit F) {
//		if (this.price < F.price)
//			return -1;
//		else if (this.price > F.price)
//			return 1;
//		else if (this.name.compareTo(F.name) < 0)
//			return -1;
//		else
//			return 1;
		//두 값의 차를 반환
		return this.price - F.price;
	}
}

public class ComparableMethod {
	public static void main(String[] args) {
		System.out.println("======스트링::");
		String[] s = { "참외", "수박", "복숭아", "포도", "감" };
	//	Arrays.sort(s);
//		Arrays.sort(s, Comparator.reverseOrder());
//
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				//첫번째 파라미터가 앞에 있으면 오름차순
				return o1.compareTo(o2); // 내림차순으로 정렬
			}
		});

//	Collections.sort(Arrays.asList(s));//s[]의 주소를 lst에서 사용하므로 변경됨
		for (String city : s)
			System.out.print(" " + city);
		System.out.println();
		List<String> lst = Arrays.asList(s);
		for (String city : lst)
			System.out.print(" " + city);

//	s = Arrays.stream(s).sorted().toArray(String[]::new);	
//	s = Arrays.stream(s).sorted(Collections.reverseOrder()).toArray(String[]::new);
		System.out.println();
		System.out.println("======객체::");
		Fruit[] arr = { 
				new Fruit("사과", 200),
				new Fruit("키위", 500),
				new Fruit("오렌지", 200),
				new Fruit("바나나", 50),
				new Fruit("수박", 880),
				new Fruit("체리", 10),
				new Fruit("망고", 550) 
		};
//    Arrays.sort(arr);
//    arr[0].compareTo(arr[1])

		Arrays.sort(arr, new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
				return o1.compareTo(o2); // 내림차순, 오름차순 정렬
			}
		});

		for (Fruit fx : arr)
			System.out.print(" " + fx);
		System.out.println();
		System.out.println("=====람다식::");
		
		//함수형 인터페이스 호환
		//내림, 오름차순 정의함수
		Arrays.sort(arr, (a, b) -> b.getPrice() - a.getPrice()); // Fruit에 compareTo()가 있어도 람다식 우선 적용

		for (Fruit fx : arr)
			System.out.print(" " + fx);

		ArrayList<Fruit> lst1 = new ArrayList<Fruit>(Arrays.asList(arr));
		ArrayList<Fruit> lst2 = new ArrayList<Fruit>();
		lst2.add(new Fruit("복숭아", 200));
		lst2.add(new Fruit("포도", 300));
		lst2.add(new Fruit("참외", 100));
		lst2.add(new Fruit("딸기", 50));
		lst2.add(new Fruit("블루베리", 500));
		lst2.add(new Fruit("구지뽕", 300));
		System.out.println();
		System.out.println("새로운 리스트2::");
		for (Fruit city : lst2)
			System.out.print(" " + city);
//    Arrays.sort(lst2);
		Collections.sort(lst2);
		System.out.println();
		System.out.println("새로운 리스트2::");
		for (Fruit city : lst2)
			System.out.print(" " + city);

		ArrayList<Fruit> lst3 = new ArrayList<Fruit>();

		Iterator<Fruit> iter1 = lst1.iterator();
		Iterator<Fruit> iter2 = lst2.iterator();

		System.out.println();
		System.out.println("merge:: ");
		for (Fruit city : lst3)
			System.out.print(city + " ");
		Fruit newFruit = new Fruit("참외", 100);
		// binary search
		Comparator<Fruit> cc = new Comparator<Fruit>() {
			public int compare(Fruit u1, Fruit u2) {
				if(u1.getPrice() > u2.getPrice()) {
					return 1;
				}
				else return -1;

			}
		};

		System.out.println();
		int result = Collections.binarySearch(lst3, newFruit, cc);
		System.out.println("조회결과 exist  " + result);

	}
}
