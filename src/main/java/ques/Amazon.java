package ques;

public class Amazon {

	public static void main(String[] args) {

	}

	private void output() {
		/*
		 * // The given statements output will be "false" because in java +
		 * operator precedence is more than == operator. So the given expression
		 * will be evaluated to "s1 == s2 is:abc" == "abc" i.e false.
		 */String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);
	}

	private void output1() {
		// The given statements output will be "ourn". First character will be
		// automatically type caste to int. After that since in java first
		// character index is 0, so it will start from 'o' and print till 'n'.
		// Note that in String substring function it leaves the end index.
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));
	}

	private void output3() {
		// The size of the shortSet will be 100. Java Autoboxing feature has
		// been introduced in JDK 5, so while adding the short to HashSet<Short>
		// it will automatically convert it to Short object. Now "i-1" will be
		// converted to int while evaluation and after that it will autoboxed to
		// Integer object but there are no Integer object in the HashSet, so it
		// will not remove anything from the HashSet and finally its size will
		// be 100.
		HashSet shortSet = new HashSet();
		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			shortSet.remove(i - 1);
		}
		System.out.println(shortSet.size());
	}

	private void ouput4() {
		// TThe finally block will never be reached here. If flag will be TRUE,
		// it will go into an infinite loop and if its false its exiting the
		// JVM. So finally block will never be reached here.
		try {
			if (flag) {
				while (true) {
				}
			} else {
				System.exit(1);
			}
		} finally {
			System.out.println("In Finally");
		}
	}

	private void output5() {
		// The given print statement will throw java.lang.NullPointerException
		// because while evaluating the OR logical operator it will first
		// evaluate both the literals and since str is null, .equals() method
		// will throw exception. Its always advisable to use short circuit
		// logical operators i.e "||" and "&&" which evaluates the literals
		// values from left and since the first literal will return true, it
		// will skip the second literal evaluation.
		try {
			if (flag) {
				while (true) {
				}
			} else {
				System.exit(1);
			}
		} finally {
			System.out.println("In Finally");
		}
	}

	private void output6() {
		// TODO Auto-generated method stub

	}

}
