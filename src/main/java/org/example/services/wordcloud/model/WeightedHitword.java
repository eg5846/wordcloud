package org.example.services.wordcloud.model;

import lombok.EqualsAndHashCode;
import lombok.NonNull;

/**
 * TODO: Add javadoc
 */
@EqualsAndHashCode
public class WeightedHitword {
    public final String hitword;
    public final double weight;

    private WeightedHitword(@NonNull String hitword, double weight) {
        this.hitword = hitword;
        this.weight = weight;
    }

    /**
     * TODO: Add javadoc
     *
     * @param hitword
     * @param weight
     * @return
     */
    @NonNull
    public static WeightedHitword create(@NonNull String hitword, double weight) {
        return new WeightedHitword(hitword, weight);
    }
}
