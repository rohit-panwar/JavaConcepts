package collectionFramework;

import java.util.EnumSet;

public class Set_enum {

	enum lang{
		JAVA, CSHARP, PHP, RUBY, PYTHON
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-------Set using all enum -------");
		EnumSet<lang> lang1=EnumSet.allOf(lang.class);
		System.out.println(lang1);
		
		System.out.println("-------Set using empty enum -------");
		EnumSet<lang> lang2=EnumSet.noneOf(lang.class);
		System.out.println(lang2);
		
		System.out.println("-------Set using range of enum -------");
		EnumSet<lang> lang3=EnumSet.range(lang.JAVA, lang.PHP);
		System.out.println(lang3);
		
		System.out.println("-------Set using only one enum -------");
		EnumSet<lang> lang4=EnumSet.of(lang.PHP);
		System.out.println(lang4);
		
		System.out.println("-------Set using multiple enum -------");
		EnumSet<lang> lang5=EnumSet.of(lang.PHP, lang.RUBY);
		System.out.println(lang5);
	}

}
