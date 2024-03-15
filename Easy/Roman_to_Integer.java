//6ms runtime
class Roman_to_Integer {
    public int romanToInt(String s) {
        Map<Character, Integer> Roman = new HashMap<>();
        
        Roman.put('I', 1);
        Roman.put('V', 5);
        Roman.put('X', 10);
        Roman.put('L', 50);
        Roman.put('C', 100);
        Roman.put('D', 500);
        Roman.put('M', 1000);
        int len= s.length();
        int Result =0;
        
        for (int i = 0; i < len; i++) {
            if (i < len - 1 && Roman.get(s.charAt(i)) < Roman.get(s.charAt(i + 1))) {
                Result -= Roman.get(s.charAt(i));
            } else {
                Result += Roman.get(s.charAt(i));
            }
        }
        
        return Result;
    }
}