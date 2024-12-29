import phonebook.PhoneBook;
import phonebook.Record;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(new Record("Amanda", "09645455555"));
        phoneBook.add(new Record("Linda", "09877777777"));
        phoneBook.add(new Record("Rose", "099333393933"));
        phoneBook.add(new Record("Linda", "096424422222"));

        Record singleRecord = phoneBook.find("Linda");
        if (singleRecord != null) {
            System.out.println(singleRecord);
        } else {
            System.out.println("Record not found.");
        }

        List<Record> allRecords = phoneBook.findAll("Linda");
        if (allRecords != null) {
            System.out.println(allRecords);
        } else {
            System.out.println("No records found.");
        }

        //1
        List<String> words = new ArrayList<>();
        words.add("place");
        words.add("store");
        words.add("square");
        words.add("market");
        words.add("street");
        words.add("spring");
        words.add("store");
        words.add("market");
        words.add("apple");
        words.add("lace");
        System.out.println(countOccurance(words, "market"));

        //2
        int [] numbers = {1,2,3,4,5,4,3};
        List<Integer> numberList = toList(numbers);
        System.out.println(numberList);

        //3
        System.out.println(findUnique(numberList));

        //4**
        calcOccurance(words);

        //4***
        List<WordOccurrence> result = findOccurance(words);
        System.out.println(result);
    }

    public static int countOccurance(List<String> list, String str) {
        int count = 0;
        if(!list.isEmpty()) {
            for (String word : list) {
                if (word.equals(str)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void calcOccurance (List<String> list) {
        List<String> countedWords = new ArrayList<>();

        for (String word : list) {
            if (!countedWords.contains(word)) {
                int count = 0;
                for (String wrd : list) {
                    if (word.equals(wrd)) {
                        count++;
                    }
                }
                countedWords.add(word);
                System.out.println(word + ": " + count);
            }
        }
    }

    public static List<WordOccurrence> findOccurance(List<String> list) {
        List<WordOccurrence> occurrences = new ArrayList<>();
        List<String> countedWords = new ArrayList<>();

        for (String word : list) {
            if (!countedWords.contains(word)) {
                int count = 0;
                for (String wrd : list) {
                    if (word.equals(wrd)) {
                        count++;
                    }
                }
                countedWords.add(word);
                occurrences.add(new WordOccurrence(word, count));
            }
        }

        return occurrences;
    }

    public static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
