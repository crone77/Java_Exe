
public class Oct_20 {
	public static void main(String[] args) {
		String str="C:\\a\\b\\c";
		while(true){
			System.out.println(str);
			int index=str.lastIndexOf("\\");
			str=str.substring(0,index);
			if(str.indexOf("\\")==-1){
				System.out.println(str);
				return;
			}
		}
		
	}
}
