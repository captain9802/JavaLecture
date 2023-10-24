package chap11_abstraction.academy;


// 추상 클래스 선언
public abstract class Academy {
	
	public int classCnt;
	public int StudentCnt;
	public int teacheCnt;
	public int subjectCnt;
	
	// 2. 추상 메소드 선언
	// 추상 클래스가 아니면 추상 메소드를 선언 할 순 없다.
	public abstract void teach();
	public abstract void solveHomework();
	public abstract void rest();
	public abstract void attend();

}
