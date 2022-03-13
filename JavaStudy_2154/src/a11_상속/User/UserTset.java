package a11_상속.User;

public class UserTset {

	public static void main(String[] args) {
		User user = new PersonalUser();
		user.setUsername("junil");
		user.setPassword("1234");
		System.out.println(user.login("junil", "1234"));
	}

}
