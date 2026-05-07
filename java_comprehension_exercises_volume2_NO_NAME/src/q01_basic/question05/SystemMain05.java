package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];

		NonMember nonmember1 = new NonMember("Sato Kensuke");
		Member member1 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);

		members[0] = nonmember1;
		members[1] = member1;

		System.out.println("---SHOW MEMBERS--- ");

		MemberManager.showAllMembers(members);

		System.out.println("---BUY ITEM---");

		nonmember1.buyItem();
		member1.buyItem();

	}

}
