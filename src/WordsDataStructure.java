/*
@author Jon Biolette
@date 03/19/2022
 */
public class WordsDataStructure {

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
