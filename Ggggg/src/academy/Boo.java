package academy;

public class Boo {
	public static void main(String[] args) {
		String str = "";
		for (int i = 0; i < 100; i++) {
			str += i;
		}
		System.out.println(str);
		StringBuilder sb = new StringBuilder();

		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("12345678912345678");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("1234567891234567825");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		StringBuilder sb1 = new StringBuilder();
		int counter = sb1.capacity();
		int temp = 1;
		for (int i = 0; i < 100; i++) {
			if (counter != sb1.capacity()) {
				temp++;
				temp = sb1.capacity();

			}
			sb1.append(i);

		}
		System.out.println(sb.length());
		System.out.println(temp);
		System.out.println(sb1.toString().substring(0).replaceAll(regex, replacement));
	}
}