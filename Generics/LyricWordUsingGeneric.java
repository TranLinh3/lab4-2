package Generics;

import java.util.ArrayList;
import java.util.List;

public class LyricWordUsingGeneric {
    private static final Word[] lyric = {
            new Word("you",1), new Word("say",2), new Word("it",3),
            new Word("best",4),new Word("when",5),new Word("you",6),
            new Word("say",7), new Word("nothing",8), new Word("at",9),
            new Word("all",10)};

    public static void main(String[] args) {
        List<Word> arrayList = new ArrayList<Word>();
        for (Word w : lyric)
            arrayList.add(w);

        for (Word w : lyric) {
            System.out.print(w.getValue() + ", "+ w.getPosition());
        }
    }

}
