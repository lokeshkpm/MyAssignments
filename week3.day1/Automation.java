package assignments.week3.day1;

public class Automation extends MultipleLangauge implements Language, TestTool{

	public static void main(String[] args) {
		Automation a = new Automation();
		a.python();
		a.ruby();
		a.Selenium();
		a.Java();
	}

	@Override
	public void Selenium() {
		System.out.println("Selenium");
		
	}

	@Override
	public void Java() {
		System.out.println("Java");
		
	}

}
