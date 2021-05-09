package org.example.services.wordcloud.model;

import com.kennycason.kumo.WordFrequency;

import java.util.List;

public class Wordcloud {
private final List<WordFrequency> weightedHitwordList;

    private Wordcloud(List<WordFrequency> wordFrequencyList) {
        this.weightedHitwordList = weightedHitwordList;
    }

    public static Wordcloud createFromWeightedHitwordList(List<WeightedHitword> weightedHitwordList) {

    }
}
