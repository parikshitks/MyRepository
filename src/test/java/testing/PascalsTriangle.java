package testing;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PascalsTriangle {

	public static void main(String[] args) {
		int n = 5;

		printPascal(n);

	}

public void test() {
	SearchContext driver = new ChromeDriver();
	driver.findElement(By.id("")).click();
			
}
	public static ArrayList<ArrayList<Long>> printPascal(int n) {

		ArrayList<ArrayList<Long>> finalArr = new ArrayList<>();

		ArrayList<Long> val = new ArrayList<>();
		val.add((long) 1);
		System.out.println(val);
		finalArr.add(new ArrayList(val));

		if(n>1)
		{
			val.clear();
			val.add((long) 1);
			val.add((long) 1);
			finalArr.add(new ArrayList(val));
			System.out.println(val);

			for(int i=1;i<n-1;i++) {
				ArrayList<Long> tmp = new ArrayList<>();
				for(i=0;i<val.size()-1;i++) {
					Long f = val.get(i);
					Long s = val.get(i+1);
					tmp.add(f+s);
				}
				val.clear();
				val.add((long) 1);
				val.addAll(tmp);
				val.add((long) 1);
				finalArr.add(new ArrayList(val));
				System.out.println(val);
			}
		}

		return finalArr;

	}

}
