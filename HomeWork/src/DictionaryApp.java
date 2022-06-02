abstract class PairMap{
    protected String keyArray[];
    protected String valueArray[];
    abstract String get(String key);
    abstract void put(String key,String value);
    abstract String delete(String key);
    abstract int length();
}
class Dictionary extends PairMap{
    private int num;
    public Dictionary(int n) {
        keyArray = new String[n];
        valueArray = new String[n];
        num=0;
    }

   protected String get(String key) {
        for(int i=0;i<num;i++) {
            if(keyArray[i].equals(key)){
                return valueArray[i];
            }
        }
        return null;
    }

   protected void put(String key,String value) {
        for(int i=0;i<num;i++) {
            if(keyArray[i].equals(key)) {
                valueArray[i] = value;
                return;
                // 중복된 키값 있으면 값 수정하고 끝.
            }
        }
        // 없으면 여기로 제어가 넘어와서 값을 넣어줌.
        valueArray[num]=value;
        keyArray[num++]=key;
        return;
    }
   protected String delete(String key) {
        String deleteData = null;
        for(int i=0;i<num;i++) {
            if(keyArray[i].equals(key)){
                deleteData = valueArray[i];
                for(int j=i;j<num-1;j++) {
                    valueArray[j]=valueArray[j+1];
                    keyArray[j]=keyArray[j+1];
                }
                num = num - 1;
            }
        }
        return deleteData;
    }
   protected int length() {
        return num;
    }
}

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        dic.delete("황기태"); // 황기태 아이템 삭제
        System.out.println("황기태의 값은 "+dic.get("황기태"));
    }
}
