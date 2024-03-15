package Com.Szy.Base;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println('a'-'A');
		capitalizeTitle("capiTalIze tHe titLe");
	}
	public static String capitalizeTitle(String title) {
		StringBuilder sb = new StringBuilder();
		String[] str = title.split(" ");
		for(String s:str) {
			if(s.length()<3) {
				for(int i=0;i<s.length();i++) {
					char c = s.charAt(i);
					if('A'<=c&&c<='Z')
						sb.append((char)(c+32));
					else
						sb.append(c);
				}
			}else {
				for(int i=0;i<s.length();i++) {
					char c = s.charAt(i);
					if(i==0&&'a'<=c&&c<='z') {
						sb.append((char)(c-32));
					}else if(i!=0&&'A'<=c&&c<='Z') {
						sb.append((char)(c+32));
					}else {
						sb.append(c);
					}
//					System.out.println(sb.toString());
				}
			}
			sb.append(" ");
		}
		sb.deleteCharAt(title.length());
//		System.out.println(sb.toString());
		return sb.toString();
    }
}
