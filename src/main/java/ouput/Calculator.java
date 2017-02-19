package ouput;

public class Calculator {
	int num = 100;

	public void calc(int num) {
		this.num = num * 10;
	}

	public void printNum() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.calc(2);
		obj.printNum();
	}

	/*
	 * Options : A) 20 B) 100 C) 1000 D) 2 Answer : A) 20 Explanation : Here the
	 * class instance variable name(num) is same as calc() method local variable
	 * name(num). So for referencing class instance variable from calc() method,
	 * this keyword is used. So in statement this.num = num * 10, num represents
	 * local variable of the method whose value is 2 and this.num represents
	 * class instance variable whose initial value is 100. Now in printNum()
	 * method, as it has no local variable whose name is same as class instance
	 * variable, so we can directly use num to reference instance variable,
	 * although this.num can be used
	 */
}