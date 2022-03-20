public class WordsDataStructure {

        public static void main(String[] args) {

            //"search","search","search","search","search","search"]
            //[".at"],["an."],["a.d."],["b."],["a.d"],["."]]
            WordDictionary wordDictionary = new WordDictionary();
            wordDictionary.addWord("at");
            wordDictionary.addWord("and");
            wordDictionary.addWord("an");
            wordDictionary.addWord("add");
//            System.out.println(wordDictionary.search("a")); // return False
//            System.out.println(wordDictionary.search(".at")); // return False
            wordDictionary.addWord("bat");
//            System.out.println(wordDictionary.search(".at")); // return True
//            System.out.println(wordDictionary.search("an.")); // return True
//            System.out.println(wordDictionary.search("a.d."));// return False
//            System.out.println(wordDictionary.search("b."));// return False
            System.out.println(wordDictionary.search("a.d"));// return True
            System.out.println(wordDictionary.search("."));// return False


            //[null,null,null,null,null,false,false,null,true,true,false,false,true,false]
        }
    }

class WordDictionary {
        String[] list;
        int pointer;
        public WordDictionary() {

            list = new String[4];
            pointer = 0;
        }



        public void addWord(String word) {
            try{
                list[pointer] = word;
                pointer++;
            }catch(ArrayIndexOutOfBoundsException e){
                String[] newArr = new String[list.length*2];
                for(int i = 0; i< list.length; i++){
                    newArr[i] = list[i];
                }
                list = newArr;
                list[pointer] = word;
                pointer++;
            }
        }
        public boolean search(String word) {
            boolean matched = false;
            for(int i = 0; i< list.length; i++){
                if(word == list[i] || matched == true) {
                    return true;
                }else if(list[i] == null) {
                    break;
                }else if(list[i].length() == word.length()){
                    for(int j = 0; j< word.length();j++) {
                        if (word.charAt(j) == list[i].charAt(j) ||
                                word.charAt(j) == '.') {
                            matched = true;
                        } else {
                            matched = false;
                            j = word.length();
                        }
                    }
                }
            }
            return matched;
        }

    }
