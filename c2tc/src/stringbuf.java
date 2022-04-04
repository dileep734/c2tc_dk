package stringbuf

public class stringbuf {

	 static void togglechars(char str[]) {
		for(int i=0;i<str.length;i++)
		{
			if(str[i]>='A' && str[i]<='Z')
				str[i]=(char)(str[i] + 'a' -'A');
			else if(str[i]>='a' && str[i]<='z')
				str[i]=(char)(str[i] +'A' - 'a');
		}

	}
	 public static void main(string[] args)
	 {
		char str[]="I am Samplle".toCharArray();
		toggleChars(str);
		System.out.println("string after toggle");
		sytem.out.println(string.valueOf(str));
	 }

}
