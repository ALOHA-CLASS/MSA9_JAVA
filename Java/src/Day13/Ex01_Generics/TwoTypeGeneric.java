package Day13.Ex01_Generics;

// 제네릭 기법으로 타입 매개변수 2개 지정
class KeyValue <K, V> {
	
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}

public class TwoTypeGeneric {

	public static void main(String[] args) {
		// 제네릭으로 객체 생성
		// 클래스타입<타입1, 타입2> 객체명 = new 클래스<타입1, 타입2>();
		// - 객체 생성하는 클래스명 뒤의 타입은 생략가능
		// - new 클래스<>();
		// KeyValue<String, Integer> kv = new KeyValue<String, Integer>();
		KeyValue<String, Integer> kv = new KeyValue<String, Integer>();
		kv.setKey("Java");
		kv.setValue(100);
		
		KeyValue<Integer, String> kv2 = new KeyValue(); // 우변의 <> 타입지정은 생략가능
		kv2.setKey(100);
		kv2.setValue("Java");
		
		System.out.println("kv - key : " + kv.getKey());
		System.out.println("kv - value : " + kv.getValue());
		
		System.out.println("kv2 - key : " + kv2.getKey());
		System.out.println("kv2 - value : " + kv2.getValue());
		
		// K 타입은 지정하고, V 타입은 지정하지 않으려면?
		// Void : 해당 타입에는 변수를 사용하지 않도록 지정
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("키 만");
		String key3 = kv3.getKey();
		System.out.println("key3 : " + key3);
	}
}
