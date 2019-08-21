/**
 * Created by SWATHI on 8/18/2019.
 */
public class NumOfVowelConsonents {
    public static void main(String[] args) {
        String line="how are you";
        int vowels=0,consonants=0;
        line=line.toLowerCase();
        for(int i=0;i<line.length();++i)
        {
            char ch=line.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                ++vowels;
            }
            else if((ch>='a'&&ch<='z')){
                ++consonants;
            }

        }
        System.out.println("vowels:"+vowels);
        System.out.println("consonants:"+consonants);

    }

}
