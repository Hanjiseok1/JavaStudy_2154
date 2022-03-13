package a09_클래스_정보은닉;

/*
 * Student 클래스 정의
 * 속성
 * schoolName
 * studentCode(학번) 20220000	int
 * studentYear					int
 * studentName
 * 
 * 생성자(기본, 전체)
 * getter, setter
 * 
 * 메서드 showStudentInfo
 * 학교명: 코리아아이티아카데미
 * 학번: 20220001
 * 학년: 1
 * 이름: 김준일
 * 
 *  메서드 showStudentInfo
 * 학교명: 코리아아이티아카데미
 * 학번: 20220002
 * 학년: 2
 * 이름: 김준이
 * 
 *  메서드 showStudentInfo
 * 학교명: 코리아아이티아카데미
 * 학번: 20220003
 * 학년: 3
 * 이름: 김준삼
 * 
 */

public class StudentTset {

	public static void main(String[] args) {
		Student student1 = new Student("코리아아이티아카데미" ,20220001 ,1 , "김준일");
		Student student2 = new Student("코리아아이티아카데미" ,20220002 ,3 , "김준이");
		
		student1.showStudentInfo();
		student2.showStudentInfo();
		
	}

}
