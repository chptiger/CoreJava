package Concept;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

// https://www.ibm.com/developerworks/cn/java/j-lo-enum/ 
// http://www.cnblogs.com/frankliiu-java/archive/2010/12/07/1898721.html
//enum  implements Comparable and Serializable  interface
//һ����ֱ�ӵ��洦�������� switch ���ʹ�÷�Χ
/*
1. enum ���Ͳ�֧�� public �� protected ���η��Ĺ��췽������˹��캯��һ��Ҫ�� private �� friendly �ġ�Ҳ����Ϊ��ˣ�����ö�ٶ������޷��ڳ�����ͨ��ֱ�ӵ����乹�췽������ʼ���ġ�
2. ���� enum ����ʱ������Ǽ����ͣ���ô���һ��ö��ֵ���ø��κ�һ�����ţ�������ж��Ʒ�������ô���һ��ö��ֵ��������Ҫ�÷ֺ�';'�����������ö��Ż�ո�
3. ���� enum ���͵�ֵʵ������ͨ�������ڹ������������ʾ�ģ������� cluster �����£�ÿ����������ṹ���һ��ͬ���ö�ٶ���
��������Ƚϲ���ʱ�����Ҫע�⣬���ֱ��ͨ��ʹ�õȺ� ( �� == �� ) ����������Щ����һ����ö��ֵһ������ȣ���Ϊ�ⲻ��ͬһ������ʵ����



EnumSet �� EnumMap
*/
public class enum_called {

	public static void main(String[] args) {
		// EnumSet
		for (color c : EnumSet.range(color.RED, color.GREEN)) {
			System.out.println(c);
		}
		// EnumSet
		EnumSet<color> subset = EnumSet.of(color.RED, color.GREEN);
		for (color c : subset) {
			System.out.println(c);
		}

		// EnumMap

		// ����һ�� EnumMap ����ӳ�������������ö�����ͣ�ֵ����ɫö������
		Map<weekDayEnum, color> schema = new EnumMap<weekDayEnum, color>(weekDayEnum.class);

		// ��һ�ܵ�ÿһ����ʺ��ĳһ��ɫ��ӳ������
		for (int i = 0; i < weekDayEnum.values().length; i++) {
			schema.put(weekDayEnum.values()[i], color.values()[i]);
		}

		System.out.println("What is the lucky color today?");
		System.out.println("It's " + schema.get(weekDayEnum.Sat));
	}

	public enum color {
		RED, BLUE, BLACK, YELLOW, GREEN, PURPPLE, WHITE
	}

	public enum weekDayEnum {
		Mon(1), Tue(2), Wed(3), Thr(4), Fri(4), Sat(6), Sun(7);

		private int index;

		weekDayEnum(int index) {
			this.index = index;
		}

		public int getIndex() {
			return index;
		}
	}
}
