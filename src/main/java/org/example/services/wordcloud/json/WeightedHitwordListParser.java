package org.example.services.wordcloud.json;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.kennycason.kumo.WordFrequency;
import lombok.NonNull;
import org.example.services.wordcloud.model.WeightedHitword;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TODO: Add javadoc
 */
public class WeightedHitwordListParser {
    private final static Gson gson = new Gson();

    // Hide constructor for utility only class
    private WeightedHitwordListParser() {
    }

    /**
     * TODO: Add javadoc
     *
     * @param json
     * @return
     */
    @NonNull
    public static List<WeightedHitword> fromJson(@NonNull String json) {
        final var weightedHitwordList = new ArrayList<WeightedHitword>();

        JsonParser.parseString(json).getAsJsonArray().forEach(e -> {
            final var array = e.getAsJsonArray();
            final var hitword = gson.fromJson(array.get(0), String.class);
            final var weight = gson.fromJson(array.get(1), Double.class);
            final var weightedHitword = WeightedHitword.create(hitword, weight);
            weightedHitwordList.add(weightedHitword);
        });

        return Collections.unmodifiableList(weightedHitwordList);
    }
}
