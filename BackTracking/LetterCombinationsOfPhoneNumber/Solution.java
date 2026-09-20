class Solution {
    List<String> result = new ArrayList<>();
    Map<Character, String> combinations = Map.of('2',"abc",
            '3',"def",
            '4' ,"ghi",
            '5',"jkl",
            '6' ,"mno",
            '7' ,"pqrs",
            '8' ,"tuv",
            '9' ,"wxyz");

    public List<String> letterCombinations(String digits) {
        String[] strs = new String[digits.length()];
        for(int i=0; i<digits.length(); i++){
            strs[i] = combinations.getOrDefault(digits.charAt(i),"");
        }
        StringBuilder temp = new StringBuilder();
        generate(strs, 0, temp);
        return result;
    }

    private void generate(String []strs, int index, StringBuilder current){
        if(index == strs.length){
            result.add(current.toString());
            return;
        }

        for(int i=0;i<strs[index].length();i++){
            generate(strs, index+1, current.append(strs[index].charAt(i)));
            current.deleteCharAt(current.length()-1);
        }
    }
}