package q01_basic.question05;

public class MemberManager {

	private MemberManager() {

	}

	public static void showAllMembers(AbstMember[] abstMember) {

		for (AbstMember m : abstMember) {

			m.showMember();
		}

	}

}
