package org.example.services.wordcloud.util;

import com.google.common.collect.ImmutableList;
import com.kennycason.kumo.WordFrequency;
import lombok.NonNull;
import org.example.services.wordcloud.model.WeightedHitword;

import java.util.List;

/**
 * TODO: Add javadoc
 */
public class WordListConverter {

    // Hide constructor for utility only class
    private WordListConverter() {
    }

    /**
     * TODO: Add javadoc
     *
     * @param weightedHitwordList
     * @return
     */
    @NonNull
    public static List<WordFrequency> toWordFrequencyList(@NonNull List<WeightedHitword> weightedHitwordList) {
        return weightedHitwordList.stream().map(WordListConverter::toWordFrequency).collect(ImmutableList.toImmutableList());
    }

    @NonNull
    private static WordFrequency toWordFrequency(@NonNull WeightedHitword weightedHitword) {
        final var word = weightedHitword.hitword;
        // TODO: Improve conversion from double to int
        final var frequency = (int) Math.round(weightedHitword.weight * 1000);
        return new WordFrequency(word, frequency);
    }
}
