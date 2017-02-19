package questions;

class One implements Runnable {
	public void run() {
		System.out.print(Thread.currentThread().getName());
	}
}

class Two implements Runnable {
	public void run() {
		new One().run();
		new Thread(new One(), "gfg2").run();
		new Thread(new One(), "gfg3").start();
	}
}

class Three {
	public static void main(String[] args) {
		new Thread(new Two(), "gfg1").start();
	}
	/*
	 * Output:
	 * 
	 * gfg1gfg1gfg3 Explanation : Initially new Thread is started with name gfg1
	 * then in class Two the first run method runs the thread with the name
	 * gfg1, then after that a new thread is created calling run method but
	 * since a new thread can be created by calling start method only so the
	 * previous thread does the action and again gfg1 is printed.Now a new
	 * thread is created by calling the start method so a new thread starts with
	 * gfg3 name and hence prints gfg3.
	 * 
	 * This article is contributed by Pratik Agarwal. If you like GeeksforGeeks
	 * and would like to contribute, you can also write an article using
	 * contribute.geeksforgeeks.org or mail your article to
	 * contribute@geeksforgeeks.org. See your article appearing on the
	 * GeeksforGeeks main page and help other Geeks.
	 * 
	 * Please write comments if you find anything incorrect, or you want to
	 * share more information about the topic discussed above.
	 */
}