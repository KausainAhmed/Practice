package practice.src.Task;

class StringOccurance {
	public static void main(String[] args) {
		int count = 0;
		String st = "i am an elephant";
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("Count of a " + count);
		
		}
	}
