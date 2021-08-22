/**
 * 메서드의 리턴타입이 인터페이스인 예제. (인터페이스를 이용한 다형성)
 * @author user EunSu Seo
 * last modified 2021-08-22
 */
interface Parseable {
	// 구문 분석 작업을 실시한다.
	public abstract void parse(String fileName);	// 추상 메서드.
}

class ParserManager {
	// 리턴 타입이 Parseable 인터페이스이다!
	public static Parseable getParser(String type) {
		if (type.equals("XML"))
			return new XMLParser();
		else {
			Parseable p = new HTMLParser();
			return p;
			// return new HTMLParser();
		}
	}
}

// XMLParser 클래스는 Parseable 인터페이스에 정의되어 있는 추상 메서드를 구현해야 한다.
class XMLParser implements Parseable {
	public void parse(String fileName) {
		/* 구문 분석작업을 수행하는 코드를 적는다. */
		System.out.println(fileName + " - XML parsing completed.");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName) {
		/* 구문 분석작업을 수행하는 코드를 적는다. */
		System.out.println(fileName + " - HTML parsing completed.");
	}
}

public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");	// 반환타입이 Parseable.
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
