package a11_상속;

public class TsetMain {

	public static void main(String[] args) {
		Test test = new Test();
		Tset1 test1 = new Tset1();
		Tset2 test2 = new Tset2();
		
		Tset1[] t1Array = new Tset1[10];
		t1Array[0] = test1;
		//t1Array[1] = test2;
		
		// 자식 -> 부모 : 업캐스팅
		Test t1 = test1;
		Test t2 = test2;
		
		Test[] tArray = new Test[2];
		tArray[0] = test1;
		tArray[1] = test2;
		
		// 부모 -> 자식 : 다운캐스팅
		Test tt1 = (Tset1)t1;
		Test tt2 = (Tset2)t2;
		
	}

}
