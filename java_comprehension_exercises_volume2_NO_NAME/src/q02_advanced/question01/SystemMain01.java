package q02_advanced.question01;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");
		//TODO ここから実装する
		Member member1 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);

		member1.showMember();
	}
}
